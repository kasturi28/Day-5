import java.util.Random;

public class NumberEvenOdd {

	public static void main(String[] args) {

		Random random = new Random();
		int x1 = random.nextInt(100);
		System.out.println(" " + x1);

		if (x1 % 2 == 0) {
			System.out.println("THE NUMBER IS EVEN....");
		} else {
			System.out.println("THE NUMBER IS ODD....");
		}

	}

}
