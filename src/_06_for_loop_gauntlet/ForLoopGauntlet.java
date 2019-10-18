package _06_for_loop_gauntlet;

public class ForLoopGauntlet {
	public static void main(String[] args) {
		int numie = 1;
		for (int i = 0; i < 100; i++) {
			System.out.println(numie+i);
		}
		
		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}
		
		for (int i = 0; i < 100; i++) {
			if (i%2 == 0) {
			System.out.println(i);
			}
		}
			
		for (int i = 0; i < 100; i++) {
			if (i%2 == 1) {
			System.out.println(i);
			}
		}
			
		for (int i = 0; i < 500; i++) {
			if (i%2 == 0) {
			System.out.println(i + " is even");
			}
		
			else if (i%2 == 1) {
				System.out.println(i + " is odd");
			}
		}
		}
	}


