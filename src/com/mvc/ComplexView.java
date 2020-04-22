package com.mvc;

import javax.swing.*;
import java.awt.*;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class ComplexView extends JPanel {

    public ComplexView (ObservableGameModel m, Controller c){
        View v = new View(m);
        v.subscribe(m);
        setLayout(new GridLayout(4,1));
        add(v);
        Action a=new IncrementoAction(c);
        Action b= new DoppioIncrementoAction(c);
        Action d= new SettaNomeAction(c);
        Action e= new LockUnlockAction(a);

        add(new JButton(a));
        add(new JButton(b));
        add(new JButton(d));
        add(new JButton(e));

    }

}
