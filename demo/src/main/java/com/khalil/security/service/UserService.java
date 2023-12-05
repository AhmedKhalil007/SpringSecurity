package com.khalil.security.service;

import com.khalil.security.entities.Role;
import com.khalil.security.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	
}
