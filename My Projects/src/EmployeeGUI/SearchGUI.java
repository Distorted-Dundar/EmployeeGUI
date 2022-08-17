package EmployeeGUI;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class SearchGUI extends JFrame{
	private static  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private static int setWidth = (int)screenSize.getWidth()/2;
	private static int setHeight = (int)screenSize.getHeight()/2;

	public SearchGUI(){
		super("List of Employees");
		setSize(setWidth,setHeight);
	    setLocationRelativeTo(null); // this method display the JFrame to center position of a screen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JTextArea display = new JTextArea(8,40);
//        JScrollPane scroll = new JScrollPane(display);
//        add(scroll);
		String[] columnNames = {"First Name",
                "Last Name",
                "Sport",
                "# of Years",
                "Vegetarian"};

			Object[][] data = {
			{"Kathy", "Smith",
			"Snowboarding", new Integer(5), new Boolean(false)},
			{"John", "Doe",
			"Rowing", new Integer(3), new Boolean(true)},
			{"Sue", "Black",
			"Knitting", new Integer(2), new Boolean(false)},
			{"Jane", "White",
			"Speed reading", new Integer(20), new Boolean(true)},
			{"Joe", "Brown",
			"Pool", new Integer(10), new Boolean(false)}
			};
			
			JTable table = new JTable(data, columnNames);
			JScrollPane scrollPane = new JScrollPane(table);
			table.setFillsViewportHeight(true);
			add(scrollPane);
//			https://docs.oracle.com/javase/tutorial/uiswing/components/table.html#simple
		setVisible(true);
	}
	
	public static void main(String args[]){
		new SearchGUI();
	}
}
	
