package com.cg.DayFour.PackageProtected;

public class Test extends Protected{

	public static void main(String[] args) {
		Protected p = new Protected();
		System.out.println(p.protectedData);
		p.protectedMessage();
	}

}
