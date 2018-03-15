import java.net.*;
import java.io.*;
class clientTCP{
	public static void main(String[] args) throws Exception {
		Socket s = new Socket ("localhost",9999);
		OutputStream os = s.getOutputStream();
		PrintWriter pw = new PrintWriter (os);
		pw.println("Adnan cunt");
		pw.flush();
	}
}