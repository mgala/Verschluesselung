package mgala;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.*;
import javax.swing.*;

/**
 * GUI
 * @author mgala
 * @version 11-10-2013
 * Die GUI auf dem neuersten Stand
 */
public class MyView extends JFrame{
//Attribute
private JButton eingabe, ausgabe, end, loeschen, suchen, sortieren;
private JPanel grid, border;
private TextArea anzeige;
private Telefonbuch tb;
private Console c;




//Constructor
public MyView(Console c, Telefonbuch t){
this.tb = tb;
this.c = c;
grid = new JPanel();
border = new JPanel();
this.anzeige = new TextArea();
this.anzeige.disable();


this.eingabe = new JButton("Neuer Eintrag");
this.ausgabe = new JButton("Anzeigen");
this.end = new JButton("Beenden");
this.loeschen = new JButton("Löschen");
this.suchen = new JButton("Suchen");
this.sortieren = new JButton("Sortieren");
this.refresh();


this.border.setLayout(new BorderLayout());
this.grid.setLayout(new GridLayout(5,1));
add(this.grid, BorderLayout.WEST);

this.grid.add(this.eingabe);
this.grid.add(this.ausgabe);
this.border.add(this.end, BorderLayout.SOUTH);
this.grid.add(this.loeschen);
this.grid.add(this.suchen);
this.grid.add(this.sortieren);
this.border.add(this.anzeige, BorderLayout.EAST);




this.eingabe.addActionListener(this.c);
this.ausgabe.addActionListener(this.c);
this.end.addActionListener(this.c);
this.loeschen.addActionListener(this.c);
this.suchen.addActionListener(this.c);
this.sortieren.addActionListener(this.c);

this.eingabe.setActionCommand("Neuer Eintrag");
this.ausgabe.setActionCommand("Anzeigen");
this.end.setActionCommand("Beenden");
this.loeschen.setActionCommand("Löschen");
this.suchen.setActionCommand("Suchen");
this.sortieren.setActionCommand("Sortieren");

add(this.border);
setSize(600, 400);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);

}
	
public boolean eingabe(ActionEvent e){
	if(e.getSource() == this.eingabe) 
	return true;
	else{	
		return false;
	}
}
public void refreshSearch(int indexnr){
	this.anzeige.setText("");
	this.anzeige.append(this.tb.getTb().get(indexnr).vname);
	this.anzeige.append("		" + this.tb.getTb().get(indexnr).nname);
	this.anzeige.append("		" + this.tb.getTb().get(indexnr).tel);
}
public void refresh(){
	this.anzeige.setText("Vorname    	Nachname    	Tel\n\n");
	for(int i = 0; i< this.tb.getTb().size(); i++){
		this.anzeige.append(this.tb.getTb().get(i).vname);
		this.anzeige.append("		" + this.tb.getTb().get(i).nname);
		this.anzeige.append("		" + this.tb.getTb().get(i).tel + "\n");
		this.anzeige.append("_______________________________" + "\n");
		}
}
}