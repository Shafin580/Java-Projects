import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;


class Student_data extends Frame implements ActionListener{
	
	private  Faculty_control control;	//association with Faculty_control class
	private  StudentSerial student;     //association with Studentserial class
	private  Volunteer_status volunteer;  //association with Volunteer_Status class
	TextArea t;
	
	public Student_data(Faculty_control fc){
		
		super("Free Slot Scheduler:Student Data");
		
		control = fc;
		
		//creating all the lebels,textfield and buttons for this window.
		
		Label l = new Label("Data of Students");
		
		Button b = new Button("Show");
		
		Button b2 = new Button("Exit");
		
		t = new TextArea(5,70);
		
		add(b); add(l); add(t); add(b2); //adds all the labels,textfield and buttons inside the window.
		
		b.addActionListener(this);
		b2.addActionListener(this);
		
		setLayout(new FlowLayout());
			
		setSize(800,300);
			
		setLocation(300,450);
		
	}
	
	public Student_data(StudentSerial ss){
		
		super("Free Slot Scheduler:Student Data");
		
		student = ss;
		
		//creating all the lebels,textfield and buttons for this window.
		
		Label l = new Label("Data of Students");
		
		Button b = new Button("Show");
		
		Button b2 = new Button("Exit");
		
		t = new TextArea(5,70);
		
		add(b); add(l); add(t); add(b2); //adds all the labels,textfield and buttons inside the window.
		
		b.addActionListener(this);
		b2.addActionListener(this);
		
		setLayout(new FlowLayout());
			
		setSize(800,800);
			
		setLocation(300,450);
		
	}
	
	public Student_data(Volunteer_status vs){
		
		super("Free Slot Scheduler:Student Data");
		
		volunteer = vs;
		
		//creating all the lebels,textfield and buttons for this window.
		
		Label l = new Label("Data of Students");
		
		Button b = new Button("Show");
		
		Button b2 = new Button("Exit");
		
		t = new TextArea(5,70);
		
		add(b); add(l); add(t); add(b2); //adds all the labels,textfield and buttons inside the window.
		
		b.addActionListener(this);
		b2.addActionListener(this);
		
		setLayout(new FlowLayout());
			
		setSize(800,800);
			
		setLocation(300,450);
		
	}
	
	
	public void actionPerformed(ActionEvent ae){
		
		String s = ae.getActionCommand();
		
		t.setText("");
			
			if(s.equals("Show")){
				
				try{
				DataAccess da=new DataAccess();
				ResultSet rs=null;
				rs=da.getData("select name,ID,Serial from student");
				t.append("Name\t \t ID\t \t \t Serial\t \t \n");
				while(rs.next()){
					
					String st=rs.getString("name")+"\t \t"+rs.getString("ID")+"\t \t"+rs.getInt("Serial");
					t.append(st+"\n");
					
					//shows all the data of the Students.
				}
			}
			
			catch(Exception ex){ex.printStackTrace();}
				
			}
			
			else if(s.equals("Exit")){
			this.setVisible(false);
			
			//closes this window.
		}
		
	}
	
	
	
	
}