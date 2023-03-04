package mensuration;

import java.util.Scanner;

public class Cuboid {
	Scanner sc = new Scanner(System.in);

	void cub() {
		System.out.println("*** Cuboid *** \n 1.Area  \n 2.Volume");
		System.out.print("Enter Choice = ");
		int ch8 = sc.nextInt();
		switch (ch8) {
		case 1:
			this.areaTotal();
			break;
		case 2:
			this.volume();
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}

	void areaTotal() {
		System.out.println("------------------------------------------------------");
		System.out.println("Area of Cuboid");
		System.out.print("Enter l = ");
		double l = sc.nextDouble();
		System.out.print("Enter b =");
		double b = sc.nextDouble();
		System.out.print("Enter h =");
		double h = sc.nextDouble();
		double ara = 2 * (l * h + b * h + l * b);
		System.out.println("\nTotal Area of Cuboid (2*(l*h+b*h+l*b)) \n2*(" + l + "*" + h + "+" + b + "*" + h + "+" + l
				+ "*" + b + ") = " + ara);
		System.out.println("------------------------------------------------------");
	}

	void volume() {
		System.out.println("------------------------------------------------------");
		System.out.println("Volume of Cuboid");
		System.out.print("Enter l = ");
		double l = sc.nextDouble();
		System.out.print("Enter b =");
		double b = sc.nextDouble();
		System.out.print("Enter h =");
		double h = sc.nextDouble();

		double vol = l * b * h;
		System.out.println("\nTotal Volume of Cuboid (l * b * h) \n" + l + "*" + b + "*" + h + "=" + vol);
		System.out.println("------------------------------------------------------");
	}
}
