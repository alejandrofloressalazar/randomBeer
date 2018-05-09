package com.sch.randomBeer.dao;

import java.util.List;
import org.springframework.data.mongodb.core.query.Query;
 
public interface GenericDao<T> {

	// CREATE
	public T create(T entity);

	// UPDATE
	public T update(T entity);

	// DELETE
	public boolean delete(T entity);

	public boolean deleteAll();

	// FIND
	public T findById(String id, Class<T> clazz);

	public List<T> findAll(Class<T> clazz);

	public List<T> findAllFilter(Query query, Class<T> entity);

	public long countQuery(Query query, Class<T> entity);
	public T  findOneQuery(Query query ,Class<T>  entity);
	
}