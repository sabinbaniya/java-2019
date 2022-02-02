// Draw a cricle, ellipse, traingle, hexagon, pentagon in different colors.
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    Main()
    {
        setTitle("Draw a cricle, ellipse, traingle, hexagon, pentagon in different colors.");
        setSize(900, 900);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) 
    {

        //circle
		g.setColor(Color.RED);
        g.fillOval(30,50,90,90);

        //ellipse
        g.setColor(Color.GREEN);
        g.fillOval(150,80,90,50);

        //triangle
        g.setColor(Color.BLACK);
        int x[] = {300,200,50};
        int y[] = {150,250,150};
        g.fillPolygon(x, y, 3);
        
        //hexagon
        g.setColor(Color.YELLOW);
        int x1[] = {400,600,800,600,400,200};
        int y1[] = {100,100,300,500,500,300};
        g.fillPolygon(x1, y1, 6);

        //pentagon
        g.setColor(Color.PINK);
        int x2[] = {150,250,200,100,50};
        int y2[] = {300,350,400,400,350};
        g.fillPolygon(x2, y2, 5);
    }

    public static void main(String[] args)
    {
       new Main();
    }
}