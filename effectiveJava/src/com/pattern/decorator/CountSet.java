package com.pattern.decorator;

import java.util.Collection;

public class CountSet<E> extends SetFuture<E> {
	
	private int setSize = 0;

	@Override
	public boolean add(Object e) {
		setSize++;
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection c) {
		return super.addAll(c);
	}
	
	

}
