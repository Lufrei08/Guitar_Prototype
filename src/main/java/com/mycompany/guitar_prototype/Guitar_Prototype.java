package com.mycompany.guitar_prototype;

public class Guitar_Prototype {

    public static void main(String[] args) {
        Classic prototypeClassic = new Classic();
        Folk prototypeFolk = new Folk();
        Flet prototypeFlet = new Flet();
        Jumbo prototypeJumbo = new Jumbo();
        SevenStrings prototypeSeven = new SevenStrings();
        TwelveStrings prototypeTwelve = new TwelveStrings();

        ConventionalPrototype ClassicoUsado = prototypeClassic.clone();
        ClassicoUsado.setValue(950.7);
        ClassicoUsado.setStrings(6);
        ClassicoUsado.setModel("Acústico");
        ClassicoUsado.setStringType("Nylon");
        System.out.println(ClassicoUsado.showInfo());

        ConventionalPrototype FolkNovo = prototypeFolk.clone();
        FolkNovo.setValue(1350);
        FolkNovo.setStrings(6);
        FolkNovo.setModel("Eletroacústico");
        FolkNovo.setStringType("Aço");
        System.out.println(FolkNovo.showInfo());

        ConventionalPrototype FletUsado = prototypeFlet.clone();
        FletUsado.setValue(1570.97);
        FletUsado.setStrings(6);
        FletUsado.setModel("Elétrico");
        FletUsado.setStringType("Nylon");
        System.out.println(FletUsado.showInfo());
        
        ConventionalPrototype JumboElvis = prototypeJumbo.clone();
        JumboElvis.setValue(3465.98);
        JumboElvis.setStrings(6);
        JumboElvis.setModel("Eletroacústico");
        JumboElvis.setStringType("Aço");
        System.out.println(JumboElvis.showInfo());
        
        ConventionalPrototype SevenUsado = prototypeSeven.clone();
        SevenUsado.setValue(1276.05);
        SevenUsado.setStrings(7);
        SevenUsado.setModel("Acústico");
        SevenUsado.setStringType("Aço");
        System.out.println(SevenUsado.showInfo());
        
        ConventionalPrototype TwelveMelodias = prototypeTwelve.clone();
        TwelveMelodias.setValue(1950);
        TwelveMelodias.setStrings(12);
        TwelveMelodias.setModel("Eletroacústico");
        TwelveMelodias.setStringType("Aço");
        System.out.println(TwelveMelodias.showInfo());
        
        Guitar0 prototypeZero = new Guitar0();
        Guitar00 prototypeDoubleZero = new Guitar00();
        Guitar000 prototypeTripleZero = new Guitar000();
        
        ParlorPrototype parlorPequeno = prototypeZero.clone();
        parlorPequeno.setValue(1850);
        parlorPequeno.setStrings(6);
        parlorPequeno.setModel("Elétrico");
        parlorPequeno.setStringType("Aço");
        parlorPequeno.setBody("Parlor");
        System.out.println(parlorPequeno.showInfo());
        
        ParlorPrototype parlorMedio = prototypeDoubleZero.clone();
        parlorMedio.setValue(1690);
        parlorMedio.setStrings(6);
        parlorMedio.setModel("Acústico");
        parlorMedio.setStringType("Aço");
        parlorMedio.setBody("Parlor");
        System.out.println(parlorMedio.showInfo());
        
        ParlorPrototype parlorGrande = prototypeTripleZero.clone();
        parlorGrande.setValue(2190);
        parlorGrande.setStrings(6);
        parlorGrande.setModel("Acústico");
        parlorGrande.setStringType("Nylon");
        parlorGrande.setBody("Parlor");
        System.out.println(parlorGrande.showInfo());
    }
}
