package com.jl.design.proxy.service;

import com.jl.design.proxy.service.impl.Proxy;

public class Main {
	public static void main(String[] args) {
		new Proxy("hero").buy();
	}
}
