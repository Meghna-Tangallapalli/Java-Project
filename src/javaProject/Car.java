package javaProject;

public class Car extends Engine{
	
	public void drive() {
		
		int engStatus = start();
		
		if(engStatus == 1) {
			System.out.println("journey started");
		}else {
			System.out.println("journey not started");
		}
	}

}
