package mensuration;

import java.util.Scanner;

public class Cone {
	double PI = 3.14;
	Scanner sc = new Scanner(System.in);

	void con() {
		System.out.println("*** Cone *** \n 1.Area Total \n 2.Volume");
		System.out.print("Enter Choice = ");
		int ch5 = sc.nextInt();
		switch (ch5) {
		case 1:
			this.areaTotal(); // PI*r*(l+r)
			break;
		case 2:

			this.volume(); // 1/3*PI*r*r*h
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}

	void areaTotal() {
		System.out.println("------------------------------------------------------");
		System.out.println("Area of Cone");
		System.out.print("Enter r = ");
		double r = sc.nextDouble();
		System.out.print("Enter l =");
		double l = sc.nextDouble();

		double ara = PI * r * (l + r);
		System.out
				.println("\nTotal Area of Cone (PI * r * (l + r)) \n" + PI + "*" + r + "*(" + l + "+" + r + ")=" + ara);
		System.out.println("------------------------------------------------------");
	}

	void volume() {
		System.out.println("------------------------------------------------------");
		System.out.println("Volume of Cone");
		System.out.print("Enter r= ");
		double r = sc.nextDouble();
		System.out.print("Enter h= ");
		double h = sc.nextDouble();

		double vol = (double) 1 / 3 * PI * r * r * h;
		System.out.println("\nTotal Volume of Cone (1 / 3 * PI * r * r * h) \n1/3*" + PI + "*" + r + "*" + r + "*" + h
				+ "=" + vol);
		System.out.println("------------------------------------------------------");
	}
}
