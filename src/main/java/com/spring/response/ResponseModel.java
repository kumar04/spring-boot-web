package com.spring.response;

public class ResponseModel {

	private Object data;
	private Status status;

	public ResponseModel(Object data, Status status) {
		super();
		this.data = data;
		this.status = status;
	}

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

	public ResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
