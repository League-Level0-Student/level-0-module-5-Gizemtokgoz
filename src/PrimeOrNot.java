import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			String numie = JOptionPane.showInputDialog("Enter a number below.");
			int numi = Integer.parseInt(numie);
			for (int j = 2; j < numi; j++) {
				if (numi % j == 0) {
					JOptionPane.showMessageDialog(null, "Your number is not prime.");
					System.exit(0);
				}
			}
			JOptionPane.showMessageDialog(null, "Your number is prime.");
		}
	}
}
