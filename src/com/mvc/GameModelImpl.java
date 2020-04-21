package com.mvc;

public class GameModelImpl implements GameModel {

    private int numeroGiocatori;

    public GameModelImpl() {
        this.numeroGiocatori = 0;
    }

    @Override
    public int getNGiocatori() {
        return numeroGiocatori;
    }

    @Override
    public void inc() {
        numeroGiocatori++;
    }

}
