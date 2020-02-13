package com.jl.design.factory.service.impl;

import com.jl.design.factory.service.PersonAction;

public class WomanEat implements PersonAction{

	@Override
	public void eat() {
		System.out.println("woman is eating");
		
	}

}
