package com.mvc;

import java.util.ArrayList;

public interface Observer {
    void updateNumG();
    void updateName();
    void subscribe(ObservableGameModel observer);
}
