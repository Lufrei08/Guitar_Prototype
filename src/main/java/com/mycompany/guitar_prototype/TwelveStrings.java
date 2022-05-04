package com.mycompany.guitar_prototype;

public class TwelveStrings extends ConventionalPrototype {

    public TwelveStrings(TwelveStrings twelveGuitar) {
        this.value = twelveGuitar.getValue();
        this.strings = twelveGuitar.strings;
        this.model = twelveGuitar.model;
        this.stringType = twelveGuitar.stringType;
    }

    public TwelveStrings() {
        this.value = value;
        this.strings = strings;
        this.model = model;
        this.stringType = stringType;
    }

    @Override
    public String showInfo() {
        return("""
               Tipo: Violão 12 cordas 
               Marca: Solinho Violões 
               Modelo: """+this.model+" \nCordas: "+this.strings+" \n"
                + "Tipo de cordas: "+this.stringType+" \nR$: "+this.value+" \n");
    }

    @Override
    public ConventionalPrototype clone() {
         return(new TwelveStrings(this));
    }

}
