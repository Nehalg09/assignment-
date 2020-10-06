package com.training;

import com.project.entity.User;

public interface UserDAO extends DAO<User> {
	
	boolean loginMethod(String email,String Password); //Change Name
	
}
