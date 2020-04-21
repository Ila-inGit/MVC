package com.mvc;


import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //Model
        ObservableGameModel m1=new ObservableGameModel(new GameModelImpl());

        //Controller
        Controller c1= new Controller(m1);

        //View

        ComplexView v1= new ComplexView(m1,c1);

        //GUI SETUP
        JFrame f=new JFrame();
        f.getContentPane().add(v1);
        f.pack();
        f.setVisible(true);
    }
}
