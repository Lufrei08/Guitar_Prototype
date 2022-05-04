package com.mycompany.guitar_prototype;

public class SevenStrings extends ConventionalPrototype {

    public SevenStrings(SevenStrings sevenGuitar) {
        this.value = sevenGuitar.getValue();
        this.strings = sevenGuitar.strings;
        this.model = sevenGuitar.model;
        this.stringType = sevenGuitar.stringType;
    }

    public SevenStrings() {
        this.value = value;
        this.strings = strings;
        this.model = model;
        this.stringType = stringType;
    }

    @Override
    public String showInfo() {
        return("""
               Tipo: Violão 7 cordas 
               Marca: Solinho Violões 
               Modelo: """+this.model+" \nCordas: "+this.strings+" \n"
                + "Tipo de cordas: "+this.stringType+" \nR$: "+this.value+" \n");
    }

    @Override
    public ConventionalPrototype clone() {
         return(new SevenStrings(this));
    }

}
