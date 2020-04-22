package com.mvc;

public interface Subject {
    void subscribeObserver(Observer observer);
    void notifyObserversNum();
    void notifyObserversName();
}
