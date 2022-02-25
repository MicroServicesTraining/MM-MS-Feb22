/**
 * 
 */
package com.mm.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mm.sms.dao.StudentDao;
import com.mm.sms.model.Student;
import com.mm.sms.service.StudentService;

/**
 * @author Lalitha
 *
 */
@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public List<Student> getStudentsList() {
		return studentDao.getStudentsList();
	}

	@Override
	public Long createStudent(Student student) {
		return studentDao.createStudent(student);
	}

	@Override
	public Boolean updateStudent(Student student, Long rollNo) {
		return studentDao.updateStudent(student, rollNo);
	}

	@Override
	public Boolean removeStudent(Long rollNo) {
		return studentDao.removeStudent(rollNo);
	}

}
