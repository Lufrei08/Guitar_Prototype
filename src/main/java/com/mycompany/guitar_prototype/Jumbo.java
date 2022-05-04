package com.mycompany.guitar_prototype;

public class Jumbo extends ConventionalPrototype {

    public Jumbo(Jumbo jumboGuitar) {
        this.value = jumboGuitar.getValue();
        this.strings = jumboGuitar.strings;
        this.model = jumboGuitar.model;
        this.stringType = jumboGuitar.stringType;
    }

    public Jumbo() {
        this.value = value;
        this.strings = strings;
        this.model = model;
        this.stringType = stringType;
    }

    @Override
    public String showInfo() {
        return("""
               Tipo: Violão Jumbo 
               Marca: Solinho Violões 
               Modelo: """+this.model+" \nCordas: "+this.strings+" \n"
                + "Tipo de cordas: "+this.stringType+" \nR$: "+this.value+" \n");
    }

    @Override
    public ConventionalPrototype clone() {
         return(new Jumbo(this));
    }

}
