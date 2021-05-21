import java.util.*;
public class SimpleCalculator {

	public static void main(String[] args) {
		
		//data field and scanner
		String decision = "y";
		int count;
		double result;
		String operation;
		Scanner input = new Scanner(System.in);
		
		//create object for Calculator() class
		Calculator calculate = new Calculator();
		
		//to show that the calculation is on
		System.out.println("Calculator is on.");
		
		//outer loop whether want to continue the calculating or not
		while(decision.equals("Y") || decision.equals("y")) {
			
			//set data field to initial value
			count = 0;
			result = 0.0;
			operation = "";
			System.out.println("result = " + result);
			
			//check if users want to get result or continue the calculation(check R or r)
			while(!operation.equals("R") && !operation.equals("r")) {
				operation = input.next();
				
				//this code in try lock will execute in normal circumstances
				try {
					result = calculate.performOperation(result, operation);
					count++;
					
					if(!operation.equals("R") && !operation.equals("r")) {
						
						//to display new result(count = 1 as the first result)
						if(count == 1) {	
							System.out.println(result);
							System.out.println("New result = " + result);
						}
						//to display update result(count != 1 as the updated result)
						else {
							System.out.println(result);
							System.out.println("Updated result = " + result);
						}
					}
				}
				//this code in catch block is to handle the exception
				catch(UnknownOperatorException ex) {
					System.out.println(ex.getMessage());
					System.out.println("re-enter");
				}
			}
			//display final result
			System.out.println("Final result = " + result);
			System.out.println("Again? (y/n)");
			decision = input.next();
		
		}
		//display when users enter n
		System.out.println("End of Program.");
		input.close();
	}

}

