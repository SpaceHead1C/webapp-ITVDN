package com.vebinar.service;

import java.io.Serializable;

public class TestBean implements Serializable {
    private String name;

    public TestBean() {}

    public TestBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
