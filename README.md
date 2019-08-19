# URL Web App
https://mean-deviation.herokuapp.com/operation

# Laboratory #2 

In this laboratory, a generic LinkedList was implemented and an application that calculates the mean and standard deviation of a set of n real numbers, this program read that set of real numbers from a file that is located in [file](https://github.com/anamaria1299/Laboratorio-1-AREM/blob/master/src/main/java/edu/escuelaing/arem/resources/testCases.txt), the structure of that file is the following:

  * The first line is the number of elements for the set of real numbers
  * Then comes n lines each one with a real number
  
It is necessary to remember that in the file can come one or more cases, for that reason if the number of elements is 0 you must end reading.

# Prerequisites

It is necessary to have installed java 1.8 and Apache Maven 3.6.0 on the computer where the program will run.

# Architecture

The class diagram is the following: 

 ![](https://github.com/anamaria1299/Laboratorio-1-AREM/blob/master/src/site/resources/Class_Diagram.PNG)

In this diagram it is possible to visualize the classes; in this case Node, LinkedList and App. To add and remove to the LinkedList it is possible to do it by index, here is an example of how is the functionality:

 ![](https://github.com/anamaria1299/Laboratorio-1-AREM/blob/master/src/site/resources/LinkedListArchitecture.png)

However, it is possible to see how it works in the javadoc.

# Running the application

Compiling:
```
$ mvn clean compile
```
Packing:
```
$ mvn package
```
Running:
```
$ java -cp target/LinkedListApp-1.0-SNAPSHOT.jar edu.escuelaing.arem.App
```
![](https://github.com/anamaria1299/Laboratorio-1-AREM/blob/master/src/site/resources/runningApp.PNG)

Generating javadoc:
```
$ mvn javadoc:javadoc
$ mvn javadoc:jar
$ mvn javadoc:aggregate
$ mvn javadoc:aggregate-jar
$ mvn javadoc:test-javadoc
$ mvn javadoc:test-jar
$ mvn javadoc:test-aggregate
$ mvn javadoc:test-aggregate-jar
```
Then, when you finish to run the commands, you can visualize the documentation in the path:
```
/target/site
```

# License

This project is under the Apache license - see [LICENSE](https://github.com/anamaria1299/Laboratorio-1-AREM/blob/master/LICENSE.txt) for more details.
