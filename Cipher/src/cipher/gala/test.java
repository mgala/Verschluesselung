package cipher.gala;

import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) {
		String text = JOptionPane.showInputDialog("Was soll ich encrypten?");
		MonoAlphabeticCipher a = new MonoAlphabeticCipher();
		a.encrypt(text);
	}

}
