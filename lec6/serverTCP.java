import java.net.*;
import java.io.*;
class serverTCP {
	public static void main(String[] args) throws Exception{
		ServerSocket s1= new ServerSocket (9999);
		System.out.println("Waiting for client");
		Socket s = s1.accept();
		InputStream is = s.getInputStream();
		InputStreamReader isr = new InputStreamReader (is);
		BufferedReader br = new BufferedReader (isr);
		String str = br.readLine();
		System.out.println(str);
	}
} 