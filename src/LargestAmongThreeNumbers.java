import java.util.Random;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		
		Random random = new Random();
		long x1 = random.nextInt(100);
		long x2 = random.nextInt(100);
		long x3 = random.nextInt(100);

		System.out.println("The three numbers are " + x1 + x2 + x3);

		if ((x1 > x2) && (x1 > x3)) {
			System.out.println("The largest number = " + x1);
		} else if ((x2 > x1) && (x2 > x3)) {
			System.out.println("The largest number = " + x2);
		} else {
			System.out.println("The largest number = " + x3);
		}

	}

}
