package com.mytests.spring.SpEL.targetTypeAnnotations;

import org.springframework.stereotype.Component;

/**
 * @el( tstr1: java.lang.String)
 * @el( strList: java.util.List<java.lang.String>)
 */
@Component
public class CustomSpELVarsTest {
    
    @MyAnno(expr = "#tstr1.startsWith(#strList[0])")
    public void test1(){
        System.out.println("test1");
    }
    
    
    // @el(param1: java.lang.String)
    @MyAnno(expr = "#tstr1 == #param1")
    public void test2(String param1){
        System.out.println("test2");
    }
    
    
    // @el(someType: com.mytests.spring.SpEL.targetTypeAnnotations.TargetType)
    // @el(param2: java.lang.Integer)
    @MyAnno(expr = "#someType.tint1 > #param2 ")
    public void test3(int param2){
        System.out.println("test3; parameter is "+param2);
    }
    
    
    // @el(fooList: java.util.List<com.mytests.spring.SpEL.targetTypeAnnotations.Foo>)
    @MyAnno(expr = "#fooList.get(0).foo1 < #fooList.get(1).foo2")
    public void test4(){
        System.out.println("test4"); 
    }
}
