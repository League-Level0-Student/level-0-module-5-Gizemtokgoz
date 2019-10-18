
public class Fibonacci {
	public static void main(String[] args) {
		int prev = 0;
		int curr = 1;
		int next;
		
		for (int i = 0; i < 12; i++) {
		next = prev+curr;	
		prev = curr;
		curr = next;
		
		System.out.println(next);
		
		}
	}
}
