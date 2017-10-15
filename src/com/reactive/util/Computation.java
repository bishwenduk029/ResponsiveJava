package com.reactive.util;
import java.util.Objects;

public class Computation {
	
	Runnable computation;
	
	public Computation(Runnable r) {
		this.computation = r;
		this.computation.run();
	}
	
	public boolean dependsOn(ReactiveSource s) {
		Objects.requireNonNull(s);
		return s.addComputation(this.computation);
	}
}
