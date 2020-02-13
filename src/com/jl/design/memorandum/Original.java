package com.jl.design.memorandum;

import sun.security.krb5.internal.rcache.MemoryCache;

public class Original {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public Memo createMemo() {
		return new Memo(value);
	}
	
	public void restoreMemo(Memo memo) {
		this.value = memo.getValue();
		
	}
}
