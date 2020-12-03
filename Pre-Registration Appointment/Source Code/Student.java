import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
class Student extends Frame implements ActionListener{
	
	private Frame parent;
	private  MAIN main;   //association with MAIN class
	
	TextField t;
	TextField t2;
	TextField t3;
	TextField t4;
	TextField t5;
	TextField t6;
	
	
	
		public Student(MAIN m){
			
			
			super("Free Slot Scheduler:Student Panel");
			
			main=m;
			
			//creating lebels,textfield and buttons for the window. 
			
			Label l = new Label("Name");
			
			Label l2 = new Label("ID");
			
			Label l3 = new Label("Password");
			
			Label l4 = new Label("CGPA");
			
			Label l5 = new Label("Current Semester");
			
			Label l6 = new Label("Department");
			
		    t = new TextField(28);
			
			t2 = new TextField(28);
			
			t3 = new TextField(28);
			
			t4 = new TextField(28);
			
			t5 = new TextField(28);
			
			t6 = new TextField(28);
			
			Button b1 = new Button("Register");
			
			Button b2 = new Button("Back");
			
			add(l); add(t) ; add(l2); add(t2); add(l3); add(t3);  add(l4); add(t4);  add(l5); add(t5);  add(l6); add(t6); add(b1); add(b2);  //adding all the lebels, buttons and textfield in the window.
			
			b1.addActionListener(this);
		    b2.addActionListener(this);
			
			setLayout(new FlowLayout());
			
			setSize(270,450);
			
			setLocation(450,450);
			
		    
		}
		public void actionPerformed(ActionEvent ae){
			
			String s = ae.getActionCommand();
			
			if(s.equals("Back")){
				
				//closes the current window and opens the First window.
			
			main.setVisible(true);
			this.setVisible(false);
		}
		else if(s.equals("Register")){
			
			if(t.getText().length()==0 || t2.getText().length()==0 || t3.getText().length()==0 || t4.getText().length()==0 || t5.getText().length()==0 || t6.getText().length()==0){
				JOptionPane.showMessageDialog(this,"You Must Fill up all the information.");
			}
			else{
				float a=Float.parseFloat(t4.getText());
				
				int serial=0;
				
				DataAccess da=new DataAccess();
				
				String p = "select Serial from student";
				
				ResultSet rs=null;
				try{
				rs=da.getData(p);
				
				while(rs.next()){
					
					serial = rs.getInt("Serial");
					
				}
				}
				catch(Exception ex){}
				
				serial = serial+1;
				
				String q="insert into student values('"+t2.getText()+"','"+t.getText()+"','"+a+"','"+t5.getText()+"','"+t6.getText()+"','"+t3.getText()+"','"+serial+"')";
				
				System.out.println(q);
                
				da.updateDB(q);
				
				//Register the student's information to the database.
				
				JOptionPane.showMessageDialog(this,"Registration Successful.");
			}
		}
			
		}
		
		
		
		public void setParent(Frame m){parent=m;} //setiing the first window as parent for this class.
		
		
		
	}