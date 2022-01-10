package com.mytests.spring.SpEL.targetTypeAnnotations;

import java.util.List;

/**
 * *
 * <p>Created by irina on 10.01.2022.</p>
 * <p>Project: spring-el-targettype-annotations-java</p>
 * *
 */
public class TargetType {
    
    Integer tint1;
    Integer tint2;

    public TargetType(Integer tint1, Integer tint2) {
        this.tint1 = tint1;
        this.tint2 = tint2;
    }

    public Integer getTint1() {
        return tint1;
    }

   

    public Integer getTint2() {
        return tint2;
    }

    }
