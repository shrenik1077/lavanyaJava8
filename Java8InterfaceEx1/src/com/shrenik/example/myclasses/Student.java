package com.shrenik.example.myclasses;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	
	
	public Student() {}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student another) {
		return this.name.compareTo(another.name);
	}
	
	// John Smith  Peter
	
	
	// 1       match found greater
	// -1      match found less
	// 0       match found equal


}
