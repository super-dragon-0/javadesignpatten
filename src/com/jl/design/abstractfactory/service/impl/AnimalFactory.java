package com.jl.design.abstractfactory.service.impl;

import com.jl.design.abstractfactory.service.AbstractFactory;
import com.jl.design.abstractfactory.service.LandAnimal;
import com.jl.design.abstractfactory.service.WaterAnimal;

public class AnimalFactory implements AbstractFactory{

	@Override
	public LandAnimal getCat() {
		
		return new Cat();
	}

	@Override
	public LandAnimal getDog() {
		
		return new Dog();
	}

	@Override
	public LandAnimal getHorse() {
	
		return new Horse();
	}

	@Override
	public WaterAnimal getFish() {
		
		return new Fish();
	}

	@Override
	public WaterAnimal getShark() {
	
		return new Shark();
	}

}
