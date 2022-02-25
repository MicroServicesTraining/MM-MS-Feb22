/**
 * 
 */
package com.mm.sms.dao;

import java.util.List;

import com.mm.sms.model.Student;

/**
 * @author Lalitha
 *
 */
public interface StudentDao {

	List<Student> getStudentsList();

	Long createStudent(Student student);

	Boolean updateStudent(Student student, Long rollNo);

	Boolean removeStudent(Long rollNo);

}
