import java.util.ArrayList;

public class ArrayListTest3 {
	public static void main(String[] args) {
		
		ArrayList<Integer> nlist = new ArrayList<>();
		nlist.add(10);
		nlist.add(20);
		nlist.add(30);
		nlist.add(0,100);	//insert 
		
		for (Integer n : nlist) {
			System.out.println(n);
		}
		
		System.out.println();
		
		ArrayList<Integer> nlist2 = new ArrayList<>(nlist);
		
		for (Integer n : nlist2) {
			System.out.println(n);
		}
		
		System.out.println(nlist2.contains(nlist));		//false
		System.out.println(nlist2.containsAll(nlist2));	//true
		
		System.out.println();
		
		Object[] oarr = nlist2.toArray();
		
		Integer[] narr = new Integer[nlist2.size()];
		nlist2.toArray(narr);
		
		for (Integer n : narr) {
			System.out.println(n);
		}
	}
}
