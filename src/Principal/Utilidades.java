/*    */ package Principal;
/*    */ import java.security.Provider;
/*    */ import java.security.Security;
/*    */ import java.util.Enumeration;
/*    */ 
/*    */ public class Utilidades {
/*    */   public void infoProveedoresSeguridad() {
/*  8 */     System.out.println("------------------------------------");
/*  9 */     System.out.println("Proveedores instalados en su sistema");
/* 10 */     System.out.println("------------------------------------");
/* 11 */     Provider[] listaProv = Security.getProviders();
/* 12 */     for (int i = 0; i < listaProv.length; i++) {
/* 13 */       System.out.println("Num. proveedor : " + (i + 1));
/* 14 */       System.out.println("Nombre         : " + listaProv[i].getName());
/* 15 */       System.out.println("Versionn        : " + listaProv[i].getVersion());
/* 16 */       System.out.println("Informacion    :\n  " + listaProv[i].getInfo());
/* 17 */       System.out.println("Propiedades    :");
/* 18 */       Enumeration<?> propiedades = listaProv[i].propertyNames();
/* 19 */       while (propiedades.hasMoreElements()) {
/* 20 */         String clave = (String)propiedades.nextElement();
/* 21 */         String valor = listaProv[i].getProperty(clave);
/* 22 */         System.out.println("  " + clave + " = " + valor);
/*    */       } 
/* 24 */       System.out.println("------------------------------------");
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Javas\wscdc.jar!\Principal\Utilidades.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */