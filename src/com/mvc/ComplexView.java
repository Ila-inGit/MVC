package com.mvc;

import javax.swing.*;
import java.awt.*;

public class ComplexView extends JPanel {

    private View v;

    public ComplexView (ObservableGameModel m, Controller c){
        v=new View(m);
        v.subscribe(m);
        setLayout(new GridLayout(4,1));
        add(v);
        Action a=new IncrementoAction(c);
        add(new JButton(a));
        add(new JButton(new DoppioIncrementoAction(c)));
    }

}
