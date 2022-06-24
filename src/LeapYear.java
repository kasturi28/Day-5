import java.util.Scanner;

public class LeapYear {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Taking input from the user using scanner by using if-else checking the
		 * conditions of leap year printing the output
		 */

		System.out.println("Enter a year.....");
		Scanner scanner = new Scanner(System.in);
		long check = scanner.nextLong();

		if (check % 4 == 0 || check % 400 == 0) {
			System.out.println("The given year is a leap year....");
		} else {
			System.out.println("The given year is not a leap year....");
		}

	}

}
