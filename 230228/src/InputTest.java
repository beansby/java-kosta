

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		//사용자 입력 받
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		System.out.println(name);
		
		//반복 입력 
		for(int i=0; i<3; i++) {
			int n = scanner.nextInt();
			System.out.println(n);
		}
	}
}
