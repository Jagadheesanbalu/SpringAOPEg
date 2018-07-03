/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.springaop.others;

/**
 *
 * @author Jagadheesan Balu
 */
public class EmployeeService {
    
    private Employee emp;

    public Employee getEmp() {
        System.out.println("get Employee");
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }
    
    public String getThrow() throws Exception{
        throw new Exception("DUmmy Exception");
    }
    
    public String getReturnMsg(String msg) {
        System.out.println("returning msg");
        return msg;
    }
}
