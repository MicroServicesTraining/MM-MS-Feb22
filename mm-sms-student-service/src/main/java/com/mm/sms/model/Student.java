/**
 * 
 */
package com.mm.sms.model;

import java.io.Serializable;

/**
 * @author Lalitha
 *
 */
public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -834864976466474338L;

	private long rollNo;
	private String name;
	private String gender;
	private String course;
	private Double feePaid;
	private String mobile;
	/**
	 * @return the rollNo
	 */
	public long getRollNo() {
		return rollNo;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	/**
	 * @return the feePaid
	 */
	public Double getFeePaid() {
		return feePaid;
	}
	/**
	 * @param feePaid the feePaid to set
	 */
	public void setFeePaid(Double feePaid) {
		this.feePaid = feePaid;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}
