//the program takes a line and prints it
//and exits if you type quit



import java.io.*;

class bfreader{
	public static void main(String[] args)throws Exception {
		InputStream is = System.in;
		InputStreamReader ISR= new InputStreamReader (is);// can also be written as InputStreamReader ISR= new InputStreamReader (System.in)  
		BufferedReader br = new BufferedReader (ISR);
		String line = "";
		while ((line=br.readLine())!=null){
			if(line.equalsIgnoreCase ("QUIT"))break;
			System.out.println(line);

		}
	}
}