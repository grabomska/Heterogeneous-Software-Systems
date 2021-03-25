package com.example.demo.model;

public class Mark {

    private int id;
    private String name;
    private String value;

    public Mark(int id, String name, String value) {
        this.id = id;
        this.name = name;
        this.value =value;
    }

    public int getId() {
        return id;
    }

    public Mark setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Mark setName(String name) {
        this.name = name;
        return this;
    }

    public String getValue() {
        return value;
    }

    public Mark setValue(String value) {
        this.value = value;
        return this;
    }
}
