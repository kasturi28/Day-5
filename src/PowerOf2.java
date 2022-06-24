import java.util.Scanner;

public class PowerOf2 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * printing input line defining power variable n using scanner function printing
		 * the output using power function
		 */
		System.out.println("Enter a power of 2.....");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double a = 2;
		double b = n;

		System.out.println("The output is " + (Math.pow(2, n)));

	}

}
