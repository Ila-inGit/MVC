package com.mvc;

public class GameModelImpl implements GameModel {

    private int numeroGiocatori;
    private String nomegiocatore;

    public GameModelImpl() {
        this.numeroGiocatori = 0;
        this.nomegiocatore="";
    }

    @Override
    public int getNGiocatori() {
        return numeroGiocatori;
    }

    public String getNomegiocatore() {
        return nomegiocatore;
    }

    @Override
    public void inc() {
        numeroGiocatori++;
    }

    public void setNomegiocatore(String nomegiocatore) {
        this.nomegiocatore = nomegiocatore;
    }
}
