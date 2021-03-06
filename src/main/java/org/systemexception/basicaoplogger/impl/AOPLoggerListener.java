/**
 *
 * @author leo
 * @date 19/03/2015 21:58
 *
 */
package org.systemexception.basicaoplogger.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.systemexception.basicaoplogger.api.AOPLogger;

@Aspect
public class AOPLoggerListener {

	@AfterReturning("execution(* org.systemexception.basicaoplogger.pojo.Message.getMessage(..))")
	public void logAround(JoinPoint joinPoint) {
		AOPLogger aopLogger = AOPLoggerImpl.getFor(joinPoint.getTarget().getClass());
		aopLogger.info(joinPoint.getTarget().getClass().getCanonicalName());
	}
}
