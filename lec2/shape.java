
import java.awt.*;


class shape extends Frame{
 shape(){
	System.out.println("in constructor");
	this.setSize(300,300);
	this.setVisible(true);
	}

 public void paint (Graphics g){
 	g.drawOval(100,100,50,30);
	

 	}
}

class test{
public static void main(String args[]){
	shape obj= new shape();
 }
}
