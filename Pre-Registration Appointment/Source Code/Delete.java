import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
class Delete extends Frame implements ActionListener{
	
	private  Faculty_control control;  //association with Faculty_control class
	
	public TextField t;
	
	
	public Delete(Faculty_control fc){
		
		super("Free Slot Scheduler:Delete Panel");
		
		control = fc;
		
		//creating lebels,buttons and textfield.
		
		Button b1 = new Button("Delete");
		
		Label l = new Label("ID");
		
		t = new TextField(28);
		
		Button b2 = new Button("Exit");
		
		add(l); add(t); add(b1); add(b2);  //adding lebels,buttons and textfield.
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setLayout(new FlowLayout());
			
	    setSize(300,300);
			
		setLocation(450,450);
		
		
		
	}
	
	public void actionPerformed(ActionEvent ae){
		
		String s = ae.getActionCommand();
		
		if(s.equals("Exit")){
			
			this.setVisible(false);
			
			//closes this window.
			
		}
		
		else if(s.equals("Delete")){
			
			if(t.getText().length()==0){
				
				JOptionPane.showMessageDialog(this,"You Must Fill up all the information.");
				
			}
			
			else{
			
			String a = t.getText();
			
			DataAccess da=new DataAccess();
			ResultSet rs=null;
			
			String p = "select ID from student";
			
			try{
				rs=da.getData(p);
				
				while(rs.next()){
					
					if(a.equals(rs.getString("ID"))){
						
						String q = "DELETE FROM student WHERE id = '"+a+"'";
						da.updateDB(q);
						JOptionPane.showMessageDialog(this,"Data deleted");
						break;
						
						//deletes student data.
						
					}
					
					
					
				}
				}
				catch(Exception ex){ex.printStackTrace(); JOptionPane.showMessageDialog(this,"invalid ID");}
			
			}
			
			
			
		}
		
	}
	
}