// Create a swing GUI that contains a two buttons (add and subtract) and three text fields. When the buttons are clicked sum or difference of values of first two text fields should be displayed in the third text field respectively.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SwingCalculator
{
    SwingCalculator()
    {
        JFrame frame = new JFrame();

        JLabel label1 = new JLabel("Number 1: "); 
        label1.setBounds(30,40,70,50);
        JTextField tf1 = new JTextField();
        tf1.setBounds(110,50,150,30);

        JLabel label2 = new JLabel("Number 2: "); 
        label2.setBounds(30,70,70,100);
        JTextField tf2 = new JTextField();
        tf2.setBounds(110,100,150,30);

        JLabel label3 = new JLabel("Answer: "); 
        label3.setBounds(30,150,70,100);
        JTextField tf3 = new JTextField();
        tf3.setBounds(110,140,150,30);

        JButton addButton = new JButton("Add");
        addButton.setBounds(40,200,80,50);

        JButton subButton = new JButton("Subtract");
        subButton.setBounds(110,200,20,30);

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(tf1);
        frame.add(tf2);
        frame.add(tf3);
        frame.add(addButton);
        frame.add(subButton);

        addButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tf3.setText(""+(Integer.parseInt(tf1.getText())+Integer.parseInt(tf2.getText())));
			}
		});

		subButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tf3.setText(""+(Integer.parseInt(tf1.getText())-Integer.parseInt(tf2.getText())));
			}
		});

        frame.setSize(700,700);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
    }

    public static void main(String[] args)
    {
        new SwingCalculator();
    }
}