import java.util.Scanner;

public class AlphabetVowelConsonent {

	public static void main(String[] args) {

		System.out.println("Enter an alphabet.....");
		Scanner scanner = new Scanner(System.in);
		char check = scanner.next().charAt(0);

		if (check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u') {
			System.out.println("THE ALPHABET IS VOWEL....");
		} else {
			System.out.println("THE ALPHABET IS CONSONANT....");
		}

	}

}
