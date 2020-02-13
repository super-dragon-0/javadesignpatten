package com.jl.design.observer.service.impl;

import java.util.Enumeration;
import java.util.Vector;

import com.jl.design.observer.service.Observer;
import com.jl.design.observer.service.Subject;

public abstract class AbstractSubject implements Subject{

	private Vector<Observer> vector = new Vector<>();
	@Override
	public void add(Observer observer) {
		
		vector.add(observer);
	}

	@Override
	public void del(Observer observer) {
		vector.remove(observer);
		
	}

	@Override
	public void notifyAllObservers() {
		Enumeration<Observer> elements = vector.elements();
		while (elements.hasMoreElements()) {
			Observer observer = (Observer) elements.nextElement();
			observer.update();
		}
	}

	@Override
	public void operation() {
		
	}

	
}
