package com.company;

interface Test {
	void show();
}

public class Main {

    public static void main(String[] args) {

		DefaultMethod demoDefaultMethod = new DefaultMethod();
		demoDefaultMethod.showDefaultMethod();
		demoDefaultMethod.showOverridedMethod();

		/** anonymous class implments interface */
		Test anonymousClassInstance = new Test() {
			@Override
			public void show() {
				System.out.println("Here is working of anonymous class with interface");
			}
		};
		anonymousClassInstance.show();
    }
}
