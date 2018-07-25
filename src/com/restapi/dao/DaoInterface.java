package com.restapi.dao;

import java.util.List;

import com.restapi.pojo.ADMIN;

public interface DaoInterface<T> {

	T get(int id);
	List<T> getall();
	boolean insert(T t);
	boolean delete(int i);
	boolean update(T t);
	T get(String name, String password);
	
}
