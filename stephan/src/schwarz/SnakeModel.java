package schwarz;

import java.awt.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.JOptionPane;

public class SnakeModel {
	public LinkedList<Point> schlange;
	private int schrittweite;
	private int breite;
	private int hoehe;
	private int x = 0;
	private int y = 0;
	private Iterator <Point> i;
	public boolean moveable = true;
	public final int SCHRITTWEITE = 10;
	private int score = 0;
	private int laenge = 4;
	
	public SnakeModel(int b, int h){
		this.breite = b;
		this.hoehe = h;
		
		this.schlange = new LinkedList<Point>();
		this.schlange.add(new Point(250, 250));
	}
	
	public void up(){
		Point p = new Point(schlange.getLast());
		p.y -= SCHRITTWEITE;
		schlange.add(p);
		if(schlange.size()==laenge){
			schlange.removeFirst();
		}
	}
	public void down(){
		Point p = new Point(schlange.getLast());
		p.y += SCHRITTWEITE;
		schlange.add(p);
		if(schlange.size()==laenge){
			schlange.removeFirst();
		}
	}
	public void left(){
		Point p = new Point(schlange.getLast());
		p.x -= SCHRITTWEITE;
		schlange.add(p);
		if(schlange.size()==laenge){
			schlange.removeFirst();
		}
	}
	public void right(){
		Point p = new Point(schlange.getLast());
		p.x += SCHRITTWEITE;
		schlange.add(p);
		if(schlange.size()==laenge){
			schlange.removeFirst();
		}
	}
	
	public void init(){
		
	}
	
	public void ueberpruefen(){
		this.i = schlange.iterator();
		while(i.hasNext()){
			Point p = i.next();
			if(i.hasNext()){
				if(p.x == schlange.getLast().x && p.y == schlange.getLast().y){
					System.out.println("Score: " + getScore());
					moveable = false;
					System.exit(0);
				}				
			}
		}
			
	}
	
	public int randomEssenX(){
		Random zufall = new Random();
		int x1 = zufall.nextInt(hoehe/10);
		int x = x1*10;
		if(x>breite-20){
			x = breite-20;
		}
		if(x<=20){
			x = 20;
		}
		if(x>=590){
			x = 580;
		}
		if(x == 280){
			x = 270;
		}
		if(x == 290){
			x = 300;
		}
		return x;
	}
	public int randomEssenY(){
		Random zufall = new Random();
		int y1 = zufall.nextInt(breite/10);
		int y = y1*10;
		if(y>breite-20){
			y = breite-20;
		}
		if(y<=20){
			y = 20;
		}
		if(y>=590){
			y = 580;
		}
		if(y == 280){
			y = 270;
		}
		if(y == 290){
			y = 300;
		}
		return y;
	}
	
	public LinkedList getLinkedList() {
		return schlange;
	}
	public void setLaenge(){
		this.laenge = laenge+5;
	}

	public int getBreite() {
		return this.breite;
	}

	public int getHoehe() {
		return this.hoehe;
	}
	public int farbe(){
		Random zufall = new Random();
		int farbe = zufall.nextInt(5);
		return farbe;
	}
	
	public int setScore(){
		this.score += 5;
		return score;
	}
	public int getScore(){
		return score;
	}
}
