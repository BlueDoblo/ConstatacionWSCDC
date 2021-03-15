package ar.gob.afip.servicios1.wscdc;

public class ServiceSoapProxy implements ar.gob.afip.servicios1.wscdc.ServiceSoap {
  private String _endpoint = null;
  private ar.gob.afip.servicios1.wscdc.ServiceSoap serviceSoap = null;
  
  public ServiceSoapProxy() {
    _initServiceSoapProxy();
  }
  
  public ServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiceSoapProxy();
  }
  
  private void _initServiceSoapProxy() {
    try {
      serviceSoap = (new ar.gob.afip.servicios1.wscdc.ServiceLocator()).getServiceSoap();
      if (serviceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serviceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serviceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serviceSoap != null)
      ((javax.xml.rpc.Stub)serviceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ar.gob.afip.servicios1.wscdc.ServiceSoap getServiceSoap() {
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap;
  }
  
  public ar.gob.afip.servicios1.wscdc.FacModTipoResponse comprobantesModalidadConsultar(ar.gob.afip.servicios1.wscdc.CmpAuthRequest auth) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.comprobantesModalidadConsultar(auth);
  }
  
  public ar.gob.afip.servicios1.wscdc.CbteTipoResponse comprobantesTipoConsultar(ar.gob.afip.servicios1.wscdc.CmpAuthRequest auth) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.comprobantesTipoConsultar(auth);
  }
  
  public ar.gob.afip.servicios1.wscdc.DocTipoResponse documentosTipoConsultar(ar.gob.afip.servicios1.wscdc.CmpAuthRequest auth) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.documentosTipoConsultar(auth);
  }
  
  public ar.gob.afip.servicios1.wscdc.OpcionalTipoResponse opcionalesTipoConsultar(ar.gob.afip.servicios1.wscdc.CmpAuthRequest auth) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.opcionalesTipoConsultar(auth);
  }
  
  public ar.gob.afip.servicios1.wscdc.CmpResponse comprobanteConstatar(ar.gob.afip.servicios1.wscdc.CmpAuthRequest auth, ar.gob.afip.servicios1.wscdc.CmpDatos cmpReq) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.comprobanteConstatar(auth, cmpReq);
  }
  
  public ar.gob.afip.servicios1.wscdc.DummyResponse comprobanteDummy() throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.comprobanteDummy();
  }
  
  
}