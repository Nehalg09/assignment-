package com.training;
import java.sql.SQLException;
import java.util.HashSet;

import com.project.entity.User;
import com.training.UserDAO;

public class UserDAOImpl implements UserDAO {

	@Override
	public boolean add(User t) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(User t) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public HashSet<User> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(int id) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean loginMethod(String email, String Password) {
		// TODO Auto-generated method stub
		return false;
	}

}
