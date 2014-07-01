// This is the View
// Its only job is to display what the user sees
// It performs no calculations, but instead passes
// information entered by the user to whomever needs
// it. 

import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.*;

//Becomes a subclass of JFrame
public class CalculatorView extends JFrame{

	//Makes the textfields, labels and buttons 
	
	private JLabel title = new JLabel("MVC Calculator");
	private JTextField firstNumber  = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);
	

	CalculatorView(){
		
		// Sets up the view and adds the components
		
		JPanel calcPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		
		title.setFont(title.getFont().deriveFont(Font.BOLD));
		
		calcPanel.add(title);
		calcPanel.add(firstNumber);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);
		
		this.add(calcPanel);
		
		// End of setting up the components --------
		
	}
	
	//gets the first number entered on the calcPanel
	public int getFirstNumber(){
		
		return Integer.parseInt(firstNumber.getText());
		
	}
	
	//gets the second number entered on the calcPanel
	public int getSecondNumber(){
		
		return Integer.parseInt(secondNumber.getText());
		
	}
	
	//gets the solution 
	public int getCalcSolution(){
		
		return Integer.parseInt(calcSolution.getText());
		
	}
	
	//sets the solution
	public void setCalcSolution(int solution){
		
		calcSolution.setText(Integer.toString(solution));
		
	}
	
	// If the calculateButton is clicked execute a method
	// in the Controller named actionPerformed
	
	void addCalculateListener(ActionListener listenForCalcButton){
		
		calculateButton.addActionListener(listenForCalcButton);
		
	}
	
	// Open a popup that contains the error message passed
	
	void displayErrorMessage(String errorMessage){
		
		JOptionPane.showMessageDialog(this, errorMessage);
		
	}
	
}
