import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;

import javax.swing.*;


public class Sekunden extends JFrame implements ActionListener {
	JPanel p1, p2, p3, p4; //4 Panels werden als Attribute deklariert
	JLabel l1, l2; //2 Panels werden als Attribute deklariert
	JButton b1 = new JButton("Klick mich");
	public Sekunden(){
		this.Gui();
	}
	public void Gui(){
		
		p1 = new JPanel(); //Neues Panel wird initalisiert
		
		p1.setLayout(new BorderLayout()); //Dem Panel 1 wird ein BorderLayout hinzugefuegt
		l1 = new JLabel();
		p1.add(l1); //Label mit zahlen initialisiert
		Font f = new Font("BAUHAUS 93", Font.BOLD, 40); //Font Objekt erzeugt um im nachhinein die Font zu aendern
		
		l1.setFont(f); //Schriftart vom ersten Label geaendert
		p1.add(b1, BorderLayout.SOUTH);
		add(p1);//Hinzufuegen vom Panel
		b1.addActionListener(this);
		setVisible(true); //Macht das Fenster/Frame sichtbar
		setSize(600,150); //Stellt die Groesse pixelgenau ein
		setTitle("NEIN"); //Aendert den Titel des Programms
		setResizable(false); //Fenster kann nicht skaliert werden
		//setLocationRelativeTo(null); //Positioniert das Fenster in der Mitte des Monitor
	    this.setAlwaysOnTop(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Wird aus dem Arbeitsspeicher gel�scht 
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1){
			l1.setText("MARKUS IST ZWEI HUND");
		}
	}
}