import java.util.Random;

public class ComputeRemainderQuotient {

	public static void main(String[] args) {
		
		Random random = new Random();
        long x1 = random.nextInt(100);
        long x2 = random.nextInt(100);

        System.out.println("The first number is " + x1);
        System.out.println("The second number is " + x2);
        System.out.println("The quotient is " + x1 / x2);
        System.out.println("The remainder is " + x1 % x2);

	}

}
