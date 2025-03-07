//Sphere.java

class Sphere extends Shape{
	public Sphere(double side){
		super(side,0,0,0);
	}

	public double calculateArea(){
		return 4*3.14*(dim_one*dim_one);
	}

	public double calculatePerimeter(){
		return 2 *dim_one * 3.14;

	}

	public double calculateVolume(){
		return (4.0/3.0) * 3.14 * (dim_one * dim_one * dim_one);

	}
}