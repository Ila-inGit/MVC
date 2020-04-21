package com.mvc;

public class Controller {

    private ObservableGameModel model;

    public Controller(ObservableGameModel model) {
        this.model = model;
    }

    public void increment(){
        model.inc();
        model.notifyObservers();
    }
    public void dobleIncrement() {
        model.inc();
        model.inc();
        model.notifyObservers();
    }

}
