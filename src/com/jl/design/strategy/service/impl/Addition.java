package com.jl.design.strategy.service.impl;

import com.jl.design.strategy.service.Function;

public class Addition implements Function{

	@Override
	public int fun(int a, int b) {
		
		return a+b;
	}

}
