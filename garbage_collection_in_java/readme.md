<h3>Garbage Collection in Java</h3>

<p>Garbage collection in java is the mechanism by which JVM automatically removes the unused objects from the memory. In Java the space for program that is allocated by JVM during runtime is allocated in a heap. And the heap is also divided into two parts: </p>
<bold>Young Space &</bold>
<bold>Old Space</bold>

<p>In java programs we dont have to free the memories ourselves like in c/c++ , JVM automatically does garbage collection to free up unused objects from the memory and thus free up the memory. Garbage collection is done automatically by JVM, but we can also call it as a method named gc inside of System class 
```System.gc();```
</p>