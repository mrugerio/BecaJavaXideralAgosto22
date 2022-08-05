package com.observer.v2;
import java.util.*;

public abstract class Subject {
	//Has-A
	List<Observer> listaObservers = new ArrayList<>();
	
	void atach(Observer o) {
		listaObservers.add(o);
	}
	
	void detach(Observer o) {
		listaObservers.remove(o);
	}
	
	void notificar() {
		for (Observer o:listaObservers) {
			o.update();
		}
	}

}
