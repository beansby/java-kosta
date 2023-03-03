package exercise;

public class Ex5_09 {
	public static void main(String[] args) {
		/**
		 * 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성
		 */
		char[][] star = { 
				{'*','*',' ',' ',' '}, //****
				{'*','*',' ',' ',' '}, //****
				{'*','*','*','*','*'}, //**
				{'*','*','*','*','*'}  //**
									   //**
		};
		
		// 90도 회전 = [열][행] -> [행][열]
		char[][] result = new char[star[0].length][star.length];
		
		//star[][]
		for(int i=0; i < star.length; i++) {
			for(int j=0; j < star[i].length;j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
       }
       
		System.out.println();
       
		//result[][] 데이터 값 복사 
		//result.length = 5 , result[i].length = 4
		//star.length = 4, star[i].length = 5
		for(int i=0; i < star.length; i++) {  		// = result[i].length = 4
			for(int j=0; j < star[i].length; j++) {	// = result.length = 5
				result[j][star.length-1-i] = star[i][j];
			}
		}
		
		//result[][]
		for(int i=0; i < result.length;i++) { 
			for(int j=0; j < result[i].length;j++) {
               System.out.print(result[i][j]);
           }
           System.out.println();
       }
	}
}
