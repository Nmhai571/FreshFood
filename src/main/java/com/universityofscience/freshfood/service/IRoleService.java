package com.universityofscience.freshfood.service;

import com.universityofscience.freshfood.entity.Role;

public interface IRoleService {
	void addRole(Role role);
	void deleteRole(Long id);
}
