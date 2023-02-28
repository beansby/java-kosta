
public class ForTest4 {
	public static void main(String[] args) {
		// 1~100까지의 합을 구할 때 처음으로 합계가 100보가 크거나 같아질 때의 sum과 i 값 출력 
		int sum = 0,i;
		
		for (i=1; sum<100; i++) {
			sum += i;
		}
		System.out.println("sum : " +sum);
		System.out.println("i : "+(i-1));
		
		
		//반복문의 조건식을 내부에 위치할 때 생략하기도 함 : 무한반복문 형태 
		sum = 0;
		for (i=1; ; i++) {
			sum += i;
			if(sum>=100) {
				break;
			}
		}
		System.out.println("sum : "+sum+", i : "+i);
		
		int j;
		sum =0;
		for(j=1;;j++) {
			if(j%2 == 1) {
				sum += j;
				if(sum >=100) {
					break;
				}
			}
		}
		System.out.println("sum:"+sum+", j:"+j);
	}
}
