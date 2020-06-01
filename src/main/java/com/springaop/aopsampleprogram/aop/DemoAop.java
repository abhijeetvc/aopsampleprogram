package com.springaop.aopsampleprogram.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//Advice types : @Before, @After, @Around, @AfterReturning, @AfterThrowing

@Component
@Aspect
public class DemoAop {

    @Before(" execution(* com.springaop.aopsampleprogram.impl.DemoImpl.doSomething())")
    void checkAopImpl(){
        System.out.println("Hiiiiiiiiiiii");
    }

//    @After(" execution(* com.springaop.aopsampleprogram.impl.DemoImpl.doSomething())")
//    void checkAopImpl1(){
//        System.out.println("Hellooooooooo");
//    }

    @AfterReturning(pointcut = "execution(* com.springaop.aopsampleprogram.impl.DemoImpl.doSomething())",
    returning = "retValue")
    void checkAopImpl2(Object retValue){
        System.out.println("Printing value returned by doSomething: "+retValue);
    }
}
