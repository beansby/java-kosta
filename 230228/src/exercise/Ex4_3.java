package exercise;

public class Ex4_3 {
	public static void main(String[] args) {
		// (1) + (1+2) + (1+2+3) + ... + (1+ ... +10)
		int sum = 0, total = 0;
			
		for (int i=1; i<=10; i++) {
			sum += i;
			total += sum;
		}
		System.out.println(total);	//220
	}
}
