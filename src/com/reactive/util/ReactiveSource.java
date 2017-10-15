package com.reactive.util;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ReactiveSource {
	
	protected Set<Runnable> computations;
	
	public ReactiveSource() {
		this.computations = new LinkedHashSet<>();
	}
	
	public boolean addComputation(Runnable computation) {
		return computations.add(computation);
	}
	
	protected void reRunComputations() {
		// TODO Auto-generated method stub
		Iterator<Runnable> itr = this.computations.iterator();
		while(itr.hasNext()){
			itr.next().run();
		}
	}
}
