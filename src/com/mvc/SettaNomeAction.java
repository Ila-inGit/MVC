package com.mvc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Scanner;

public class SettaNomeAction extends AbstractAction {

    private Controller c;

    public SettaNomeAction(Controller c1){
        super("Setting Nome");
        c=c1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("inserisci nome:");
        Scanner tastiera = new Scanner(System.in);
        String nomeg = tastiera.nextLine(); //s avrà il valore che l'utente avrà inserito prima di premere invio
        c.setName(nomeg);
    }
}
