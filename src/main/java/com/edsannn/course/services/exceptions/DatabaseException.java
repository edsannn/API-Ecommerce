package com.edsannn.course.services.exceptions;

public class DatabaseException extends RuntimeException {

	private static final long serialVersionUID = -6130843597754617045L;

	public DatabaseException(String msg) {
		super(msg);
	}
}
