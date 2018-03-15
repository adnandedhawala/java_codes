import java.awt.*;
import java.awt.event.*;
class mousedrg extends Frame implements MouseListener,MouseMotionListener{
	int oldx, oldy;
	mousedrg(){
		setSize (300,300);
		setVisible(true);
		addMouseListener(this);
		addMouseMotionListener(this);

	}

	public void mousePressed(MouseEvent me){
		// Graphics g = getGraphics ();
		// int x= me.getX();
		// int y= me.getY();
		// g.setColor(Color.RED);
		// g.drawLine(0,0,x,y);
		oldx=me.getX();
		oldy=me.getY();
		System.out.println("pressed");

	}
	public void mouseDragged(MouseEvent me){
		Graphics g = getGraphics ();
		int x= me.getX();
		int y= me.getY();
		g.setColor(Color.RED);
		g.drawLine(oldx,oldy,x,y);
		oldx=x;
		oldy= y;

	}
	public void mouseMoved(MouseEvent me){
		System.out.println("moved");
	}	

	public void mouseReleased(MouseEvent me){
		// System.out.println("Released");
		// setBackground (Color.BLUE);

	}
	public void mouseClicked(MouseEvent me){
		System.out.println("Clicked");
		setBackground (Color.BLACK);
	}
	public void mouseEntered(MouseEvent me){
		//setBackground (Color.PINK);
	}
	public void mouseExited(MouseEvent me){
		//setBackground (Color.ORANGE);
	}

	public static void main(String[] args) {
		mousedrg obj = new mousedrg();
	}
}