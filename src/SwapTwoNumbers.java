import java.util.Random;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		Random random = new Random();
		long x1 = random.nextInt(100);
		long x2 = random.nextInt(100);

		System.out.println("The first number is " + x1);
		System.out.println("The second number is " + x2);
		long temp = x1;
		x1 = x2;
		x2 = temp;

		System.out.println("After swapping the first number is " + x1);
		System.out.println("After swapping the second number is " + x2);

	}

}
