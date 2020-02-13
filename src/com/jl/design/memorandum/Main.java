package com.jl.design.memorandum;

public class Main {

	public static void main(String[] args) {
		Original original = new Original();
		original.setValue("hello");
		System.out.println("修改前的值："+original.getValue());
		SavaMemo savaMemo = new SavaMemo(original.createMemo());
		original.setValue("good");
		System.out.println("修改后的值："+original.getValue());
		original.restoreMemo(savaMemo.getMemo());
		System.out.println("恢复到修改前的值："+original.getValue());
	}
}
