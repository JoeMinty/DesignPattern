public class AImpl implements A{
  final private AProtocolPB rpcProxy;

  public AImpl(AProtocolPB rpcProxy) {
    this.rpcProxy = rpcProxy;
  }
}
