package com.sch.randomBeer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.mongodb.WriteResult;

@Repository
@Qualifier("genericDao")
public class GenericDaoImpl<T> implements GenericDao<T> {
	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public T create(T entity) {
		try {
			mongoTemplate.insert(entity);
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
		return entity;
	}

	@Override
	public T update(T entity) {
		try {
			mongoTemplate.save(entity);
			return entity;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean delete(T entity) {
		try {
			WriteResult result = mongoTemplate.remove(entity);
			if (result.getN() > 0)
				return true;
			else
				return false;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public List<T> findAll(Class<T> clazz) {
		return mongoTemplate.findAll((Class<T>) clazz);

	}

	@Override
	public T findById(String id, Class<T> clazz) {
		return mongoTemplate.findById(id, clazz);

	}

	@Override
	public List<T> findAllFilter(Query query, Class<T> entity) {

		return mongoTemplate.find(query, entity);

	}

	@Override
	public long countQuery(Query query, Class<T> entity) {

		return mongoTemplate.count(query, entity);

	}

	@Override
	public T findOneQuery(Query query, Class<T> entity) {
		return mongoTemplate.findOne(query, entity);
	}

}
