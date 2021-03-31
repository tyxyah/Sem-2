/************************************************************************/
/* This is a test program that creates three RegularPolygon objects,    */
/* created using the no-arg constructor, using RegularPolygon(6, 4),    */
/* and using RegularPolygon(10, 4, 5.6, 7.8).                           */
/* For each object, display its perimeter and area                      */
/************************************************************************/
public class TestRegularPolygon {

	public static void main(String[] args) {
		
		//create three objects from RegularPolygon() class
		RegularPolygon polygon1 = new RegularPolygon();
		RegularPolygon polygon2 = new RegularPolygon(6,4);
		RegularPolygon polygon3 = new RegularPolygon(10,4,5.6,7.8);
		
		//display perimeter and area for each object
		System.out.printf("Polygon 1" + "\nPerimeter : " + polygon1.getPerimeter() + "\nArea : %.2f", polygon1.getArea());
		System.out.printf("\n\nPolygon 2" + "\nPerimeter : " + polygon2.getPerimeter() + "\nArea : %.2f", polygon2.getArea());
		System.out.printf("\n\nPolygon 3" + "\nPerimeter : " + polygon3.getPerimeter() + "\nArea : %.2f", polygon3.getArea());

	}

}
