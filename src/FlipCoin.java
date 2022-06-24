import java.util.Random;

public class FlipCoin {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/*
		 * 
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
