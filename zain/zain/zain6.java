import java.awt.Frame;
class zain6{
 public static void main (String args[]){
	Frame f= new Frame();
	f.setSize(300,300);
	f.setVisible(true);
	
	int x=21;
	int dx=1;
	int y=19;
	int dy=1;

	while(true){
		try{
			Thread.sleep(10);
			}
		catch(Exception e){
			}
		x=x+dx;
		y=y+dy;
		if(x>1365-300 || x<0)dx=-dx;
		if(y>768-300 || y<0)dy=-dy;
		f.setLocation(x,y);
		}
	}
}