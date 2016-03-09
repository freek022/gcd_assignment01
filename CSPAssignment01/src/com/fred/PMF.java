package com.fred;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

// class definition
public final class PMF {
	
	// instance of the factory manager
	private static final PersistenceManagerFactory pmf_instance =
			JDOHelper.getPersistenceManagerFactory("transactions-optional");
	
	// private constructor
	private PMF(){}
	
	// return method for a static instance of the factory manager
	public static PersistenceManagerFactory get(){
		return pmf_instance;
	}
}
