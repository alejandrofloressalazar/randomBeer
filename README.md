# Synopsis

The project is composed of two large elements

### Random Beer website:

The only project webpage, which randomly displays a beer with its details.
 ~~~ txt
http://localhost:8080/alexRandomBeer/randomBeer
 ~~~

### Rest API: 
Public Rest API  that it allows to modify and obtain records of the 'beer' collection.
** more details in 'Rest API & Urls'


# Technology

### Back-End 
* Spring Boots 1.5.4
* Spring Data MongoDb 1.10.6
* Java 1.8
* Maven 

### Front-End 
* Bootstrap 4.0
* Thymeleaf
* Html 5
* Jquery
* Css 3

### Data Base
* MongoDB 3.4

### Server
* Tomcat 8.5

### Tools 
* Eclipse - Spring tool suite-3.8.4
* PostMan
* Robo3t

# Installation

* you must import the java project in your IDE, Eclipse is recommended
* have the technologies mentioned above

* Modify the class MongoConfig.java with your database connection. 


# Data Base


* Create a collection in your database called
~~~ txt 
beer
~~~ 
* Insert the sample records:
 ~~~ txt
DataBase / beer.json
~~~ 
* Modify the MongoConfig.java class with your owner Connection string 
~~~ txt 
String url = "";
~~~ 


# Rest API & Urls 
### Get All (Get)
   ~~~ txt 
   http://localhost:8080/alexRandomBeer/api/beer/
   ~~~
### Get One (Get)
   ~~~ txt
   http://localhost:8080/alexRandomBeer/api/beer/id
   Example:
   http://localhost:8080/alexRandomBeer/api/beer/5af379e4d30b7fc8e7d68f15 
   ~~~

### Insert  (Post)

   ~~~ txt
   http://localhost:8080/alexRandomBeer/api/beer/
   Example:
   http://localhost:8080/alexRandomBeer/api/beer/
   plus the following parameters:
   {
	   "name":"xxxx",
	   "description":"xxxx",
	   "abv":"0.0",
	   "brewery":"xxx"
   }
   ~~~

### Update  (Put)
   ~~~ txt
   http://localhost:8080/alexRandomBeer/api/beer/id
   Example:
   http://localhost:8080/alexRandomBeer/api/beer/5af379e4d30b7fc8e7d68f15/
   plus the following parameters:
    {
	   "name":"xxxx",
	   "description":"xxxx",
	   "abv":"0.0",
	   "brewery":"xxx"
   }
   ~~~

### Delete  (Delete)
   ~~~ txt
   http://localhost:8080/alexRandomBeer/api/beer/id
   Example=
   http://localhost:8080/alexRandomBeer/api/beer/5af37b18d30b7fc8e7d68f16/
   ~~~



