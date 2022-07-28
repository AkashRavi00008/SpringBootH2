package com.Springcontroller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.service.SpringService;
import com.Springentity.SpringEntity;

@RestController
@RequestMapping("/api/student")
public class Controller {
	@Autowired
	private SpringService studentservice;
	@PostMapping("/create")
    public SpringEntity registerStudent(@RequestBody SpringEntity student) {
		return studentservice.registerStudent(student);
	}
    
	@GetMapping("/get")
	public List<SpringEntity> getStudentsEntity() {
		return studentservice.getStudentsAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteStudentEntity(@PathVariable("id") Integer rollno)
	{
		studentservice.deleteStudentEntity(rollno);
		
	}
	
		
	}

	
	 
	 


