import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

class ChatClient extends Frame implements ActionListener,Runnable{
	TextField tf;
	TextArea ta;
	BufferedReader br;
	PrintWriter pw;
		ChatClient() throws Exception {
			Socket s = new Socket("localhost",9999);
			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader (is);
			br = new BufferedReader (isr);
			OutputStream os = s.getOutputStream();
			tf = new TextField();
			ta = new TextArea();
			ta.setEditable(false);
			pw= new PrintWriter(os);
			add (tf, BorderLayout.SOUTH);
			add (ta);
			tf.addActionListener(this);
			setTitle ("Client");
			setSize(300,500);
			setVisible (true);
			Thread t= new Thread (this);
			t.start();


		}

		public void actionPerformed (ActionEvent ae){
			String data = tf.getText();
			data = "client: "+data ;
			ta.append (data +"\n");
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

	public static void main(String[] args) throws Exception{
		ChatClient obj = new ChatClient();
	}
}
