import java.net.InetSocketAddress;

public class WritableJRpcEngine implements JRpcEngine {

  @Override
  public <T> AProtocolPB<T> getProxy(Class<T> protocol, InetSocketAddress addr) {
    return null;
  }
}
