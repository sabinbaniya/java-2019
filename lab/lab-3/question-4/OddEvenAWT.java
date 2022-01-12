// Create an awt GUI that contains a button, and two text fields. When the button is clicked the value of first text field should be checked and display "odd number" or "even number" in the second text field.

import java.awt.*;
import java.awt.event.*;

class OddEvenAWT extends Frame{
	OddEvenAWT(){
		TextField input = new TextField();
		TextField result = new TextField();
		Button getResult = new Button("Check:");

		input.setBounds(20,40,80,40);
		result.setBounds(110,40,100,40);

		getResult.setBounds(20,100,120,40);

		getResult.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					if(Integer.parseInt(input.getText()) % 2 == 0){
						result.setText("Number is Even");
					}else{
						result.setText("Number is Odd");
					}
				}catch(Exception err){
					result.setText(err.getMessage());
				}
			}
		});

		add(input);
		add(result);
		add(getResult);
		setLayout(null);
		setSize(700,700);
		setVisible(true);
	}
	public static void main(String[] args){
		new OddEvenAWT();
	}
}