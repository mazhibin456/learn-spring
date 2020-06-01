
/*
 * @author: marvin
 * @software: IntelliJ IDEA
 * @file: Logger.java
 * @time: 2020-05-29 11:09
 */

package com.marvin.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("logger")
@Aspect
public class Logger {

    @Pointcut("execution(* com.marvin.service.impl.*.*(..))")
    public void pointCut1() { }

    /**
     * 前置通知
     */
    //@Before("pointCut1()")
    public  void beforePrintLog(){
        System.out.println("前置通知......");
    }

    /**
     * 后置通知
     */
    //@AfterReturning("pointCut1()")
    public  void afterReturningPrintLog(){
        System.out.println("后置通知......");
    }

    /**
     * 异常通知
     */
    //@AfterThrowing("pointCut1()")
    public  void afterThrowingPrintLog(){
        System.out.println("异常通知......");
    }

    /**
     * 最终通知
     */
    //@After("pointCut1()")
    public  void afterPrintLog(){
        System.out.println("最终通知......");
    }

    /**
     * 环绕通知
     * @param pjp
     * @return
     */
    @Around("pointCut1()")
    public Object aroundPringLog(ProceedingJoinPoint pjp){
        Object rtValue = null;

        try{
            Object[] args = pjp.getArgs();//得到方法执行所需的参数
            System.out.println("环绕通知。。。前置");
            rtValue = pjp.proceed(args);//明确调用业务层方法（切入点方法）
            System.out.println("环绕通知。。。后置");
            return rtValue;
        }catch (Throwable t){
            System.out.println("环绕通知。。。异常");
            throw new RuntimeException(t);
        }finally {
            System.out.println("环绕通知。。。最终");
        }
    }
}
