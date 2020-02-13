package com.jl.design.abstractfactory.service;

public interface AbstractFactory {

	LandAnimal getCat();
	LandAnimal getDog();
	LandAnimal getHorse();
	WaterAnimal getFish();
	WaterAnimal getShark();
}
