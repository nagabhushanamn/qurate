package com;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author nag-training
 *
 */

class Super {
	public void abc() {

	}
}

class Sub extends Super {

	@Override
	public void abc() {
		//
	}

}

class Lib {

	@Deprecated
	public void methodV1() {

	}

	public void methodV2() {

	}
}

public class Ex {

	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		List list = new ArrayList();

		Lib lib = new Lib();
		lib.methodV1();

	}

}
