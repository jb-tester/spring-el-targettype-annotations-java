package com.mytests.spring.SpEL.targetTypeAnnotations;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * *
 * <p>Created by irina on 10.01.2022.</p>
 * <p>Project: spring-el-targettype-annotations-java</p>
 * *
 */
public class MyCustomSpELProcessor {
    public static Object getDynamicValue(String[] parameterNames, Object[] args, Map<String,Object> vars, String key) {
        ExpressionParser parser = new SpelExpressionParser();
        StandardEvaluationContext context = new StandardEvaluationContext();
        for (int i = 0; i < parameterNames.length; i++) {
            context.setVariable(parameterNames[i], args[i]);
        }
        vars.forEach(context::setVariable) ;
        
        System.out.println("expression is: " + key);
        return parser.parseExpression(key).getValue(context, Object.class);
    }
}
