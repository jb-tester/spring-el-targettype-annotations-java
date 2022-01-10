package com.mytests.spring.SpEL.targetTypeAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 @el( root:org.springframework.beans.factory.config.BeanExpressionContext)
 */
@Component
public class CompoWithSpEL {
    
    //@el( root:org.springframework.beans.factory.config.BeanExpressionContext)
    @Value("#{#root.getBeanFactory().beanDefinitionNames[0]}")
    String p1;
    
    
    public void someMethod(){
        System.out.println("=== test #root using in @Value annotation: ");
        System.out.println(p1);

    }

    
}
