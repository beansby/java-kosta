
public class WhileTest2 {
	public static void main(String[] args) {
		/**
		 * 반복문 while
		 */
		//구구단 2
		int i = 1;
		while(i<=9) {
			System.out.println("2 x "+i+" = "+(2*i));
			i++;
		}
		
		System.out.println();
		
		//구구단 1~9
		int dan = 2;
		
		while(dan <= 9) {
			System.out.println("[" + dan +"단]");
			for(int j=1; j<=9; j++) {
				System.out.println(dan +" x "+ j +" = "+(dan*j));
			}
			dan++;
			System.out.println();
		}
		
		System.out.println();
		
		i=1;
		while(i<=9) {
			dan=2;
			while(dan<=9) {
				System.out.print(dan+" x "+i+" = "+(dan*i)+"\t");
				dan++;
			}
			System.out.println();
			i++;
		}
	}
}
