package com.jl.design.protype;

public class ShadowClone implements Cloneable{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "ShadowClone [name=" + name + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		ShadowClone shadowClone = (ShadowClone) super.clone();
		return shadowClone;
	}
}
