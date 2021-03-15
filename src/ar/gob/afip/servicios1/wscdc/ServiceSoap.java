/**
 * ServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.gob.afip.servicios1.wscdc;

public interface ServiceSoap extends java.rmi.Remote {

    /**
     * Determina los modos de facturación habilitados a consultar
     * por este medio.
     */
    public ar.gob.afip.servicios1.wscdc.FacModTipoResponse comprobantesModalidadConsultar(ar.gob.afip.servicios1.wscdc.CmpAuthRequest auth) throws java.rmi.RemoteException;

    /**
     * Recupera los Tipos de Comprobantes habilitados a consultar
     * por este medio.
     */
    public ar.gob.afip.servicios1.wscdc.CbteTipoResponse comprobantesTipoConsultar(ar.gob.afip.servicios1.wscdc.CmpAuthRequest auth) throws java.rmi.RemoteException;

    /**
     * Recupera los Tipos de Documentos habilitados a consultar por
     * este medio.
     */
    public ar.gob.afip.servicios1.wscdc.DocTipoResponse documentosTipoConsultar(ar.gob.afip.servicios1.wscdc.CmpAuthRequest auth) throws java.rmi.RemoteException;

    /**
     * Recupera el listado de identificadores para los campos Opcionales
     */
    public ar.gob.afip.servicios1.wscdc.OpcionalTipoResponse opcionalesTipoConsultar(ar.gob.afip.servicios1.wscdc.CmpAuthRequest auth) throws java.rmi.RemoteException;

    /**
     * Constatación de comprobantes de forma electronica
     */
    public ar.gob.afip.servicios1.wscdc.CmpResponse comprobanteConstatar(ar.gob.afip.servicios1.wscdc.CmpAuthRequest auth, ar.gob.afip.servicios1.wscdc.CmpDatos cmpReq) throws java.rmi.RemoteException;

    /**
     * Metodo dummy para verificacion de funcionamiento
     */
    public ar.gob.afip.servicios1.wscdc.DummyResponse comprobanteDummy() throws java.rmi.RemoteException;
}
