import java.util.HashSet;
import java.util.Iterator;

@SuppressWarnings("unchecked")
public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("hong");
		hs.add("park");
		hs.add("song");
		hs.add("hong");	//중복값 불허 
		System.out.println(hs);	//hong song park
		
		System.out.println();
		
		HashSet<Person> pers = new HashSet<>();
		pers.add(new Person("hong", 20));
		pers.add(new Person("song", 25));
		pers.add(new Person("park", 30));
		pers.add(new Person("hong", 20));	//Person 타입에 중복 판단 
		System.out.println(pers);	//30:park, 20:hong, 25:song, 20:hong
		
		System.out.println();
		
		HashSet<Complex> coms = new HashSet<>();
		coms.add(new Complex(3, 5));
		coms.add(new Complex(7, 2));
		coms.add(new Complex(5, 6));
		coms.add(new Complex(3, 5));	//중복값 불허 
		coms.add(new Complex(5, 3));
		
		System.out.println(coms);
		
		for(Complex c : coms) {
			System.out.println(c);
		}
		
		System.out.println();
		
		Iterator<Complex> it = coms.iterator();
		for(int i=0; i<coms.size(); i++) {
//			System.out.println(it.hasNext());
			System.out.println(it.next());
		}
		
	}
}
