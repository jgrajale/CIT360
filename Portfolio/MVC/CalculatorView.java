// This is the View class, it displays the results 

import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorView extends JFrame{

	// Multiply
	private JTextField firstNumber  = new JTextField(10);
	private JLabel multiplyLabel = new JLabel("x");
	private JTextField secondNumber = new JTextField(10);
	private JButton multiplyButton = new JButton("Calculate");
	private JTextField multiplySolution = new JTextField(10);
	
	
	//Add
	private JTextField thirdNumber  = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField fourthNumber = new JTextField(10);
	private JButton addButton = new JButton("Calculate");
	private JTextField addSolution = new JTextField(10);
	
	//Subtract
		private JTextField fifthNumber  = new JTextField(10);
		private JLabel subtractionLabel = new JLabel("-");
		private JTextField sixthNumber = new JTextField(10);
		private JButton subtractButton = new JButton("Calculate");
		private JTextField subtractSolution = new JTextField(10);
	
	CalculatorView(){
		
		// Sets up the view 
		
		JPanel calcPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		//Multiply Panel
		calcPanel.add(firstNumber);
		calcPanel.add(multiplyLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(multiplyButton);	
		calcPanel.add(multiplySolution);
		
		//Add Panel
		calcPanel.add(thirdNumber);
		calcPanel.add(additionLabel);
		calcPanel.add(fourthNumber);
		calcPanel.add(addButton);
		calcPanel.add(addSolution);
		
		//Add Panel
		calcPanel.add(fifthNumber);
		calcPanel.add(subtractionLabel);
		calcPanel.add(sixthNumber);
		calcPanel.add(subtractButton);
		calcPanel.add(subtractSolution);
		
		this.add(calcPanel);
		
		
		
	}
	
	public int getFirstNumber(){
		
		return Integer.parseInt(firstNumber.getText());
		
	}
	
	public int getSecondNumber(){
		
		return Integer.parseInt(secondNumber.getText());
		
	}
	
	public int getThirdNumber(){
		
		return Integer.parseInt(thirdNumber.getText());
		
	}
	
	public int getFourthNumber(){
		
		return Integer.parseInt(fourthNumber.getText());
		
	}
	
	
public int getFifthNumber(){
		
		return Integer.parseInt(fifthNumber.getText());
		
	}

public int getSixthNumber(){
	
	return Integer.parseInt(sixthNumber.getText());
	
}
	
	
	public int getMuliplySolution(){
		
		return Integer.parseInt(multiplySolution.getText());
		
	}
	
	public void setMultiplySolution(int solution){
		
		multiplySolution.setText(Integer.toString(solution));
		
	}
	
	

	public int getAddSolution(){
		
		return Integer.parseInt(addSolution.getText());
		
	}
	
	public void setAddSolution(int solution){
		
		addSolution.setText(Integer.toString(solution));
		
	}
	
   public int getSubtractSolution(){
		
		return Integer.parseInt(subtractSolution.getText());
		
	}
	
	public void setSubtractSolution(int solution){
		
		subtractSolution.setText(Integer.toString(solution));
		
	}
	// Execute method
	
	void multiplyCalculateListener(ActionListener listenForCalcButton){
		
		multiplyButton.addActionListener(listenForCalcButton);
		
	}
    
	void addCalculateListener(ActionListener listenForCalcButton){
		
		addButton.addActionListener(listenForCalcButton);
		
	}
	
	
void subtractCalculateListener(ActionListener listenForCalcButton){
		
		subtractButton.addActionListener(listenForCalcButton);
		
	}
	
	//If no numbers are typed, error message appears
	
	void displayErrorMessage(String errorMessage){
		
		JOptionPane.showMessageDialog(this, errorMessage);
		
	}
	
}