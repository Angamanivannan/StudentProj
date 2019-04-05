package com.testServices.StudentApp.StudentApp.Excercises.one;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentResource {
    
	@Autowired
	private StudentFunction service;
	
	@GetMapping("/getAllStudents")
	public List<StudentApp> displayAllStudents(){
		return service.displayStudents();
	}
	
	@GetMapping("/getStudent/{studentId}")
	public StudentApp displayResult(@PathVariable int studentId){
		return service.searchStudent(studentId);
		
	}
 		
		@PostMapping("/addStudent")
		public void addStudent(@RequestBody StudentApp Student){
			StudentApp newStudent = service.addStudent(Student);
		
		}
		
		@DeleteMapping("/removeStudent/{studentId}")
		public void deleteStudent(@PathVariable int studentId) {
			StudentApp removeStudent = service.deleteStudent(studentId);
			
		}
	}

