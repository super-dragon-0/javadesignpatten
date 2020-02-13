package com.jl.design.abstractfactory.service.impl;

import com.jl.design.abstractfactory.service.WaterAnimal;

public class Fish implements WaterAnimal{

	@Override
	public void swim() {
		System.out.println("fish is swimming");
		
	}

}
