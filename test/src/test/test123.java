package test;

import com.sun.java.util.jar.pack.Package.File;

public class test123{

	public static void verzeichnisBaumR(String verzeichnis){
	File f = new File(verzeichnis);
	if(f.isDirectory()){{
	String[] vliste = f.list();
	for(int i = 0; i<vliste.length;i++){
		Klasse.verzeichnisBaumR(vliste[i]);
		}
	}else{ //Dateiname anzeigen
	System.out.println(f);
	}
	}
}
}

