package MainPackage;

public class Triangle extends GeometricObject {

	//attributes
		private double side1;
		private double side2;
		private double side3;

		//no-arg constructor
		public Triangle() {
			side1 = 1.0;
			side2 = 1.0;
			side3 = 1.0;
		}
		//constructor
		public Triangle(double Side1, double Side2, double Side3){
			this.side1= Side1;
			this.side2 = Side2;
			this.side3 = Side3;
		
		}
		
		//getter for side1
		public double getSide1() {
			return side1;
		}
		
		//getter for side2
		public double getSide2() {
			return side2;
		}
		
		//getter for side3
		public double getSide3() {
			return side3;
		}
		
		//method getArea that returns the area of the triangle
		public double getArea()
		{
			return (0.5 * side1 * side2);
		}
		
		//method getPerimeter that returns the perimeter of the triangle
		public double getPerimeter()
		{
			return (+ side1 + side2 + side3);
		}
		
		public String toString()
		{
			return ("Side1 of this triangle has a length of " + side1 +  " Side2 has a length of " + side2 + " Side3 has a length of " + side3);
		}
		
		
	}
