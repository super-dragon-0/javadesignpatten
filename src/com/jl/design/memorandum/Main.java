package com.jl.design.memorandum;

public class Main {

	public static void main(String[] args) {
		Original original = new Original();
		original.setValue("hello");
		System.out.println("�޸�ǰ��ֵ��"+original.getValue());
		SavaMemo savaMemo = new SavaMemo(original.createMemo());
		original.setValue("good");
		System.out.println("�޸ĺ��ֵ��"+original.getValue());
		original.restoreMemo(savaMemo.getMemo());
		System.out.println("�ָ����޸�ǰ��ֵ��"+original.getValue());
	}
}
