/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.springaop.others;

import com.practice.springaop.aspect.Loggable;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jagadheesan Balu
 */
@Component
public class Employee {
    
    private String name;
   // private int id;

    public String getName() {
        return name;
    }

    @Loggable
    public void setName(String name) {
        System.out.println("setting name :"+name);
        this.name = name;
    }
    @Loggable
    public void setId(int id) {
        System.out.println("setting id :"+id);
    }
    
}
