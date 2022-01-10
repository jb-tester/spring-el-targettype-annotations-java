package com.mytests.spring.SpEL.targetTypeAnnotations;

/**
 * *
 * <p>Created by irina on 10.01.2022.</p>
 * <p>Project: spring-el-targettype-annotations-java</p>
 * *
 */
public class Foo {
    int foo1;
    int foo2;

    public Foo(int foo1, int foo2) {
        this.foo1 = foo1;
        this.foo2 = foo2;
    }

    public int getFoo1() {
        return foo1;
    }

    public int getFoo2() {
        return foo2;
    }
}
