
public class SingleTonTest {
	public static void main(String[] args) {
//		SingleArray sa = new SingleArray();
		SingleArray sa1 = SingleArray.getReference();
		SingleArray sa2 = SingleArray.getReference();
		System.out.println(sa1 == sa2); 	//false = !singleton
		
		sa1.setData(10);
		System.out.println(sa2.getData(0));	//하나의 배열 참조 
	}
}


class SingleArray {
	int[] array = new int[10];
	int cnt;
	
	private SingleArray() {}
	
	static SingleArray singleArray;
	
	public static SingleArray getReference() {
		//메소드 내부에서 인스턴스 생성 후 리턴 
		if(singleArray == null) {
			singleArray = new SingleArray(); 			
		}
		return singleArray;
	}
	
	public void setData(int data) {
		array[cnt++] = data;
	}
	
	public int getData(int idx) {
		return array[idx];
	}
	
}