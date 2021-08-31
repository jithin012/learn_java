package com.company;

interface Demo {
	void showOverridedMethod();

	default void showDefaultMethod() {
		System.out
				.println("I am default method declared on interface. I will work even if you are not @Override it!!!");
	}
}

public class DefaultMethod implements Demo {

	@Override
	public void showOverridedMethod() {
		System.out.println("I want to override xyz here, cause of not a default method!!!");
	}

}
