package com.cg.DaySix;

public class Final {
	final int num = 25;
	final void msg() {
		System.out.println("I'm in the Final Method...");
	}
	public static void main(String[] args) {
		Final f = new Final();
		System.out.println(f.num);
		f.msg();
	}

}
