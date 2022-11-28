package com.universityofscience.freshfood.service;

import java.util.List;

import com.universityofscience.freshfood.entity.Role;

public interface IRoleService {
	void addRole(Role role);
	void deleteRole(Long id);
	List<Role> getAllRole();
}
