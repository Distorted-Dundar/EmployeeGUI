package EmployeeGUI;

import javax.swing.*;

public class QuitGUI {
    public static void main(String[] args) {
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?",

                "Quit?", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        System.out.println(response);//yes ==0 no ==1, closed gui == -1
    }

}
