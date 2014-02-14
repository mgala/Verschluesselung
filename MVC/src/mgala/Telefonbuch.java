package mgala;
import java.util.ArrayList;
import javax.swing.Icon;
/**
 * 
 * @author Mateusz Gala
 * @version 11-10-2013
 * Telefonbuch Klasse für eigene Methoden
 *
 */

public class Telefonbuch{
			public static ArrayList<TelefonbuchEintrag> tb = new ArrayList<TelefonbuchEintrag>();
			private Console c;
			public static boolean add(TelefonbuchEintrag neu){
				tb.add(neu);
				return true;
			}
			public Telefonbuch(Console c){
				this.c = c;
			}
			
			public static boolean remove(int x){
				tb.remove(tb.get(x-1));
				return true;
			}
			public boolean contains(String a) {
				int indexnr = 0;
				for(int i = 0;i<tb.size();i++){
					if((tb.get(i).vname.contains(a)) || (tb.get(i).nname.contains(a)) || (tb.get(i).tel.contains(a))){
						indexnr = i;
						System.out.println(tb.get(i).vname);
						System.out.println(tb.get(i).nname);
						System.out.println(tb.get(i).tel);
						this.c.v.refreshSearch(indexnr);
					}
				}
				return true;
			}
			
			public static void sort (String typ) {
				if(typ.toUpperCase().charAt(0)=='V'){
				TelefonbuchEintrag tmp = new TelefonbuchEintrag();
				for(int i = 0;i<tb.size();i++){
					for(int j = 1;j<tb.size()-i;j++){
						if(tb.get(j-1).vname.toLowerCase().charAt(0) > tb.get(j).vname.toLowerCase().charAt(0)){
							tmp = tb.get(j-1);
							tb.set(j-1, tb.get(j));
							tb.set(j, tmp);
						}
					}
				}
				}
				if(typ.toUpperCase().charAt(0)=='N'){
					TelefonbuchEintrag tmp = new TelefonbuchEintrag();
					for(int i = 0;i<tb.size();i++){
						for(int j = 1;j<tb.size()-i;j++){
							if(tb.get(j-1).nname.toLowerCase().charAt(0) > tb.get(j).nname.toLowerCase().charAt(0)){
								tmp = tb.get(j-1);
								tb.set(j-1, tb.get(j));
								tb.set(j, tmp);
						}
					}
				}
			}
		}
			//getter Methode für die ArrayList
			public static ArrayList<TelefonbuchEintrag> getTb() {
				return tb;
			}
	}
