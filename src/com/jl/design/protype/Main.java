package com.jl.design.protype;

public class Main {

	public static void main(String[] args) throws Exception {
		ShadowClone shadowClone = new ShadowClone();
		shadowClone.setName("shadow");
		System.out.println("shadow1��"+shadowClone);
		ShadowClone shadowClone2 = (ShadowClone) shadowClone.clone();
		System.out.println("shadow2��"+shadowClone2);
		System.out.println(shadowClone.equals(shadowClone2));
		/*
		DeepClone deepClone = new DeepClone();
		System.out.println("deepClone1��"+deepClone);
		DeepClone deepClone2 = (DeepClone) deepClone.deepClone();
		System.out.println("deepClone2��"+deepClone2);
		System.out.println(deepClone.equals(deepClone2));*/
	}
}
