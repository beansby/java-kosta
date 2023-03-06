
public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.x = 10;
		calc.y = 20;
		
		System.out.println(calc.add());
		System.out.println(calc.sub());
		System.out.println(calc.mul());
		
		//Math class 의 method 가 static method인 이유  
		System.out.println(Calculator.add(20, 10));
		System.out.println(Calculator.sub(200, 100));
		System.out.println(Calculator.mul(20, 10));
		
	}
}

class Calculator{
	int x;
	int y;
	
	int add() {
		return x+y;
	}
	
	int sub() {
		return x-y;
	}
	
	int mul() {
		return x*y;
	}
	
	static int add(int x, int y) {
		return x+y;
	}
	
	static int sub(int x, int y) {
		return x-y;
	}
	
	static int mul(int x, int y) {
		return x*y;
	}
}

