/**
 * CmpResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.gob.afip.servicios1.wscdc;

public class CmpResponse  implements java.io.Serializable {
    private ar.gob.afip.servicios1.wscdc.CmpDatos cmpResp;

    private java.lang.String resultado;

    private ar.gob.afip.servicios1.wscdc.Obs[] observaciones;

    private java.lang.String fchProceso;

    private ar.gob.afip.servicios1.wscdc.Evt[] events;

    private ar.gob.afip.servicios1.wscdc.Err[] errors;

    public CmpResponse() {
    }

    public CmpResponse(
           ar.gob.afip.servicios1.wscdc.CmpDatos cmpResp,
           java.lang.String resultado,
           ar.gob.afip.servicios1.wscdc.Obs[] observaciones,
           java.lang.String fchProceso,
           ar.gob.afip.servicios1.wscdc.Evt[] events,
           ar.gob.afip.servicios1.wscdc.Err[] errors) {
           this.cmpResp = cmpResp;
           this.resultado = resultado;
           this.observaciones = observaciones;
           this.fchProceso = fchProceso;
           this.events = events;
           this.errors = errors;
    }


    /**
     * Gets the cmpResp value for this CmpResponse.
     * 
     * @return cmpResp
     */
    public ar.gob.afip.servicios1.wscdc.CmpDatos getCmpResp() {
        return cmpResp;
    }


    /**
     * Sets the cmpResp value for this CmpResponse.
     * 
     * @param cmpResp
     */
    public void setCmpResp(ar.gob.afip.servicios1.wscdc.CmpDatos cmpResp) {
        this.cmpResp = cmpResp;
    }


    /**
     * Gets the resultado value for this CmpResponse.
     * 
     * @return resultado
     */
    public java.lang.String getResultado() {
        return resultado;
    }


    /**
     * Sets the resultado value for this CmpResponse.
     * 
     * @param resultado
     */
    public void setResultado(java.lang.String resultado) {
        this.resultado = resultado;
    }


    /**
     * Gets the observaciones value for this CmpResponse.
     * 
     * @return observaciones
     */
    public ar.gob.afip.servicios1.wscdc.Obs[] getObservaciones() {
        return observaciones;
    }


    /**
     * Sets the observaciones value for this CmpResponse.
     * 
     * @param observaciones
     */
    public void setObservaciones(ar.gob.afip.servicios1.wscdc.Obs[] observaciones) {
        this.observaciones = observaciones;
    }


    /**
     * Gets the fchProceso value for this CmpResponse.
     * 
     * @return fchProceso
     */
    public java.lang.String getFchProceso() {
        return fchProceso;
    }


    /**
     * Sets the fchProceso value for this CmpResponse.
     * 
     * @param fchProceso
     */
    public void setFchProceso(java.lang.String fchProceso) {
        this.fchProceso = fchProceso;
    }


    /**
     * Gets the events value for this CmpResponse.
     * 
     * @return events
     */
    public ar.gob.afip.servicios1.wscdc.Evt[] getEvents() {
        return events;
    }


    /**
     * Sets the events value for this CmpResponse.
     * 
     * @param events
     */
    public void setEvents(ar.gob.afip.servicios1.wscdc.Evt[] events) {
        this.events = events;
    }


    /**
     * Gets the errors value for this CmpResponse.
     * 
     * @return errors
     */
    public ar.gob.afip.servicios1.wscdc.Err[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this CmpResponse.
     * 
     * @param errors
     */
    public void setErrors(ar.gob.afip.servicios1.wscdc.Err[] errors) {
        this.errors = errors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmpResponse)) return false;
        CmpResponse other = (CmpResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cmpResp==null && other.getCmpResp()==null) || 
             (this.cmpResp!=null &&
              this.cmpResp.equals(other.getCmpResp()))) &&
            ((this.resultado==null && other.getResultado()==null) || 
             (this.resultado!=null &&
              this.resultado.equals(other.getResultado()))) &&
            ((this.observaciones==null && other.getObservaciones()==null) || 
             (this.observaciones!=null &&
              java.util.Arrays.equals(this.observaciones, other.getObservaciones()))) &&
            ((this.fchProceso==null && other.getFchProceso()==null) || 
             (this.fchProceso!=null &&
              this.fchProceso.equals(other.getFchProceso()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              java.util.Arrays.equals(this.events, other.getEvents()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCmpResp() != null) {
            _hashCode += getCmpResp().hashCode();
        }
        if (getResultado() != null) {
            _hashCode += getResultado().hashCode();
        }
        if (getObservaciones() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObservaciones());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObservaciones(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFchProceso() != null) {
            _hashCode += getFchProceso().hashCode();
        }
        if (getEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEvents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CmpResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "CmpResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmpResp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "CmpResp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "CmpDatos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Resultado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observaciones");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Observaciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Obs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Obs"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fchProceso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "FchProceso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Evt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Evt"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Err"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Err"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
