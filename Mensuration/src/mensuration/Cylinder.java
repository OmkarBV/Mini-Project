package mensuration;

import java.util.Scanner;

public class Cylinder {
	double PI = 3.14;
	Scanner sc = new Scanner(System.in);

	void cly() {
		System.out.println("*** Cylinder *** \n 1.Area \n 2.Volume");
		System.out.print("Enter Choice = ");
		int ch4 = sc.nextInt();
		switch (ch4) {
		case 1:
			this.areaTotal(); // 2*PI*r(h+r)
			break;
		case 2:
			this.volume(); // PI*r*r*h
			break;
		default:
			System.out.println("Invalid");
			break;

		}
	}

	void areaTotal() {
		System.out.println("------------------------------------------------------");
		System.out.println("Area of Cylinder");
		System.out.print("Enter r= ");
		double r = sc.nextDouble();
		System.out.print("Enter h= ");
		Double h = sc.nextDouble();
		double ara = 2 * PI * r * (h + r);
		System.out.println("\nTotal Area of Cylinder (2 * PI * r * (h + r)) \n2*" + PI + "*" + r + "*(" + h + "+" + r
				+ ")=" + ara);
		System.out.println("------------------------------------------------------");
	}

	void volume() {
		System.out.println("------------------------------------------------------");
		System.out.println("Volume of Cylinder");
		System.out.print("Enter r= ");
		double r = sc.nextDouble();
		System.out.print("Enter h= ");
		Double h = sc.nextDouble();
		double vol = PI * r * r * h;
		System.out.println("\nVolume of Cylinder (PI * r * r * h) \n" + PI + "*" + r + "*" + r + "*" + h + "=" + vol);
		System.out.println("------------------------------------------------------");
	}
}
