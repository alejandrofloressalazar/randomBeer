package com.sch.randomBeer.config;

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
	    	//url = "mongodb://user:password@127.0.0.1:27017/appWeb";
	    	//atlas
	    	url = "mongodb://admin:adminTest@clustertest-shard-00-00-x75yn.mongodb.net:27017,clustertest-shard-00-01-x75yn.mongodb.net:27017,clustertest-shard-00-02-x75yn.mongodb.net:27017/test?ssl=true&replicaSet=ClusterTest-shard-0&authSource=admin";

	        MongoClientURI mongoURI = new MongoClientURI(url);
	        return new SimpleMongoDbFactory(mongoURI);
	    }

	    @Bean
	    public MongoTemplate mongoTemplate() throws Exception {
	        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
	        return mongoTemplate;
	    }
	 
	}