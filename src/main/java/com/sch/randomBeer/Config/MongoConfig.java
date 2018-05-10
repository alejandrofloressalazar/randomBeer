package com.sch.randomBeer.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import com.mongodb.MongoClientURI;


@Configuration
@ComponentScan(basePackages = "com.sch.randomBeer")

public class MongoConfig {

	    @Bean
	    public MongoDbFactory mongoDbFactory() throws Exception {
	    	String url = "";
	    	//local
	    	url = "mongodb://user:password@127.0.0.1:27017/appWeb";
	    	//atlas

	        MongoClientURI mongoURI = new MongoClientURI(url);
	        return new SimpleMongoDbFactory(mongoURI);
	    }

	    @Bean
	    public MongoTemplate mongoTemplate() throws Exception {
	        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
	        return mongoTemplate;
	    }
	 
	}