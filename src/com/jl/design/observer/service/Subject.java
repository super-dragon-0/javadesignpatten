package com.jl.design.observer.service;

public interface Subject {
	void add(Observer observer);
	void del(Observer observer);
	void notifyAllObservers();
	void operation();
}
