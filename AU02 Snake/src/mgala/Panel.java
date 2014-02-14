package mgala;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;
/**
 * 
 * @author Mateusz Gala
 * @version 2013-11-03
 *
 */
public class Panel extends JPanel{
	Graphics g2;
	private Model m;
	private SnakeView v;
	private Controller c;
	private int x;
	private int y;
	private Point p;
	Iterator <Point> i;
	
	
	public Panel(Model m, SnakeView v){
		this.m = m;
		this.v = v;
		this.c = c;
		this.x = this.m.randomx();
		this.y = this.m.randomy();
	}
	//Paint Methode zum zeichnen der Schlange
	@Override
	public void paint(Graphics g){
		super.paintComponent(g);
		this.i = this.m.getSchlange().iterator();
		p = new Point();
		while(i.hasNext()){
			p = i.next();
			//Schlange
			g.setColor(new Color(255,255,255));
			g.fillRect(p.x, p.y, 6,6);
			//Kopf färben
			g.setColor(new Color(100,220,100));
			g.fillRect(this.m.getSchlange().getLast().x -1, this.m.getSchlange().getLast().y - 1, 8, 8);
			//Schriftart und Punktezähler
			g.setColor(new Color(0,191,255));
			Font f = new Font("Comic Sans MS",Font.BOLD,28);
			g.setFont(f);
			g.drawString(this.m.getPoints() + "", 300 , 25);
			
			//selbst fressen
			if(i.hasNext()){
			if((this.m.getSchlange().getLast().x == p.x) && (this.m.getSchlange().getLast().y == p.y)){
				this.v.getC().stop();
				JOptionPane.showMessageDialog(null, "Sie haben sich selbst gefressen \n" + "Erreichte Punkte: " + this.m.getPoints());
				System.exit(1);
				}
			}
			
			if(this.v.getC().isDrive() == false){
				g.setColor(new Color(255,255,255));
				g.drawString("PAUSE", 265 , 210);
			}
			
		}
		if(p.x == 600){
			p.x = 10;
			}
		if(p.x == 0){
			p.x = 600;
			}
		if(p.y == 400){
			p.y = 10;
			}
		if(p.y == 0){
			p.y = 400;
		}
		if((p.x == x)&&(p.y == y)){
			this.x = this.m.randomx();
			this.y = this.m.randomy();
			this.m.setPoints();
			this.m.setSize();
		}
		if((p.x == this.m.randomx()) && (p.y == this.m.randomy())){
			this.c.setSchwer();
		}
		g.setColor(new Color(255,0,0));
		g.drawRect(x, y, 6,6);
		}
	}
	
