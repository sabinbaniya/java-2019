## What is Stream?
- Stream is a sequence of data that is composed of bytes.

## I/O Stream in Java 
Java uses the concept of the stream to make I/O operations fast. All the classes that are required for stream functions like for input & output operation are present in ``` java.io ``` package

There are three types of stream console in java. They are:
- System.out
- System.in
- System.err

---

**Input stream** performs the operation of reading data from source such as text files, sockets, network requests etc, and bring it to the Java program. It perform reading operation.

**Output Stream** performs the operation for writing data from Java program to other files, sockets etc. 

Methods that fall under OutputStream class :
```flush()``` , 
```close()``` etc.

---

## Zipfile Stream in Java

Zip files are used to store large files in compressed form so that they are reduced in the size they use up. We can work with zip files in Java by using the classes from java.util.zip package. Each zip files has a header which includes information like name of the file and the compression method used like *GZIP* and *ZIP*. ```ZipInputStream()``` is used to read a Zip file. We then need to look at the individual entries in the archive .The ```getNextEntry()``` method returns an object of type zipEntry that describes the entry. 

---

## Object Stream in Java

Object stream is used in java for i/o operations of objects. And for objects to support the i/o they must also implement a special class called ```Specialize```.