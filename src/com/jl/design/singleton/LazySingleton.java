package com.jl.design.singleton;
//Lazy singleton(only one object)
public class LazySingleton {

	private static LazySingleton singleton;
	
	private LazySingleton() {}
	
	public static LazySingleton getInstance() {
		if(null == singleton) {
			singleton = new LazySingleton();
		}
		return singleton;
	}
}
