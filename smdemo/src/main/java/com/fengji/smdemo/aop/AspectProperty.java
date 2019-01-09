package com.fengji.smdemo.aop;

import ch.qos.logback.classic.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//@Aspect
//@Configuration
public class AspectProperty {

    private final static Logger logger = (Logger) LoggerFactory.getLogger(AspectProperty.class);

    @Pointcut("execution(* com.fengji.smdemo.service.impl.*.*(..))")
    public void excudeService(){}

    @Around("excudeService()")
    public void around(ProceedingJoinPoint point){
        long startTime = System.currentTimeMillis();
        try {
           point.proceed();
        } catch (Throwable throwable) {
            logger.debug("程序异常,交互耗时："+(System.currentTimeMillis()-startTime)+"ms");
            throwable.printStackTrace();
        }finally {
            logger.debug("交互成功，交互耗时："+(System.currentTimeMillis()-startTime)+"ms");
        }
    }
}
