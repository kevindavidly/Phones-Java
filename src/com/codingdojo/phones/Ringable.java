package com.codingdojo.phones;

public interface Ringable {
	
    public default String ring() {
    	return "Ring a ding!";
    }
    public default String unlock() {
    	return "Phone unlocked";
    }
}
