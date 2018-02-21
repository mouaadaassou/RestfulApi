package com.immoerp.webservices.RestfulApi;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.immoerp.webservices.RestfulApi.dao.UserDAO;
import com.immoerp.webservices.RestfulApi.domain.User;
import com.immoerp.webservices.RestfulApi.doman.exceptionhandler.UserNotFoundException;

@RestController
@RequestMapping(path = "/users")
public class UserController {

	@Autowired
	private UserDAO userDAO;

	@GetMapping("/all")
	public List<User> getAllUsers() {
		return this.userDAO.findAllUsers();
	}

	@PostMapping("/user")
	public ResponseEntity<Object> addUser(@RequestBody User user) {
		User savedUser = userDAO.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

	@GetMapping("/user/{id}")
	public User getUser(@PathVariable int id) {
		User user = userDAO.findOne(id);
		if(user == null)
			throw new UserNotFoundException(String.format("the user with the id %d not found", id));
		return user;
	}
}
