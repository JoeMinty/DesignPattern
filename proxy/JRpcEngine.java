import java.net.InetSocketAddress;

public interface JRpcEngine {
  <T> AProtocolPB<T> getProxy(Class<T> protocol, InetSocketAddress addr);
}
