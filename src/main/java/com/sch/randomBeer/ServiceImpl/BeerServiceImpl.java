package com.sch.randomBeer.serviceImpl;

import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sch.randomBeer.bean.Beer;
import com.sch.randomBeer.dao.GenericDao;
import com.sch.randomBeer.service.BeerService;

@Service("beerService")
public class BeerServiceImpl implements BeerService {

	@Autowired
	private GenericDao<Beer> genericDao;

	@Override
	public Beer getRandom() {

		List<Beer> listAll = genericDao.findAll(Beer.class);
		if (listAll.size() == 0) {
			return new Beer("", "NO  RECORDS", "", "", "");
		}
		int intRandom = new Random().nextInt(listAll.size());
		return listAll.get(intRandom);
	}

	@Override
	public List<Beer> getAll() {
		return genericDao.findAll(Beer.class);
	}

	@Override
	public Beer getBeer(String id) {
		return genericDao.findById(id, Beer.class);
	}

	@Override
	public boolean deleteBeer(String id) {
		Beer abeer = genericDao.findById(id, Beer.class);
		return genericDao.delete(abeer);
	}

	@Override
	public Beer update(Beer beer) {
		return genericDao.update(beer);
	}

	@Override
	public Beer create(Beer beer) {
		return genericDao.create(beer);
	}

}
