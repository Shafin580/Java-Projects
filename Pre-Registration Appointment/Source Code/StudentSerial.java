import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class StudentSerial extends Frame implements ActionListener{
	
	private Frame parent;
	private  Home home;
	
	public Student_data sd1;   //association with Student_data class
	
		public StudentSerial(Home h){
			
			super("Free Slot Scheduler:Student Serial Status");
			
			sd1 = new Student_data(this);  //calling the constructor of Student_data class
			
			home=h;
			
			//creating and adding buttons for this window.
			
			Button b1 = new Button("Log out");
			
			Button b2 = new Button("Show all");
			
			add(b1); add(b2);
			
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
			
			//closes this window and opens the login window.
		}
		
		else if(s.equals("Show all")){
			
			
			sd1.setVisible(true); //opens the window of Student_data class 
	
		
		}
			
		}
		
		
		
		public void setParent(Frame h){parent=h;}
		
}