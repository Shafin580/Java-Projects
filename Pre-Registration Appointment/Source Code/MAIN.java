import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

public class MAIN extends Frame implements ActionListener, WindowListener{
	
	public Home h;          //association with Home class
	public Student s;       //association with Student class
	
	
	
	public MAIN(){
		super("Free Slot Scheduler:Home");
		h = new Home(this);                  //calling the constructor of Home class
		s = new Student(this);               //calling the constructor of Student class
		
		//Creating buttons for this window
		
		Button b1 = new Button("Login");
		Button b2 = new Button("signup");
		
		
		add(b1);add(b2); //adding buttons for this window
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		
		addWindowListener(this);
		
		setLayout(new FlowLayout());
		setSize(280,400);
		setLocation(450,450);
		setVisible(true);
	}
	
	
	
	public void actionPerformed(ActionEvent ae){
		String ab = ae.getActionCommand();
		
		if(ab=="Login")
		{
			//closes the current window and opens the login window.
			
			this.setVisible(false);
			h.setVisible(true);
			
			
		}
		
		else if(ab=="signup")
		{
			//closes the current window and opens the signup for student window.
			
			this.setVisible(false);
			s.setVisible(true);
			
		}
		
		
	}
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e){
		
		System.exit(0);
		
	}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
}
	
	 
	
	 
	
	
	
	
	
