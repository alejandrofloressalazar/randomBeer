## Synopsis

Beer API rest + Beer website

Project Technology

Back End
* Java 1.8
* Spring Boots 1.5.4
* SpringData mongodb

Front End
* Thymeleaf
* Html 5

Data Base
* MongoDB 3.4

Tools : 
* Eclipse - Spring tool suite-3.8.4
* PostMan
* robo3t
 

## Installation

* you must import the java project in your IDE, Eclipse is recommended
* have the technologies mentioned above

* Modify the class MongoConfig.java with your database connection. 

Data base scheme:
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


## API Reference & Urls 

   Website : 
   http://portalpega.cl/alexRandomBeer/randomBeer

  #API Rest: 

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



