package com.reactive.test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.reactive.util.Computation;

public class Hack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person bashu = new Person("Bashu");
		Computation c1 = new Computation(() -> {System.out.println(bashu.getPersonName());});
		c1.dependsOn(bashu);
		Computation c2 = new Computation(() -> {System.out.println(bashu.getPersonName().toUpperCase());});
		c2.dependsOn(bashu);
		bashu.setPersonName("Bishwendu");
	}
}
