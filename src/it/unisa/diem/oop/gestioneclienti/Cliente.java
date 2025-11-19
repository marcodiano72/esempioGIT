/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.gestioneclienti;

/**
 *
 * @author Marco Diano'
 */
public class Cliente {
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private String indirizzo;
    
    public Cliente (String nome, String cognome, String codiceFiscale, String indirizzo)
    {
        this.nome=nome;
        this.cognome=cognome;
        this.codiceFiscale=codiceFiscale;
        this.indirizzo=indirizzo;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public String getCognome()
    {
        return cognome;
    }
    
    public String getCodiceFiscale()
    {
        return codiceFiscale;
    }

    public String getIndirizzo()
    {
        return indirizzo;
    }
    
    public String stampaCliente()
    {
        return "Cliente:" +nome+ "" + cognome + "\nCodice Fiscale" + codiceFiscale+ "\nIndirizzo"+ indirizzo;
    }
    
}
