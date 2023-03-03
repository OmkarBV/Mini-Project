package mensuration;

import java.util.Scanner;

public class Mensuration {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("**** Mensuration ****");
			System.out.println("Enter choice");
			System.out.println(
					" 1.Square \n 2.Traingle \n 3.Circle \n 4.Cylinder \n 5.Cone \n 6.Sphere \n 7.Rectangle \n 8.Cuboid");
			System.out.print("Choice is = ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				Square r = new Square();
				r.sqr();
				break;

			case 2:
				Triangle t = new Triangle();
				t.tri();
				break;

			case 3:
				Circle c = new Circle();
				c.cir();
				break;
			case 4:
				Cylinder cy = new Cylinder();
				cy.cly();
				break;

			case 5:
				Cone co = new Cone();
				co.con();
				break;

			case 6:
				Sphere sp = new Sphere();
				sp.sph();
				break;
			case 7:
				Rectangle r7 = new Rectangle();
				r7.rec();
				break;

			case 8:
				Cuboid c8 = new Cuboid();
				c8.cub();
				break;

			default:
				System.out.println("Invalid");
				break;
			}

		}

	}
}
