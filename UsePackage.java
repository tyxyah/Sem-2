/*************************************************************************************/
/* Name : Siti Aisyah Binti Razali                                                   */
/* Matric number : 207704                                                            */
/* Lab/Question number : 3 / Q2                                                      */
/*************************************************************************************/
public class UsePackage {

	public static void main(String[] args) {
		
		//information for shipping method
		System.out.println("Character for shipping method : 'A' for Air, 'T' for Truck and 'M' for Mail");
		
		//display variety of results
		System.out.println("\nItem 1");
		Package p1 = new Package(3.56, 'A');
		p1.display();
		
		System.out.println("\nItem 2");
		Package p2 = new Package(20.2, 'T');
		p2.display();
		
		System.out.println("\nItem 2");
		Package p3 = new Package(18, 'M');
		p3.display();
		
	}

}
