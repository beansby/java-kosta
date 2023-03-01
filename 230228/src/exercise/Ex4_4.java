package exercise;

public class Ex4_4 {
	public static void main(String[] args) {
		/**
		 * 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시
		 */
		int sum = 0;
		for(int i=1; ; i++) {
			
			//짝수 
			if(i%2 == 0) {
				sum -= i;
			} else {
				sum += i;
			}
			
			if(sum >= 100) {
				System.out.println(sum);
				System.out.println(i);	//199
				break;
			} 
		}
	}
}
