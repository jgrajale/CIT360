// The Model performs all the calculations needed

public class CalculatorModel {

	// Holds the value
	
	
	// Multiply
	private int multiplyValue;
	
	public void multiplyTwoNumbers(int firstNumber, int secondNumber){
		
		multiplyValue = firstNumber * secondNumber;
		
	}
	
	public int getMultiplyValue(){
		
		return multiplyValue;
		
	}
	
	// Add
		private int addValue;
		
		public void addTwoNumbers(int firstNumber, int secondNumber){
			
			addValue = firstNumber + secondNumber;
			
		}
		
		public int getAdditionValue(){
			
			return addValue;
			
			
			
		}
		
		// Subtract
				private int subtractValue;
				
				public void subtractTwoNumbers(int firstNumber, int secondNumber){
					
					subtractValue = firstNumber - secondNumber;
					
				}
				
				public int getSubtractionValue(){
					
					return subtractValue;
					
				}
	

}