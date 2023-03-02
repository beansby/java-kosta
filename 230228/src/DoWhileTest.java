import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		/**
		 * 반복문 do-while
		 */
		Scanner scanner = new Scanner(System.in);
		int sum = 0, input;
		
		//0 입력 반복문 중
		do {
			input = scanner.nextInt();
			sum += input;
		} while (input != 0);
		
		System.out.println(sum);
	}
}
