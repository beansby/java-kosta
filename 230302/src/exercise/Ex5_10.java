package exercise;

public class Ex5_10 {
	public static void main(String[] args) {
		/**
		 * 다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다. 
		 * (1)에 알맞은 코드를 넣어서 완성하시오
		 */
		
		//a~z
		char[] abcCode = { '`','~','!','@','#','$','%','^','&','*',
			           '(',')','-','_','+','=','|','[',']','{',
			           '}',';',':',',','.','/'
			           };
		
		
		//0 1 2 3 4 5 6 7 8 9 
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
		String src = "abchelloworld123"; 
		String result = "";
		
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장 
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			System.out.println(ch);
			int n = ch -'0';
			System.out.println(ch +"\t"+ n);
			
			if(n >= 0 && n <= 9) {				//숫자 
				ch = (char) numCode[n];
				result += ch;
			} else if (n >= 49 && n <= 74) {	//문자 
				ch = (char) abcCode[n-49];
				result += ch;
			}
			
			//다른 풀이 - 미완 
//			if(ch >= '0' && ch <= '9') {				//숫자 
//				result += numCode[ch-'0'];
//			} else if (ch >= 'a' && ch <= 'z') {	//문자 
//				result += abcCode[ch-'0'];
//			}
			
		}
        System.out.println("src:"+src);
        System.out.println("result:"+result);
	}
}
