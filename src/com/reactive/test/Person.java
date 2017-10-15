package com.reactive.test;

import java.util.Iterator;

import com.reactive.util.ReactiveSource;

public class Person extends ReactiveSource {
	public String name;
	
	Person(String name) {
		super();
		this.name = name;
	}
	
	public String getPersonName() {
		return this.name;
	}
	
	public void setPersonName(String name) {
		this.name = name;
		this.reRunComputations();
	}	
}
