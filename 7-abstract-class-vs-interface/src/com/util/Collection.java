package com.util;

public interface Collection {

	void add(String e);

	void clear();

	// java 1.8
	public default void forEach() {
		// ..
	}

}
