package com.te.autoincrement;

public class SequenceGenerator {
	private static int count=1;
	private static final String PREFIX="TY";
	
	public static String getNextId() {
		String numericPart=String.format("%03d", count++);
		return PREFIX+numericPart;
	}
	
	public static void main(String[] args) {
		String nextId = getNextId();
		System.out.println(nextId);
	}
}
