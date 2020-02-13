package com.jl.design.abstractfactory.service.impl;

import com.jl.design.abstractfactory.service.LandAnimal;

public class Dog implements LandAnimal{

	@Override
	public void run() {
		System.out.println("dog is running");
		
	}

}
