package com.mvc;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class DoppioIncrementoAction extends AbstractAction {
    private Controller c;

    public DoppioIncrementoAction(Controller c1){
        super("Doppio Incremento");
        c=c1;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        c.doubleIncrement();
    }
}
