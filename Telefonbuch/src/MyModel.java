import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MyModel{
	//Attribute
	private int zaehler;
	private Telefonbuch tb;
	//Constructor
	public MyModel () {
		//this.zaehler = 0;
		this.reset();
	}
	public void reset(){
	this.zaehler = 0;
	}
	public int getZaehler(){
	return this.zaehler;
	}
	public static ArrayList<TelefonbuchEintrag> getTb() {
		return this.tb;
	}
	public void eingabe(){
		TelefonbuchEintrag t = new TelefonbuchEintrag();
		t.vname = MyModel.read();
		t.nname = MyModel.read();
		t.tel = MyModel.read();
		tb.add(t);
	}
	public void ausgabe(){
	this.zaehler--;
	}
	
	
	
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
}
