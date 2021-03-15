/**
 * Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.gob.afip.servicios1.wscdc;

public interface Service extends javax.xml.rpc.Service {

/**
 * Web Service Orientado a la Constatacion de Comprobantes.
 */
    public java.lang.String getServiceSoapAddress();

    public ar.gob.afip.servicios1.wscdc.ServiceSoap getServiceSoap() throws javax.xml.rpc.ServiceException;

    public ar.gob.afip.servicios1.wscdc.ServiceSoap getServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
