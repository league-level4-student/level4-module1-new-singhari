package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class NegativeNumbersException extends Exception {
	
	
	
	public void scaryPopup(int x) {
		if(x < 0) {
			JOptionPane.showInputDialog("You have triggered a critical error in your computer.");
		}
	}
	

}
