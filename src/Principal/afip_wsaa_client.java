/*     */ package Principal;
/*     */ 

/*     */ import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;


/*     */ import java.io.FileInputStream;
/*     */ import java.net.URL;
/*     */ import java.security.KeyStore;
/*     */ import java.security.PrivateKey;
/*     */ import java.security.Provider;
/*     */ import java.security.Security;
/*     */ import java.security.cert.CertStore;
/*     */ import java.security.cert.CollectionCertStoreParameters;
/*     */ import java.security.cert.X509Certificate;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.GregorianCalendar;
/*     */ import javax.xml.rpc.ParameterMode;
/*     */ import org.apache.axis.client.Call;
/*     */ import org.apache.axis.client.Service;
/*     */ import org.apache.axis.encoding.Base64;
/*     */ import org.apache.axis.encoding.XMLType;
/*     */ import org.bouncycastle.cms.CMSProcessable;
/*     */ import org.bouncycastle.cms.CMSProcessableByteArray;
/*     */ import org.bouncycastle.cms.CMSSignedData;
/*     */ import org.bouncycastle.cms.CMSSignedDataGenerator;
/*     */ import org.bouncycastle.jce.provider.BouncyCastleProvider;

/*     */ 
/*     */ @SuppressWarnings("restriction")
public class afip_wsaa_client
/*     */ {
/*     */   public static byte[] create_cms(String p12file, String p12pass, String signer, String dstDN, String service, Long TicketTime, boolean debug) {
/*  40 */     PrivateKey pKey = null;
/*  41 */     X509Certificate pCertificate = null;
/*  42 */     byte[] asn1_cms = null;
/*  43 */     CertStore cstore = null;
/*  44 */     String SignerDN = null;
/*     */     
/*     */     try {
/*  47 */       KeyStore ks = KeyStore.getInstance("pkcs12");
/*     */       
/*  49 */       FileInputStream p12stream = new FileInputStream(p12file);
/*     */       
/*  51 */       ks.load(p12stream, p12pass.toCharArray());
/*  52 */       p12stream.close();
/*     */       
/*  54 */       pKey = (PrivateKey)ks.getKey(signer, p12pass.toCharArray());
/*  55 */       pCertificate = (X509Certificate)ks.getCertificate(signer);
/*  56 */       SignerDN = pCertificate.getSubjectDN().toString();
/*  57 */       ArrayList<X509Certificate> certList = new ArrayList<X509Certificate>();
/*  58 */       certList.add(pCertificate);
/*  59 */       if (Security.getProvider("BC") == null)
/*     */       {
/*  61 */         Security.addProvider((Provider)new BouncyCastleProvider());
/*     */       }
				cstore = CertStore.getInstance("Collection",new CollectionCertStoreParameters(certList),"BC");
/*     */     }
/*  65 */     catch (Exception e) {
/*  66 */       e.printStackTrace();
/*     */     } 
/*  68 */     String LoginTicketRequest_xml = create_LoginTicketRequest(SignerDN, dstDN, service, TicketTime);
/*     */     
/*     */     try {
/*  71 */       CMSSignedDataGenerator gen = new CMSSignedDataGenerator();
/*  72 */       System.out.println(gen);
/*  73 */       gen.addSigner(pKey, pCertificate, CMSSignedDataGenerator.DIGEST_SHA1);
/*  74 */       gen.addCertificatesAndCRLs(cstore);
/*  75 */       CMSProcessableByteArray data = new CMSProcessableByteArray(LoginTicketRequest_xml.getBytes());
/*  76 */       CMSSignedData signed = gen.generate((CMSProcessable)data, true, "BC");
/*  77 */       asn1_cms = signed.getEncoded();
/*     */     }
/*  79 */     catch (Exception e) {
/*  80 */       e.printStackTrace();
/*     */     } 
/*  82 */     return asn1_cms;
/*     */   }
/*     */   static String invoke_wsaa(byte[] LoginTicketRequest_xml_cms, String endpoint) throws Exception {
/*  85 */     String LoginTicketResponse = null;
/*     */     try {
/*  87 */       Service service = new Service();
/*  88 */       Call call = (Call)service.createCall();
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  93 */       call.setTargetEndpointAddress(new URL(endpoint));
/*     */       
/*  95 */       call.setOperationName("loginCms");
/*     */ 
/*     */       
/*  98 */       call.addParameter("request", XMLType.XSD_STRING, ParameterMode.IN);
/*     */       
/* 100 */       call.setReturnType(XMLType.XSD_STRING);
/*     */       
/* 102 */       String cms = Base64.encode(LoginTicketRequest_xml_cms);
/*     */       
/* 104 */       LoginTicketResponse = (String)call.invoke(new Object[] { cms });
/*     */     
/*     */     }
/* 107 */     catch (Exception e) {
/* 108 */       e.printStackTrace();
/*     */     } 
/* 110 */     return LoginTicketResponse;
/*     */   }
/*     */   
/*     */   public static String create_LoginTicketRequest(String SignerDN, String dstDN, String service, Long TicketTime) {
/* 114 */     Date GenTime = new Date();
/* 115 */     GregorianCalendar gentime = new GregorianCalendar();
/* 116 */     GregorianCalendar exptime = new GregorianCalendar();
/* 117 */     String UniqueId = (new Long(GenTime.getTime() / 1000L)).toString();
/* 118 */     exptime.setTime(new Date(GenTime.getTime() + TicketTime.longValue()));
/* 119 */     gentime.setTime(new Date(GenTime.getTime() - 180000L));
/* 120 */     XMLGregorianCalendarImpl XMLGenTime = new XMLGregorianCalendarImpl(gentime);
/* 121 */     XMLGregorianCalendarImpl XMLExpTime = new XMLGregorianCalendarImpl(exptime);
/* 122 */     String LoginTicketRequest_xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><loginTicketRequest version=\"1.0\"><header><source>" + SignerDN + "</source>" + "<destination>" + dstDN + "</destination>" + "<uniqueId>" + UniqueId + "</uniqueId>" + "<generationTime>" + XMLGenTime + "</generationTime>" + "<expirationTime>" + XMLExpTime + "</expirationTime>" + "</header>" + "<service>" + service + "</service>" + "</loginTicketRequest>";
/* 123 */     return LoginTicketRequest_xml;
/*     */   }
/*     */ }

