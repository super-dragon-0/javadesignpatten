package com.jl.design.factory.service.impl;

import com.jl.design.factory.service.PersonAction;
import com.jl.design.factory.service.Provider;

public class ManFactory implements Provider{

	@Override
	public PersonAction produce() {
		
		return new ManEat();
	}

}
