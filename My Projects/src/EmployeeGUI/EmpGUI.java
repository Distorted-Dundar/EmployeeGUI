package EmployeeGUI;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;


public class EmpGUI extends JFrame implements ActionListener{
	private static  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private static int setWidth = (int)screenSize.getWidth()/2;
	private static int setHeight = (int)screenSize.getHeight()/2;
	JButton Add,Layoff,Rehire,Display,Search,Quit;
	public EmpGUI(){
		super("HR PAYROLL");
		setSize(setWidth,setHeight);
	    setLocationRelativeTo(null); // this method display the JFrame to center position of a screen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pane = new JPanel();
		GridLayout family = new GridLayout(3,3,8,8);
		pane.setLayout(family);
		 Add = new JButton("Add a new Employee");
		Add.setToolTipText("Add A New Employee\n by First & lastName and ID");
		Add.addActionListener(this);
		 Layoff = new JButton("Layoff an Employee");
		Layoff.setToolTipText("LayOff the most recent employee that was added to your team");
		Layoff.addActionListener(this);
		 Rehire = new JButton("Rehire an Employee");
		Rehire.setToolTipText("Rehire 1 an Employee that layedoff first to last");
		Rehire.addActionListener(this);
		 Display = new JButton("Display List");
		Display.setToolTipText("Display all the employees in your team");
		Display.addActionListener(this);
		 Search = new JButton("Search an Employee");
		Search.setToolTipText("Search an employee by last name or ID");
		Search.addActionListener(this);
		 Quit = new JButton("Quit the program");
		Quit.addActionListener(this);

		
		pane.add(Add);
		pane.add(Layoff);
		pane.add(Rehire);
		pane.add(Display);
		pane.add(Search);
		pane.add(Quit);
		add(pane);

		setVisible(true);

		
	}
	@Override
	public void actionPerformed(ActionEvent evt){
		Object source = evt.getSource();
		if (source == Add){
			System.out.println("You clicked add");
		}
		else if (source == Layoff){
			System.out.println("You clicked Layoff");
		}
		else if (source == Rehire){
			System.out.println("You clicked Rehire");
		}
		else if (source == Display){
			System.out.println("You clicked Display");
		}
		else if (source == Search){
			System.out.println("You clicked Search");
		}
		else {
			System.out.println("You clicked quit");
		}
		
	}
	
	
	
//	use .dispose() to get rid of a frame and then reopen a frame by calling it 
//	perhaps later you can use just a frame but not use .show() to provide more flexibility
//	https://www.google.com/search?q=open+new+window+when+click+on+button+JFRANE+java&rlz=1C1CHBF_enUS863US863&oq=open+new+window+when+click+on+button+JFRANE+java&aqs=chrome..69i57j33i10i160l2j33i10i299l3j33i10i22i29i30l3.12634j0j4&sourceid=chrome&ie=UTF-8#kpvalbx=_d1z5Yvb-LeiJptQP1KOlsAE18
	
	public static void main(String args[]) {
		System.out.println("Running EMp GUI");
		new EmpGUI();
	}
}
