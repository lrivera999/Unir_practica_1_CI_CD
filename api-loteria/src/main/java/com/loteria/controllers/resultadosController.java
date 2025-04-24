package com.loteria.controllers;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.loteria.repository.resultadosRepository;
import com.loteria.models.resultadosModel;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class resultadosController {
	
	@Autowired
	private resultadosRepository resultRepo;
	
	@GetMapping("/Results")
	public ArrayList<resultadosModel> getAllResults() {
		return (ArrayList<resultadosModel>) resultRepo.findAll();
	}

	@PostMapping("Results")
	public boolean saveNewResults(@RequestBody resultadosModel usr) {
		boolean objResponse;
		try {
			resultRepo.save(usr);
			objResponse = true;
		}
		catch(Exception e) {
			System.out.println(e.getMessage() + "\t" + e.getStackTrace());
			objResponse = false;
		}
		return objResponse;
	}
	
	@PutMapping("Results/Update")
	public boolean updateResults(@RequestBody resultadosModel usr) {
		boolean objResponse;
		try {
			resultRepo.save(usr);
			objResponse = true;
		}
		catch(Exception e) {
			System.out.println(e.getMessage() + "\t" + e.getStackTrace());
			objResponse = false;
		}
		return objResponse;
	}
	
	@DeleteMapping("Results/Delete")
	public boolean deleteResults(@RequestBody resultadosModel usr) {
		boolean objResponse;
		try {
			resultRepo.delete(usr);
			objResponse = true;
		}
		catch(Exception e) {
			System.out.println(e.getMessage() + "\t" + e.getStackTrace());
			objResponse = false;
		}
		return objResponse;
	}
	
}
