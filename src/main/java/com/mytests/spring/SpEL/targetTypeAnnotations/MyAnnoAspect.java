package com.mytests.spring.SpEL.targetTypeAnnotations;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * *
 * <p>Created by irina on 10.01.2022.</p>
 * <p>Project: spring-el-targettype-annotations-java</p>
 * *
 */
@Aspect
@Component
public class MyAnnoAspect {

    @Autowired
    private VarsService varsService;

    @Around("methodsAnnotatedWithMyAnno()") public Object processMethodsAnnotatedWithProjectSecuredAnnotation(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        MyAnno myAnno = method.getAnnotation(MyAnno.class);
        // parse expression and get the boolean result      
        Boolean expr = (Boolean) MyCustomSpELProcessor.getDynamicValue(signature.getParameterNames(), joinPoint.getArgs(), varsService.getVars(), myAnno.expr());

        if (expr) {
            System.out.println(signature.getMethod().getName() + " passed");
            return joinPoint.proceed();        } else {
            System.out.println(("expression should return true, but returns " + expr+ ":"));
            System.out.println(signature.getMethod().getName() + " failed");
            return  null;
        }    }
    @Pointcut("@annotation(MyAnno)")    private void methodsAnnotatedWithMyAnno() {    }
}
