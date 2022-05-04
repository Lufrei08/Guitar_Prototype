package com.mycompany.guitar_prototype;

public abstract class ConventionalPrototype {

    protected double value;
    protected int strings;
    protected String model;
    protected String stringType;

    public abstract String showInfo();
    
    public abstract ConventionalPrototype clone();

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

}
