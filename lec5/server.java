import java.net.*;
class server{
	public static void main(String[] args)throws Exception{
		DatagramSocket ds =  new DatagramSocket(9999);
		byte[] buf= new byte [512];
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		ds.receive(dp);
		buf = dp.getData();
		String str = new String (buf);
		System.out.println(str);
	}
}