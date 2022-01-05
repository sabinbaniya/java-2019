## User Defined Package
We can define our own package to be used in our program in Java. To define a .java file as a package the first non-comment line of code in the .java file must be ```package <nameOfPackage>```. And when compiling this file we use command ```javac -d . MyPackage.java```. Here -d flag sepcifies javac to create directory for the package & . specifies the folder where the directory must be created. In this case this is the current working directory.

After we compile our package we can import it in our other program by using ```import <nameOfPackage>.<className>```.

## Exception Handling
In Java we have five keywords for exception handling. They are try, catch, finally, throw & throws. If we are expecting some error to occur in our lines of code then we put that lines of code in the try block. And whatever error is thrown from try block we can access that in the catch block. So we can use catch block to catch those error and print them out. After the try and catch is finished the finally block will execute in the last. **Remember: the finally block will always execute no matter what.** The throws keyword is used in the method that is expected to throw some error so that it will compile without any error before compiling. And the throw keyboard is used to throw a exception.

