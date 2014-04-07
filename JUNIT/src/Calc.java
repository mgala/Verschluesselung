
public class Calc {
	public static int calc(int a, int b, char operation){
		int result = 0;
		switch(operation){
		case'+':
			result = a+b;
		break;
		case'-':
			result = a-b;
		break;
		case'*':
			result = a*b;
		break;
		case '/':
			result = a/b;
		break;
		case '%':
			result = a%b;
		break;
		default:
			throw new RuntimeException(
					"Invalid operator");
		
		}
		return result;
	}
}
