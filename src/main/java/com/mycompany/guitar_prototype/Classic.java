package com.mycompany.guitar_prototype;

public class Classic extends ConventionalPrototype {

    public Classic(Classic classicGuitar) {
        this.value = classicGuitar.getValue();
        this.strings = classicGuitar.strings;
        this.model = classicGuitar.model;
        this.stringType = classicGuitar.stringType;
    }

    public Classic() {
        this.value = value;
        this.strings = strings;
        this.model = model;
        this.stringType = stringType;
    }

    @Override
    public String showInfo() {
        return("""
               Tipo: Violão Classico 
               Marca: Solinho Violões 
               Modelo: """+this.model+" \nCordas: "+this.strings+" \n"
                + "Tipo de cordas: "+this.stringType+" \nR$: "+this.value+" \n");
    }

    @Override
    public ConventionalPrototype clone() {
         return(new Classic(this));
    }

}
