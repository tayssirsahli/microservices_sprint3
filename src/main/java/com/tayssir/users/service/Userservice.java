package com.tayssir.users.service;


import com.tayssir.users.entities.Role;
import com.tayssir.users.entities.User;
import com.tayssir.users.service.register.RegistrationRequest;

public interface Userservice {
	
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	
	User registerUser(RegistrationRequest request);
	
	public void sendEmailUser(User u, String code);
	public User validateToken(String code);

}
