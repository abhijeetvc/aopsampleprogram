package com.springaop.aopsampleprogram.impl;

import com.springaop.aopsampleprogram.interfaces.DemoInterface;
import org.springframework.stereotype.Service;

@Service
public class DemoImpl implements DemoInterface {


    @Override
    public String doSomething() {
        System.out.println("AOP Implementation");
        return "Hello AOP";
    }
}
