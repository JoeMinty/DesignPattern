
  import java.net.InetSocketAddress;
  import java.util.HashMap;
  import java.util.Map;

public class JRPC {

  private static final Map<Class<?>, JRpcEngine> PROTOCOL_ENGINES = new HashMap<Class<?>, JRpcEngine>();


  public static <T> AProtocolPB<T> getProtocolProxy(Class<T> protocol, InetSocketAddress addr, String name) throws InstantiationException, IllegalAccessException,
    IllegalArgumentException{
    return getProtocolEngine(protocol, name).getProxy(protocol, addr);
  }

  static synchronized JRpcEngine getProtocolEngine(Class<?> protocol, String name) throws InstantiationException, IllegalAccessException,
    IllegalArgumentException {
    JRpcEngine engine = PROTOCOL_ENGINES.get(protocol);
    if (engine == null) {
      Class<?> impl = new Conf().getClass(name, WritableJRpcEngine.class);
      engine = (JRpcEngine) impl.newInstance();
      PROTOCOL_ENGINES.put(protocol, engine);
    }

    return engine;
  }


}
