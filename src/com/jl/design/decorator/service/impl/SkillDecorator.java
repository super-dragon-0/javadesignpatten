package com.jl.design.decorator.service.impl;

import com.jl.design.decorator.service.Hero;

public abstract class SkillDecorator implements Hero{

	private Hero hero;
	
	public SkillDecorator(Hero hero) {
		this.hero = hero;
	}
	
	@Override
    public void learnSkill() {
		hero.learnSkill();
    }
}
