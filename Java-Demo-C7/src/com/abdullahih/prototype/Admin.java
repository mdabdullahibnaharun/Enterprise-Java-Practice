package com.abdullahih.prototype;

public class Admin implements Prototype {
    @Override
    public Prototype getClone() {
        return new Admin();
    }
}
