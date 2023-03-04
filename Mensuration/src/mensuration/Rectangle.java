package mensuration;

import java.util.Scanner;

public class Rectangle {
	Scanner sc = new Scanner(System.in);

	void rec() {
		System.out.println("*** Rectangle *** \n 1.Area Total \n 2.Parameter");
		System.out.print("Enter Choice = ");
		int ch7 = sc.nextInt();
		switch (ch7) {
		case 1:
			this.area(); // a * a
			break;
		case 2:
			this.parameter(); // 2(a+b)
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}

	void area() {
		System.out.println("------------------------------------------------------");
		System.out.println("Area of Rectangle");
		System.out.print("Enter a = ");
		double a = sc.nextDouble();
		System.out.print("Enter b = ");
		double b = sc.nextDouble();
		double ar = a * b;
		System.out.println("\nArea of Rectangle (a * b) \n" + a + "*" + b + "=" + ar);
		System.out.println("------------------------------------------------------");
	}

	void parameter() {
		System.out.println("------------------------------------------------------");
		System.out.println("Parameter of Rectangle");
		System.out.print("Enter a = ");
		double a = sc.nextDouble();
		System.out.print("Enter b = ");
		double b = sc.nextDouble();
		double prm = 2 * (a + b);
		System.out.println("\nParameter of Rectangle  2(a * b)  \n2(" + a + "+" + b + ")=" + prm);
		System.out.println("------------------------------------------------------");

	}

}
