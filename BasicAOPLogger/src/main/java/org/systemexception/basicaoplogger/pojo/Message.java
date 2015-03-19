/**
 * $Id$
 *
 * @author lcappuccio
 * @date 19/03/2015 17:05
 *
 * Copyright (C) 2015 Scytl Secure Electronic Voting SA
 *
 * All rights reserved.
 *
 */
package org.systemexception.basicaoplogger.pojo;

public class Message {

	private String message;

	/**
	 * Default constructor
	 */
	public Message() {

	}

	/**
	 * Parametrized constructor
	 *
	 * @param message
	 */
	public Message(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
