package exercise;


public class Ex5_08 {
	public static void main(String[] args) {
		/**
		 * 다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어
		 * 개수만큼 '*'을 직어서 그래프를 그리는 프로그램.
		 * (1)~(2)에 알맞은 코드를 넣어서 완성.
		 */
		
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];	// 앤써를 보고 갯수를 담을 배열
		
		
		// 1) 풀이 
		for(int i=0; i<answer.length; i++) {
			if(answer[i] == 1) {
				counter[0] += 1;
			} else if (answer[i] == 2) {
				counter[1] += 1;
			} else if (answer[i] == 3) {
				counter[2] += 1;
			} else if (answer[i] == 4) {
				counter[3] += 1;
			} 
		}
		
		for(int i=0; i<counter.length; i++) {
			System.out.print(counter[i]);
			for (int j=0; j<counter[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// 2) 풀이 
		//counter[0] = 1의 갯수
		//counter[1] = 2의 갯수
		//counter[2] = 3의 갯수
		//counter[3] = 4의 갯수
//		for(int i=0; i<answer.length; i++) {
//			counter[answer[i]-1]++;
//		}
//		
//		for(int i=0; i<counter.length; i++) {
//			System.out.print(counter[i]);
//			for(int j=0; j<counter[i]; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
}
