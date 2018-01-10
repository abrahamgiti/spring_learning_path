package com.learning.spring.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * Created by rin9790 on 8/01/18.
 */

@Aspect
@Component
public class LogginAspect {

    private  Logger logger = Logger.getLogger(this.getClass().getName());

    /*@Before("execution(void com.learning.spring..*.set*(*))")
    public void callSetters(JoinPoint joinPoint){
        this.logger.info("Setters Called " + joinPoint.getSignature().getName()+" "+ joinPoint
        .getArgs()[0].toString());
    }*/

    @Around("execution(void playGame())")
    public Object checkForRain(ProceedingJoinPoint pjp)
    throws Throwable{

        double ramdom = Math.random();
        boolean rain = ramdom < 0.5;
        this.logger.info("RAMDOM " + ramdom);
        Object result = null;
        if(rain){
            this.logger.info(pjp.getTarget() + " rained out" );
        }
        else{
          pjp.proceed();

        }

        return result;
    }



}
