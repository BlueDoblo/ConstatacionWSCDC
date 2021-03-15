/*    */ package Principal;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.FilenameFilter;
/*    */ 
/*    */ public class DirectoryReader
/*    */ {
/*    */   private File folder;
/*    */   private FilenameFilter filter;
/*    */   
/*    */   public DirectoryReader(String path, final String prefix) {
/* 12 */     this.folder = new File(path);
/* 13 */     this.filter = new FilenameFilter()
/*    */       {
/*    */         public boolean accept(File dir, String name) {
/* 16 */           return name.startsWith(prefix);
/*    */         }
/*    */       };
/* 19 */     this.listOfFiles = this.folder.listFiles(this.filter);
/* 20 */     this.actual = -1;
/*    */   }
/*    */   private File[] listOfFiles; int actual;
/*    */   public void refresh() {
/* 24 */     this.listOfFiles = this.folder.listFiles();
/* 25 */     this.actual = -1;
/*    */   }
/*    */   
/*    */   String getFirst() {
/* 29 */     this.actual = -1;
/* 30 */     return getNext();
/*    */   }
/*    */   
/*    */   String getNext() {
/* 34 */     this.actual++;
/* 35 */     while (this.actual < this.listOfFiles.length && !this.listOfFiles[this.actual].isFile()) {
/* 36 */       this.actual++;
/*    */     }
/* 38 */     return this.listOfFiles[this.actual].getName();
/*    */   }
/*    */   
/*    */   boolean hasNext() {
/* 42 */     if (this.actual < this.listOfFiles.length - 1) {
/* 43 */       return true;
/*    */     }
/* 45 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Javas\wscdc.jar!\Principal\DirectoryReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */