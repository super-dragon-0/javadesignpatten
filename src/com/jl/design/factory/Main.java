package com.jl.design.factory;

import com.jl.design.factory.service.PersonAction;
import com.jl.design.factory.service.impl.ManFactory;

public class Main {
	public static void main(String[] args) {
		ManFactory manFactory = new ManFactory();
		PersonAction personAction = manFactory.produce();
		personAction.eat();
	}
}
