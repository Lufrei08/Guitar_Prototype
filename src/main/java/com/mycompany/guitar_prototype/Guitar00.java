package com.mycompany.guitar_prototype;

public class Guitar00 extends ParlorPrototype {

    public Guitar00(Guitar00 guitarDoubleZero) {
        this.value = guitarDoubleZero.getValue();
        this.strings = guitarDoubleZero.strings;
        this.model = guitarDoubleZero.model;
        this.stringType = guitarDoubleZero.stringType;
    }

    public Guitar00() {
        this.value = value;
        this.strings = strings;
        this.model = model;
        this.stringType = stringType;
        this.body = body;
    }

    @Override
    public String showInfo() {
        return ("""
               Tipo: Violão Parlor Duplo Zero
               Marca: Solinho Violões 
               Modelo: """ + this.model + " \nCordas: " + this.strings + " \n"
                + "Tipo de cordas: " + this.stringType + " \nR$: " + this.value + " \n"
                + "Corpo: " + this.body + "\n");
    }

    @Override
    public ParlorPrototype clone() {
        return (new Guitar00(this));
    }

}
