/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.springaop.aspect;

import java.lang.reflect.Array;
import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 *
 * @author Jagadheesan Balu
 */
@Aspect
public class EmployeeAspect {
    
    @Before("execution(public String getName())")
    public void getNameAdvice(JoinPoint jp) {
        System.out.println("Executing Advice on getName" + "jp :"+jp.toString()+" args :"+ Arrays.toString(jp.getArgs()));
    }
    
    @Before("execution(* com.practice.springaop.others.*.getE*())")
    public void getAllAdvice(){
        System.out.println("Executing Advice on getEmp");
    }
    
    // Join Point
    @After("execution(* com.practice.springaop.others..getE*())")
	public void loggingAdvice(JoinPoint joinPoint){
		System.out.println("Before running loggingAdvice on method="+joinPoint.toString());
		
		System.out.println("Agruments Passed=" + Arrays.toString(joinPoint.getArgs()));

	}
    
    // Arguments
    @Before("args(name)")
    public void logStrArg(String name) {
        System.out.println("String Arguments :"+name );
    }
    
    /*
    //After - diff cases
    @AfterThrowing("execution(* com.practice.springaop.others..get*())")
    public void throwAdvice() {
        System.out.println("Throw ADVICE");
    }*/
    
    @After("execution(* com.practice.springaop.others.EmployeeService.get*())")
    public void normalAdvice() {
        System.out.println(" Normal ADVICE");
    }
    /*
    @AfterReturning(pointcut = "execution(* com.practice.springaop.others.EmployeeService.get*(String))",
            returning = "returnStr" )
    public void returnAdvice(JoinPoint jp,String returnStr) {
        System.out.println("Return ADVICE :"+returnStr+" JoinPoint :"+jp.toString()+" Args :"+Arrays.toString(jp.getArgs()));
    }
    
    //AroundAdvice
    @Around("execution(* com.practice.springaop.others.EmployeeService.get*(String))")
    public Object aroundAdvice(ProceedingJoinPoint pjp) {
        System.out.println("Before Around");
        Object value = null;
        try {
             value = pjp.proceed();
        } catch (Throwable ex) {
            System.out.println("Exception caught :"+ex.getMessage());
        }
        
        System.out.println("After Around");
        return value;
    }*/
    
    @Before("@annotation(com.practice.springaop.aspect.Loggable)")
    public void myAdvice(){
		System.out.println("Executing myAdvice!!");
	}
    
}
