package com.jl.design.decorator.service.impl;

import com.jl.design.decorator.service.Hero;

public class BlindMonk implements Hero{

	private String name;
		
	public BlindMonk(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void learnSkill() {
		System.out.println(getName());
	}

}
