
//NAME : Tom Thomas
//PRN : 23070126136
//Batch : AIML B3


import java.util.*;

class Main{

	public static void main(String args[]){

		

		while(true){
			Scanner scan = new Scanner(System.in);
			System.out.println("--------------------------------------------------------------");
			System.out.println("MENU\n");
			System.out.println("1. Triangle");
			System.out.println("2. Square");
			System.out.println("3. Rectangle");
			System.out.println("4. Circle");
			System.out.println("5. Sphere");
			System.out.println("6. Cylinder");
			System.out.println("7. Cube");
			System.out.println("8. Equilateral Pyramid");
			System.out.println("9. EXIT");

			System.out.println("--------------------------------------------------------------");
			System.out.println("Enter your Choice : ");
			int choice = scan.nextInt();
			scan.nextLine();

			switch(choice){
			case 1 ://Triangle
				System.out.println("Enter Base of Triangle :");
				double baset = scan.nextDouble();

				System.out.println("Enter Height of Triangle :");
				double heightt = scan.nextDouble();
				System.out.println("______________________________________________________________________");

				Shape triangle = new Triangle(baset,heightt);
				System.out.println("Area of Triangle : "+triangle.calculateArea());
				System.out.println("Perimeter of triangle : "+triangle.calculatePerimeter());
				System.out.println("______________________________________________________________________");

				break;

			case 2 ://Square
				System.out.println("Enter Side of Square :");
				double sidess = Double.parseDouble(scan.nextLine());


				System.out.println("______________________________________________________________________");

				Shape square = new Square(sidess);
				System.out.println("Area of Square : "+square.calculateArea());
				System.out.println("Perimeter of Square : "+square.calculatePerimeter());
				System.out.println("______________________________________________________________________");
				break;
			case 3 : //Rectangle
				System.out.println("Enter Length of Rectangle :");
				double lengthrr = scan.nextDouble();

				System.out.println("Enter Breadth of Rectangle :");
				double breadthrr = scan.nextDouble();
				Shape rectangle = new Rectangle(lengthrr,breadthrr);

				System.out.println("______________________________________________________________________");

				System.out.println("Area of Rectangle : "+rectangle.calculateArea());
				System.out.println("Perimeter of Rectangle : "+rectangle.calculatePerimeter());

				System.out.println("______________________________________________________________________");
				break;

			case 4 : //Circle
				System.out.println("Enter Radius of Circle : ");
				double radiuscc = scan.nextDouble();

				Shape circle = new Circle(radiuscc);
				System.out.println("______________________________________________________________________");
				System.out.println("Area of Circle : "+circle.calculateArea());
				System.out.println("Perimeter of Circle : "+circle.calculatePerimeter());

				System.out.println("______________________________________________________________________");


				break;

			case 5 : //Sphere
				System.out.println("Enter the Radius of Sphere : ");
				double radiusss = scan.nextDouble();

				Shape sphere = new Sphere(radiusss);
				System.out.println("______________________________________________________________________");
				System.out.println("Area of Sphere : "+sphere.calculateArea());
				System.out.println("Perimeter of Sphere : "+sphere.calculatePerimeter());
				System.out.println("Volume of Sphere : "+sphere.calculateVolume());

				System.out.println("______________________________________________________________________");
				break;


			case 6 : //Cylinder
				System.out.println("Enter radius of Cylinder : ");
				double radiuscy = scan.nextDouble();

				System.out.println("Enter height of Cylinder : ");
				double heightcy = scan.nextDouble();


				Shape cylinder = new Cylinder(radiuscy,heightcy);
				System.out.println("______________________________________________________________________");
				System.out.println("Area of Sphere : "+cylinder.calculateArea());
				System.out.println("Perimeter of Sphere : "+cylinder.calculatePerimeter());
				System.out.println("Volume of Sphere : "+cylinder.calculateVolume());

				System.out.println("______________________________________________________________________");


				break;

			case 7 : //Cube
				System.out.println("Enter side of Cube : ");
				double sidecu = scan.nextDouble();


				System.out.println("______________________________________________________________________");

				Shape cube = new Cube(sidecu);
				System.out.println("Area of Cube : "+cube.calculateArea());
				System.out.println("Perimeter of Cube : "+cube.calculatePerimeter());
				System.out.println("Volume of Cube :"+cube.calculateVolume());

				System.out.println("______________________________________________________________________");
				break;

			case 8 : //Equilateral Pyramid
				System.out.println("Enter the side of the Base of the Pyramid : ");
				double basepp  = scan.nextDouble();

				System.out.println("Enter the height of the Pyramid : ");
				double heightpp = scan.nextDouble();


				System.out.println("______________________________________________________________________");

				Shape pyramid = new Pyramid(basepp,heightpp);
				System.out.println("Area of Pyramid : "+pyramid.calculateArea());
				System.out.println("Perimeter of Pyramid : "+pyramid.calculatePerimeter());
				System.out.println("Volume of Pyramid :"+pyramid.calculateVolume());

				System.out.println("______________________________________________________________________");
				break;

			case 9 :
				System.out.println("UNTIL WE MEET AGAIN!!");
				System.out.println("EXITING. . . . .");
				scan.close();
				break;

			default :
				System.out.println("Please enter a valid choice!!!");


			}
		}
		
		
		
	}


}