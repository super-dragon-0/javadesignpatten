package com.jl.design.observer.main;

import com.jl.design.observer.service.Observer;
import com.jl.design.observer.service.Subject;
import com.jl.design.observer.service.impl.ObserverImpl1;
import com.jl.design.observer.service.impl.ObserverImpl2;
import com.jl.design.observer.service.impl.RealizeSubject;

public class Main {
	public static void main(String[] args) {
		Observer observer1 = new ObserverImpl1();
		Observer observer2 = new ObserverImpl2();
		Subject subject = new RealizeSubject();
		subject.add(observer1);
		subject.add(observer2);
		subject.operation();
		subject.del(observer2);
		subject.operation();
	}
}
