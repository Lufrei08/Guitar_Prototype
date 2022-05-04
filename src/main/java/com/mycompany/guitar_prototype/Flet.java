package com.mycompany.guitar_prototype;

public class Flet extends ConventionalPrototype {

    public Flet(Flet fletGuitar) {
        this.value = fletGuitar.getValue();
        this.strings = fletGuitar.strings;
        this.model = fletGuitar.model;
        this.stringType = fletGuitar.stringType;
    }

    public Flet() {
        this.value = value;
        this.strings = strings;
        this.model = model;
        this.stringType = stringType;
    }

    @Override
    public String showInfo() {
        return("""
               Tipo: Violão Flet 
               Marca: Solinho Violões 
               Modelo: """+this.model+" \nCordas: "+this.strings+" \n"
                + "Tipo de cordas: "+this.stringType+" \nR$: "+this.value+" \n");
    }

    @Override
    public ConventionalPrototype clone() {
         return(new Flet(this));
    }

}
