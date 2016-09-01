package com.bydan.framework.erp.business.dataaccess;

public class Box<T> {

    private T t; // T stands for "Type"          

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}

