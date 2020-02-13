package com.jl.design.proxy.service.impl;

import com.jl.design.proxy.service.IProxy;

public class Proxy implements IProxy{

	private Tenant tenant;
	
	private String name;
	
	public Proxy(String name) {
		this.name = name;
	}
	@Override
	public void buy() {
		if(null == tenant) {
			tenant = new Tenant(name);
		}
		tenant.buy();
	}

}
