/*************************************************************************************/
/* Name : Siti Aisyah Binti Razali                                                   */
/* Matric number : 207704                                                            */
/* Lab/Question number : 3 / Q1                                                      */
/*************************************************************************************/
public class InventoryItem {

	private String description;
	private int unit;
	
	//no-arg constructor that assign "" to description and 0 to units
	InventoryItem(){
		description = "";
		unit = 0;
	}
	
	//constructor that accepts a String argument 
	InventoryItem(String description){
		
	}
	
	//constructor that accepts a String arg an int argument
	InventoryItem(String description, int unit){
		this.description = description;
		this.unit = unit;
	}
	
	//getter method
	public String getDescription() {
		return description;
	}
	
	public int getUnit() {
		return unit;
	}
	
	//setter method
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setUnit(int unit) {
		this.unit = unit;
	}
	
}
