/*************************************************************************************/
/* This is a program to compute rectangle area and perimeter                         */
/* Course Name : Computer Programming II                                             */
/* Course Code : SSK3101 Group 3                                                     */
/* Name : Siti Aisyah Binti Razali                                                   */
/* Date created : 22 March 2021                                                      */
/*************************************************************************************/
public class TestRectangle {

	public static void main(String[] args) {
		
		//invoke and initialize Rectangle class template to calculate r1
		Rectangle r1 = new Rectangle(4,40);
		
		//to display width, height, area and perimeter for r1
		System.out.println("The rectangle with width " +r1.width + " and height " + r1.height + " : ");
		System.out.println("Area : " + r1.getArea());
		System.out.println("Perimeter : " + r1.getPerimeter());
		
		//invoke and initialize Rectangle class template to calculate r2
		Rectangle r2 = new Rectangle(3.5,35.9);
		
		//to display width, height, area and perimeter for r2
		System.out.println("\nThe rectangle with width " +r2.width + " and height " + r2.height + " : ");
		System.out.printf("Area : %.2f", r2.getArea());
		System.out.println("\nPerimeter : " + r2.getPerimeter());
		
	}

}
