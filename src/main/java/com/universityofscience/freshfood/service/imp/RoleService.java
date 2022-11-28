package com.universityofscience.freshfood.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universityofscience.freshfood.entity.Role;
import com.universityofscience.freshfood.repositery.RoleRepository;
import com.universityofscience.freshfood.service.IRoleService;

@Service
public class RoleService implements IRoleService{
	@Autowired
	RoleRepository roleRepository;

	@Override
	public void addRole(Role role) {
		roleRepository.save(role);
	}

	@Override
	public void deleteRole(Long id) {
		roleRepository.deleteById(id);
		
	}

	@Override
	public List<Role> getAllRole() {
		return roleRepository.findAll();
	}
	

}
