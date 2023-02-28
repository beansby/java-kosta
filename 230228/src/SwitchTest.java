
public class SwitchTest {
	public static void main(String[] args) {
		/**
		 * 조건문 switch
		 */
		int kor = 80, eng = 85, math = 100;
		
		int sum = kor + eng + math;
		double avg = Math.round(sum/(double)3*1000)/1000d;
		
		String grade;
		
		//double -> int : 정수타입으로 형변환 
		switch ((int)(avg/10)) {
		case 10 : 
		case 9 : 
			grade = "A";
			if(avg>=98) {
				grade += "+";
			} else if(avg<=94) {
				grade += "-";
			}
			break;
		case 8 : grade = "B";
		  break;
		case 7 : grade = "C";
		  break;
		case 6 : grade = "D";
		  break;

		default: grade = "F";
			break;
		}
		
		System.out.println("평균 : "+avg+", 학점 : "+grade);	//B
	}
}
