package com.company;

public class Action {
    private String text;
    private int n;

    public Action(String text, int n) {
        this.text = text;
        this.n = n;
    }

    public String getText() {
        return text;
    }

    public int getN() {
        return n;
    }
}
