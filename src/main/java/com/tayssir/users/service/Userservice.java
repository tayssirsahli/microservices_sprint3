package com.tayssir.users.service;

import java.util.List;

import com.tayssir.users.entities.Role;
import com.tayssir.users.entities.User;

public interface Userservice {
	
	User saveUser(User user);

	User findUserByUsername(String username);

	Role addRole(Role role);

	User addRoleToUser(String username, String rolename);
	List<User> findAllUsers();
}
