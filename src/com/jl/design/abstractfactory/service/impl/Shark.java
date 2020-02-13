package com.jl.design.abstractfactory.service.impl;

import com.jl.design.abstractfactory.service.WaterAnimal;

public class Shark implements WaterAnimal{

	@Override
	public void swim() {
		System.out.println("shark is swimming");
		
	}

}
