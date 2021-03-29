/*************************************************************************************/
/* This is a program to create rectangle class template                              */
/* Course Name : Computer Programming II                                             */
/* Course Code : SSK3101 Group 3                                                     */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 22 March 2021                                                      */
/*************************************************************************************/
public class Rectangle {

	//to initialize variable
	double width = 1.0;
	double height = 1.0;
	
	//constructor without argument
	Rectangle() {
		
	}
	
	//constructor with arguments
	Rectangle(double newWidth,double newHeight){
		width = newWidth;
		height = newHeight;
	}
	
	//method to compute area(non-static method)
	public double getArea() {
		double area = width* height;
		return area;
	}
	
	//method to compute perimeter(non-static method)
	public double getPerimeter() {
		double perimeter = (2* width) + (2* height);
		return perimeter;
		
	}
}
