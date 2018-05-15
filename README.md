# Synopsis

The project is composed of two large elements

<<<<<<< HEAD
### Random Beer website:
=======
###Random Beer website:
>>>>>>> ea4a7b5cc7ee7e0b3034fed61eb9bf7697a089cb

The only project webpage, which randomly displays a beer with its details.
 ~~~ txt
http://localhost:8080/alexRandomBeer/randomBeer
 ~~~

<<<<<<< HEAD
### Rest API: 
=======
###Rest API:
>>>>>>> ea4a7b5cc7ee7e0b3034fed61eb9bf7697a089cb

Public Rest API  that it allows to modify and obtain records of the 'beer' collection
** more details in 'Rest API & Urls'


# Project Technology

<<<<<<< HEAD
### Back-End 
=======
###Back-End
>>>>>>> ea4a7b5cc7ee7e0b3034fed61eb9bf7697a089cb
* Spring Boots 1.5.4
* Spring Data MongoDb 1.10.6
* Java 1.8
* Maven 

<<<<<<< HEAD
### Front-End 
=======
###Front-End 
>>>>>>> ea4a7b5cc7ee7e0b3034fed61eb9bf7697a089cb
* Bootstrap 4.0
* Thymeleaf
* Html 5
* Jquery
* Css 3

<<<<<<< HEAD
### Data Base
* MongoDB 3.4

### Server
* Tomcat 8.5

### Tools 
=======
###Data Base
* MongoDB 3.4

###Server
* Tomcat 8.5

###Tools 
>>>>>>> ea4a7b5cc7ee7e0b3034fed61eb9bf7697a089cb
* Eclipse - Spring tool suite-3.8.4
* PostMan
* Robo3t

# Installation

* you must import the java project in your IDE, Eclipse is recommended
* have the technologies mentioned above

* Modify the class MongoConfig.java with your database connection. 


# Data Base:

Name Collection = beer

db.beer.findOne();

Scheme:
``` corefile
{
    "_id" : ObjectId("5af379e4d30b7fc8e7d68f15"),
    "_class" : "com.sch.randomBeer.bean.Beer",
    "name" : "GUINNESS STOUT",
    "description" : "very cool beer",
    "abv" : "4.2",
    "brewery" : "Temple Bar "
}
```


# Rest API & Urls 

   Website : 
   http://portalpega.cl/alexRandomBeer/randomBeer

  API Rest: 

   ~~~ txt 
   GetAll (Get method)
   http://portalpega.cl/alexRandomBeer/api/beer/
   ~~~

   ~~~ txt
   Get a beer (Get method)
   http://portalpega.cl/alexRandomBeer/api/beer/id
   Example:
   http://portalpega.cl/alexRandomBeer/api/beer/5af379e4d30b7fc8e7d68f15 
   ~~~


   ~~~ txt
   Insert   (Get post)
   http://portalpega.cl/alexRandomBeer/api/beer/
   Example:
   http://portalpega.cl/alexRandomBeer/api/beer/
   plus the following parameters:
   {
	   "name":"xxxx",
	   "description":"xxxx",
	   "abv":"0.0",
	   "brewery":"xxx"
   }
   ~~~


   ~~~ txt
   Update (Put method)
   http://portalpega.cl/alexRandomBeer/api/beer/id
   Example:
   http://portalpega.cl/alexRandomBeer/api/beer/5af379e4d30b7fc8e7d68f15/
   plus the following parameters:
    {
	   "name":"xxxx",
	   "description":"xxxx",
	   "abv":"0.0",
	   "brewery":"xxx"
   }
   ~~~


   ~~~ txt
   Delete  (Delete method)
   http://portalpega.cl/alexRandomBeer/api/beer/id
   Example=
   http://portalpega.cl/alexRandomBeer/api/beer/5af37b18d30b7fc8e7d68f16/
   ~~~



