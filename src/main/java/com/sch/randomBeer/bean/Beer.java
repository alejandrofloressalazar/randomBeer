package com.sch.randomBeer.bean;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "beer") 
public class Beer {
	@Id
	@Field("_id")
    private String id;
	@NotNull
	private String name;
	@NotNull
	private String description;
	@NotNull
	private String abv;
	@NotNull
	private String brewery;
	
	
	public Beer() {
		super();
	}
	
	public Beer(String id, String name, String description, String abv, String brewery) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.abv = abv;
		this.brewery = brewery;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAbv() {
		return abv;
	}
	public void setAbv(String abv) {
		this.abv = abv;
	}
	public String getBrewery() {
		return brewery;
	}
	public void setBrewery(String brewery) {
		this.brewery = brewery;
	}
	
	
	
	
}
