import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {

		System.out.println("Enter the number for which the nth harmonic number required..");

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		float harmonic = (float) 1.00;

		// loop to apply the formula
		// Hn = H1 + H2 + H3 ... + Hn-1 + Hn-1 + 1/n

		for (int i = 2; i <= n; i++) {
			harmonic += (float) 1 / i;
		}

		System.out.println("The nth harmonic number is  " + harmonic);
	}

}
