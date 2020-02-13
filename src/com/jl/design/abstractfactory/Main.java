package com.jl.design.abstractfactory;

import com.jl.design.abstractfactory.service.LandAnimal;
import com.jl.design.abstractfactory.service.impl.AnimalFactory;

public class Main {
	public static void main(String[] args) {
		AnimalFactory animalFactory = new AnimalFactory();
		LandAnimal landAnimal = animalFactory.getCat();
		landAnimal.run();
	}
}
