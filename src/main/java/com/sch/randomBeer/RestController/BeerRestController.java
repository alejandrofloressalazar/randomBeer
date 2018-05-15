package com.sch.randomBeer.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.sch.randomBeer.bean.Beer;
import com.sch.randomBeer.service.BeerService;

@RestController
@RequestMapping("/api")
public class BeerRestController {
	@Autowired
	BeerService beerService;

	// GET Random Beer
	@RequestMapping(value = "/randomBeer/", method = RequestMethod.GET)
	public Beer GetRandom() {
		Beer aBeer = beerService.getRandom();
		return aBeer;
	}

	// Get All
	@RequestMapping(value = "/beer/", method = RequestMethod.GET)
	public List<Beer> RestRandomBeer() {
		return beerService.getAll();
	}

	// GET by ID
	@RequestMapping(value = "/beer/{id}/", method = RequestMethod.GET)
	public Beer getBeer(@PathVariable("id") String id) {
		if (id == null) {
			return new Beer("", "GET ERROR", "", "", "");
		}

		Beer getBeer = beerService.getBeer(id);
		if (getBeer == null) {
			return new Beer("", "GET ERROR", "", "", "");
		}
		return getBeer;
	}

	// Insert
	@RequestMapping(value = "/beer/", method = RequestMethod.POST)
	public Beer createBeer(@RequestBody Beer beer) {
		if (beer == null) {
			return new Beer("", "INSERT ERROR", "", "", "");
		}
		Beer currentBeer = new Beer();
		currentBeer.setName(beer.getName().trim().toLowerCase());
		currentBeer.setAbv(beer.getAbv().trim().toLowerCase());
		currentBeer.setBrewery(beer.getBrewery().trim().toLowerCase());
		currentBeer.setDescription(beer.getDescription().trim().toLowerCase());

		Beer insertBeer = beerService.create(currentBeer);
		if (insertBeer == null) {
			return new Beer("", "INSERT ERROR", "", "", "");
		}

		return insertBeer;
	}

	// Update
	@RequestMapping(value = "/beer/{id}/", method = RequestMethod.PUT)
	public Beer updateBeer(@PathVariable("id") String id, @RequestBody Beer beer) {
		if (id == null) {
			return new Beer("", "UPDATE ERROR", "", "", "");
		}
		Beer currentBeer = beerService.getBeer(id.trim());
		currentBeer.setName(beer.getName().trim().toLowerCase());
		currentBeer.setAbv(beer.getAbv().trim().toLowerCase());
		currentBeer.setBrewery(beer.getBrewery().trim().toLowerCase());
		currentBeer.setDescription(beer.getDescription().trim().toLowerCase());

		Beer updateBeer = beerService.update(currentBeer);
		if (updateBeer == null) {
			return new Beer("", "UPDATE ERROR", "", "", "");
		}
		return updateBeer;

	}

	// Delete by id
	@RequestMapping(value = "/beer/{id}/", method = RequestMethod.DELETE)
	public String deleteBeer(@PathVariable("id") String id) {
		if (id == null) {
			return "ERROR";
		}
		boolean response = beerService.deleteBeer(id);
		if (response) {
			return "DELETED";
		} else {
			return "ERROR";
		}
	}

}
