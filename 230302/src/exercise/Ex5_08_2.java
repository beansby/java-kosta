package exercise;

public class Ex5_08_2 {
	public static void main(String[] args) {
		int[] correct = {4,1,2,3,4,1,2,3,3,1}; //문제에 대한 정답 
		int[] answer = {4,2,1,3,2,1,2,4,3,1};  //학생이 제출한 답안 
		
		int score = 0; //정답수
		
		for(int i=0; i<correct.length; i++) {
			if(correct[i] == answer[i]) {
				score++;
			}
		}
		
		System.out.println("정답 수 : " +score);
	}
}
