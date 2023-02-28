
public class ForTest5 {
	public static void main(String[] args) {
		/**
		 * 우물의 높이는 3m, 달팽이가 하루에 올라갈 수 있는 거리는 55cm
		 * 달팽이가 자는 동안은 미끄러져서 13cm 내려감 
		 * 달팽이가 우물을 탈출하는데 몇일이 걸릴끼 
		 */
		// 우물높이 
		int height = 300;
		
		// 현재위치 
		int now = 0;
		
		// 이동거리 
		int move = 55;
		int sleep = 13;
		
		int day;
		
		for (day=1; ; day++) {
			now += move;
			
			if((height-now) <= 0) {
				System.out.println(day + "일째 도착 ");		//7
				break;
			}

			System.out.println(day+"일 경과 남은 거리 : "+(height-now)+"cm");
			now -= sleep;
		}
		
		
		int climb = 0, up = 55, down = 13, days = 0;
		while(true) {
			climb += up;
			days += 1;
			if(climb >= height) break;
			climb -= down;
		}
		System.out.println(days);
	}
}
