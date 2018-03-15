 import java.io.*;
 class dcmnt2{
 	 public static void main(String[] args) {
 		File f= new File ("C://");
 		File [] files = f.listFiles();

 		for (int i=0;i<files.length;i++){
 			File h= files [i];
 			if(h.isDirectory())System.out.println("<dir>"+ h.getName());

 			 else if (h.isFile())System.out.println("<File>" + h.getName());

 			 else System.out.println("<Link>" + h.getName());
 		}
 	}
 }