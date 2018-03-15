import java.awt.*;
import java.awt.event.*;
class mouselne extends Frame implements MouseListener{
	mouselne(){
		setSize (300,300);
		setVisible(true);
		addMouseListener(this);

	}

	public void mousePressed(MouseEvent me){
		Graphics g = getGraphics ();
		int x= me.getX();
		int y= me.getY();
		g.setColor(Color.RED);
		g.drawLine(0,0,x,y);

	}

	public void mouseReleased(MouseEvent me){
		System.out.println("Released");
		//setBackground (Color.BLUE);
	}
	public void mouseClicked(MouseEvent me){
		System.out.println("Clicked");
		//setBackground (Color.BLACK);
	}
	public void mouseEntered(MouseEvent me){
		//setBackground (Color.PINK);
	}
	public void mouseExited(MouseEvent me){
		//setBackground (Color.ORANGE);
	}

	public static void main(String[] args) {
		mouselne obj = new mouselne();
	}
}