package mensuration;

import java.util.Scanner;

public class Square {
	Scanner sc = new Scanner(System.in);

	void sqr() {
		System.out.println("*** Square *** \n 1.Area \n 2.parameter");
		System.out.print("Enter Choice = ");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			this.area(); // a * a
			break;
		case 2:
			this.parameter(); // 4 * a
			break;
		default:
			System.out.println("Invalid");
			break;

		}
	}

	void area() {
		double a;
		System.out.println("------------------------------------------------------");
		System.out.print("Enter Side(a) = ");
		a = sc.nextDouble();
		double ara = a * a;
		System.out.println("\nArea of Square (a * a) \n" + a + "*" + a + "=" + ara);
		System.out.println("------------------------------------------------------");

	}

	void parameter() {
		double a;
		System.out.println("------------------------------------------------------");
		System.out.print("Enter Side(a) = ");
		a = sc.nextDouble();
		double prm = 4 * a;
		System.out.println("\nParameter of Square (4 * a)  \n(4 *" + a + ")=" + prm);
		System.out.println("------------------------------------------------------");
	}
}
