package com.jl.design.strategy.main;

import com.jl.design.strategy.excute.Excute;
import com.jl.design.strategy.service.impl.Addition;
import com.jl.design.strategy.service.impl.Division;
import com.jl.design.strategy.service.impl.Multiplication;
import com.jl.design.strategy.service.impl.Substraction;

public class Main {
	public static void main(String[] args) {
		System.out.println(new Excute(new Addition()).excuteFuction(2, 3));
		System.out.println(new Excute(new Substraction()).excuteFuction(2, 3));
		System.out.println(new Excute(new Division()).excuteFuction(2, 3));
		System.out.println(new Excute(new Multiplication()).excuteFuction(2, 3));
	}
}
