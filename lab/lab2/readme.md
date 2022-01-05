## User Defined Package
We can define our own package to be used in our program in Java. To define a .java file as a package the first non-comment line of code in the .java file must be ```package <nameOfPackage>```. And when compiling this file we use command ```javac -d . MyPackage.java```. Here -d flag sepcifies javac to create directory for the package & . specifies the folder where the directory must be created. In this case this is the current working directory.

After we compile our package we can import it in our other program by using ```import <nameOfPackage>.<className>```.