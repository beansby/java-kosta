import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		//LIFO
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		while(stack.empty() == false) {
			System.out.println(stack.pop());	//30 20 10
		}
		
		
		System.out.println();
		
		//FIFO
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		
		while(q.isEmpty() == false) {
			System.out.println(q.poll());	//10 20 30		
		}
		
	}
}
