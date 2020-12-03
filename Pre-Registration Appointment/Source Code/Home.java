import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

class Home extends Frame implements ActionListener{
	private Frame parent;
	private  MAIN main;
	
	public StudentSerial ss;         //association with StudentSerial class
	public Faculty_control fc;       //association with Faculty_control class
	public Volunteer_status vs;      //association with Volunteer_status class
	

	
	TextField t;
	TextField t2;
	
		public Home(MAIN m){
			
			
			
			super("Free Slot Scheduler:Login");
			
			ss = new StudentSerial(this);       //calling the constructor of StudentSerial class
			fc = new Faculty_control(this);     //calling the constructor of Faculty_control class
			vs = new Volunteer_status(this);    //calling the constructor of Volunteer_status class
			
			main=m;
			
			//creating lebels,textfield and buttons for the window.
			
			Label l = new Label("ID");
			
			Label l2 = new Label("Password");
			
			 t = new TextField(28);
			
			 t2 = new TextField(28);
			
			Button b1 = new Button("Login Student");
			
			Button b2 = new Button("Login Faculty");
			
			Button b3 = new Button("Login Volunteer");
			
			Button b4 = new Button("Back");
			
			add(l); add(t) ; add(l2); add(t2); add(b1); add(b2); add(b3); add(b4);   //adding all the lebels, buttons and textfield in the window.
			
			b1.addActionListener(this);
		    b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			
			setLayout(new FlowLayout());
			
			setSize(250,400);
			setLocation(450,450);
			
		    
		}
		public void actionPerformed(ActionEvent ae){
			String s = ae.getActionCommand();
			
			// goes back to the First window
			
			if(s.equals("Back")){
			this.setVisible(false);
			main.setVisible(true);
		}
		    else if(s.equals("Login Student"))
			
			if(t.getText().length()==0 || t2.getText().length()==0){
				
				JOptionPane.showMessageDialog(this,"You Must Fill up all the information.");
			}
			
			else{
                        DataAccess da=new DataAccess();
			String typedID=t.getText();
			String typedPass=t2.getText();
			
			//String q="select * from student";
			String q="select * from student where ID='"+typedID+"' and pass='"+typedPass+"'";
			ResultSet rs=null;
			System.out.println("Button pressed");		
			try{
				rs=da.getData(q);
				System.out.println(q);
				while(rs.next()){
					String n = rs.getString("ID");
					String p = rs.getString("pass");
					if(n.equals(typedID) && p.equals(typedPass)){
						
						//logs in to the Student panel,closes current window and opens student window
						
						System.out.println("Correct Cred.");
						JOptionPane.showMessageDialog(this,"Login Successful.");
						
						this.setVisible(false);
						ss.setVisible(true);
						
						
						break;
					}
				
				}
			}
			catch(Exception ex){
				JOptionPane.showMessageDialog(this,"Login Unsuccessful.");
				 
                                 
			}

                                 t.setText("");
                                 t2.setText("");
								 
								 //performed only when login is unsuccessful.

				
			}
			
			else if(s.equals("Login Faculty"))
			
			if(t.getText().length()==0 || t2.getText().length()==0){
				
				JOptionPane.showMessageDialog(this,"You Must Fill up all the information.");
			}
			
			
			else{ 
                        DataAccess da=new DataAccess();
			String typedID=t.getText();
			String typedPass=t2.getText();
			//String q="select * from faculty";
			String q="select * from faculty where ID='"+typedID+"' and pass='"+typedPass+"'";
			ResultSet rs=null;
			System.out.println("Button pressed");		
			try{
				rs=da.getData(q);
				System.out.println(q);
				while(rs.next()){
					String n = rs.getString("ID");
					String p = rs.getString("pass");
					if(n.equals(typedID) && p.equals(typedPass)){
						System.out.println("Correct Cred.");
						JOptionPane.showMessageDialog(this,"Login Successful.");
						
						//logs in to the faculty panel,closes current window and opens faculty window
						
						this.setVisible(false);
						fc.setVisible(true);
						break;
					}
					
					
					
				}
			}
			catch(Exception ex){
				JOptionPane.showMessageDialog(this,"Login Unsuccessful.");
				 
                                 
			}
                                 t.setText("");
                                 t2.setText("");
								 
								 //performed only when login is unsuccessful.



				
				
			}
			
			else if(s.equals("Login Volunteer"))
			
			if(t.getText().length()==0 || t2.getText().length()==0){
				
				JOptionPane.showMessageDialog(this,"You Must Fill up all the information.");
			}
			
			else{ 
                        DataAccess da=new DataAccess();
			String typedID=t.getText();
			String typedPass=t2.getText();
			//String q="select * from volunteer";
			String q="select * from volunteer where ID='"+typedID+"' and pass='"+typedPass+"'";
			ResultSet rs=null;
			System.out.println("Button pressed");		
			try{
				rs=da.getData(q);
				System.out.println(q);
				while(rs.next()){
					String n = rs.getString("ID");
					String p = rs.getString("pass");
					if(n.equals(typedID) && p.equals(typedPass)){
						System.out.println("Correct Cred.");
						JOptionPane.showMessageDialog(this,"Login Successful.");
						
						//logs in to the volunteer panel,closes current window and opens volunteer window.
						
						this.setVisible(false);
						vs.setVisible(true);
						
						
						break;
					}
					
					
					
				}
			}
			catch(Exception ex){
				JOptionPane.showMessageDialog(this,"Login Unsuccessful.");
				 
                                 
			}
                                 t.setText("");
                                 t2.setText("");
								 
								 //performed only when login is unsuccessful.



				
				
			}
		}
		
		
		
		public void setParent(Frame m){parent=m;} //setting the login window as the parent for this window.
		
		
	
	}
