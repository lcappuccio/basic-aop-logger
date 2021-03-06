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

import org.apache.logging.log4j.ThreadContext;

public class Message {

	private String message;

	/**
	 * Default constructor
	 */
	public Message() {
	}

	/**
	 * Parameterized constructor
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
		ThreadContext.put("message",message);
	}
}
