/************************************************************************************************************************/
/* (Geometry: n-sided regular polygon) In an n-sided regular polygon, all sides have                                    */
/* the same length and all angles have the same degree (i.e., the polygon is both equilateral and equiangular).         */
/* Design a class named RegularPolygon that contains:                                                                   */
/* - A private int data field named n that defines the number of sides in the polygon                                   */
/*   with default value 3.                                                                                              */
/* - A private double data field named side that stores the length of the side with default value 1.                    */
/* - A private double data field named x that defines the x-coordinate of the polygon’s center with default value 0.    */
/* - A private double data field named y that defines the y-coordinate of the polygon’s center with default value 0.    */
/* - A no-arg constructor that creates a regular polygon with default values.                                           */
/* - A constructor that creates a regular polygon with the specified number of sides                                    */
/*   and length of side, centered at (0, 0).                                                                            */
/* - A constructor that creates a regular polygon with the specified number of sides,                                   */
/*   length of side, and x- and y-coordinates.                                                                          */
/* - The accessor and mutator methods for all data fields.                                                              */
/* - The method getPerimeter() that returns the perimeter of the polygon.                                               */
/* - The method getArea() that returns the area of the polygon.                                                         */
/************************************************************************************************************************/
public class RegularPolygon {
	
	private int n;
	private double side;
	private double x;
	private double y;
	
	//no-arg constructor with default value
	RegularPolygon() {
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}
	
	//constructor with specified number of sides and length of side, centered at (0,0)
	RegularPolygon(int newN, double newSide) {
		n = newN;
		side = newSide;
		
	}
	
	//constructor with specified number of sides, length of sides, and x- and y-coordinates
	RegularPolygon(int newN, double newSide, double newX, double newY) {
		n = newN;
		side = newSide;
		x = newX;
		y = newY;
		
	}
	
	//accessor method for all data types
	public int getN() {
		return n;
	}
	
	public double getSide() {
		return side;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	//mutator
	public int setN(int newN) {
		n = newN;
		return n;	
	}
	
	public double setSide(double newSide) {
		side = newSide;
		return side;
	}
	
	public double setX(double newX) {
		x = newX;
		return x;
	}
	
	public double setY(double newY) {
		y = newY;
		return y;
	}
	
	//method for getParameter() that returns parameter of the polygon
	public double getPerimeter() {
		double perimeter = n* side;
		return perimeter;
	}
	
	//method getArea() that returns the area of the polygon
	public double getArea() {
		double area = ((n* (side*side))/(4* Math.tan(Math.PI/n)));
		return area;
	}

}
