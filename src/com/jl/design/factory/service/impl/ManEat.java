package com.jl.design.factory.service.impl;

import com.jl.design.factory.service.PersonAction;

public class ManEat implements PersonAction{

	@Override
	public void eat() {
		System.out.println("man is eating");
		
	}

}
