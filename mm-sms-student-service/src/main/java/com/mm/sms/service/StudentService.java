/**
 * 
 */
package com.mm.sms.service;

import java.util.List;

import com.mm.sms.model.Student;

/**
 * @author Lalitha
 *
 */
public interface StudentService {

	List<Student> getStudentsList();

	Long createStudent(Student student);

	Boolean updateStudent(Student student, Long rollNo);

	Boolean removeStudent(Long rollNo);

}
