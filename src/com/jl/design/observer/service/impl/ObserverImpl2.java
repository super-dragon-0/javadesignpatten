package com.jl.design.observer.service.impl;

import com.jl.design.observer.service.Observer;

public class ObserverImpl2 implements Observer{

	@Override
	public void update() {
		System.out.println("ObserverImpl2 has received");
		
	}

}
