// WAP to demonstrate lifecycle methods of applet
import java.awt.Graphics;
import java.applet.Applet;

class LifeCycle extends Applet
{
    public void init(){
        System.out.println("Applet is being born");
    }
    
    public void start(){
        System.out.println("Applet will now run");
    }

    public void paint(Graphics g){
        g.drawString("Hello World");
    }

    public void stop(){
        System.out.println("Applet has stopped");
    }

    public void destroy(){
        System.out.println("Applet is Destroyed");
    }

}