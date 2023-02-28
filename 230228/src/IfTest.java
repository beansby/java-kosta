
public class IfTest {
	public static void main(String[] args) {
		/**
		 * 조건문 if
		 */
		int kor = 80, eng = 85, math = 100;
		
		int sum = kor + eng + math;
		double avg = (double)sum/3;
		double avg2 = Math.round(sum/(double)3*1000)/1000d;
	
		System.out.println("과목 평균 : "+avg);	//88.33333333333333
		System.out.println(avg2);				//88.333
		
		String grade;
		
		if(avg >= 90) {
			grade = "A";
			//중첩 if문 
			if(avg >= 97) {
				grade += "+";
			} else if (avg <= 94){
				grade += "-";
			}
		} else if (avg >= 80) {
			grade = "B";
			if(avg >= 87) {
				grade += "+";
			} else if (avg <=84) {
				grade += "-";
			}
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		System.out.println("학점 : "+grade);		//B+
	}
}
