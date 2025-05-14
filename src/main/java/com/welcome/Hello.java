package com.welcome;

public class Hello {
    private String name;

    public void setupName(String name) {
        this.name = name;
    }

    public void welcome() {
        System.out.println("Hello, " + name);
    }

    public void byeBay() {
        System.out.println("Bye, " + name);
    }
}