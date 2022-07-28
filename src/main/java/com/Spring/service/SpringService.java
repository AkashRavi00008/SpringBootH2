package com.Spring.service;

import java.util.List;
//import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Spring.repository.SpringRepository;
import com.Springentity.SpringEntity;

@Transactional
@Service
public class SpringService {
	@Autowired
	private SpringRepository studentRepository;
	public SpringEntity registerStudent(SpringEntity student)
	{
		return studentRepository.save(student);
	}
	public List<SpringEntity> getStudentsAll() {
		// TODO Auto-generated method stub
		return (List<SpringEntity>) studentRepository.findAll();
	}
	public void deleteStudentEntity(Integer id)
	{
		studentRepository.deleteById(id);
	}

	 

}
