

import java.util.Scanner;

public class StringBuilderTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		
		sb.append("이름:");
		sb.append(sc.nextLine());
		sb.append(", 나이 :");
		sb.append(sc.nextLine());
		System.out.println(sb);
		
		//setCharAt
		sb.setCharAt(3, '김');
		System.out.println(sb);
		
	}
}
