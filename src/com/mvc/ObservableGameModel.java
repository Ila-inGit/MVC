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
    public void subscribeObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void notifyObservers() {
        System.out.println("sto notificando gli observer:");
        for(Observer observer : observers){
            observer.update();
        }

    }
}
