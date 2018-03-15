import java.io.*;
class cpy{
 public static void main (String args[])throws Exception{
 
//  file path can be passed through args like
//  File f= new File(args[0]);
// but remember to give the whole path("C:\\temp\\abc.txt") in cmd prompt

 File f= new File("C:\\temp\\abc.txt"); 
 File f1= new File("C:\\temp\\pqr.txt");

 FileInputStream fis= new FileInputStream (f);
 FileOutputStream fio= new FileOutputStream (f1);
 
 int ch=0;
 while((ch= fis.read())!=-1){
   fio.write(ch);
   }
  fio.close();
  fis.close();
 }
}