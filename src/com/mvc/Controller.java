package com.mvc;

public class Controller {

    private ObservableGameModel model;

    public Controller(ObservableGameModel model) {
        this.model = model;
    }

    public void increment(){
        model.inc();
        model.notifyObserversNum();
    }
    public void doubleIncrement() {
        model.inc();
        model.inc();
        model.notifyObserversNum();
    }
    public void setName(String nome){
        model.setNomegiocatore(nome);
        model.notifyObserversName();
    }
}
