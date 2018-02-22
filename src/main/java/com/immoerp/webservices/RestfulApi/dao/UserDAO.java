package com.immoerp.webservices.RestfulApi.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.immoerp.webservices.RestfulApi.domain.User;

@Component
public class UserDAO {
	
	private static List<User> list = new ArrayList<>();
	private static int counter = 8;
	
	static {
		list.add(new User(1, "moaad", new Date()));
		list.add(new User(2, "andrew", new Date()));
		list.add(new User(3, "linus", new Date()));
		list.add(new User(4, "arun", new Date()));
		list.add(new User(5, "james", new Date()));
		list.add(new User(6, "jerome", new Date()));
		list.add(new User(7, "rezha", new Date()));
		list.add(new User(8, "fabian", new Date()));
	}
	
	public List<User> findAllUsers() {
		return list;
	}
	
	public User save(User user) {
		if(user.getId() == null)
			user.setId(++counter);
		list.add(user);
		return list.get(list.size() - 1);
	}
	
	public User findOne(int id) {
		for(User us : list) {
			if(us.getId().equals(id))
				return us;
		}
		return null;
	}
	
	public User deleteUser(int id) {
		User deletedUser = null;
		for(User user : list)
			if(user.getId() == id)
				deletedUser = user;
		list.remove(deletedUser);
		return deletedUser;
	}
	
}
