import java.util.HashMap;

import javax.swing.JOptionPane;


public class MAIN {

	public static void main(String[] args) {
		String eingabe = "";
		String eingabe2 = "";
		String wort = "";
		eingabe = JOptionPane.showInputDialog("Bitte einen Text einfügen") + " ";
		HashMap<String, String> m = new HashMap<>();
		m.put("ist", "is");
		m.put("arsch", "ass");
		
		for(int i = 0; i<eingabe.length(); i++){
			if(m.containsKey(eingabe.toLowerCase()) == true){
				try{
					System.out.println(m.get(eingabe).toString());
				}catch(NullPointerException e){
					System.out.print("");
				}
			}else{
				wort +=eingabe.charAt(i);
				if(eingabe.charAt(i) == ' '){
					eingabe2 = JOptionPane.showInputDialog("Übersetzung");
					m.put(wort, eingabe2);
					wort = "";
				}
			}
		}
		for(String name : m.keySet()){
			System.out.println(name + " : " + m.get(name).toString());
			}
		}
	}


