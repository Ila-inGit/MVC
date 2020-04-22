package com.mvc;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class LockUnlockAction extends AbstractAction {

    private Action c;



    public LockUnlockAction(Action c1){
        c=c1;
        updateName();
    }

    private void updateName() {

        if ( c.isEnabled() )
            putValue(Action.NAME, "Lock");
        else
            putValue(Action.NAME, "Unlock");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        c.setEnabled(!c.isEnabled());
        updateName();

    }


}
