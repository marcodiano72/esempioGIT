/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.gestioneprodotti;

import it.unisa.diem.oop.gestioneclienti.Cliente;
/**
 *
 * @author  Marco Dianò
 */
public class Fattura {
    
    private final Prodotto prodotti[];
    private int riemp;   
    static private int count=0;  
    private final int idFattura;
    private final Cliente destinatario;
    private final String dataEmissione;
    private final double tassa;
    
    public Fattura(int maxSize, Cliente destinatario, String dataEmissione, double tassa){
        
        prodotti = new Prodotto[maxSize];
        riemp = 0;
        idFattura=count++;
        this.destinatario = destinatario;
        this.dataEmissione = dataEmissione;
        this.tassa = tassa;
        
    }

    public Prodotto[] getProdotti() {
        return prodotti;
    }

    public int getRiemp() {
        return riemp;
    }

    public static int getCount() {
        return count;
    }

    public int getIdFattura() {
        return idFattura;
    }

    public Cliente getDestinatario() {
        return destinatario;
    }

    public String getDataEmissione() {
        return dataEmissione;
    }

    public double getTassa() {
        return tassa;
    }
    
    public void aggiungiProdotto(Prodotto prod){
        if(riemp < prodotti.length){
            prodotti[riemp] = prod;
            riemp++;
        } else {
            System.out.println("Non è possibile aggiungere un nuovo elemento!");
        }
    }
    
    public double calcolaImponibile(){
        
        double totImponibile = 0;
        for(int i=0; i < riemp; i++){
            totImponibile += prodotti[i].getCosto();
        }
        return totImponibile;
    }
    
    public double calcolaTotale(){
        
        double imponibile = calcolaImponibile();
        return imponibile + (imponibile * tassa);
        
    }
    
    public String stampaFattura(){
           StringBuffer sb = new StringBuffer();
           sb.append("==== FATTURA ID: " + this.idFattura + " (" + this.getDataEmissione() + ") ====");
           sb.append(destinatario.stampaCliente() + "\n");
           for (int i=0; i<riemp; i++){
               sb.append(prodotti[i].stampaProdotto()+"\n");
           }
           sb.append("-------------------\n");
           sb.append("Totale da pagare: €" + calcolaTotale());
           
           return sb.toString();
           
    }
}
