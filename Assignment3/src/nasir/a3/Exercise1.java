package nasir.a3;

public class Exercise1 {

	static int product(int x, int y) {
		// if x is less than
		// y swap the numbers
		if (x < y)
			return product(y, x);

		// iteratively calculate
		// y times sum of x
		else if (y != 0)
			return (x + product(x, y - 1));

		// if any of the two numbers is
		// zero return zero
		else
			return 0;
	}

	public static void main(String[] args) {


		int x = 5, y = 7;
		System.out.println(product(x, y));
	}

}
