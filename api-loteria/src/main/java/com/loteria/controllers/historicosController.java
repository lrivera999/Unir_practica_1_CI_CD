package com.loteria.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.loteria.repository.historicosRepository;
import com.loteria.models.historicosModel;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class historicosController {
	
	@Autowired
	private historicosRepository histRepo;
	
	@GetMapping("/Historic")
	public ArrayList<historicosModel> getAllHistoric() {
		return (ArrayList<historicosModel>) histRepo.findAll();
	}

	@PostMapping("Historic")
	public boolean saveNewHistoric(@RequestBody historicosModel usr) {
		boolean objResponse;
		try {
			histRepo.save(usr);
			objResponse = true;
		}
		catch(Exception e) {
			System.out.println(e.getMessage() + "\t" + e.getStackTrace());
			objResponse = false;
		}
		return objResponse;
	}
	
	@PutMapping("Historic/Update")
	public boolean updateHistoric(@RequestBody historicosModel usr) {
		boolean objResponse;
		try {
			histRepo.save(usr);
			objResponse = true;
		}
		catch(Exception e) {
			System.out.println(e.getMessage() + "\t" + e.getStackTrace());
			objResponse = false;
		}
		return objResponse;
	}
	
	@DeleteMapping("Historic/Delete")
	public boolean deleteHistoric(@RequestBody historicosModel usr) {
		boolean objResponse;
		try {
			histRepo.delete(usr);
			objResponse = true;
		}
		catch(Exception e) {
			System.out.println(e.getMessage() + "\t" + e.getStackTrace());
			objResponse = false;
		}
		return objResponse;
	}
}
