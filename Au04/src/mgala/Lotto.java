package mgala;
import java.util.Random;
import java.util.TreeSet;

import javax.swing.JOptionPane;


public class Lotto {
public static void main(String[] args) {
	String eingabe = JOptionPane.showInputDialog("Bitte Anzahl der Tipps angeben");
	int zahl;
	int gewinne = 0;
	zahl = Integer.parseInt(eingabe);
	TreeSet<Integer> ziehung = new TreeSet<Integer>();
	TreeSet<Integer>  [] a = new TreeSet[zahl];
	Random r = new Random();
	Random zieh = new Random();
	int erg = 0;
	int tipp[] = new int[6];
	int zie[]  = new int[6];
	for(int i = 0; i < zie.length ;i++){
		zie[i] = zieh.nextInt(44) + 1;
		if(ziehung.add(zie[i]) == false){
			zie[i] = zieh.nextInt(44) + 1;
			ziehung.add(zie[i]);
		}
	} 
		for(int j = 0; j < a.length; j++){
			a[j] = new TreeSet<>();
			
			for(int i = 0; i < tipp.length ;i++){
				tipp[i] = r.nextInt(44) + 1;
				
				if(a[j].add(tipp[i]) == false){
					tipp[i] = r.nextInt(44) + 1;
					a[j].add(tipp[i]);
				}
			}
	System.out.println(a[j]);
	}
		//prüfen
		for(int j = 0; j < a.length; j++){
			for(int k = 0; k<zie.length;k++){
				if(a[j].contains(zie[k])){
					gewinne +=1;		
				}
			}
		}
		System.out.println("\nZiehung: " + ziehung);
		System.out.println("\nÜbereinstimmende Zahlen: " + gewinne);
		
		}
		
	}
