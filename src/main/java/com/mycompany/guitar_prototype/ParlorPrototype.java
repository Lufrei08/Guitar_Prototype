package com.mycompany.guitar_prototype;

public abstract class ParlorPrototype {

    protected double value;
    protected int strings;
    protected String model;
    protected String stringType;
    protected String body;

    public abstract String showInfo();

    public abstract ParlorPrototype clone();

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStringType() {
        return stringType;
    }

    public void setStringType(String stringType) {
        this.stringType = stringType;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
