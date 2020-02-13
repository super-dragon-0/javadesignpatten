package com.jl.design.singleton;
// hungry sigleton(only one object)
public class HungrySingleton {

	private static HungrySingleton singleton = new HungrySingleton();
	
	private HungrySingleton() {}
	
	public static HungrySingleton getInstance() {
		return singleton;
	}
}
