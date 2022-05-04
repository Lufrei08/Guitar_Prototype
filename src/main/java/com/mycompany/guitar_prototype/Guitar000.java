package com.mycompany.guitar_prototype;

public class Guitar000 extends ParlorPrototype {

    public Guitar000(Guitar000 guitarTripleZero) {
        this.value = guitarTripleZero.getValue();
        this.strings = guitarTripleZero.strings;
        this.model = guitarTripleZero.model;
        this.stringType = guitarTripleZero.stringType;
    }

    public Guitar000() {
        this.value = value;
        this.strings = strings;
        this.model = model;
        this.stringType = stringType;
        this.body = body;
    }

    @Override
    public String showInfo() {
        return ("""
               Tipo: Violão Parlor Triplo Zero
               Marca: Solinho Violões 
               Modelo: """ + this.model + " \nCordas: " + this.strings + " \n"
                + "Tipo de cordas: " + this.stringType + " \nR$: " + this.value + " \n"
                + "Corpo: " + this.body + " \n");
    }

    @Override
    public ParlorPrototype clone() {
        return (new Guitar000(this));
    }

}
