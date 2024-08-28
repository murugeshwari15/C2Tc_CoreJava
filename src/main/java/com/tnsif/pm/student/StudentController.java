package com.tnsif.pm.student;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController 
{
	@Autowired
	private StudentService service;
	
	
	@GetMapping("/students")
	public List<Student> list()
	{
		return service.listAll();
	}
	
	
	@GetMapping("/students/{id}")
	public ResponseEntity<Student> get(@PathVariable Long id)
	{
		try
		{
			Student student=service.get(id);
			return new ResponseEntity<Student>(student,HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}
	
	
//Insert
	@PostMapping("/students")
	public void add(@RequestBody Student student)
	{
		service.save(student);
	} 
	
	
//Update
	@PutMapping("/students/{id}")
	public ResponseEntity<?> update(@RequestBody Student student, @PathVariable Long id)
	{
	    try
	    {
	        Student existStudent = service.get(id);
	       service.save(student);
	            return new ResponseEntity<Student>(student,HttpStatus.OK);
	        }
	     catch (Exception e)
	    {
	        return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
	    }
	}


//Delete
		@DeleteMapping("/students/{id}")
		public void delete(@PathVariable Long id)
		{
			service.delete(id);
		}


}
