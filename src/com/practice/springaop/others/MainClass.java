/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.springaop.others;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Jagadheesan Balu
 */
public class MainClass {
    
    public static void main(String arg[]) {
        
        ApplicationContext cxt = new ClassPathXmlApplicationContext("Beans.xml");
        
        EmployeeService empService = (EmployeeService) cxt.getBean("employeeService");
        
        Employee emp = empService.getEmp();
/*        try {
            System.out.println(empService.getThrow());
        } catch (Exception ex) {
            System.out.println("Exception caught :"+ex.getMessage());
        } */
        
        //System.out.println("call returnMsg :"+empService.getReturnMsg("Hiieee"));
        
        //System.out.println("call getName:"+emp.getName());
        emp.setName("Jag");
        emp.setId(1);
        emp.getName();
    }
}
