package com.cg.DayFour.PackagePrivate;

public class Private {

	private int privateData = 245;  
	
	private void privateMessage(){
		System.out.println("I'm in the Message Visible to Private Access Specifier...");
		} 
	
	public static void main(String[] args) {
		Private p = new Private();
		System.out.println(p.privateData);
		p.privateMessage();
	}

}
