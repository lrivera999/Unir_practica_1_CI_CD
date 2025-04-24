package com.loteria.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.loteria.repository.apuestasRepository;
import com.loteria.models.apuestasModel;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.v3.oas.annotations.tags.*;


@CrossOrigin(origins = "http://localhost:8080")
@Tag(name="EndPoint - Bet", description="EndPoint de Apuestas")
@RestController
@RequestMapping("/api")
public class apuestasController {

	@Autowired
	private apuestasRepository apRepo;
	
	@GetMapping("/Bets")
	public ArrayList<apuestasModel> getAllBets() {
		return (ArrayList<apuestasModel>) apRepo.findAll();
	}

	@PostMapping("Bets")
	public boolean saveNewBets(@RequestBody apuestasModel usr) {
		boolean objResponse;
		try {
			apRepo.save(usr);
			objResponse = true;
		}
		catch(Exception e) {
			System.out.println(e.getMessage() + "\t" + e.getStackTrace());
			objResponse = false;
		}
		return objResponse;
	}
	
	@PutMapping("Bets/Update")
	public boolean updateBets(@RequestBody apuestasModel usr) {
		boolean objResponse;
		try {
			apRepo.save(usr);
			objResponse = true;
		}
		catch(Exception e) {
			System.out.println(e.getMessage() + "\t" + e.getStackTrace());
			objResponse = false;
		}
		return objResponse;
	}
	
	@DeleteMapping("Bets/Delete")
	public boolean deleteBets(@RequestBody apuestasModel usr) {
		boolean objResponse;
		try {
			apRepo.delete(usr);
			objResponse = true;
		}
		catch(Exception e) {
			System.out.println(e.getMessage() + "\t" + e.getStackTrace());
			objResponse = false;
		}
		return objResponse;
	}
	
}
