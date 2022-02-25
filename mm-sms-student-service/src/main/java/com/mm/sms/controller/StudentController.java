/**
 * 
 */
package com.mm.sms.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.sms.model.Student;
import com.mm.sms.repository.StudentRepository;
import com.mm.sms.responses.SMSResponse;
import com.mm.sms.service.StudentService;

/**
 * @author Lalitha
 *
 */
@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	// http://localhost:8081/sms/ss/api/v1/students GET
	@GetMapping
	public SMSResponse<List<Student>> getStudentsList() {
		List<Student> studentsList = studentService.getStudentsList();
		SMSResponse<List<Student>> response = new SMSResponse<List<Student>>(studentsList, "Students Found", HttpStatus.OK.value());
		return response;
	}
	
	@PostMapping
	public SMSResponse<Long> createStudent(@RequestBody Student student) {
		Long rollNo =  studentService.createStudent(student);
		SMSResponse<Long> response = new SMSResponse<>(rollNo, "Student Created Successfully", HttpStatus.CREATED.value());
		return response;
	}
	
	@PutMapping("/rollNo/{rollNo}")
	public ResponseEntity<String> updateStudent(@RequestBody Student student, @PathVariable Long rollNo) {
		Boolean result = studentService.updateStudent(student, rollNo);
		if(result) {
		ResponseEntity<String> response = ResponseEntity.status(HttpStatus.CREATED).body("Student Updated Successfully");
		return response;
		}else {
			ResponseEntity<String> response = ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("Student Update failed");
			return response;
		}
	}
	
	@DeleteMapping("/rollNo/{rollNo}")
	public SMSResponse<Boolean> removeStudent(@PathVariable Long rollNo) {
		Boolean result =  studentService.removeStudent(rollNo);
		SMSResponse<Boolean> response = new SMSResponse<>(result, "Student Removed Successfully", HttpStatus.OK.value());
		return response;
	}
}
