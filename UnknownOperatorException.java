
@SuppressWarnings("serial")
public class UnknownOperatorException extends Exception{
		
	//no-arg constructor
	UnknownOperatorException(){
			
	}
	//constructor with argument
	UnknownOperatorException(String operator){
		super(operator + " is an unknown operation.");
	}
}


