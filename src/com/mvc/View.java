package com.mvc;

import javax.swing.*;

public class View extends JLabel implements Observer {

    private ObservableGameModel theObservedModel;

    public View(ObservableGameModel model){
        theObservedModel=model;
        update(null);
    }

    @Override
    public void update() {

        String s=
                Integer.toString(theObservedModel.getNGiocatori());
        setText(s);
        repaint();
    }

    @Override
    public void subscribe(ObservableGameModel observer) {
        this.theObservedModel.subscribeObserver(this);

    }

}
