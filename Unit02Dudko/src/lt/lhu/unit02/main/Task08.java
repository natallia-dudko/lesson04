package lt.lhu.unit02.main;

public class Task08 {

	public static void main(String[] args) {
		double a;
		double b;
		double h;
		double fx;

		a = -5;
		b = 8.7;
		h = 0.2;

		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "fx");
		System.out.println("---------------------------------");

		for (double x = a; x <= b; x += h) {
			fx = 2 * Math.tan(x / 2) + 1;

			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, fx);
		}
		System.out.println("---------------------------------");
	}

}
