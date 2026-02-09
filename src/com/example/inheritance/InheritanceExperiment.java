package com.example.inheritance;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class InheritanceExperiment {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Dog();
		Animal a3 = new Cat();
		
		Dog d1 = (Dog) a1; //compile 
		Dog d2 = (Dog) a2; //fine
		Dog d3 = (Dog) a3;// complie time eror

	}
}