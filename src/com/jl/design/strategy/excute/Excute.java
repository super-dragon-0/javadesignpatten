package com.jl.design.strategy.excute;

import com.jl.design.strategy.service.Function;

public class Excute {
	private Function function;

	public Excute(Function function) {
		super();
		this.function = function;
	}
	
	public int excuteFuction(int a,int b) {
		return function.fun(a, b);
	}
}
