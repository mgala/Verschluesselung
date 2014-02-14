package schwarz;

import java.awt.TrayIcon.MessageType;

import javax.swing.JOptionPane;

public class SnakeMain{
	public static void main(String[] args){
		Object[] options = {"easy", "medium", "hard"};
		int gesch = JOptionPane.showOptionDialog(null, "Schwierigkeitsgrad", "Snake", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
		SnakeController c = new SnakeController(600, 600, gesch);
		c.start();
	}
}
