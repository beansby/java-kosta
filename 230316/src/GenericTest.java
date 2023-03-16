
public class GenericTest {
	public static void main(String[] args) {
		
		MyArray marr = new MyArray();
		marr.add(new Person("hong", 10));
		Person p = (Person) marr.get(0);	//Object -> Person downcasting : ArrayList 구조 
		System.out.println(p.info());
		
	}
}


class MyArray {
	Object[] arr;
	int capacity = 10;
	int incrementsize = 5;
	int cnt;
	
	public MyArray() {
		arr = new Object[capacity];
	}

	//사이즈를 크게 잡기 위해 사용하는 게 좋음 
	public MyArray(int capacity) {
		this.capacity = capacity;
		arr = new Object[capacity];
	}
	
	
	
	public MyArray(int capacity, int incrementsize) {
		this.capacity = capacity;
		this.incrementsize = incrementsize;
		arr = new Object[capacity];
	}

	//ArrayList를 사용하는 이유 : 메모리가 부족할 때 자동으로 늘려주는 기능이 내재되어있음 
	void add(Object data) {
		if(capacity >= cnt) {
			capacity += incrementsize;
			Object[] narr = new Object[capacity];
			System.arraycopy(arr, 0, narr, 0, arr.length);
			arr = narr;
		}
		arr[cnt++] = data;
	} 
	
	Object get(int idx) {
		return arr[idx];
	}	
}


