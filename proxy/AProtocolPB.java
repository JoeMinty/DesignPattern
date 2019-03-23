public class AProtocolPB<T> {
  private Class<T> protocol;

  private T proxy;

  public AProtocolPB(Class<T> protocol, T proxy) {
    this.protocol = protocol;
    this.proxy = proxy;
  }

  public T getProxy() {
    return proxy;
  }
}
