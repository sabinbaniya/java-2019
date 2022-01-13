import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JFrame;

class Main{
	    int width,height,gridx,gridy;
    
	Main(){

		JFrame frame = new JFrame("Grid Bag Layout");
		GridBagLayout layout = new GridBagLayout();

		frame.setLayout(layout);
		width = 8;
		height = 8;
		for (int i = 0; i<3 ; i++) {
			GridBagConstraints gbc = new GridBagConstraints();
			gbc.weightx = 1;
			gbc.weighty = 1;
			gbc.fill = GridBagConstraints.BOTH;
			JButton button = new JButton(""+(i+1));
			gbc.gridx = gridx;
			gbc.gridy = gridy;
			gbc.gridwidth = width;
			gbc.gridheight = height;
			if(i % 2 == 0){
				gridy = height;
				width = width/2;
			}else{
				gridx = width;
				height = height/2;
			}

			layout.setConstraints(button,gbc);
			System.out.println("X=> "+layout.getConstraints(button).gridx+" Y=> "+layout.getConstraints(button).gridy+" Width=> "+layout.getConstraints(button).gridwidth+" Height=> "+layout.getConstraints(button).gridheight);
			frame.add(button);
		}
		frame.setSize(500,500);
		frame.setVisible(true);
	}
	public static void main(String[] args){
		new Main();
	}
}