package exercise;

public class Ex4_12 {
	public static void main(String[] args) {
		/**
		 * 구구단의 일부분을 다음과 같이 출력하시오.
		 */
		
		for(int i=1; i<=3; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j +"*"+ i +"="+ (i*j) +"\t");
			}
			System.out.println();
		}
		
		System.out.println("====================================");
		//i = 단 (2~9), j = 곱하는 수 (1~3) 
		// x = (j+1)+(i-1) / 3*3; = 단 
		// y = 단%3 == 0 ? 3 : i%3  = 곱하는 수 
		// 3의 배수 단이면 y = 3 or y = 단을 3으로 나눈 나머지
		
		for(int i = 1; i<=9; i++) {
			for(int j=1; i<=3; j++) {
				int x = j+1+(i-1)/3*3;
				int y = i%3 == 0 ? 3 : i%3;
				if (x>9) break;
				System.out.print(x+"*"+y+"="+x*y+"\t");
			}
			System.out.println();
			if(i%3==0) System.out.println();
		}

		System.out.println("=====================================");
		
		for(int k=2; k<10; k+=3) {	// 띄어쓸 단 : 2단부터 3 단위로 줄 띄움 
			for(int i=1; i<=3; i++) {	//곱하는 수 : 1~3
				for(int j=k; j<=k+2 && j<10; j++) { // 단 : 기준단 ~ 한줄에 출력하고 싶은 단까
					System.out.print(j+"x"+i+"="+ j*i +"\t");
				}
//				System.out.print(k+"x"+i+"="+ k*i +"\t");	// 2,5,8단 
				System.out.println();
			}
			System.out.println();
		}
		
	}
}
