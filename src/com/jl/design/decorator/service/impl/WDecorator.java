package com.jl.design.decorator.service.impl;

import com.jl.design.decorator.service.Hero;

public class WDecorator extends SkillDecorator{

	private String name;
	
	public WDecorator(Hero hero,String name) {
		super(hero);
		this.name = name;
	}

	private void learn_W(){
		System.out.println("learn to "+name+"skill");
	}
	
	@Override
	public void learnSkill() {
		super.learnSkill();
		learn_W();
	}
}
