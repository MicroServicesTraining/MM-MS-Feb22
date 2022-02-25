/**
 * 
 */
package com.mm.sms.responses;

import java.io.Serializable;

/**
 * @author Lalitha
 *
 */
public class SMSResponse<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 438312665825609161L;

	private T data;
	private String message;
	private Integer status;
	
	/**
	 * @param data
	 * @param message
	 * @param status
	 */
	public SMSResponse(T data, String message, Integer status) {
		this.data = data;
		this.message = message;
		this.status = status;
	}
	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	
}
