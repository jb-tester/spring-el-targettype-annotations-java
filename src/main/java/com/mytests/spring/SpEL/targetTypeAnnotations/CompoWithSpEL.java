package com.mytests.spring.SpEL.targetTypeAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 @el( root:org.springframework.beans.factory.config.BeanExpressionContext)
 */
@Component
public class CompoWithSpEL {
    
    //@el( root:org.springframework.beans.factory.config.BeanExpressionContext)
    @Value("#{#root.getBeanFactory().containsBean('testBean')?#root.getBeanFactory().getBean('testBean'):'none'}")
    String p1;
    
    
    public void someMethod(){
      
        System.out.println(p1);

    }

   
}
