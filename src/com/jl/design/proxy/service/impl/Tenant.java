package com.jl.design.proxy.service.impl;

import java.util.jar.Attributes.Name;

import com.jl.design.proxy.service.IProxy;

public class Tenant implements IProxy{

	private String name;
	
	public Tenant(String name) {
		this.name = name;
	}
	@Override
	public void buy() {
		System.out.println(name+" is buying");
	}

}
