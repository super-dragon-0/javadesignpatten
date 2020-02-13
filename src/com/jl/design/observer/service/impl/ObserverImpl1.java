package com.jl.design.observer.service.impl;

import com.jl.design.observer.service.Observer;

public class ObserverImpl1 implements Observer{

	@Override
	public void update() {
		System.out.println("ObserverImpl1 has received");
		
	}

}
