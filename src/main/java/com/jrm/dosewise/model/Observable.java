package com.jrm.dosewise.model;

import com.jrm.dosewise.view.Observer;

public interface Observable {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);
    
    public void notifyObservers();
}
