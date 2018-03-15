import java.awt.*;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
import java.awt.event.*;
// import java.awt.Stroke.*;
// import
class mnu extends Frame implements ActionListener, MouseListener,MouseMotionListener{
	int oldx, oldy;
	Color c= Color.RED;
	BasicStroke bs_1 = new BasicStroke (1);
	BasicStroke bs_5= new BasicStroke (5);
	BasicStroke bs_10= new BasicStroke (10);
	BasicStroke erase= new BasicStroke (25);
	BasicStroke bs=bs_1;
	mnu(){ 
		
		MenuBar mb = new MenuBar();
		Menu mnu_color = new Menu("COLOUR MENU");
		Menu mnu_size= new Menu("BRUSH SIZE");
		Menu mnu_erase = new Menu("ERASE");

		MenuItem mi_one = new MenuItem ("1");
		MenuItem mi_five = new MenuItem ("5");
		MenuItem mi_ten = new MenuItem ("10");

		MenuItem mi_erase = new MenuItem ("ERASE");		

		MenuItem mi_red = new MenuItem ("RED");
		MenuItem mi_blue = new MenuItem ("BLUE");
		MenuItem mi_green = new MenuItem ("GREEN");
		MenuItem mi_cyan = new MenuItem ("CYAN");
		MenuItem mi_gray = new MenuItem ("GRAY");
		MenuItem mi_magenta = new MenuItem ("MAGENTA");

		mnu_size.add (mi_one);
		mnu_size.add (mi_five);
		mnu_size.add (mi_ten);

		mnu_color.add (mi_red);
		mnu_color.add (mi_blue);
		mnu_color.add (mi_green);
		mnu_color.add (mi_cyan);
		mnu_color.add (mi_gray);
		mnu_color.add (mi_magenta);

		mnu_erase.add(mi_erase);

		mb.add(mnu_size);
		mb.add (mnu_color);
		mb.add(mnu_erase);
		setMenuBar(mb); //adds menubar to frame

		mi_one.addActionListener (this);
		mi_five.addActionListener (this);
		mi_ten.addActionListener (this);

		mi_red.addActionListener (this);
		mi_blue.addActionListener (this);
		mi_green.addActionListener (this);
		mi_cyan.addActionListener (this);
		mi_gray.addActionListener (this);
		mi_magenta.addActionListener (this);

		mi_erase.addActionListener (this);

		addMouseListener(this);
		addMouseMotionListener(this);
		setSize (300,300);
		setVisible(true);

	}
	public void actionPerformed (ActionEvent ae){
		String name= ae.getActionCommand();
		System.out.println(name);
		if(name.equals ("RED"))c=Color.RED;
		if(name.equals ("BLUE"))c=Color.BLUE;
		if(name.equals ("GREEN"))c=Color.GREEN;		
		if(name.equals ("CYAN"))c=Color.CYAN;
		if(name.equals ("GRAY"))c=Color.GRAY;
		if(name.equals ("MAGENTA"))c=Color.MAGENTA;

		if(name.equals ("ERASE")){
			c=Color.WHITE;
			bs= erase;
		}

		if(name.equals ("1")) bs=bs_1;
		if(name.equals ("5")) bs=bs_5;
		if(name.equals ("10")) bs=bs_10;
	}
	
	

	public void mousePressed(MouseEvent me){
		
		oldx=me.getX();
		oldy=me.getY();
		System.out.println("pressed");

	}
	public void mouseDragged(MouseEvent me){
		Graphics g = getGraphics ();
		Graphics2D g2= (Graphics2D) g;
		g2.setStroke(bs);

		int x= me.getX();
		int y= me.getY();
		g.setColor(c);
		g.drawLine(oldx,oldy,x,y);
		oldx=x;
		oldy= y;


	}
	public void mouseMoved(MouseEvent me){
		// System.out.println("moved");
	}	

	public void mouseReleased(MouseEvent me){
		 // System.out.println("Released");
	}
	public void mouseClicked(MouseEvent me){
		// System.out.println("Clicked");
		
	}
	public void mouseEntered(MouseEvent me){
		// System.out.println("Entered");
	}
	public void mouseExited(MouseEvent me){
		// System.out.println("Exited");
	}

}


class test{
	public static void main(String[] args) {
		mnu obj = new mnu();

	}
}