package deu.cse.design_pattern.ch02.modelling02;
// Subject 클래스

import java.util.List;

public abstract class Subject {

    public abstract void registerObserver(Observer o);

    public abstract void removeObserver(Observer o);

    public abstract void notifyObservers();

    protected List<Observer> mObserver ;

}
