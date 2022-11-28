package com.universityofscience.freshfood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.universityofscience.freshfood.entity.Role;
import com.universityofscience.freshfood.service.IRoleService;

@RestController
@RequestMapping("/api/v1")
public class RoleController {
	@Autowired
	IRoleService iRoleService;
	@PostMapping("/addrole")
	public void addRole(@RequestBody Role role) {
		iRoleService.addRole(role);
	}
	
	@PostMapping("/deleterole")
	public String deleteRole(long id) {
		iRoleService.deleteRole(id);
		return "thanh cong";
	}
	@PostMapping("/getAllRole")
	public List<Role> getAllRole(){
		return iRoleService.getAllRole();
	}
}
