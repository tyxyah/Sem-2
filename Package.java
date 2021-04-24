/*************************************************************************************/
/* Name : Siti Aisyah Binti Razali                                                   */
/* Matric number : 207704                                                            */
/* Lab/Question number : 3 / Q2                                                      */
/*************************************************************************************/
public class Package {
	
	//data fields
	private double weight;
	private double shippingCost;
	char shippingMethod;
	
	//constructor with argument
	Package(double weight, char shippingMethod){
		this.weight = weight;
		this.shippingMethod = shippingMethod;
		calculateCost(weight, shippingMethod);
	}
	
	//getter method
	public double getWeight() {
		return weight;
	}
			
	public double getShippingCost() {
		return shippingCost;
	}
	
	//calculateCost() method
	public double calculateCost(double weight, char shippingMethod){
		
		//calculation if the weight > 6 oz.
		if(weight > 16) {
			if(shippingMethod == 'A')
				shippingCost = 4.50;
			else if(shippingMethod == 'T')
				shippingCost = 3.25;
			else if(shippingMethod == 'M')
				shippingCost = 2.15;
		}
		//calculation if the weight > 8 oz.
		else if(weight > 8) {
			if(shippingMethod == 'A')
				shippingCost = 3.00;
			else if(shippingMethod == 'T')
				shippingCost = 2.35;
			else if(shippingMethod == 'M')
				shippingCost = 1.50;
		}
		//calculation if the weight > 1 oz.
		else if(weight > 0) {
			if(shippingMethod == 'A')
				shippingCost = 2.00;
			else if(shippingMethod == 'T')
				shippingCost = 1.50;
			else if(shippingMethod == 'M')
				shippingCost = 0.50;
		}
			
		return shippingCost;
	}
	
	//display() method
	public void display() {
		System.out.println("Weight of item (oz.)\t: " + getWeight());
		System.out.println("Shipping methods\t: " + shippingMethod);
		System.out.println("Shipping cost (RM)\t: " + shippingCost);
		System.out.println("Insurance (RM)\t\t: " + insuredCost());
		System.out.println("Total shipping cost (RM) : " + (shippingCost + insuredCost()));
	}
	
	//insuredCost() method that adds an insurance cost to the shipping cost
	public double insuredCost() {
		double insurance = 0;
		
		if(shippingCost > 3.01)
			insurance = 5.55;
		else if(shippingCost > 1.01 )
			insurance = 3.95;
		else
			insurance = 2.45;
		
		return insurance;
	
	}

}
