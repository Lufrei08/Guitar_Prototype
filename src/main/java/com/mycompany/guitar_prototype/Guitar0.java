package com.mycompany.guitar_prototype;

public class Guitar0 extends ParlorPrototype {

    public Guitar0(Guitar0 guitarZero) {
        this.value = guitarZero.getValue();
        this.strings = guitarZero.strings;
        this.model = guitarZero.model;
        this.stringType = guitarZero.stringType;
    }

    public Guitar0() {
        this.value = value;
        this.strings = strings;
        this.model = model;
        this.stringType = stringType;
        this.body = body;
    }

    @Override
    public String showInfo() {
        return ("""
               Tipo: Violão Parlor Zero
               Marca: Solinho Violões 
               Modelo: """ + this.model + " \nCordas: " + this.strings + " \n"
                + "Tipo de cordas: " + this.stringType + " \nR$: " + this.value + " \n"
                + "Corpo: " + this.body + " \n");
    }

    @Override
    public ParlorPrototype clone() {
        return (new Guitar0(this));
    }

}
