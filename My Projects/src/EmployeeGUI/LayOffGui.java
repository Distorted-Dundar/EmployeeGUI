package EmployeeGUI;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LayOffGui extends JFrame{
	public LayOffGui(){
		super("");
	}
	public static void main(String args[]){
		int response = JOptionPane.showConfirmDialog(null, "You are about to lay off employee\n"+
				"  First Name Last Name Id",
				"Lay Off notification", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		System.out.println(response);//yes ==0 no ==1, closed gui == -1
		JOptionPane.showMessageDialog(null, "Operation impossible since no employees are laid off");
		
	}
}
