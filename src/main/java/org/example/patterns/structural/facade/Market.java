package org.example.patterns.structural.facade;

public class Market {
    private Volkswagen volkswagen;
    private Toyota toyota;
    private Reno reno;

    public Market(){
        volkswagen= new Volkswagen();
        toyota=new Toyota();
        reno=new Reno();
    }
    public void renoSale(){
        reno.model();
        reno.price();
    }
    public void toyotaSale(){
        toyota.model();
        toyota.price();
    }
    public void volkswagenSale(){
        volkswagen.model();
        volkswagen.price();
    }
}
