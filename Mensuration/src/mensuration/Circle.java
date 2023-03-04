package mensuration;

import java.util.Scanner;

public class Circle {
	double PI = 3.14;
	Scanner sc = new Scanner(System.in);

	void cir() {
		System.out.println("***Circle *** \n 1.Area \n 2.parameter");
		System.out.print("Enter Choice = ");
		int ch3 = sc.nextInt();
		switch (ch3) {
		case 1:
			this.area(); // PI*r*r
			break;
		case 2:
			this.parameter(); // 2*PI*r
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}

	void area() {
		double r;
		System.out.println("------------------------------------------------------");
		System.out.println("Area of Circle");
		System.out.print("Radius = ");
		r = sc.nextDouble();
		double ara = PI * r * r;
		System.out.println("\nArea of Circle (PI * r * r) \n" + PI + "*" + r + "*" + r + "=" + ara);
		System.out.println("------------------------------------------------------");
	}

	void parameter() {
		double r;
		System.out.println("------------------------------------------------------");
		System.out.println("Parameter of Circle");
		System.out.print("Radius = ");
		r = sc.nextDouble();
		double para = 2 * PI * r;
		System.out.println("\nparameter of Circle (2 * PI * r) \n2*" + PI + "*" + r + "=" + para);
		System.out.println("------------------------------------------------------");
	}

}
