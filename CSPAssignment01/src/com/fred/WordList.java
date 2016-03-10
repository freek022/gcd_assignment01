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
	public Key getId() {
		return id;
	}
	public void setId(Key id) {
		this.id = id;
	}
	public ArrayList<String> getStrings() {
		return strings;
	}
	public void setStrings(ArrayList<String> strings) {
		this.strings = strings;
	}
	@Persistent
	private ArrayList<String> strings;
	

}
