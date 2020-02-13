package com.jl.design.adapter;

public class OriginAdapter extends Original implements IExpand{

	@Override
	public void hide() {
		
		System.out.println("This is adapter");
	}

}
