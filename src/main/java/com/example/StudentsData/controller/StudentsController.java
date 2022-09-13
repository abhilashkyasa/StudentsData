package com.example.StudentsData.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentsData.entity.Students;
import com.example.StudentsData.repository.StudentsRepository;

@RestController
public class StudentsController {
	@Autowired
	private StudentsRepository studentsrepository;
	
	@PostMapping("/addstudents")
	public String saveCustomer(@RequestBody Students emp) {
		studentsrepository.save(emp);
		return "Student added successfully::"+emp.getId();
	}
	
	@GetMapping("/students")
	public List<Students> getStudents(){
		return studentsrepository.findAll();
	}
	
	@GetMapping("/findStudents/{id}")
	public Optional<Students> getStudents(@PathVariable Integer id){
		return studentsrepository.findById(id);
	}
	
	@GetMapping("/deleteStudents/{id}")
	public String deleteStudents(@PathVariable Integer id) {
		studentsrepository.deleteById(id);
		return "Deleted Student Succesfully";
	}

}
