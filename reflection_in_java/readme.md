<h3>Reflection API in Java</h3>

Reflection is an API which is used to examine or modify the behavior of methods, classes, interfaces at runtime.

Java Reflection is a process of examining or modifying the run time behavior of a class at run time.

The java.lang.Class class provides many methods that can be used to get metadata, examine and change the run time behavior of a class.

The java.lang and java.lang.reflect packages provide classes for java reflection.

<h4>Advantages of Reflection in Java</h4>
---

Extensibility Features: An application may use external, user-defined classes by creating instances of extensibility objects using their fully-qualified names.

Class Browsers and Visual Development Environments: A class browser must be ready to enumerate the members of classes. Visual development environments can enjoy making use of type information available in reflection to assist the developer in writing the correct code.

Debuggers and Test Tools: Debuggers got to be ready to examine private members in classes. Test harnesses can make use of reflection to systematically call a discoverable set APIs defined on a category, to ensure a high level of code coverage during a test suite.

<h4>Disadvantages of reflection in Java</h4>
---

Performance Overhead: Certain Java virtual machine optimizations cannot be performed because reflection involves types that are dynamically resolved.

Security Restrictions: When running under a security manager, reflection requires a runtime permission which may not be present. This is in a crucial consideration for code that has got to run during a restricted security context, like in an Applet.

Exposure of Internals: The use of reflection can result in unexpected side-effects because reflection allows code to perform operations that would be illegal in non-reflective code, such as accessing private fields and methods, which can render code dysfunctional and should destroy portability. Reflective code breaks abstractions and thus may change behavior with upgrades of the platform.


