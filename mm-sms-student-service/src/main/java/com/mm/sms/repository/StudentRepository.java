/**
 * 
 */
package com.mm.sms.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.mm.sms.model.Student;

/**
 * @author Lalitha
 *
 */
@Repository
public class StudentRepository {

	private List<Student> studentsList;
	
	public StudentRepository() {
		studentsList = new ArrayList<>();
	}
	
	public List<Student> findAll(){
		return studentsList;
	}
	
	public Student findById(Long id) throws Exception {
		Optional<Student> result = null;
		Student st = null;
		result = studentsList.stream().filter(student -> student.getRollNo() == id).findFirst();
		if(result.isPresent()) {
			st = result.get();
		}else {
			throw new Exception();
		}
		return st;
	}
	
	public Long create(Student student) {
		Long rollNo =  (long) (Math.random() * 100000);
		student.setRollNo(rollNo);
		studentsList.add(student);
		return rollNo;
	}
	
	public Boolean update(Student student, Long id) {
		if(delete(id)) {
		studentsList.add(student);
		return true;
		}
		return false;
	}
	
	public Boolean delete(Long id) {
		Iterator<Student> it = studentsList.iterator();
		while(it.hasNext()) {
			if(id == it.next().getRollNo()) {
				it.remove();
				return true;
			}
		}
		return false;
	}
}
