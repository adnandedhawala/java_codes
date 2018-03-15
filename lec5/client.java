import java.net.*;

class client{
	public static void main(String[] args) throws Exception {
		DatagramSocket ds= new DatagramSocket();
		String data = "okokokokokokokokokokokokokok";
		byte[] buf= new byte[512];
		buf = data.getBytes();
		DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(),9999);
		ds.send(dp);
	}
}