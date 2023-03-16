import java.util.Iterator;

public class GenericTest2 {
	public static void main(String[] args) {
		MyClass<Person> pers = new MyClass<>();
		pers.add(new Person("song", 25));
		Person p = pers.get(0);	//generic은 downcasting 불필요 
		System.out.println(p.info());
		
		MyClass<Integer> narr = new MyClass<>();
		narr.add(10);
		int n = narr.get(0);
		System.out.println(n);
	}
}

class MyClass<E> implements Iterator<E>{
	E[] arr;
	int capacity = 10;
	int incrementsize = 5;
	int cnt;
	
	@SuppressWarnings("unchecked")
	public MyClass() {
		//배열은 타입이 지정되지 않으면 생성할 수 없음 
//		arr = new E[capacity]; 
		arr = (E[])(new Object[capacity]);	//Object[] -> E[] casting 
	}

	@SuppressWarnings("unchecked")
	public MyClass(int capacity) {
		this.capacity = capacity;
		arr = (E[])(new Object[capacity]);
	}
	
	@SuppressWarnings("unchecked")
	void add(E data) {
		if(cnt >= capacity) {
			capacity += incrementsize;
			E[] narr = (E[])(new Object[capacity]); 
			System.arraycopy(arr, 0, narr, 0, arr.length);
			arr = narr;
		}
		arr[cnt++] = data;
	}
	
	E get(int idx) {
		return arr[idx];
	}

//	@Override
	public Iterator<E> iterator(){
		return new Iterator<E>() {
			int idx = 0;
			
			@Override
			public boolean hasNext() {
				return arr[idx]!=null;
			}

			@Override
			public E next() {
				return arr[idx++];
			}
		};
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E next() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
