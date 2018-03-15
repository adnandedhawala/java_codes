import java.awt.*;
import java.awt.event.*;
class buton extends Frame implements ActionListener{
	buton(){
		Button b1= new Button("RED");
		Button b2= new Button("BLUE");
		Button b3= new Button("YELLOW");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		add (b1, BorderLayout.SOUTH);
		add (b2, BorderLayout.NORTH);
		add (b3, BorderLayout.WEST);
		setSize (300,300);
		setVisible (true);

	}

	public void actionPerformed (ActionEvent ae){
		String name= ae.getActionCommand();
		System.out.println(name);
		if(name.equalsIgnoreCase ("RED"))setBackground (Color.RED);
		if(name.equalsIgnoreCase ("BLUE"))setBackground (Color.BLUE);
		if(name.equalsIgnoreCase ("YELLOW"))setBackground (Color.YELLOW);

	}

}

class test {
	public static void main(String[] args) {
		buton obj = new buton();	
	}
}