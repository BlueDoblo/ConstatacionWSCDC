/**
 * ServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.gob.afip.servicios1.wscdc;

public class ServiceSoapStub extends org.apache.axis.client.Stub implements ar.gob.afip.servicios1.wscdc.ServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[6];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ComprobantesModalidadConsultar");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "CmpAuthRequest"), ar.gob.afip.servicios1.wscdc.CmpAuthRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "FacModTipoResponse"));
        oper.setReturnClass(ar.gob.afip.servicios1.wscdc.FacModTipoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "ComprobantesModalidadConsultarResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ComprobantesTipoConsultar");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "CmpAuthRequest"), ar.gob.afip.servicios1.wscdc.CmpAuthRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "CbteTipoResponse"));
        oper.setReturnClass(ar.gob.afip.servicios1.wscdc.CbteTipoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "ComprobantesTipoConsultarResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DocumentosTipoConsultar");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "CmpAuthRequest"), ar.gob.afip.servicios1.wscdc.CmpAuthRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "DocTipoResponse"));
        oper.setReturnClass(ar.gob.afip.servicios1.wscdc.DocTipoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "DocumentosTipoConsultarResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OpcionalesTipoConsultar");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "CmpAuthRequest"), ar.gob.afip.servicios1.wscdc.CmpAuthRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "OpcionalTipoResponse"));
        oper.setReturnClass(ar.gob.afip.servicios1.wscdc.OpcionalTipoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "OpcionalesTipoConsultarResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ComprobanteConstatar");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "CmpAuthRequest"), ar.gob.afip.servicios1.wscdc.CmpAuthRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "CmpReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "CmpDatos"), ar.gob.afip.servicios1.wscdc.CmpDatos.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "CmpResponse"));
        oper.setReturnClass(ar.gob.afip.servicios1.wscdc.CmpResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "ComprobanteConstatarResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ComprobanteDummy");
        oper.setReturnType(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "DummyResponse"));
        oper.setReturnClass(ar.gob.afip.servicios1.wscdc.DummyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "ComprobanteDummyResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

    }

    public ServiceSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "ArrayOfCbteTipo");
            cachedSerQNames.add(qName);
            cls = ar.gob.afip.servicios1.wscdc.CbteTipo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "CbteTipo");
            qName2 = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "CbteTipo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "ArrayOfDocTipo");
            cachedSerQNames.add(qName);
            cls = ar.gob.afip.servicios1.wscdc.DocTipo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "DocTipo");
            qName2 = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "DocTipo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "ArrayOfErr");
            cachedSerQNames.add(qName);
            cls = ar.gob.afip.servicios1.wscdc.Err[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Err");
            qName2 = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Err");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "ArrayOfEvt");
            cachedSerQNames.add(qName);
            cls = ar.gob.afip.servicios1.wscdc.Evt[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Evt");
            qName2 = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Evt");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "ArrayOfFacModTipo");
            cachedSerQNames.add(qName);
            cls = ar.gob.afip.servicios1.wscdc.FacModTipo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "FacModTipo");
            qName2 = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "FacModTipo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "ArrayOfObs");
            cachedSerQNames.add(qName);
            cls = ar.gob.afip.servicios1.wscdc.Obs[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Obs");
            qName2 = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Obs");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "ArrayOfOpcional");
            cachedSerQNames.add(qName);
            cls = ar.gob.afip.servicios1.wscdc.Opcional[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Opcional");
            qName2 = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Opcional");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "ArrayOfOpcionalTipo");
            cachedSerQNames.add(qName);
            cls = ar.gob.afip.servicios1.wscdc.OpcionalTipo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "OpcionalTipo");
            qName2 = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "OpcionalTipo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "CbteTipo");
            cachedSerQNames.add(qName);
            cls = ar.gob.afip.servicios1.wscdc.CbteTipo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "CbteTipoResponse");
            cachedSerQNames.add(qName);
            cls = ar.gob.afip.servicios1.wscdc.CbteTipoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "CmpAuthRequest");
            cachedSerQNames.add(qName);
            cls = ar.gob.afip.servicios1.wscdc.CmpAuthRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "CmpDatos");
            cachedSerQNames.add(qName);
            cls = ar.gob.afip.servicios1.wscdc.CmpDatos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "CmpResponse");
            cachedSerQNames.add(qName);
            cls = ar.gob.afip.servicios1.wscdc.CmpResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "DocTipo");
            cachedSerQNames.add(qName);
            cls = ar.gob.afip.servicios1.wscdc.DocTipo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "DocTipoResponse");
            cachedSerQNames.add(qName);
            cls = ar.gob.afip.servicios1.wscdc.DocTipoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "DummyResponse");
            cachedSerQNames.add(qName);
            cls = ar.gob.afip.servicios1.wscdc.DummyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Err");
            cachedSerQNames.add(qName);
            cls = ar.gob.afip.servicios1.wscdc.Err.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Evt");
            cachedSerQNames.add(qName);
            cls = ar.gob.afip.servicios1.wscdc.Evt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "FacModTipo");
            cachedSerQNames.add(qName);
            cls = ar.gob.afip.servicios1.wscdc.FacModTipo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "FacModTipoResponse");
            cachedSerQNames.add(qName);
            cls = ar.gob.afip.servicios1.wscdc.FacModTipoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Obs");
            cachedSerQNames.add(qName);
            cls = ar.gob.afip.servicios1.wscdc.Obs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "Opcional");
            cachedSerQNames.add(qName);
            cls = ar.gob.afip.servicios1.wscdc.Opcional.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "OpcionalTipo");
            cachedSerQNames.add(qName);
            cls = ar.gob.afip.servicios1.wscdc.OpcionalTipo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "OpcionalTipoResponse");
            cachedSerQNames.add(qName);
            cls = ar.gob.afip.servicios1.wscdc.OpcionalTipoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public ar.gob.afip.servicios1.wscdc.FacModTipoResponse comprobantesModalidadConsultar(ar.gob.afip.servicios1.wscdc.CmpAuthRequest auth) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://servicios1.afip.gob.ar/wscdc/ComprobantesModalidadConsultar");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "ComprobantesModalidadConsultar"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ar.gob.afip.servicios1.wscdc.FacModTipoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (ar.gob.afip.servicios1.wscdc.FacModTipoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ar.gob.afip.servicios1.wscdc.FacModTipoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ar.gob.afip.servicios1.wscdc.CbteTipoResponse comprobantesTipoConsultar(ar.gob.afip.servicios1.wscdc.CmpAuthRequest auth) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://servicios1.afip.gob.ar/wscdc/ComprobantesTipoConsultar");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "ComprobantesTipoConsultar"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ar.gob.afip.servicios1.wscdc.CbteTipoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (ar.gob.afip.servicios1.wscdc.CbteTipoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ar.gob.afip.servicios1.wscdc.CbteTipoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ar.gob.afip.servicios1.wscdc.DocTipoResponse documentosTipoConsultar(ar.gob.afip.servicios1.wscdc.CmpAuthRequest auth) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://servicios1.afip.gob.ar/wscdc/DocumentosTipoConsultar");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "DocumentosTipoConsultar"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ar.gob.afip.servicios1.wscdc.DocTipoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (ar.gob.afip.servicios1.wscdc.DocTipoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ar.gob.afip.servicios1.wscdc.DocTipoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ar.gob.afip.servicios1.wscdc.OpcionalTipoResponse opcionalesTipoConsultar(ar.gob.afip.servicios1.wscdc.CmpAuthRequest auth) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://servicios1.afip.gob.ar/wscdc/OpcionalesTipoConsultar");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "OpcionalesTipoConsultar"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ar.gob.afip.servicios1.wscdc.OpcionalTipoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (ar.gob.afip.servicios1.wscdc.OpcionalTipoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ar.gob.afip.servicios1.wscdc.OpcionalTipoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ar.gob.afip.servicios1.wscdc.CmpResponse comprobanteConstatar(ar.gob.afip.servicios1.wscdc.CmpAuthRequest auth, ar.gob.afip.servicios1.wscdc.CmpDatos cmpReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://servicios1.afip.gob.ar/wscdc/ComprobanteConstatar");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "ComprobanteConstatar"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, cmpReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ar.gob.afip.servicios1.wscdc.CmpResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (ar.gob.afip.servicios1.wscdc.CmpResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ar.gob.afip.servicios1.wscdc.CmpResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ar.gob.afip.servicios1.wscdc.DummyResponse comprobanteDummy() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://servicios1.afip.gob.ar/wscdc/ComprobanteDummy");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://servicios1.afip.gob.ar/wscdc/", "ComprobanteDummy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ar.gob.afip.servicios1.wscdc.DummyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (ar.gob.afip.servicios1.wscdc.DummyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ar.gob.afip.servicios1.wscdc.DummyResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
