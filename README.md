# Laboratory #2 

In this second laboratory, the objective was to deploy an application based on the first laboratory [this](https://github.com/anamaria1299/Laboratorio-1-AREM) where you can find the documentation of its architecture, how to run the application and, an explication of the class diagram and functionalities.

On the other hand, you can find in this laboratory a model of architecture but in an abstraction level of components and how the application interacts.

# Prerequisites

It is necessary to have installed java 1.8 and Apache Maven 3.6.0 on the computer where the program will run.

# Architecture

![](https://github.com/anamaria1299/Laboratory-2-AREM/blob/master/src/site/resources/Component_Diagram.PNG)

The architecture approach is about a web application created with java and spark framework, besides it has a service layer where was added the logical of the application that is called when someone made a post request. The html file is called from the web application to show an agreeable interface to the user, although you can make requests from "postman" for example. 

This application was deployed on Heroku and the link for this application is [application](https://mean-deviation.herokuapp.com/operation)

If you want to make a post request to get the results is necessary to send the request body like:

```json
{
 "value": [1,2,3,5,2.3]
}
```

where the value is a list of numbers.


# Running the application

Compiling:
```console
$ mvn clean compile
```
Packing:
```console
$ mvn package
```
Running:
```console
$ java -cp target/LinkedListApp-1.0-SNAPSHOT.jar edu.escuelaing.arem.App
```
![](https://github.com/anamaria1299/Laboratory-2-AREM/blob/master/src/site/resources/runningApp.PNG)

Generating javadoc:
```console
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

This project is under the Apache license - see [LICENSE](https://github.com/anamaria1299/Laboratory-2-AREM/blob/master/LICENSE.txt) for more details.
