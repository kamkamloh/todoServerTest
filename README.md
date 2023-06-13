# todoServerTest
A simple todo springboot application


The following was test todo REST API using the [Spring Boot Framework]. The API allow you to add item to a to-do list, update, select and remove from the list.



##  Concepts used in this Application
* [@RestController](https://spring.io/guides/gs/rest-service/)
* [@Service](https://spring.io/guides/gs/rest-service/)
* [@Entity](https://spring.io/guides/gs/rest-service/)
* [CrudRepository](https://docs.spring.io/spring-data/data-commons/docs/1.6.1.RELEASE/reference/html/repositories.html)


### instruction for running and building the app
* Make sure you have [java JDK](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html) and [Maven](https://maven.apache.org/) installed
* Make sure you have a Mysql server running.
* Create a database using the create statement in this directory (Todo-REST-API-loh/readme/DB setup/table.txt)
* Modify the username and passowrd in the file mention above with this line:  spring.datasource.username=testUsername spring.datasource.password=testpasword
* Run the application using your preferred IDE.


### instruction for testing the app
* Application Demo with [Postman](https://www.postman.com/):
* Get the curl from this directory(Todo-REST-API-loh/readme/curl postman/postmanCurl.txt)

### interface documentation

### Sign in via google
<img src="Todo-REST-API-loh/readme/readme/getacesstoken.png?raw=true"  alt="Demo screen postman">

###  Add a TODO item.
<img src="Todo-REST-API-loh/readme/additem.png?raw=true"  alt="Demo screen postman">

###  Delete a TODO item.
<img src="Todo-REST-API-loh/readme/readme/deleteItem.png?raw=true"  alt="Demo screen postman">
<img src="Todo-REST-API-loh/readme/readme/deleteInvalid.png?raw=true"  alt="Demo screen postman">

###  List all TODO items.
<img src="Todo-REST-API-loh/readme/readme/todolist.png?raw=true"  alt="Demo screen postman">

###  Mark a TODO item as completed.
<img src="Todo-REST-API-loh/readme/readme/updateitem.png?raw=true"  alt="Demo screen postman">










