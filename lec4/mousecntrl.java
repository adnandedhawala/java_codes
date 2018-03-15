import java.awt.*;
import java.awt.event.*;
class mousecntrl extends Frame implements MouseListener{
	mousecntrl(){
		setSize (300,300);
		setVisible(true);
		addMouseListener(this);

	}

	public void mousePressed(MouseEvent me){
		System.out.println("Pressed");
		setBackground (Color.GREEN);
	}

	public void mouseReleased(MouseEvent me){
		System.out.println("Released");
		setBackground (Color.BLUE);
	}
	public void mouseClicked(MouseEvent me){
		System.out.println("Clicked");
		setBackground (Color.BLACK);
	}
	public void mouseEntered(MouseEvent me){
		setBackground (Color.PINK);
	}
	public void mouseExited(MouseEvent me){
		setBackground (Color.ORANGE);
	}

	public static void main(String[] args) {
		mousecntrl obj = new mousecntrl();
	}
}