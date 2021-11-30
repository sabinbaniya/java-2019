<h3>Reflection API in Java</h3>

Reflection is an API which is used to examine or modify the behavior of methods, classes, interfaces at runtime.

Java Reflection is a process of examining or modifying the run time behavior of a class at run time.

The java.lang.Class class provides many methods that can be used to get metadata, examine and change the run time behavior of a class.

The java.lang and java.lang.reflect packages provide classes for java reflection.

Example :
```
import java.lang.reflect.*;
public class ReflectionDemo1
{
    public static void main (String args[])
    {
            Class c = Class.forName ("java.awt.Dimension");
            System.out.println ("Class : " + c.getName ());
            System.out.println ("Constructors:");
            Constructor constructors[] = c.getConstructors ();
            for (int i = 0; i < constructors.length; i++)
         {
             System.out.println (" " + constructors[i]);
         }
      
            System.out.println ("Fields:");
            Field fields[] = c.getFields ();
            for (int i = 0; i < fields.length; i++)
         {
             System.out.println (" " + fields[i]);
         }
         
            System.out.println ("Methods:");
            Method methods[] = c.getMethods ();
            for (int i = 0; i < methods.length; i++)
         {
             System.out.println (" " + methods[i]);
         }
    }
}
 ```

