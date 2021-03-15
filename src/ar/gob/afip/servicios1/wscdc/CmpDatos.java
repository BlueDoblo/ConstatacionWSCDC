/**
 * CmpDatos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.gob.afip.servicios1.wscdc;

public class CmpDatos  implements java.io.Serializable {
    private java.lang.String cbteModo;

    private long cuitEmisor;

    private int ptoVta;

    private int cbteTipo;

    private long cbteNro;

    private java.lang.String cbteFch;

    private double impTotal;

    private java.lang.String codAutorizacion;

    private java.lang.String docTipoReceptor;

    private java.lang.String docNroReceptor;

    private ar.gob.afip.servicios1.wscdc.Opcional[] opcionales;

    public CmpDatos() {
    }

    public CmpDatos(
           java.lang.String cbteModo,
           long cuitEmisor,
           int ptoVta,
           int cbteTipo,
           long cbteNro,
           java.lang.String cbteFch,
           double impTotal,
           java.lang.String codAutorizacion,
           java.lang.String docTipoReceptor,
           java.lang.String docNroReceptor,
           ar.gob.afip.servicios1.wscdc.Opcional[] opcionales) {
           this.cbteModo = cbteModo;
           this.cuitEmisor = cuitEmisor;
           this.ptoVta = ptoVta;
           this.cbteTipo = cbteTipo;
           this.cbteNro = cbteNro;
           this.cbteFch = cbteFch;
           this.impTotal = impTotal;
           this.codAutorizacion = codAutorizacion;
           this.docTipoReceptor = docTipoReceptor;
           this.docNroReceptor = docNroReceptor;
           this.opcionales = opcionales;
    }


    /**
     * Gets the cbteModo value for this CmpDatos.
     * 
     * @return cbteModo
     */
    public java.lang.String getCbteModo() {
        return cbteModo;
    }


    /**
     * Sets the cbteModo value for this CmpDatos.
     * 
     * @param cbteModo
     */
    public void setCbteModo(java.lang.String cbteModo) {
        this.cbteModo = cbteModo;
    }


    /**
     * Gets the cuitEmisor value for this CmpDatos.
     * 
     * @return cuitEmisor
     */
    public long getCuitEmisor() {
        return cuitEmisor;
    }


    /**
     * Sets the cuitEmisor value for this CmpDatos.
     * 
     * @param cuitEmisor
     */
    public void setCuitEmisor(long cuitEmisor) {
        this.cuitEmisor = cuitEmisor;
    }


    /**
     * Gets the ptoVta value for this CmpDatos.
     * 
     * @return ptoVta
     */
    public int getPtoVta() {
        return ptoVta;
    }


    /**
     * Sets the ptoVta value for this CmpDatos.
     * 
     * @param ptoVta
     */
    public void setPtoVta(int ptoVta) {
        this.ptoVta = ptoVta;
    }


    /**
     * Gets the cbteTipo value for this CmpDatos.
     * 
     * @return cbteTipo
     */
    public int getCbteTipo() {
        return cbteTipo;
    }


    /**
     * Sets the cbteTipo value for this CmpDatos.
     * 
     * @param cbteTipo
     */
    public void setCbteTipo(int cbteTipo) {
        this.cbteTipo = cbteTipo;
    }


    /**
     * Gets the cbteNro value for this CmpDatos.
     * 
     * @return cbteNro
     */
    public long getCbteNro() {
        return cbteNro;
    }


    /**
     * Sets the cbteNro value for this CmpDatos.
     * 
     * @param cbteNro
     */
    public void setCbteNro(long cbteNro) {
        this.cbteNro = cbteNro;
    }


    /**
     * Gets the cbteFch value for this CmpDatos.
     * 
     * @return cbteFch
     */
    public java.lang.String getCbteFch() {
        return cbteFch;
    }


    /**
     * Sets the cbteFch value for this CmpDatos.
     * 
     * @param cbteFch
     */
    public void setCbteFch(java.lang.String cbteFch) {
        this.cbteFch = cbteFch;
    }


    /**
     * Gets the impTotal value for this CmpDatos.
     * 
     * @return impTotal
     */
    public double getImpTotal() {
        return impTotal;
    }


    /**
     * Sets the impTotal value for this CmpDatos.
     * 
     * @param impTotal
     */
    public void setImpTotal(double impTotal) {
        this.impTotal = impTotal;
    }


    /**
     * Gets the codAutorizacion value for this CmpDatos.
     * 
     * @return codAutorizacion
     */
    public java.lang.String getCodAutorizacion() {
        return codAutorizacion;
    }


    /**
     * Sets the codAutorizacion value for this CmpDatos.
     * 
     * @param codAutorizacion
     */
    public void setCodAutorizacion(java.lang.String codAutorizacion) {
        this.codAutorizacion = codAutorizacion;
    }


    /**
     * Gets the docTipoReceptor value for this CmpDatos.
     * 
     * @return docTipoReceptor
     */
    public java.lang.String getDocTipoReceptor() {
        return docTipoReceptor;
    }


    /**
     * Sets the docTipoReceptor value for this CmpDatos.
     * 
     * @param docTipoReceptor
     */
    public void setDocTipoReceptor(java.lang.String docTipoReceptor) {
        this.docTipoReceptor = docTipoReceptor;
    }


    /**
     * Gets the docNroReceptor value for this CmpDatos.
     * 
     * @return docNroReceptor
     */
    public java.lang.String getDocNroReceptor() {
        return docNroReceptor;
    }


    /**
     * Sets the docNroReceptor value for this CmpDatos.
     * 
     * @param docNroReceptor
     */
    public void setDocNroReceptor(java.lang.String docNroReceptor) {
        this.docNroReceptor = docNroReceptor;
    }


    /**
     * Gets the opcionales value for this CmpDatos.
     * 
     * @return opcionales
     */
    public ar.gob.afip.servicios1.wscdc.Opcional[] getOpcionales() {
        return opcionales;
    }


    /**
     * Sets the opcionales value for this CmpDatos.
     * 
     * @param opcionales
     */
    public void setOpcionales(ar.gob.afip.servicios1.wscdc.Opcional[] opcionales) {
        this.opcionales = opcionales;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmpDatos)) return false;
        CmpDatos other = (CmpDatos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cbteModo==null && other.getCbteModo()==null) || 
             (this.cbteModo!=null &&
              this.cbteModo.equals(other.getCbteModo()))) &&
            this.cuitEmisor == other.getCuitEmisor() &&
            this.ptoVta == other.getPtoVta() &&
            this.cbteTipo == other.getCbteTipo() &&
            this.cbteNro == other.getCbteNro() &&
            ((this.cbteFch==null && other.getCbteFch()==null) || 
             (this.cbteFch!=null &&
              this.cbteFch.equals(other.getCbteFch()))) &&
            this.impTotal == other.getImpTotal() &&
            ((this.codAutorizacion==null && other.getCodAutorizacion()==null) || 
             (this.codAutorizacion!=null &&
              this.codAutorizacion.equals(other.getCodAutorizacion()))) &&
            ((this.docTipoReceptor==null && other.getDocTipoReceptor()==null) || 
             (this.docTipoReceptor!=null &&
              this.docTipoReceptor.equals(other.getDocTipoReceptor()))) &&
            ((this.docNroReceptor==null && other.getDocNroReceptor()==null) || 
             (this.docNroReceptor!=null &&
              this.docNroReceptor.equals(other.getDocNroReceptor()))) &&
            ((this.opcionales==null && other.getOpcionales()==null) || 
             (this.opcionales!=null &&
              java.util.Arrays.equals(this.opcionales, other.getOpcionales())));
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
        if (getCbteModo() != null) {
            _hashCode += getCbteModo().hashCode();
        }
        _hashCode += new Long(getCuitEmisor()).hashCode();
        _hashCode += getPtoVta();
        _hashCode += getCbteTipo();
        _hashCode += new Long(getCbteNro()).hashCode();
        if (getCbteFch() != null) {
            _hashCode += getCbteFch().hashCode();
        }
        _hashCode += new Double(getImpTotal()).hashCode();
        if (getCodAutorizacion() != null) {
            _hashCode += getCodAutorizacion().hashCode();
        }
        if (getDocTipoReceptor() != null) {
            _hashCode += getDocTipoReceptor().hashCode();
        }
        if (getDocNroReceptor() != null) {
            _hashCode += getDocNroReceptor().hashCode();
        }
        if (getOpcionales() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOpcionales());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOpcionales(), i);
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
        new org.apache.axis.description.TypeDesc(CmpDatos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "CmpDatos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cbteModo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "CbteModo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuitEmisor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "CuitEmisor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ptoVta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "PtoVta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cbteTipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "CbteTipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cbteNro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "CbteNro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cbteFch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "CbteFch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "ImpTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codAutorizacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "CodAutorizacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docTipoReceptor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "DocTipoReceptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docNroReceptor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "DocNroReceptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opcionales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Opcionales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Opcional"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Opcional"));
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
