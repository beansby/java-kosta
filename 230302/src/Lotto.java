
public class Lotto {
	public static void main(String[] args) {
		
		//로또번호 6개 
		//중복값 처리 안 되어있음 
		int[] winner = new int[6];
		System.out.print("로또번호: ");
		
		for (int i=0; i<winner.length; i++) {
			int num = (int)(Math.random()*46+1);
			winner[i] = num;
			System.out.print(winner[i] +" ");
		}
		
		System.out.println();
		
		//배열의 두 인덱스 값을 바꾸는 법 : swap
		int[] ball = new int[46];
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;
		}
		//1000번 섞기 
		for(int i=0; i<1000; i++) {
			int ran1 = (int)(Math.random()*46);
			int ran2 = (int)(Math.random()*46);
			
			if(ran1 != ran2) {
				int temp = ball[ran1];
				ball[ran1] = ball[ran2];
				ball[ran2] = temp;		
			}
		}
		
		for (int i=0; i<6; i++) {
			System.out.print(ball[i]+",");
		}
	}
}
