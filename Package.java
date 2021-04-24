/**********************************************************************************************************/
/* Create  a  class  name Package with  data  fields  for weight in  ounces,  shipping  method,           */
/* and shipping  cost.The weightand shipping  costdata  fields  have privatemodifier.                     */
/* The shipping methodis  character:  ‘A’  for  air,  ‘T’  for  truck,  and  ‘M’  for  mail.              */
/* The Package class  contains  a constructor  that  requires  arguments  for weightand shipping  method. */
/* The  constructor  calls  a calculateCost()method that determines theshipping cost                      */
/* The Packageclass also contains a display()method that displays the values in all four fields           */ 
/* Create another method named insuredCost()that adds an insurance costto the shipping cost               */
/* Write  an  application  named UsePackagethat  creates  three  objects  of Package type                 */
/* using  a variety  of  weights  and  shipping  method  codes                                            */
/* (either  ‘A’,  ‘T’,  or  ‘M’).  Display  the  results  for Package.                                    */
/**********************************************************************************************************/
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
