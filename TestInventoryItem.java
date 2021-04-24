/*************************************************************************************/
/* Name : Siti Aisyah Binti Razali                                                   */
/* Matric number : 207704                                                            */
/* Lab/Question number : 3 / Q1                                                      */
/*************************************************************************************/
import java.util.*;
public class TestInventoryItem {

	public static void main(String[] args) {
		
		//create array for inventory with the size of 10 from InventoryItem() class
		InventoryItem[] inventory = new InventoryItem[10];
		String tools;
		int unit;
		
		//create Scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user to input the values for the description and unit for each object array
		System.out.println("Enter description and unit : ");
		
		//create loop to input the values into array
		for(int i = 0; i < inventory.length; i++) {
			tools = input.next();
			unit = input.nextInt();
			inventory[i] = new InventoryItem(tools, unit);
		}
		
		//to add all the tools
		int countHammer = 0;
		int countWrench = 0;
		int countNails = 0;
		
		for(int j = 0; j < inventory.length; j++) {
			if(inventory[j].getDescription().equals("wrench")) {
				countWrench += inventory[j].getUnit();
			}
			else if (inventory[j].getDescription().equals("hammer")) {
				countHammer += inventory[j].getUnit();
			}
			else if (inventory[j].getDescription().equals("nails")) {
				countNails += inventory[j].getUnit();
			}
			
		}
		//display total number of tools based on name
		System.out.print("Total unit of wrench : " + countWrench + "\n");
		System.out.print("Total unit of hammer : " + countHammer + "\n");
		System.out.print("Total unit of nails : " + countNails);
		
		input.close();
	}

}
