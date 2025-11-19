/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.gestioneprodotti;

/**
 *
 * @author Marco Diano'
 */
public class Prodotto {
    private  int codice;
    private String descrizione;
    private double costo;
    private String dataProduzione;
    
    public Prodotto (int codice, String descrizione, double costo, String dataProduzione)
    {
        this.codice=codice;
        this.descrizione=descrizione;
        this.costo=costo;
        this.dataProduzione=dataProduzione;
    }
    
    public int getCodice()
    {
        return codice;
    }
    
    public String getDescrizione()
    {
        return descrizione;
    }
    
    public double getCosto()
    {
        return costo;
    }
    
    public String getDataProduzione()
    {
        return dataProduzione;
    }
     
    
    public String stampaProdotto()
    {
        return "Codice" + codice +"\ndescrizione:" + descrizione +"\ncosto" + costo + "\ndata di produzione" + dataProduzione;    
}
    
    
}
