package com.example.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Admin;
import com.example.model.Trainee;
import com.example.service.TraineeService;

@RestController
public class MyController {
	public String status;
	@Autowired
	TraineeService traineeService;
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String start() {
		return "hello";
	}
	@GetMapping("/login")
	public String go(@RequestBody Admin admin) {
		if(admin.getUserName().equals("admin") && admin.getPassword().equals("admin")) {
			status = "Success";
			return status;
		}
		else {
			status = "Wrong Credentials";
			return status;
		}
	}
	@GetMapping("/list")
	public String list() {
		if(status.equals("Success")) {
			return "Select Your Choice: add,delete,modify,retreive";
		}
		else {
			return "Bad";
		}
	}
	@PostMapping("/add")
	public ResponseEntity add(@RequestBody Trainee trainee) {
		traineeService.addTrainee(trainee);
		return new ResponseEntity("Successfully added a new Trainee",HttpStatus.OK);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestBody int id) {
		traineeService.deleteTrainee(id);
		return "Done";
	}
	@GetMapping("/getById")
	public Trainee getById(@RequestBody int id) {
		Trainee t = traineeService.getById(id);
		return t;
	}
	@GetMapping("/getAll")
	public List getAll() {
		List list = traineeService.getAll();
		return list;
	}
	@PutMapping("/modify")
	public String modify(@RequestBody Trainee trainee) {
		traineeService.modifyTrainee(trainee);
		return "Done";
	}
}
