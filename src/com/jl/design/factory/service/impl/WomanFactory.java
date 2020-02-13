package com.jl.design.factory.service.impl;

import com.jl.design.factory.service.PersonAction;
import com.jl.design.factory.service.Provider;

public class WomanFactory implements Provider{

	@Override
	public PersonAction produce() {
		
		return new WomanEat();
	}

}
