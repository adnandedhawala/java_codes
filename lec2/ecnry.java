// pass values as ty1.txt ty1.enc
// then pass values as ty1.enc ty1.org 
// C:\lec2>java ecnry ty1.txt ty2.txt

import java.io.*;
class ecnry{
 public static void main (String args[])throws Exception{

 File f= new File(args[0]);
 File f1= new File(args[1]);

 FileInputStream fis= new FileInputStream (f);
 FileOutputStream fio= new FileOutputStream (f1);
 int key=3;
 int ch=0;
 while((ch= fis.read())!=-1){
   ch=ch^key;
   fio.write(ch);
   }

  fis.close();
 }
}