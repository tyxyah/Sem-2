
public class Calculator {

	//data fields
	private double value;
	private String operation;
	
	Calculator(){
		
	}
	
	//getters method
	public double getValue() {
		return value;
	}
	
	public String getOperation() {
		return operation;
	}
	
	//method to perform operation
	public double performOperation(double value, String operation) throws UnknownOperatorException{
			
		//to get first character of String operation
		String operator = operation.substring(0,1);
			
		//to check if the operator is right, if not throw exception
		if(!operator.endsWith("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/") && !operator.equals("R") && !operator.equals("r")) 
			throw new UnknownOperatorException(operator);
			
		//to check if operator is R or r, return value
		if(operator.equals("R") || operator.equals("r"))
			return value;
		
		//get remaining string from String operation and parse it to double
		double number = Double.parseDouble(operation.substring(1,operation.length()));
			
		//calculate and display result
		System.out.print("result " + operator + " " + number + " = ");
		if(operator.equals("+"))
			return value += number;
		else if(operator.endsWith("-"))
			return value -= number;
		else if(operator.endsWith("*"))
			return value *= number;
		else
			return value /= number;
		
		}
}
