package com.sch.randomBeer.service;

import java.util.List;
import com.sch.randomBeer.bean.Beer;

public interface BeerService {
	
	 public Beer getRandom();
	 public List<Beer> getAll();
	 public Beer getBeer(String id);
	 public boolean deleteBeer(String id);
	 public Beer update(Beer beer);
	 public Beer create(Beer beer);
}
