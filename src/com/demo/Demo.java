package com.demo;

import com.demo.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee e=(Employee) ac.getBean("emp");
        System.out.print("Employee id is "+ e.getEmpid()+" ");
        System.out.print("Employee name is "+ e.getName()+" ");
        System.out.print("Employee salary is "+ e.getSalary()+" ");
    }
}