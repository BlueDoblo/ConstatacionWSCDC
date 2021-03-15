/*     */ package Principal;
/*     */
	      import java.util.GregorianCalendar;
/*     */ import ar.gob.afip.servicios1.wscdc.CmpAuthRequest;
/*     */ import ar.gob.afip.servicios1.wscdc.CmpDatos;
/*     */ import ar.gob.afip.servicios1.wscdc.CmpResponse;
/*     */ import ar.gob.afip.servicios1.wscdc.DummyResponse;
/*     */ import ar.gob.afip.servicios1.wscdc.Err;
/*     */ import ar.gob.afip.servicios1.wscdc.Evt;
/*     */ import ar.gob.afip.servicios1.wscdc.Obs;
/*     */ import ar.gob.afip.servicios1.wscdc.ServiceLocator;
/*     */ import ar.gob.afip.servicios1.wscdc.ServiceSoap;
/*     */ import au.com.bytecode.opencsv.CSVReader;
/*     */ import au.com.bytecode.opencsv.CSVWriter;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.FileReader;
/*     */ import java.io.FileWriter;
/*     */ import java.io.IOException;
/*     */ import java.io.StringReader;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Properties;
/*     */ import org.apache.log4j.Logger;
/*     */ import org.dom4j.Document;
/*     */ import org.dom4j.io.SAXReader;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Principal
/*     */ {
/*  37 */   private static Logger log = Logger.getLogger(Principal.class);
/*     */   
/*     */   private static CmpAuthRequest token;
/*     */   private static ServiceLocator serviceLocator;
/*     */   private static ServiceSoap ServiceSoap;
/*     */   static Date tokenExpira;
/*     */   private static boolean ciclo = true;
/*     */   static Properties config;
   public static void main(char Parametro ) {
/*  47 */     config = new Properties();
/*  48 */     String fileC = "SetUp/SetUp.properties";
/*     */     try {
/*  50 */       config.load(new FileInputStream(fileC));
/*     */     }
/*  52 */     catch (FileNotFoundException e) {
/*  53 */       log.error("Archivo de configuracio≥n para la compan√≠a no encontrado: " + fileC);
/*     */     }
/*  55 */     catch (Exception e) {
/*  56 */       log.error(e);
/*     */     } 
/*  58 */     String pathIn = config.getProperty("entrada");
/*  59 */     int i = 0;
/*  60 */     init();
/*  61 */     getToken();
/*     */ 
/*     */ 
		      if (Parametro == '1')  
		      {
		    	ciclo = true; 
		      }
		      
/*  65 */     while (ciclo) {
/*  66 */       DirectoryReader dr = new DirectoryReader(pathIn, "");
/*  67 */       if (dr.hasNext()) {
/*     */         try {
/*  69 */           getToken();
/*  70 */           consultarComprobanteConstatar();
/*     */         }
/*  72 */         catch (Exception e) {
/*  73 */           log.error("Directorio sin Archivos o Problemas de conexion.");
/*     */         } 
/*     */       } else {
/*     */         try {
/*  77 */           consultarFuncionamiento();
/*     */         }
/*  79 */         catch (Exception e) {
/*  80 */           log.error("Problemas de conexion.");
/*     */         } 
/*     */       } 
/*     */       
/*  84 */       if (i == 10) {
/*  85 */         ciclo = false;
/*     */       }
/*     */       try {
/*  88 */         Thread.sleep(5000L);
/*  89 */       } catch (InterruptedException e) {
/*     */         
/*  91 */         e.printStackTrace();
/*     */       } 
			  
			  // Si el parametro es 1 solo se ejecuta una vez el proceso
			  if (Parametro == '1')
			  {
				  ciclo = false;
			  }
			  
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void init() {
/*  97 */     serviceLocator = new ServiceLocator();
/*     */     try {
/*  99 */       serviceLocator.setEndpointAddress("ServiceSoap", config.getProperty("service-locator"));
/* 100 */       ServiceSoap = serviceLocator.getServiceSoap();
/*     */     }
/* 102 */     catch (Exception e) {
/* 103 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static CmpAuthRequest getToken() {
/* 108 */     CmpAuthRequest auth = null;
/* 109 */     String LoginTicketResponse = null;
/*     */     
/* 111 */     Date now = new Date();
/* 112 */     Calendar c1 = Calendar.getInstance();
/* 113 */     Calendar c2 = Calendar.getInstance();
/* 114 */     c1.setTime(now);
/* 115 */     long diff = 0L;
/* 116 */     if (tokenExpira != null) {
/* 117 */       c2.setTime(tokenExpira);
/* 118 */       long milliseconds1 = c1.getTimeInMillis();
/* 119 */       long milliseconds2 = c2.getTimeInMillis();
/* 120 */       diff = (milliseconds2 - milliseconds1) / 60000L;
/*     */     } 
/*     */     
/* 123 */     if (tokenExpira == null || diff < 120L) {
/* 124 */       String service = "wscdc";
/* 125 */       boolean debug = true;
/* 126 */       String p12file = config.getProperty("keystore");
/* 127 */       String signer = config.getProperty("keystore-signer");
/* 128 */       String p12pass = config.getProperty("keystore-password");
/* 129 */       String cuitStr = config.getProperty("CUIT");
/* 130 */       Long TicketTime = new Long(config.getProperty("TicketTime", "3600000"));
/* 131 */       String dstDN = config.getProperty("dstdn");
/* 132 */       Long cuit = new Long(cuitStr);
/* 133 */       String endpointwsaa = config.getProperty("endpoint");
/* 134 */       log.error("keystore: " + p12file);
/* 135 */       log.error("signer: " + signer);
/* 136 */       log.error("pass: " + p12pass);
/* 137 */       log.error("cuit: " + cuit);
/* 138 */       log.error("ticketTime: " + TicketTime);
/* 139 */       log.error("dstDN: " + dstDN);
/* 140 */       log.error("endpoint: " + endpointwsaa);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 148 */       byte[] LoginTicketRequest_xml_cms = afip_wsaa_client.create_cms(p12file, p12pass, signer, dstDN, service, TicketTime, debug);
/* 149 */       log.error("byte[]: " + LoginTicketRequest_xml_cms);
/*     */       try {
/* 151 */         LoginTicketResponse = afip_wsaa_client.invoke_wsaa(LoginTicketRequest_xml_cms, endpointwsaa);
/*     */       }
/* 153 */       catch (Exception e) {
/* 154 */         log.error("Error obteniendo Token de seguridad");
/* 155 */         log.error(e);
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/*     */       try {
/* 161 */         StringReader tokenReader = new StringReader(LoginTicketResponse);
/* 162 */         Document tokenDoc = (new SAXReader(false)).read(tokenReader);
/* 163 */         String tokenStr = tokenDoc.valueOf("/loginTicketResponse/credentials/token");
/* 164 */         String sign = tokenDoc.valueOf("/loginTicketResponse/credentials/sign");
/* 165 */         String expiraStr = tokenDoc.valueOf("/loginTicketResponse/header/expirationTime");
/* 166 */         SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
/* 167 */         tokenExpira = formatoDeFecha.parse(expiraStr);
/* 168 */         auth = new CmpAuthRequest(tokenStr, sign, cuit.longValue());
/* 169 */         log.info("Nuevo token ");
/* 170 */         log.info("TOKEN: " + tokenStr);
/* 171 */         log.info("SIGN: " + sign);
/* 172 */         log.info("EXPIRA: " + tokenExpira.toString());
/* 173 */         token = auth;
/*     */       }
/* 175 */       catch (Exception e) {
/* 176 */         log.error(e);
/*     */       } 
/*     */     } else {
/* 179 */       auth = token;
/* 180 */       log.info("Reutilizando token ");
/* 181 */       log.info("TOKEN: " + auth.getToken());
/* 182 */       log.info("SIGN: " + auth.getSign());
/* 183 */       log.info("EXPIRA: " + tokenExpira.toString());
/* 184 */       log.info("RESTAN: " + diff + " minutos");
/*     */     } 
/* 186 */     return auth;
/*     */   }
/*     */ 
/*     */   public static void consultarComprobanteConstatar() {
/*     */     try {
/* 199 */       String pathIn = config.getProperty("entrada");
/* 200 */       String pathOut = config.getProperty("salida");
/* 201 */       String pathDest = config.getProperty("procesados");
/*     */       
/* 203 */       DirectoryReader dr = new DirectoryReader(pathIn, "");
/*     */       do {
/* 205 */         String file = dr.getNext();
/* 206 */         CSVReader reader = new CSVReader(new FileReader(String.valueOf(pathIn) + "/" + file), ';'); String[] nextLine;
/* 207 */         while (token != null && (nextLine = reader.readNext()) != null) {
/* 208 */           List<String[]> allData = (List)new ArrayList<String>();
/*     */           
/* 210 */           CmpDatos cmpReqA1 = new CmpDatos();
/* 211 */           cmpReqA1.setCbteModo(nextLine[0].trim());
/* 212 */           cmpReqA1.setCuitEmisor((new Long(nextLine[1])).longValue());
/* 213 */           cmpReqA1.setPtoVta(Integer.parseInt(nextLine[2]));
/* 214 */           cmpReqA1.setCbteTipo(Integer.parseInt(nextLine[3]));
/* 215 */           cmpReqA1.setCbteNro((new Long(nextLine[4])).longValue());
/* 216 */           cmpReqA1.setCbteFch(nextLine[5].trim());
/* 217 */           cmpReqA1.setImpTotal((new Double(nextLine[6].replaceAll(",", "."))).doubleValue());
/* 218 */           cmpReqA1.setCodAutorizacion(nextLine[7].trim());
/* 219 */           cmpReqA1.setDocTipoReceptor(nextLine[8].trim());
/* 220 */           cmpReqA1.setDocNroReceptor(nextLine[9].trim());
/*     */ 
/*     */           
/* 223 */           CmpAuthRequest cmpAuthRequest = token;
/* 224 */           CmpResponse cbtCmp = getComprobanteConstatar(cmpAuthRequest, cmpReqA1);
/* 225 */           String resultado = cbtCmp.getResultado();
/* 226 */           String fechaProceso = cbtCmp.getFchProceso();
/* 227 */           Err[] errores = cbtCmp.getErrors();
/* 228 */           Obs[] observaciones = cbtCmp.getObservaciones();
/* 229 */           Evt[] eventos = cbtCmp.getEvents();
/* 230 */           log.info("Informacion Enviada a AFIP: Fecha:" + cmpReqA1.getCbteFch() + 
/* 231 */               " Modalidad:" + cmpReqA1.getCbteModo() + 
/* 232 */               " Nro:" + cmpReqA1.getCbteNro() + 
/* 233 */               " Tipo:" + cmpReqA1.getCbteTipo() + 
/* 234 */               " Codigo de Autorizacion:" + cmpReqA1.getCodAutorizacion() + 
/* 235 */               " Cuit Emisor:" + cmpReqA1.getCuitEmisor() + 
/* 236 */               " DocNroReceptor:" + cmpReqA1.getDocNroReceptor() + 
/* 237 */               " DocTipoReceptor:" + cmpReqA1.getDocTipoReceptor() + 
/* 238 */               " ImpTotal:" + cmpReqA1.getImpTotal() + 
/* 239 */               " PtoVta:" + cmpReqA1.getPtoVta());
/*     */           
/* 241 */           log.info("Resultado de la Constatacion: " + resultado);
/* 242 */           log.info("Fecha proceso: " + fechaProceso);
/* 243 */           log.info("Resultado de Constatacion Fecha:" + cbtCmp.getCmpResp().getCbteFch() + 
/* 244 */               " Modalidad:" + cbtCmp.getCmpResp().getCbteModo() + 
/* 245 */               " Nro:" + cbtCmp.getCmpResp().getCbteNro() + 
/* 246 */               " Tipo:" + cbtCmp.getCmpResp().getCbteTipo() + 
/* 247 */               " Codigo de Autorizacion:" + cbtCmp.getCmpResp().getCodAutorizacion() + 
/* 248 */               " CuitEmisor:" + cbtCmp.getCmpResp().getCuitEmisor() + 
/* 249 */               " DocNroReceptor:" + cbtCmp.getCmpResp().getDocNroReceptor() + 
/* 250 */               " DocTipoReceptor:" + cbtCmp.getCmpResp().getDocTipoReceptor() + 
/* 251 */               " ImpTotal:" + cbtCmp.getCmpResp().getImpTotal() + 
/* 252 */               " PtoVta:" + cbtCmp.getCmpResp().getPtoVta());
/*     */           
/* 254 */           if ((observaciones == null || observaciones.length == 0) && (errores == null || errores.length == 0)) {
/*     */             
/* 256 */             String[] data = { String.valueOf(cbtCmp.getCmpResp().getCbteModo()) + ";" + 
/* 257 */                 cbtCmp.getCmpResp().getCuitEmisor() + ";" + 
/* 258 */                 cbtCmp.getCmpResp().getPtoVta() + ";" + 
/* 259 */                 cbtCmp.getCmpResp().getCbteTipo() + ";" + 
/* 260 */                 cbtCmp.getCmpResp().getCbteNro() + ";" + 
/* 261 */                 cbtCmp.getCmpResp().getCbteFch() + ";" + 
/* 262 */                 cbtCmp.getCmpResp().getImpTotal() + ";" + 
/* 263 */                 cbtCmp.getCmpResp().getCodAutorizacion() + ";" + 
/* 264 */                 cbtCmp.getCmpResp().getDocTipoReceptor() + ";" + 
/* 265 */                 cbtCmp.getCmpResp().getDocNroReceptor() + ";" + 
/* 266 */                 cbtCmp.getFchProceso() + ";" + 
/* 267 */                 cbtCmp.getResultado() + ";" + 
/* 268 */                 ";;;" };
/* 269 */             allData.add(data);
/*     */           } 
/* 271 */           if (observaciones != null && observaciones.length > 0) {
/* 272 */             log.info("Observaciones: ");
/* 273 */             for (int i = 0; i < observaciones.length; i++) {
/* 274 */               log.info(String.valueOf(String.valueOf(observaciones[i].getCode())) + " - " + observaciones[i].getMsg());
/*     */               
/* 276 */               String[] data = { String.valueOf(cbtCmp.getCmpResp().getCbteModo()) + ";" + 
/* 277 */                   cbtCmp.getCmpResp().getCuitEmisor() + ";" + 
/* 278 */                   cbtCmp.getCmpResp().getPtoVta() + ";" + 
/* 279 */                   cbtCmp.getCmpResp().getCbteTipo() + ";" + 
/* 280 */                   cbtCmp.getCmpResp().getCbteNro() + ";" + 
/* 281 */                   cbtCmp.getCmpResp().getCbteFch() + ";" + 
/* 282 */                   cbtCmp.getCmpResp().getImpTotal() + ";" + 
/* 283 */                   cbtCmp.getCmpResp().getCodAutorizacion() + ";" + 
/* 284 */                   cbtCmp.getCmpResp().getDocTipoReceptor() + ";" + 
/* 285 */                   cbtCmp.getCmpResp().getDocNroReceptor() + ";" + 
/* 286 */                   cbtCmp.getFchProceso() + ";" + 
/* 287 */                   cbtCmp.getResultado() + ";" + 
/* 288 */                   "O;" + 
/* 289 */                   String.valueOf(observaciones[i].getCode()) + ";" + 
/* 290 */                   observaciones[i].getMsg() + ";" };
/*     */               
/* 292 */               allData.add(data);
/*     */             } 
/*     */           } 
/* 295 */           if (errores != null && errores.length > 0) {
/* 296 */             log.info("Errores: ");
/* 297 */             for (int i = 0; i < errores.length; i++) {
/* 298 */               log.info(String.valueOf(String.valueOf(errores[i].getCode())) + " - " + errores[i].getMsg());
/*     */               
/* 300 */               String[] data = { String.valueOf(cbtCmp.getCmpResp().getCbteModo()) + ";" + 
/* 301 */                   cbtCmp.getCmpResp().getCuitEmisor() + ";" + 
/* 302 */                   cbtCmp.getCmpResp().getPtoVta() + ";" + 
/* 303 */                   cbtCmp.getCmpResp().getCbteTipo() + ";" + 
/* 304 */                   cbtCmp.getCmpResp().getCbteNro() + ";" + 
/* 305 */                   cbtCmp.getCmpResp().getCbteFch() + ";" + 
/* 306 */                   cbtCmp.getCmpResp().getImpTotal() + ";" + 
/* 307 */                   cbtCmp.getCmpResp().getCodAutorizacion() + ";" + 
/* 308 */                   cbtCmp.getCmpResp().getDocTipoReceptor() + ";" + 
/* 309 */                   cbtCmp.getCmpResp().getDocNroReceptor() + ";" + 
/* 310 */                   cbtCmp.getFchProceso() + ";" + 
/* 311 */                   cbtCmp.getResultado() + ";" + 
/* 312 */                   "E;" + 
/* 313 */                   String.valueOf(errores[i].getCode()) + ";" + 
/* 314 */                   errores[i].getMsg() + ";" };
/*     */               
/* 316 */               allData.add(data);
/*     */             } 
/*     */           } 
/* 319 */           if (eventos != null && eventos.length > 0) {
/* 320 */             log.info("Eventos: ");
/* 321 */             for (int i = 0; i < eventos.length; i++) {
/* 322 */               log.info(String.valueOf(String.valueOf(eventos[i].getCode())) + " - " + eventos[i].getMsg());
/*     */             }
/*     */           } 
/*     */           
/* 326 */           String fileOut = String.valueOf(pathOut) + "/CC_" + cbtCmp.getCmpResp().getCuitEmisor() + "_" + 
/* 327 */             cbtCmp.getCmpResp().getPtoVta() + "_" + 
/* 328 */             cbtCmp.getCmpResp().getCbteTipo() + "_" + 
/* 329 */             cbtCmp.getCmpResp().getCbteNro() + "_" + 
/* 330 */             cbtCmp.getCmpResp().getCbteFch() + "_" + 
/* 331 */             cbtCmp.getCmpResp().getCodAutorizacion() + "_" + 
/* 332 */             cbtCmp.getFchProceso() + 
/* 333 */             ".txt";
/* 334 */           CSVWriter writer = new CSVWriter(new FileWriter(fileOut), ';');
/* 335 */           writer.writeAll(allData);
/* 336 */           writer.close();
/*     */         } 
/* 338 */         reader.close();
/* 339 */         File source = new File(String.valueOf(String.valueOf(pathIn)) + "/" + file);
/* 340 */         File dirDst = new File(pathDest);
/* 341 */         File dest = new File(dirDst, source.getName());
/* 342 */         boolean success = source.renameTo(dest);
/* 343 */         if (success)
/* 344 */           continue;  log.error("Error moviendo archivo procesado.");
/* 345 */         log.error("Origen: " + source.getAbsolutePath());
/* 346 */         log.error("Destino: " + dest.getAbsolutePath());
/*     */       }
/* 348 */       while (dr.hasNext());
/* 349 */     } catch (FileNotFoundException e) {
/*     */       
/* 351 */       e.printStackTrace();
/* 352 */     } catch (IOException e) {
/*     */       
/* 354 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static CmpResponse getComprobanteConstatar(CmpAuthRequest auth, CmpDatos cmpReq) {
/*     */     try {
/* 361 */       CmpResponse cbtCmp = ServiceSoap.comprobanteConstatar(token, cmpReq);
/* 362 */       return cbtCmp;
/*     */     }
/* 364 */     catch (Exception e) {
/* 365 */       log.error(e);
/* 366 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static void consultarFuncionamiento() {
/* 372 */     CmpAuthRequest cmpAuthRequest = token;
              Calendar Fecha = new GregorianCalendar(); 
              // Obtengo el mes a variable y adiciono 1 ya que el mes en fomato gregoriano
              // comienza en 0 para Enero, 1 para Febrero y asi sucecisvamnte
              int Mes = Fecha.get(Calendar.MONTH);
              Mes = Mes + 1 ;
/* 373 */     DummyResponse dReponse = getDummyReponse(cmpAuthRequest);
/* 374 */     String appServer = dReponse.getAppServer();
/* 375 */     log.info("Estado de Servicios:" + appServer + " - Fecha "+ 
			  Fecha.get(Calendar.DAY_OF_MONTH) + "/" +
			  Mes +"/"+
			  Fecha.get(Calendar.YEAR) +" Hora "+
			  Fecha.get(Calendar.HOUR_OF_DAY) +":"+
			  Fecha.get(Calendar.MINUTE) +":"+
			  Fecha.get(Calendar.SECOND));
/*     */   }
/*     */ 
/*     */   
/*     */   public static DummyResponse getDummyReponse(CmpAuthRequest auth) {
/*     */     try {
/* 381 */       DummyResponse dReponse = ServiceSoap.comprobanteDummy();
/* 382 */       return dReponse;
/*     */     }
/* 384 */     catch (Exception e) {
/* 385 */       log.error(e);
/* 386 */       return null;
/*     */     } 
/*     */   }
/*     */ }