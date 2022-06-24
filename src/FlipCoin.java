import java.util.Random;

public class FlipCoin {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/*
		 * Taking random choice from the computer between 0-1 By using if-else printing
		 * head or tail condition
		 */
		Random random = new Random();
		float x1 = random.nextFloat(1);

		if (x1 < 0.5) {
			System.out.println("COIN DISPLAYS HEAD....");
		} else {
			System.out.println("COIN DISPLAYS TAIL....");
		}

	}

}
