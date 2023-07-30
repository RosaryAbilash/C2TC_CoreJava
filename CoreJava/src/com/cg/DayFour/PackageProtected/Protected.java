package com.cg.DayFour.PackageProtected;

public class Protected {
	
	
	protected int protectedData = 245;  
	
	protected void protectedMessage(){
		System.out.println("I'm in the Message Visible to Protected Access Specifier...");
		} 
	
	public static void main(String[] args) {
		Protected p = new Protected();
		System.out.println(p.protectedData);
		p.protectedMessage();
}
}