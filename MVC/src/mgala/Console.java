package mgala;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
/**
 * 
 * @author Mateusz Gala
 * @version 11-10-2013
 * Controller Klasse zur ganzen funktion.
 *
 */

public class Console implements ActionListener{
private Telefonbuch tb;
MyView v = new MyView(this , tb);

public  void logik(){
	tb = new Telefonbuch(this);
	
	}
	public void eingabe() {
		TelefonbuchEintrag t = new TelefonbuchEintrag();
		t.vname = JOptionPane.showInputDialog("Bitte den Vornamen Ihres neuen Kontaktes eingeben");
		t.nname = JOptionPane.showInputDialog("Bitte den Nachnamen Ihres neuen Kontaktes eingeben");
		t.tel = JOptionPane.showInputDialog("Bitte die Telefonnummer Ihres neuen Kontaktes eingeben");
		this.tb.add(t);
	}
			
	
	public void ausgabe() {
		for(int i = 0;i<tb.getTb().size();i++)
		{
			System.out.println(tb.getTb().get(i).vname);
			System.out.println(tb.getTb().get(i).nname);
			System.out.println(tb.getTb().get(i).tel);
		}
	}
			
			public void loeschen() {
			int x = Integer.parseInt(JOptionPane.showInputDialog("Bitte die entsprechende Zahl eingeben zum löschen eines Kontaktes"));
			tb.remove(x);
			}
			
			public void suchen() {
			String a = JOptionPane.showInputDialog("Suchen sie nach jemandem");
			tb.contains(a);
			};
		
			public void sortieren() {
			String typ = JOptionPane.showInputDialog("Bitte 'V' eingeben um nach Vornamen zu sortieren oder 'N' um nach dem Nachnamen zu sortieren");
			tb.sort(typ);
			}
			public void end() {
				System.exit(0);
			}
			
			//logik für die Konsoleneingabe und Ausgabe
			public void logikConsole(){
				while(true){
					String text = Console.read();
					char c = text.toUpperCase().charAt(0);
			switch(c)
			{
			
			case 'E':
				TelefonbuchEintrag t = new TelefonbuchEintrag();
				t.vname = Console.read();
				t.nname = Console.read();
				t.tel = Console.read();
				tb.add(t);
				this.v.refresh();
				break;
			
			case 'A':
				for(int i = 0;i<tb.getTb().size();i++)
				{
					System.out.println(tb.getTb().get(i).vname);
					System.out.println(tb.getTb().get(i).nname);
					System.out.println(tb.getTb().get(i).tel);
				}
				break;
			case 'X':
				System.exit(0);
				break;
			case 'L':
				int x = Integer.parseInt(Console.read());
				tb.remove(x);
				this.v.refresh();
			case '?':
				String a = Console.read();
				tb.contains(a);
				this.v.refresh();
			case 'S':
				String typ = Console.read();
				tb.sort(typ);
				this.v.refresh();
				break;
			}
		}
	}
		//die read Methode um die eingabe in der Konsole zu ermöglichen
	public static String read()
	{
		
		while(true){
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String text = null;
		try {
			text = input.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return text;
		}
	}
	public void actionPerformed(ActionEvent e){
		

		if(e.getActionCommand().equals("Neuer Eintrag")){
			this.eingabe();
			this.v.refresh();
			}
		if(e.getActionCommand().equals("Anzeigen")){
			this.ausgabe();
			this.v.refresh();
			}
		if(e.getActionCommand().equals("Beenden")){
			this.end();
			this.v.refresh();
			}
		if(e.getActionCommand().equals("Löschen")){
			this.loeschen();
			this.v.refresh();
			}
		if(e.getActionCommand().equals("Suchen")){
			this.suchen();
			this.v.refresh();
			}
		if(e.getActionCommand().equals("Sortieren")){
			this.sortieren();
			this.v.refresh();
			}
		}
	}


	



