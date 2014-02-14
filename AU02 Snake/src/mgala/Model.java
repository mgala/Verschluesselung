package mgala;
import java.awt.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.JOptionPane;
/**
 * 
 * @author Mateusz Gala
 * @version 2013-11-03
 *
 */

public class Model {
private LinkedList<Point> schlange;
private int breite;
private int hoehe;
private final int schrittweite = 10;
private int size = 8;
private int points = 0;
private int punkteplus;

public Model(int b, int h){
	this.breite = b;
	this.hoehe = h;
	schlange = new LinkedList<Point>();
	schlange.add(new Point(breite/2,hoehe/2));

}
//Methoden zum Steuern der Schlange in alle Richtungen
	public void rauf(){
		Point p = new Point(schlange.getLast());
		p.y -= schrittweite;
		schlange.add(p);
		if(schlange.size() == size){
			schlange.removeFirst();
		}
		}
	public void runter(){
		Point p = new Point(schlange.getLast());
		p.y += schrittweite;
		schlange.add(p);
		if(schlange.size() == size){
			schlange.removeFirst();
		}
		
		}
	public void links(){
		Point p = new Point(schlange.getLast());
		p.x -= schrittweite;
		schlange.add(p);
		if(schlange.size() == size){
			schlange.removeFirst();
		}
		}
	public void rechts(){
		Point p = new Point(schlange.getLast());
		p.x += schrittweite;
		schlange.add(p);
		if(schlange.size() == size){
			schlange.removeFirst();
		}
	}
	public int randomx(){
		Random zufall = new Random();
		int x = zufall.nextInt(58) * 10;
		return x + 10;
	}
	public int randomy(){
		Random zufall = new Random();
		int y;
		y = zufall.nextInt(38) * 10;
		return y + 10;
	}
	//Schwierigkeitsgrad

	public int setPoints() {
		points += punkteplus;
		return points;
	}
	public int getPoints() {
		return points;

	}
	public int setPunkteplus(int i) {
		punkteplus += i;
		return points;

	}

	//Getter Methode für die LinkedList
	public LinkedList<Point> getSchlange() {
		return schlange;
	}
	public void setSize(){
		size += 3;
	}

	
}

