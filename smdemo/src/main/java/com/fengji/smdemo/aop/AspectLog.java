package com.fengji.smdemo.aop;

import ch.qos.logback.classic.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ExceptionHandler;

//@Aspect
//@Configuration
public class AspectLog {

    private final static Logger logger = (Logger) LoggerFactory.getLogger(AspectLog.class);

    @Pointcut("execution(* com.fengji.smdemo.service.impl.UserInfoServiceImpl.*(..))")
    public void excudeService(){}

    @Before("excudeService()")
    public void before(JoinPoint point){
        logger.debug("前置通知.................");
    }

//    @Around("excudeService()")
//    public Object around(ProceedingJoinPoint point){
//        logger.debug("环绕通知前..............................");
//        try {
//           return point.proceed();
//        } catch (Throwable throwable) {
//            logger.debug("环绕通知异常..............................");
//            throwable.printStackTrace();
//        }finally {
//            logger.debug("环绕通知后..............................");
//        }
//        return null;
//    }

    @AfterReturning("excudeService()")
    public  void afterReturn(JoinPoint point){
        logger.debug("后置通知。。。。。。。。。。。。。。。。。");
    }

    @AfterThrowing("excudeService()")
    public void exception(JoinPoint point){
        logger.debug("异常通知。。。。。。。。。。。。。。。。。");
    }

    @After("excudeService()")
    public void after(JoinPoint point){
        logger.debug("最终通知。。。。。。。。。。。。。。。。。");
    }
}
