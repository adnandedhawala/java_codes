// use of buffered reader 
// this program takes data from user and puts it into the file 


import java.io.*;

class confleread{
	public static void main(String[] args)throws Exception {
		File f= new File ("C:\\lec3\\ady.txt");
		PrintWriter pw= new PrintWriter (f);
		InputStream is = System.in;
		InputStreamReader ISR= new InputStreamReader (is);
		BufferedReader br = new BufferedReader (ISR);
		String line = "";
		while ((line=br.readLine())!=null){
			if(line.equalsIgnoreCase ("ok"))break;
			
			pw.println(line);
			pw.flush();//flushes the content from ram to harddisk

		}
	//fos.close();
	}
}
