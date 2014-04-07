import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalcTest {
	@Test
	public void test3(){
		Calc.calc(20, 2, '+');
	}
	@Before
	public void beforeTests(){
		System.out.println("Method beforeTests");
	}
	@After
	public void afterTests(){
		System.out.println("Method afterTests");
	}
	@Test(expected=RuntimeException.class)
		public void testInvalid(){
				Calc.calc(5, 10, '!');
		}
}
