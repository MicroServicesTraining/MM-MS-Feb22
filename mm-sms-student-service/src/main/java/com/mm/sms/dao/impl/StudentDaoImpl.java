/**
 * 
 */
package com.mm.sms.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mm.sms.dao.StudentDao;
import com.mm.sms.model.Student;
import com.mm.sms.repository.StudentRepository;

/**
 * @author Lalitha
 *
 */
@Component
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getStudentsList() {
		return  studentRepository.findAll();
	}

	@Override
	public Long createStudent(Student student) {
		return studentRepository.create(student);
	}

	@Override
	public Boolean updateStudent(Student student, Long rollNo) {
		return studentRepository.update(student, rollNo);
	}

	@Override
	public Boolean removeStudent(Long rollNo) {
		return studentRepository.delete(rollNo);
	}

}
