

public class Test {
	public static void main(String[] args) {
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[2]);
		
		String oper = args[1];
		
		switch(oper) {
		case "+" : System.out.println(x+y); break;
		case "-" : System.out.println(x-y); break;
		}
	}
}
