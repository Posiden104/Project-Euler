package problem1;

public class Multipules3and5 {
	/*
	 * @author Joel Van Auken
	 */

	public static int max;

	public static int sum(int n) {
		int three;
		int five;
		if (n * 3 >= max)
			three = 0;
		else
			three = n * 3;
		if (n * 5 >= max)
			five = 0;
		else
			five = n * 5;


		if (three == 0 && five == 0)
			return 0;
		else if (three % 5 == 0)
			three = 0;

//		System.out.printf("n: %d\n3: %d\n5: %d\n------\n", n, three, five);
		return three + five + sum(n + 1);
	}

	public static int sum2() {
		int ret = 0;

		for (int i = 0; i * 5 < max; i++) {
			ret += (i * 5);
		}

		for (int i = 0; i * 3 < max; i++) {
			ret += (i * 3);
		}

		return ret;
	}

	public static void main(String[] args) {
		Multipules3and5.max = 1000;
		System.out.println(Multipules3and5.sum(1));
		// System.out.println(Multipules3and5.sum2());
	}

}
