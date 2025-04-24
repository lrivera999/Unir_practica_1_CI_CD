package com.loteria.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.loteria.models.usuariosModel;
import com.loteria.repository.usuariosRepository;

@RestController
public class usuariosController {

	@Autowired
	private usuariosRepository usrRepo;

	@GetMapping("/Users")
	public ArrayList<usuariosModel> getAllUsers() {
		return (ArrayList<usuariosModel>) usrRepo.findAll();
	}

	@PostMapping("Users")
	public boolean saveNewUser(@RequestBody usuariosModel usr) {
		boolean objResponse;
		try {
			usrRepo.save(usr);
			objResponse = true;
		}
		catch(Exception e) {
			System.out.println(e.getMessage() + "\t" + e.getStackTrace());
			objResponse = false;
		}
		return objResponse;
	}
	
	@PutMapping("Users/Update")
	public boolean updateUser(@RequestBody usuariosModel usr) {
		boolean objResponse;
		try {
			usrRepo.save(usr);
			objResponse = true;
		}
		catch(Exception e) {
			System.out.println(e.getMessage() + "\t" + e.getStackTrace());
			objResponse = false;
		}
		return objResponse;
	}
	
	@DeleteMapping("Users/Delete")
	public boolean deleteUser(@RequestBody usuariosModel usr) {
		boolean objResponse;
		try {
			usrRepo.delete(usr);
			objResponse = true;
		}
		catch(Exception e) {
			System.out.println(e.getMessage() + "\t" + e.getStackTrace());
			objResponse = false;
		}
		return objResponse;
	}

}
