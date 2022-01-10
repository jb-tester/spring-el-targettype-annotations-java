package com.mytests.spring.SpEL.targetTypeAnnotations;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * *
 * <p>Created by irina on 10.01.2022.</p>
 * <p>Project: spring-el-targettype-annotations-java</p>
 * *
 */
@Service
public class VarsService {
    
    Map<String, Object> vars;

    public Map<String, Object> getVars() {
        Map<String,Object> vars = new HashMap<>();
        vars.put("tstr1", "foo!!!!");
        vars.put("strList", new ArrayList<>(Arrays.asList("foo", "bbb", "ccc")));
        vars.put("fooList", new ArrayList<>(Arrays.asList(new Foo(11, 12), new Foo(21, 22))));
        vars.put("someType",new TargetType(10, 20) ) ;
        return vars;
    }

   
}
