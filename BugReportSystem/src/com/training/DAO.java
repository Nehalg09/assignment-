package com.training;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;

public interface DAO<T> {
	
	boolean add(T t)throws SQLException;
	boolean update(T t)throws SQLException;
	HashSet<T> findAll() throws SQLException;
	List<T> findList(int id) throws SQLException; //Not to be used in bugs and user
	T findById(int id) throws SQLException;
	boolean remove(int id) throws SQLException;
	

}
