package com.cts.logaspects;
 
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
 
@Aspect
@Component
public class LoggingAspectBefore {
 
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
 
    @Before("execution(* com.cts.service.EmployeeService.*(..))")
    public void logBeforeAllMethods(JoinPoint joinPoint) {
        LOGGER.info("****LoggingAspect.logBeforeAllMethods() : " + joinPoint.getSignature().getName());
    }
 
    @Before("execution(* com.cts.service.EmployeeService.getEmployee(..))")
    public void logBeforeGetEmployee(JoinPoint joinPoint) {
        LOGGER.info("****LoggingAspect.logBeforeGetEmployee() : " + joinPoint.getSignature().getName());
    }
 
    @Before("execution(* com.cts.service.EmployeeService.addEmployee(..))")
    public void logBeforeAddEmployee(JoinPoint joinPoint) {
        LOGGER.info("****LoggingAspect.logBeforeaddEmployee() : " + joinPoint.getSignature().getName());
    }
}