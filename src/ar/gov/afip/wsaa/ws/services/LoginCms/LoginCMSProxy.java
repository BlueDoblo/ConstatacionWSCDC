package ar.gov.afip.wsaa.ws.services.LoginCms;

public class LoginCMSProxy implements ar.gov.afip.wsaa.ws.services.LoginCms.LoginCMS {
  private String _endpoint = null;
  private ar.gov.afip.wsaa.ws.services.LoginCms.LoginCMS loginCMS = null;
  
  public LoginCMSProxy() {
    _initLoginCMSProxy();
  }
  
  public LoginCMSProxy(String endpoint) {
    _endpoint = endpoint;
    _initLoginCMSProxy();
  }
  
  private void _initLoginCMSProxy() {
    try {
      loginCMS = (new ar.gov.afip.wsaa.ws.services.LoginCms.LoginCMSServiceLocator()).getLoginCms();
      if (loginCMS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)loginCMS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)loginCMS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (loginCMS != null)
      ((javax.xml.rpc.Stub)loginCMS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ar.gov.afip.wsaa.ws.services.LoginCms.LoginCMS getLoginCMS() {
    if (loginCMS == null)
      _initLoginCMSProxy();
    return loginCMS;
  }
  
  public java.lang.String loginCms(java.lang.String in0) throws java.rmi.RemoteException, ar.gov.afip.wsaa.ws.services.LoginCms.LoginFault{
    if (loginCMS == null)
      _initLoginCMSProxy();
    return loginCMS.loginCms(in0);
  }
  
  
}