import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

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
        addButton.setBounds(40,170,60,30);

        JButton subButton = new JButton("Subtract");
        subButton.setBounds(130,170,60,30);

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(tf1);
        frame.add(tf2);
        frame.add(tf3);
        frame.add(addButton);
        frame.add(subButton);

        frame.setSize(1000,1000);
        frame.setVisible(true);
        frame.setLayout(null);
    }

    public static void main(String[] args)
    {
        new SwingCalculator();
    }
}