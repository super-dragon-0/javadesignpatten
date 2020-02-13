package com.jl.design.observer.service.impl;

public class RealizeSubject extends AbstractSubject{

	@Override
	public void operation() {
		System.out.println("start updating");
		notifyAllObservers();
	}
}
