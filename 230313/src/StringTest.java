import javax.sound.midi.Soundbank;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "John";
		String str2 = "John";
		System.out.println(str1 == str2);	//true : 특정 메모리에 저장 후 복사 
		
//		String str3 = new String("John");
		String str3 = new String(str1);		//String(String)
		String str4 = new String("John");	
		System.out.println(str3 == str4);	//false : 다른 객체 번지를 가지고 있음 
		System.out.println(str3.equals(str4));	//true
		System.out.println(str3.intern() == str4.intern());	//true
		
		char[] carr = {'J','o','h','n'};
		StringBuffer sb = new StringBuffer("John");
		String str5 = new String(carr);		//String(char[]) 
		String str6 = new String(sb);		//String(StringBuffer)
		System.out.println(str5);
		System.out.println(str6);
		
		char h = str1.charAt(2);
		for(int i=0; i<str1.length(); i++) {
			System.out.println(str1.charAt(i));
		}
		
		System.out.println();
		
		//concat : 원본 값이 바뀌지 않음, 새로운 주소 
		String info = str1.concat(":25");
		System.out.println(info);
		System.out.println(str1);
		
		//contains
		System.out.println(info.contains(":"));	//true
		
		//endsWith : 파일 확장자 확인에 용이 
		String fileName = "news.txt";
		System.out.println(fileName.endsWith("png"));
		
		//equals
		String name1 = new String("홍길동");
		String name2 = new String("홍길동");
		System.out.println(name1 == name2);			//false
		System.out.println(name1.equals(name2));	//true
		
		String alpha1 = new String("ABC");
		String alpha2 = new String("abc");
		System.out.println(alpha1.equals(alpha2));	//false
		System.out.println(alpha1.equalsIgnoreCase(alpha2));	//true
		
		//indexOf 
		String grace = "How are you?";
		System.out.println(grace.indexOf('a'));	  //4
		System.out.println(grace.indexOf('!'));	  //-1 : 존재하지 않음 
		System.out.println(grace.indexOf("you")); //8 : 시작 인덱스 반환 
		
		String haha = "hahaha";
		System.out.println(haha.indexOf("h", 1));  //2 : 1부터 h를 찾음 
		System.out.println(haha.indexOf("ha", 1)); //2
		
		//replace : 원본을 바꾸지 않음, 새로운 주소 
		String tata = haha.replace('h', 't');
		System.out.println(tata);
		System.out.println(haha);
		String momo = haha.replace("ha", "mo");
		System.out.println(momo);
		
		String fha = haha.replaceFirst("ha", "mo");
		System.out.println(fha);
		
		System.out.println();
		
		//split 
		String fruitstr = "banana,apple,melon,strawberry";
		String[] fruites = fruitstr.split(",");
		for (int i=0; i<fruites.length; i++) {
			System.out.println(fruites[i]);
		}
		
		//substring
		String are = grace.substring(4, 7);	//인덱스 4~(7-1) 까지 
		System.out.println(are);
		String are2 = grace.substring(4);	//인덱스 4~끝까지 
		System.out.println(are2);
		
		//toLowerCase, toUpperCase
		String lower = "ABCDE";
		System.out.println(lower.toLowerCase());	//대문자 -> 소문자 
		String upper = "abcde";
		System.out.println(upper.toUpperCase());	//소문자 -> 대문자 
		
		//trim : 앞뒤 스페이스 제거 
		String tstr = "    How are you?     ";
		System.out.println(tstr);
		System.out.println(tstr.trim());
		
		//타입변환 
		String s100 = String.valueOf(100);	 //int -> String
		String s100_2 = 100+"";
		String strue = String.valueOf(true); //boolean -> String 
		String strue_2 = true+"";
		
		int n100 = Integer.parseInt("100"); 	//String -> int
		float f100 = Float.parseFloat("100.3"); //String -> float
		
		
		
		
		
		
		
		
		
		
		
	}
}
