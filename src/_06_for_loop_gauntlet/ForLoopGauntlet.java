package _06_for_loop_gauntlet;

public class ForLoopGauntlet {
	public static void main(String[] args) {
		int numie = 1;
		for (int i = 0; i < 100; i++) {
			System.out.println(numie + i);
		}

		System.out.println();

		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}

		System.out.println();

		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		System.out.println();

		for (int i = 0; i < 100; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

		System.out.println();

		for (int i = 0; i < 500; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is even");
			}

			else if (i % 2 == 1) {
				System.out.println(i + " is odd");
			}
		}

		System.out.println();

		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 3; i++) {
				System.out.println(j + " " + i);
			}
		}

		System.out.println();

		for (int i = 1; i < 2; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(j + " ");
			}

			System.out.println();

			for (int j = 4; j <= 6; j++) {
				System.out.print(j + " ");
			}

			System.out.println();

			for (int j = 7; j <= 9; j++) {
				System.out.print(j + " ");
			}
		}

		System.out.println();
		System.out.println();

		for (int i = 0; i < 10; i++) {
			for (int j = 1; j < 11; j++) {
				System.out.print(j + i * 10 + " ");
			}
			System.out.println();
		}
		
		System.out.println();

		for (int j = 0; j < 6; j++) {
			for (int i = 0; i < 1+j; i++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
