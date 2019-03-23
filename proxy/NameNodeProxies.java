import java.net.InetSocketAddress;

public class NameNodeProxies {

  public static class ProxyAndInfo<PROXYTYPE> {
    private final PROXYTYPE proxy;
    private final InetSocketAddress address;

    public ProxyAndInfo(PROXYTYPE proxy, InetSocketAddress address) {
      this.proxy = proxy;
      this.address = address;
    }

    public PROXYTYPE getProxy() {
      return proxy;
    }

    public InetSocketAddress getAddress() {
      return address;
    }
  }

  public static <T> NameNodeProxies.ProxyAndInfo<T> createProxy(InetSocketAddress nnAddr, Class<T> xface, String name) {

    T proxy;
    if (xface == A.class) {
      proxy = (T) createAProxy(nnAddr, name);
    } else if (xface == B.class) {
      proxy = (T) createAProxy(nnAddr, name);
    } else {
      String message = "Unsupported protocol found when creating the proxy " +
        "connection to NameNode: " +
        ((xface != null) ? xface.getClass().getName() : "null");
      throw new IllegalStateException(message);
    }

    return new ProxyAndInfo<T>(proxy, nnAddr);
  }

  private static A createAProxy(InetSocketAddress address, String name) {
    AProtocolPB proxy = null;
    try {
      proxy  = JRPC.getProtocolProxy(AProtocolPB.class, address, name).getProxy();
    } catch (Exception e) {
      e.printStackTrace();
    }


    return new AImpl(proxy);
  }

}
