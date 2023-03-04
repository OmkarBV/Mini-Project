package mensuration;

import java.util.Scanner;

public class Sphere {

	double PI = 3.14;
	Scanner sc = new Scanner(System.in);

	void sph() {
		System.out.println("*** Sphere *** \n 1.Area Total \n 2.Volume");
		System.out.print("Enter Choice = ");
		int ch6 = sc.nextInt();
		switch (ch6) {
		case 1:
			this.areaLateral(); // 4*PI*r*r
			break;
		case 2:
			this.volume(); // 4/3*PI*r*r*r
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}

	void areaLateral() {
		System.out.println("------------------------------------------------------");
		System.out.println("Area of Sphare");
		System.out.print("Enter r= ");
		double r = sc.nextDouble();
		double ara = (double) 4 * PI * r * r;
		System.out.println("\nlateralor Curved surface (Total) Area of Sphere (4 * PI * r * r) \n4*" + PI + "*" + r
				+ "*" + r + "=" + ara);
		System.out.println("------------------------------------------------------");
	}

	void volume() {
		System.out.println("------------------------------------------------------");
		System.out.println("Volume of Sphare");
		System.out.print("Enter r= ");
		double r = sc.nextDouble();
		double vol = (double) 4 / 3 * PI * r * r * r;
		System.out.println("\nVolume Total of Sphere (4 / 3 * PI * r * r * r) \n4/3*" + PI + "*" + r + "*" + r + "*" + r
				+ "=" + vol);
		System.out.println("------------------------------------------------------");
	}
}
