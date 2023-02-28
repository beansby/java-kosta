
public class ForTest3 {
	public static void main(String[] args) {
		//별표 찍기 (10x10)
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//별표 찍기(트리모양) 
		for(int i=0; i<10; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		
		System.out.println();
		
		//별표 찍기(역트리모양) 
		for(int i=10; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		
		for(int i=0; i<10; i++) {
			for(int j=10; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}	
		
	}
}
