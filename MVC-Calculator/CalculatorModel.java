// The Model performs all the calculations needed
// and that is it. It doesn't know the View 
// exists

public class CalculatorModel {

	// Holds the value of the sum of the numbers
	// entered in the view
	
	private int calculationValue;
	
	//Method takes two parameters or type int
	public void addTwoNumbers(int firstNumber, int secondNumber){
		//add the two parameters given to me and put the 
		//value in the calculationValue variable 
		calculationValue = firstNumber + secondNumber;
		
	}
	
	//Method of int reurns the calculationValue
	public int getCalculationValue(){
		
		return calculationValue;
		
	}
	
}
