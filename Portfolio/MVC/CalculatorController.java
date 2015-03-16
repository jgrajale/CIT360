import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// The Controller coordinates interactions
// between the View and Model

public class CalculatorController {
	
	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		// Tell the View that when ever the calculate button
		// is clicked to execute the Model
		
		this.theView.multiplyCalculateListener(new MultiplyListener());

		this.theView.addCalculateListener(new AddListener());
		
		this.theView.subtractCalculateListener(new subtractListener());
	}
	
	
	class MultiplyListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int firstNumber, secondNumber = 0;
			
			
			
			try{
			
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
		
				
				theModel.multiplyTwoNumbers(firstNumber, secondNumber);
				
				
				theView.setMultiplySolution(theModel.getMultiplyValue());
				

					
					}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theView.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
	}
	
	
	class AddListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int thirdNumber, fourthNumber = 0;
			
		
			
			try{
			
				thirdNumber = theView.getThirdNumber();
				fourthNumber = theView.getFourthNumber();
		
				
				theModel.addTwoNumbers(thirdNumber, fourthNumber);
				
				
				theView.setAddSolution(theModel.getAdditionValue());
				

					
					}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theView.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
	}
	
	
	
	class subtractListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int fifthNumber, sixthNumber = 0;
			
			
			
			try{
			
				fifthNumber = theView.getFifthNumber();
				sixthNumber = theView.getSixthNumber();
		
				
				theModel.subtractTwoNumbers(fifthNumber, sixthNumber);
				
				
				theView.setSubtractSolution(theModel.getSubtractionValue());
				

					
					}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theView.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
	}
}