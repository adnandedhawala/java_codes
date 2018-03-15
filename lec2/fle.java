//this program prints the contents of the file by converting higher to lower case and viceversa


import java.io.*;
class fle{
 public static void main (String args[])throws Exception{
 File f= new File("C:\\temp\\abc.txt");
 boolean flag= f.exists();
 System.out.println(flag);
 FileInputStream fis= new FileInputStream (f);
 int ch=0;
 while( (ch=fis.read())!=-1){
  	if(ch>=65&&ch<=91)ch=ch+32;
	else if(ch>=97&&ch<=123)ch=ch-32;
	System.out.print((char)ch);
  }
 }
}

