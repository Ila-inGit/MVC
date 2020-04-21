package com.mvc;

import java.util.ArrayList;

public interface Observer {
    void update();
    void subscribe(ObservableGameModel observer);
}
