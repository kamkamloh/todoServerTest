# Todo REST API


The following is simple todo REST API using the [Spring Boot Framework]. The API allow you to
add item to a to-do list, update, select and remove from the list.



##  Concepts used in this Application


* [@RestController](https://spring.io/guides/gs/rest-service/)
* [@Service](https://spring.io/guides/gs/rest-service/)
* [@Entity](https://spring.io/guides/gs/rest-service/)
* [CrudRepository](https://docs.spring.io/spring-data/data-commons/docs/1.6.1.RELEASE/reference/html/repositories.html)


### Usage
* Make sure you have [java JDK](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html) and [Maven](https://maven.apache.org/) installed
* Make sure you have a Mysql server running.
* Create a database with the following name: todo_db, you can modify it in the application.properties file with this line:  spring.datasource.url=jdbc:mysql://localhost:3306/todo_db?autoReconnect=true& 
* Modify the username and pawsord in the file mention above with this line:  spring.datasource.username=testUsername spring.datasource.password=testpasword
* Run the application using your preferred IDE ([IntelliJ](https://www.jetbrains.com/idea/), [STS](https://spring.io/tools))



##  Application Demo with [Postman](https://www.postman.com/):


### interface documentation
### Todo list :



### Add  Item



### Update item





### Delete item







