// Main class

public class MVCCalculator {
    
    public static void main(String[] args) {
    	
	//Create the CalculatorView object
    	CalculatorView theView = new CalculatorView();
        
	//Create the CalculatorModel object
    	CalculatorModel theModel = new CalculatorModel();
        
	//Pass the objects within the CalculatorController object
        CalculatorController theController = new CalculatorController(theView,theModel);
        
        theView.setVisible(true);
        
    }
}
