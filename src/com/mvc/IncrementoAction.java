package com.mvc;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class IncrementoAction extends AbstractAction {

    private Controller c;

    public IncrementoAction(Controller c1){
        super("Incremento");
        c=c1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        c.increment();
    }
}
