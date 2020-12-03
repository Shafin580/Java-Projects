import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Faculty_control extends Frame implements ActionListener{
	private Frame parent; 
	private  Home home;   //association with Home class
	
	
	public Delete d;  //association with Delete class
	public Student_data sd;  //association with Student_data class
	
	
	
		public Faculty_control(Home h){
			super("Free Slot Scheduler:Admin Control Panel");
			
			sd = new Student_data(this);  //calling the constructor of Student_data class
			d = new Delete(this);         //calling the constructor of Delete class
			
			home=h;
			
			//creating lebels and buttons for the window.
			
			Label l = new Label("Welcome,Admin");
			
			Button b2 = new Button("Log out");
			
			Button b3 = new Button("Show all");
			
			Button b4 = new Button("Late");
			
			add(l); add(b3); add(b4); add(b2); //adding all the lebels, buttons and textfield in the window.
			
			//setting the size and the location of the lebels,buttons and inside the window.
			
			l.setBounds(10,50,110,60);

			b4.setBounds(130,150,40,40);
			
			b3.setBounds(180,150,70,40);
			
			b2.setBounds(20,230,60,60);
			
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			
			setLayout(null);
			
			setSize(300,300);
			
			setLocation(450,450);
			
		    
		}
		public void actionPerformed(ActionEvent ae){
			
			String s = ae.getActionCommand();
			
			// goes back to the Login window
			
			if(s.equals("Log out")){
			this.setVisible(false);
			home.setVisible(true);
		}
		
		 else if(s.equals("Late")){
			 
			 d.setVisible(true);
			 
		 }
		
	     else if(s.equals("Show all")){
			
			
			sd.setVisible(true); //opens the window of Student_data class 
	
		
		}
			
		}
		
		
		public void setParent(Frame h){parent=h;} //setting the login window as the parent for this window.

		
		
		
		
		
		
	}
	

	
	