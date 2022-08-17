package EmployeeGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.*;

import javax.swing.*;

public class AddEmpGui  extends JFrame implements FocusListener{
	private static  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private static int setWidth = (int)screenSize.getWidth()/2;
	private static int setHeight = (int)screenSize.getHeight()/2;
	JTextField firstName = new JTextField(15);
	JTextField lastName = new JTextField(15);
	JTextField ID = new JTextField(15);
	 JButton submit = new JButton("Submit");
	 JButton goback = new JButton("Go Back");
	
	public AddEmpGui(){
		super("Add A New Employee");
		setSize(setWidth,setHeight);
	    setLocationRelativeTo(null); // this method display the JFrame to center position of a screen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pane = new JPanel();
		GridLayout family = new GridLayout(4,2,18,30);
		pane.setLayout(family);

		pane.add(new JLabel("First Name "));
		pane.add(firstName);
		firstName.addFocusListener(this);
		pane.add(new JLabel("Last Name "));
		pane.add(lastName);
		lastName.addFocusListener(this);

		pane.add(new JLabel("ID #"));
		pane.add(ID);
		ID.addFocusListener(this);

		pane.add(goback);
		pane.add(submit);
        submit.setBackground(Color.WHITE);
        
        ActionListener act = (event) -> {
        	Object source = event.getSource();
    		if (source == submit){
    			System.out.println("You clicked submit");
    			if(!firstName.getText().equals("") &&
    					!lastName.getText().equals("") &&
    					!ID.getText().equals("")){
    				System.out.println("Great We can continue");
    			}
    			else{
    				JOptionPane.showMessageDialog(null, "Please make sure to fill out all fields");
    			}
    		}
    		else if (source == goback){
    			System.out.println("You clicked goback");
    		}
    		
        };
        
        
		submit.addActionListener(act);
		goback.addActionListener(act);
		submit.setEnabled(false);

		add(pane);
		


		
		setVisible(true);

	}
	@Override
	public void focusGained(FocusEvent evt) {
			if(!firstName.getText().equals("") &&
					!lastName.getText().equals("") &&
					!ID.getText().equals("")) {
				System.out.println("All are filled click submit");
				  submit.setBackground(Color.BLUE);
					submit.setEnabled(true);
			}
			else {
				System.out.println("DOnt click submit");

				  submit.setBackground(Color.WHITE);
				submit.setEnabled(false);
			}
		
//		try{
//			Employee curr = new Employee(firstName.getText(),lastName.getText(),ID.getText());
//			System.out.println("All are filled click submit");
//			  submit.setBackground(Color.BLUE);
//				submit.setEnabled(true);
//		}
//		catch(EmployeeException e){
//			System.out.println("DOnt click submit");
//			submit.setBackground(Color.WHITE);
//			submit.setEnabled(false);
//		}
		
	}
	
	@Override
	public void focusLost(FocusEvent evt){
		focusGained(evt);
	}
	public static void main(String args[]){
		new AddEmpGui();
	}
	
//	@Override
//	public void actionPerformed(ActionEvent evt){
//		Object source = evt.getSource();
//		if (source == submit){
//			System.out.println("You clicked submit");
//			if(!firstName.getText().equals("") &&
//					!lastName.getText().equals("") &&
//					!ID.getText().equals("")){
//				System.out.println("Great We can continue");
//			}
//			else{
//				JOptionPane.showMessageDialog(null, "Please make sure to fill out all fields");
//			}
//		}
//		else if (source == goback){
//			System.out.println("You clicked goback");
//		}
//		
//		
//	}
	
	
}
