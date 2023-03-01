package exercise;


public class Ex4_1 {
	public static void main(String[] args) {
		/**
		 * 조건식 표현
		 */
		
		boolean result;
		
		//int형 변수 x가 10보다 크고 20보다 작을 때 true
		int x = 10;
		if(x > 10 && x < 20) {result = true;}
		
		//char형 변수 ch가 공백이나 탭이 아닐 때 true \u1000
		char ch = ' ';
		if(ch != ' ' && ch != '\t') {result = true;}
		
		//char형 변수 ch가 'x' 또는 'X'일 때 true
		if(ch == 'x' || ch == 'X') {result = true;}
		
		//char형 변수 ch가 숫자 0~9 일 때 true
		if(ch >= '0' && ch <= '9') {result = true;}
		
		//char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {result = true;}
		
		//int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true
		int year = 2000;
		if(year%400 == 0 || (year%4 == 0 && year%100 != 0)) { result=true; }
		
		//boolean형 변수 powerOn false일 때 true
		boolean powerOn = true;
		if(powerOn == false) {result=true;}
		
		//문자열 참조변수 str이 "yes"일 때 true
		String str = "yes";
		if(str.equals("yes")) {result=true;}
	}
}
