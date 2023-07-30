package com.cg.DayFour.TestPackage;

import com.cg.DayFour.PackageProtected.Protected;

public class ProtectedTest extends Protected{

	public static void main(String[] args) {
		Protected p = new Protected();
		System.out.println(p.protectedData);
		p.protectedMessage();
	}

}
