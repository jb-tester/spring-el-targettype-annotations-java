package com.mytests.spring.SpEL.targetTypeAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringElTargettypeAnnotationsJavaApplication implements CommandLineRunner {
    @Autowired
    ApplicationContext ctx;
    public static void main(String[] args) {
        SpringApplication.run(SpringElTargettypeAnnotationsJavaApplication.class, args);
        
        
    }

    @Override
    public void run(String... args) throws Exception {
        

        CompoWithSpEL c = ctx.getBean(CompoWithSpEL.class);
       c.someMethod();
        CustomSpELVarsTest cc = ctx.getBean(CustomSpELVarsTest.class);
        cc.test1();
        cc.test2("bar!");
        cc.test3(5);
        cc.test4();
    }
}
