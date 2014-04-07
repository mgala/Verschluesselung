import org.junit.*;
public class GreetingsTest{
	@Test
	public void test1(){
		String s = Greetings.goodMorning("Kronowetter", true);
		if(!s.equals("Guten Morgen Frau Kronowetter")){
			throw new RuntimeException("Failed Test1");
		}
	}
	@Test
	public void test2(){
		String s = Greetings.goodMorning("Kronomajer", false);
		if(!s.equals("Guten Morgen Herr Kronomajer")){
			throw new RuntimeException("Failed Test2");
		}
	}
		
}

