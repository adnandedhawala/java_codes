import java.awt.*;
class nwthrd extends Frame implements Runnable{
	nwthrd(){
		setSize (300,300);
		setVisible(true);
		Thread t = new Thread(this);
		t.start();
	}
	public void run(){
		while(true){
			System.out.println("in run ");
		}
	}
		
	public static void main(String[] args) {
		nwthrd obj = new nwthrd();

	}
}