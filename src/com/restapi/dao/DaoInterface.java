package com.restapi.dao;

import java.util.List;

public interface DaoInterface<T> {

	T get(int id);
	public List<T> getSome(int id);
	List<T> getall();
	boolean insert(T t);
	boolean delete(int i);
	boolean update(T t);
	T get(String name, String password);
	
}
