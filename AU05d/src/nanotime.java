import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

import javax.swing.JOptionPane;


public class nanotime {
	private static HashSet<Integer> time = new HashSet<>();
	private static TreeSet<Integer> zeit = new TreeSet();
	private static int zahl = 0;
	
	
	public static void main(String[] args) {
		String eingabe = JOptionPane.showInputDialog("Wie viele Einträge sollen hinzugefügt werden?");
		zahl = Integer.parseInt(eingabe);
		for(int i = 0; i<10; i++){
		Messung(zahl);
		} 
		System.out.println("\n");
		for(int j = 0; j<10; j++){
		MessungLinked(zahl);
		}
	}
	public static void Messung(int anzahl){
		anzahl = zahl;
		long z1 = System.nanoTime();
		
		for(int i = 0; i< anzahl; i++){
			time.add(i);
		}
		long z2 = System.nanoTime();
		long laufzeit = z2-z1;
		System.out.println("" + laufzeit + "");
	}
	public static void MessungLinked(int anzahl){
		anzahl = zahl;
		long z1 = System.nanoTime();
		for(int i = 0; i< anzahl; i++){
			zeit.add(i);
		}
		long z2 = System.nanoTime();
		long laufzeit = z2-z1;
		System.out.println("" + laufzeit + "");
	}

}
