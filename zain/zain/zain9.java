import java.awt.*;


class zain9 extends Frame{
 zain9(){
	System.out.println("in constructor");
	this.setSize(400,400);
	this.setVisible(true);
	}

 public void paint(Graphics g){
 //System.out.println("in paint");
  while(true){
 	 int red= (int)(Math.random()*255);
 	 int blue= (int)(Math.random()*255);
  	int green= (int)(Math.random()*255);
  	Color c= new Color(red,green,blue);
  	g.setColor(c);

	 int x= (int)(Math.random()*300);
 	int y= (int)(Math.random()*300);
 	g.drawLine (0,0,x,y);
	}
		}
}
class test{
public static void main(String args[]){
	zain9 obj= new zain9();
 }
}