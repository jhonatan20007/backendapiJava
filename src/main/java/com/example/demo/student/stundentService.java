package com.example.demo.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class stundentService {

	private final studentRepository studentRepository;

	@Autowired
	public stundentService(com.example.demo.student.studentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public void addNewStudent(student student){
		Optional<student> studentByOptional= studentRepository
		.findstudentByEmail(student.getEmail());

		if(studentByOptional.isPresent()){

			throw new IllegalStateException("email taken");
		}

		studentRepository.save(student);
		
	}

    public List<student> getStudents(){
		return studentRepository.findAll();
		
		
	}

	public void deleteStudent(Long studentId){
		studentRepository.findById(studentId);

			boolean exists = studentRepository.existsById(studentId);
			if(!exists){

				throw new IllegalStateException("student with id "+ studentId + " does not exists",null);
			}
			studentRepository.deleteById(studentId);
	}


}
