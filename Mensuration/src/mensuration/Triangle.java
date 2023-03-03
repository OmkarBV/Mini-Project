package mensuration;

import java.util.Scanner;

public class Triangle {
	Scanner sc = new Scanner(System.in);

	void tri() {
		System.out.println("*** Triangle *** \n 1.Area \n 2.parameter");
		System.out.print("Enter Choice = ");
		int ch2 = sc.nextInt();
		switch (ch2) {
		case 1:
			this.area(); // 1/2(b*h)
			break;
		case 2:
			this.parameter(); // a+b+c
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}

	void area() {
		System.out.println("------------------------------------------------------");
		System.out.println("Area of Traingle");

		System.out.print("Enter b = ");
		double b = sc.nextDouble();
		System.out.print("Enter h =");
		double h = sc.nextDouble();

		double ara = (double) 1 / 2 * (b * h);
		System.out.println("Area of Triangle (1/2(b*h))  \n1/2(" + b + "*" + h + ")=" + ara);
		System.out.println("------------------------------------------------------");

	}

	void parameter() {
		System.out.println("------------------------------------------------------");
		System.out.println("parameter of Traingle");
		System.out.print("Enter a= ");
		double a = sc.nextDouble();
		System.out.print("Enter b= ");
		double b = sc.nextDouble();
		System.out.print("Enter c= ");
		double c = sc.nextDouble();

		double para = a + b + c;
		System.out.println("Parameter of Triangle (a+b+c) \n" + a + "+" + b + "+" + c + "=" + para);
		System.out.println("------------------------------------------------------");
	}

}
