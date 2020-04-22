package com.mvc;

import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class ObservableGameModel implements GameModel,Subject {


    private GameModel gameModel;
    private ArrayList<Observer> observers;

    public ObservableGameModel(GameModel gameModel) {
        this.gameModel = gameModel;
        observers=new ArrayList<>();
    }

    @Override
    public int getNGiocatori() {
        return gameModel.getNGiocatori();
    }


    @Override
    public void inc() {
        gameModel.inc();
    }

    @Override
    public String getNomegiocatore() {
        return gameModel.getNomegiocatore();
    }

    @Override
    public void setNomegiocatore(String nomegiocatore) {
        gameModel.setNomegiocatore(nomegiocatore);
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserversNum() {
        System.out.println("sto notificando gli observer:");
        for(Observer observer : observers){
            observer.updateNumG();
        }

    }
    @Override
    public void notifyObserversName() {
        System.out.println("sto notificando gli observer:");
        for(Observer observer : observers){
            observer.updateName();
        }

    }



}
