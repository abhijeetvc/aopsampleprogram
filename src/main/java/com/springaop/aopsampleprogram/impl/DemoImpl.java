package com.springaop.aopsampleprogram.impl;

import com.springaop.aopsampleprogram.domain.Employee;
import com.springaop.aopsampleprogram.interfaces.DemoInterface;
import org.springframework.stereotype.Service;

@Service
public class DemoImpl implements DemoInterface {


    @Override
    public String doSomething() {
        System.out.println("AOP Implementation");
        return "Hello AOP";
    }

    @Override
    public Employee getEmployee() {
        Employee e=new Employee();
        e.setId(1);
        e.setName("Abcd");
        e.setCity("Mumbai");
        return e;
    }


}
