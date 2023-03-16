import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<Integer> tset = new TreeSet<>();
		tset.add(100);
		tset.add(55);
		tset.add(77);
		
		System.out.println(tset);	//55 77 100
		
		TreeSet<String> sset = new TreeSet<>();
		sset.add("kim");
		sset.add("hong");
		sset.add("park");
		
		System.out.println(sset);	//hong kim park
		
		TreeSet<Person> pset = new TreeSet<>();	//ClassCastException : Comparable implements
		pset.add(new Person("hong",20));
		pset.add(new Person("kang",15));
		pset.add(new Person("song",17));
		
		System.out.println(pset);
		
		System.out.println();
		
		TreeSet<Complex> cset = new TreeSet<>(new ComplexCompare()); //생성시에 Comparator 구현 객체 생성 
		cset.add(new Complex(3,5));
		cset.add(new Complex(4,7));
		cset.add(new Complex(2,3));
		
		System.out.println(cset);
		
	}
}
