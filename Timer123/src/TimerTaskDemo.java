import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;

class Task extends TimerTask
{
	
	 Sekunden s = new Sekunden();
	 int i = 0;
	 int m = 0;
	 int h= 0;
  @Override public void run(){		  
	  	if(i >= 0 && i <= 10){
		 s.l1.setText("00:0" + m + ":0"+i );
		 i++;
		  }
  		if(i >= 10 && i < 60){
		 s.l1.setText("00:0" + m + ":"+i);
		 i++;
		  }
  		if(i == 60){
  		  m++;
  		}
  		if(i >= 60){
  			this.i = 0;
  			s.l1.setText("00:0" + m + ":" +i);
  			i++;
  		}
  		if(m>=1 && i < 10){
 			 s.l1.setText(h + ":" + m + ":0" +i);
 		}
  		if(m >= 1 && m <= 10){
  			 s.l1.setText("00:0" + m + ":"+i );
  			  }
  		if(m >= 10){
 			 s.l1.setText("00:" + m + ":"+i);
 			if(i<10){
  				s.l1.setText(h + ":" + m + ":0" +i);
  			 	}
 			  }
  		if(m >= 60){
  			this.m = 0;
  			s.l1.setText("0" + h + ":" + m + ":" +i);
  			m++;
  			h++;
  		}
  		if(h >= 1 && h <= 10){
  			 s.l1.setText("0" + h + ":0" + m + ":" +i);
  			  }
  		if(m >= 10){
			 s.l1.setText("0" + h + ":" + m + ":"+i);
			  }
  		if(h >= 10 && h <= 60){
  			 s.l1.setText(h + ":" + m + ":" +i);
  			 if(m<10){
  				s.l1.setText(h + ":0" + m + ":" +i);
  			 	}
  			  }
  }
}
public class TimerTaskDemo
{
  public static void main( String[] args )
  {
	Timer timer = new Timer();
    
	timer.schedule( new Task(), 1000, 1000);
    // Start in 2 Sekunden

    // Start in einer Sekunde dann Ablauf alle 5 Sekunden
    
  }
}