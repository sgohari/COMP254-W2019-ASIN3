package nasir.a3;
//lab three
import java.util.Scanner;

public class Exercise2 {

	@SuppressWarnings("unused")
	private static boolean recursivePalindrome(String value) {

		if (value.length() <= 1) {
			return true;
		} else {

			if (value.charAt(0) == value.charAt(value.length() - 1)) {

				return recursivePalindrome(value.substring(1, value.length() - 1));
			}
			return false;
		}
	}

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Your Input:");
		String value = input.nextLine();
		input.close();

		boolean result = recursivePalindrome(value);
		if (result) {
			System.out.println("Your input is a palindrome");
		} else {
			System.out.println("Your input is NOT a palindrome");
		}


	}

}
