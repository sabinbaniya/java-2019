import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main{
	JFrame frame;
	CardLayout layout;

	Main(){
		frame = new JFrame("Card layout");
		layout = new CardLayout();

		JButton btn1 = new JButton("Click to go to next - 1");
		JButton btn2 = new JButton("Click to go to next - 2");
		JButton btn3 = new JButton("Click to go to next - 3");
		
		frame.setLayout(layout);

		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);

		frame.setSize(500,500);
		frame.setVisible(true);
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				layout.next(frame.getContentPane());
			}
		});
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				layout.next(frame.getContentPane());
			}
		});
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				layout.next(frame.getContentPane());
			}
		});
	}
	public static void main(String[] args){
		new Main();
	}
}