package com.sch.randomBeer.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.sch.randomBeer.Service.BeerService;
import com.sch.randomBeer.bean.Beer;

@RestController
@RequestMapping("/api")
public class BeerRestController {
	@Autowired
	 BeerService   beerService;
	
	//GET Random Beer
	@RequestMapping(value ="/randomBeer/", method = RequestMethod.GET)
	   public  Beer GetRandom() {
		Beer aBeer =beerService.getRandom();	 
		return aBeer;
	    }
	//Get All
	@RequestMapping(value ="/beer/", method = RequestMethod.GET)
	   public  List<Beer> RestRandomBeer() {
		return beerService.getAll() ;
	    }
	
	//GET by ID 
	@RequestMapping(value ="/beer/{id}/", method = RequestMethod.GET)
	   public Beer getBeer(@PathVariable("id") String id) {
	     if (id == null) {
	    	   return new Beer(); 
	    	   }
		return beerService.getBeer(id) ;
	    }
	
	//Insert
	@RequestMapping(value ="/beer/", method = RequestMethod.POST)
	   public Beer createBeer(@RequestBody Beer beer)  {
	     if (beer == null) {
	    	   return new Beer(); 
	    	   }
		Beer currentBeer =new Beer();
		currentBeer.setName(beer.getName());
		currentBeer.setAbv(beer.getAbv());
		currentBeer.setBrewery(beer.getBrewery());
		currentBeer.setDescription(beer.getDescription());
	   
		return beerService.create(currentBeer);
	}
	
	//Update
	@RequestMapping(value ="/beer/{id}/", method = RequestMethod.PUT)
	   public Beer updateBeer(@PathVariable("id") String id, @RequestBody Beer beer)  {
	     if (id == null) {
	    	   return new Beer(); 
	    	   }
		Beer currentBeer = beerService.getBeer(id);
		currentBeer.setName(beer.getName());
		currentBeer.setAbv(beer.getAbv());
		currentBeer.setBrewery(beer.getBrewery());
		currentBeer.setDescription(beer.getDescription());
	   
		return beerService.update(currentBeer);
	}
	
	//Delete by id
	@RequestMapping(value ="/beer/{id}/", method = RequestMethod.DELETE)
	   public String deleteBeer(@PathVariable("id") String id) {
	     if (id == null) {
	    	   return "Error"; 
	    	   }
		 boolean response = beerService.deleteBeer(id) ;
		if(response)
		{
			  return "deleted"; 
		}else
		{
			  return "Error";   
	    }
	}
	
	
	
}
