//circle.java
import java.lang.*;
class Circle extends Shape{
	public Circle(double side){
		super(side,0,0,0);
	}

	public double calculateArea(){
		return 3.14*dim_one*dim_one;

	}

	public double calculatePerimeter(){
		return 3.14*dim_one*2;
	}

}