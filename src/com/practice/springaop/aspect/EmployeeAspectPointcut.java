/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author Jagadheesan Balu
 */
//@Aspect
public class EmployeeAspectPointcut {
    
    @Before("getNamePointcut()")
    public void loggingAdvice() {
        System.out.println("Execute Bfr Advice on getName"); 
    }
    
    @Before("getNamePointcut()")
    public void secondAdvice() {
        System.out.println("Execute second Bfr Advice on getName"); 
    }
    
    @Pointcut("execution(public String getName())")
    public void getNamePointcut() { }
    
    @Before("allServicePointcut()")
    public void allServiceMethodsAdvice() {
        System.out.println("Execute before Service method");
    }
    
    @Pointcut("within(com.practice.springaop.others.EmployeeService)")
    public void allServicePointcut() { }
    
}
