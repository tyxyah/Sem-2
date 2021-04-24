/*******************************************************************************************/
/* Create a class named InventoryItemwhich has the following fields:                       */
/* •description  The private descriptionfield is a Stringthat holds the item’s name,       */
/*     	      e.g. hammer, wrench, or nails.                                               */
/* •units	 The private unitfield is an intthat holds the number of items             */
/* In addition, the class should have the following methods:                               */
/* •a no-argument constructor that will assign “ “ to description and 0 to units           */
/* •a constructor that accepts a String argument that is assigned to the descriptionfield  */
/* •a constructor that accepts a String argument that is assigned to the descriptionfield  */  
/*  and an int argument that is assigned to the unitsfield                                 */
/* •getDescription() returns the value in the descriptionfield                             */
/* •getUnits() returns the value in the unitsfield                                         */
/* •setDescription() assigns its argument to the descriptionfield                          */
/* •setUnits() assigns its argument to the unitsfield                                      */
/*******************************************************************************************/
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
