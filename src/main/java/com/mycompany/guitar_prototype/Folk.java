package com.mycompany.guitar_prototype;

public class Folk extends ConventionalPrototype {

    public Folk(Folk folkGuitar) {
        this.value = folkGuitar.getValue();
        this.strings = folkGuitar.strings;
        this.model = folkGuitar.model;
        this.stringType = folkGuitar.stringType;
    }

    public Folk() {
        this.value = value;
        this.strings = strings;
        this.model = model;
        this.stringType = stringType;
    }

    @Override
    public String showInfo() {
        return("""
               Tipo: Violão Folk 
               Marca: Solinho Violões 
               Modelo: """+this.model+" \nCordas: "+this.strings+" \n"
                + "Tipo de cordas: "+this.stringType+" \nR$: "+this.value+" \n");
    }

    @Override
    public ConventionalPrototype clone() {
         return(new Folk(this));
    }

}
