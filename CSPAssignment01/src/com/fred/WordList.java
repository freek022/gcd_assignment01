package com.fred;

import java.util.ArrayList;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class WordList {
	@PrimaryKey
	@Persistent
	private Key id;
	@Persistent
	private ArrayList<String> strings;
	
	// constructor
	public WordList(Key id, ArrayList<String> strings){
		this.id = id;
		this.strings = strings;
	}
	
	// getter and setter for Key id
	public Key getId() { return id;	}
	public void setId(Key id) { this.id = id;}
	
	// getter and setter for strings list
	public ArrayList<String> getStrings() { return strings;	}
	public void setStrings(ArrayList<String> strings) {
		this.strings = strings;
	}	

}
