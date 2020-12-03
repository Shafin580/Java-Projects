import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

class Volunteer_status extends Frame implements ActionListener{
	
	private Frame parent;
	private  Home home;
	
	public Student_data sd2; //association with Student_data class
	
	public Volunteer_status(Home h){
		
		super("Free Slot Scheduler:Volunteer Control Panel");
		
		sd2 = new Student_data(this);  //calling the constructor of Student_data class
		
		home=h;
		
		//creating buttons
		
		Button b1 = new Button("Log out");
		
		Button b2 = new Button("Show all");
		
		add(b1); add(b2); //adding buttons
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		
			
		setLayout(new FlowLayout());
			
		setSize(200,200);
			
		setLocation(450,450);
		
		
		
	}
	

	
	public void actionPerformed(ActionEvent ae){
			
		String s = ae.getActionCommand();
			
		if(s.equals("Log out")){
			
		home.setVisible(true);
		this.setVisible(false);
		}
		
		else if(s.equals("Show all")){
			
			
			sd2.setVisible(true); //opens the window of Student_data class 
	
		
		}
			
		}
		
		
		
		public void setParent(Frame h){parent=h;}
	
}