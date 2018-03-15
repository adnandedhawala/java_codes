import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

class ChatServer extends Frame implements ActionListener,Runnable{
	TextField tf;
	TextArea ta;
	BufferedReader br;
	PrintWriter pw;
		ChatServer() throws Exception {
			ServerSocket ss = new ServerSocket(9999);
			System.out.println ("waiting for connection");
			Socket s = ss.accept();
			System.out.println("connection established");
			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader (is);
			br = new BufferedReader (isr);
			
			OutputStream os = s.getOutputStream();
			pw = new PrintWriter(os);
			
			tf = new TextField();
			ta = new TextArea();
			ta.setEditable(false);
			add (tf, BorderLayout.SOUTH);
			add (ta);
			tf.addActionListener(this);
			setTitle ("Server");
			setSize(300,500);
			setVisible (true);
			Thread t= new Thread (this);
			t.start();

		}

		public void actionPerformed (ActionEvent ae){
			String data = tf.getText();
			data = "Server: " +data;
			ta.append (data + "\n");
			tf.setText ("");


			pw.println(data);
			pw.flush();

		}
		@Override
		public void run(){
			while (true){
				try {
					String str = br.readLine();
					ta.append (str+"\n");
				}
				catch (Exception e) {

				}
			}
		}






	public static void main(String[] args) throws Exception {
	ChatServer obj = new ChatServer();
}
}