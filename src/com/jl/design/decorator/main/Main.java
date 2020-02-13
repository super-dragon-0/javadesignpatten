package com.jl.design.decorator.main;

import com.jl.design.decorator.service.impl.BlindMonk;
import com.jl.design.decorator.service.impl.EDecorator;
import com.jl.design.decorator.service.impl.QDecorator;
import com.jl.design.decorator.service.impl.RDecorator;
import com.jl.design.decorator.service.impl.WDecorator;

public class Main {

	public static void main(String[] args) {
		BlindMonk blindMonk = new BlindMonk("hero");
		EDecorator eDecorator = new EDecorator(blindMonk,"E"); 
		QDecorator qDecorator = new QDecorator(eDecorator,"Q");
		RDecorator rDecorator = new RDecorator(qDecorator,"R");
		WDecorator wDecorator = new WDecorator(rDecorator,"W");
		wDecorator.learnSkill();
	}
}
