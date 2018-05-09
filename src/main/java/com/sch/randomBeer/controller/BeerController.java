package com.sch.randomBeer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sch.randomBeer.Service.BeerService;
import com.sch.randomBeer.bean.Beer;


@Controller 
public class BeerController {
	 @Autowired
	 BeerService   beerService;
	 
	 @GetMapping( "/")
	   public  String index() {
		  return "redirect:/randomBeer";

	    } 
	   @GetMapping( "/randomBeer")
	   public  ModelAndView randomBeer() {
		   Beer beer =  beerService.getRandom();
		   ModelAndView mav = new ModelAndView();
	  	   mav.addObject("beer", beer);
	  	   mav.setViewName("randomBeer"); 
		   return mav;

	    }
}
