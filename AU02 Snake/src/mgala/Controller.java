package mgala;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 * 
 * @author Mateusz Gala
 * @version 2013-11-03
 *
 */

public class Controller extends Thread implements ActionListener, KeyListener{
	private Model m;
	private Panel p;
	private SnakeView v;
	private int richtung;
	private int schwer;
	private boolean drive =true;

	public Controller(int b, int h){
		this.m = new Model(b, h);
		this.v = new SnakeView(this.m, this);
	}


	@Override
	//Controller zum steuern des ActionListeners
	public void actionPerformed(ActionEvent e) {

		if(e.getActionCommand().equals("Rauf")){
			this.m.rauf();
			v.repaint();
		}
		if(e.getActionCommand().equals("Runter")){
			this.m.runter();
			v.repaint();
		}
		if(e.getActionCommand().equals("Links")){
			this.m.links();
			v.repaint();
		}
		if(e.getActionCommand().equals("Rechts")){
			this.m.rechts();
			v.repaint();
		}
	}
	@Override
	public void keyPressed(KeyEvent a) {
		if(a.getKeyCode() == 38){
			if((richtung != 4) && (richtung != 1)){
				richtung = 1;
			}
		}
		if(a.getKeyCode() == 37){
			if((richtung != 3) && (richtung != 2)){
				richtung = 2;
			}
		}
		if(a.getKeyCode() == 39){
			if((richtung != 2) && (richtung != 3)){
				richtung = 3;
			}
		}
		if(a.getKeyCode() == 40){
			if((richtung != 1) && (richtung != 4)){
				richtung = 4;
			}
		}

		if(a.getKeyCode() == 80){
			if(this.drive == true){
				this.drive = false;
			}else{
				this.drive = true;
			}
		}
	}


	


	public void run() { 
		for(int i =0;i<1;){ 
			if(drive){
				try { 
					sleep(this.schwer); 
					if(richtung == 1){
						this.m.rauf();
					}
					if(richtung == 2){
						this.m.links();
					}
					if(richtung == 3){
						this.m.rechts();
					}
					if(richtung == 4){
						this.m.runter();
					}
				} catch(InterruptedException e) {

				} this.v.repaint(); 	
			} 	
		}
	}

	public void schwierigkeit(){
		Object[] options = {"Einfach", "Normal", "Schwer", "Organspender!"};
		int n = JOptionPane.showOptionDialog(null, "Mit was für einem Schwirigkeitsgrad willst du spielen?", "Treffe deine Wahl gut!", 
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[3]);
		//einfach
		if(n == 0) {
			this.schwer = 100;
			this.m.setPunkteplus(1);
		}
		//normal
		if(n == 1) {
			this.schwer = 55;
			this.m.setPunkteplus(2);
		}
		//schwer
		if(n == 2) {
			this.schwer = 30;
			this.m.setPunkteplus(5);
		}
		//organspender
		if(n == 3) {
			this.schwer = 20;
			this.m.setPunkteplus(10);
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {

	}
	@Override
	public void keyTyped(KeyEvent arg0) {

	}
	public boolean isDrive() {
		return drive;
	}
	public void setSchwer(){
		this.schwer -= 10;
	}
}
