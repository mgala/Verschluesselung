package mgala;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;

import javax.swing.*;

import com.sun.media.sound.Toolkit;

/**
 * 
 * @author Mateusz Gala
 * @version 2013-11-03
 *
 */
public class SnakeView extends JFrame{
	private Model m;
	private Controller c;


	private Panel p;
	private JLabel l1;
	
	//Oben sind Attribute, unten die View Klasse
	public SnakeView(Model m, Controller c){
		//Initialisieren der Buttons
		this.m = m;
		this.c = c;
		this.p = new Panel(this.m, this);
		//Einteilung der Buttons
		this.addKeyListener(this.c);
		l1 = new JLabel(this.m.getPoints() + "");

		
		//Allgemeine Einstellungen für das Fenstera
		add(this.p);
		setSize(620, 420);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		p.setBackground(getBackground().DARK_GRAY);
		setTitle("The Perfect Snake v2.0 - Copyright ©");
	}
	public Controller getC() {
		return c;
	}
}
