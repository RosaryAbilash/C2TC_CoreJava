package com.cg.DayNine.String;

public class StringClass {

	public static void main(String[] args) {
		String s = "IFET College Of Engineering";
		System.out.println("CharAT : "+s.charAt(6));
		System.out.println("isEmpty : "+s.isEmpty());
		System.out.println("codePointAt : "+s.codePointAt(7));
		System.out.println("Concat to Villupuram : "+s.concat("Villupuram"));
		System.out.println("hashCode : "+s.hashCode());
		System.out.println("indexOf (College) : "+s.indexOf("College"));
		System.out.println("lastIndexOf(E) : "+s.lastIndexOf("E"));
		System.out.println("Length : "+s.length());
		System.out.println("repeat(2) : "+s.repeat(2));
		System.out.println("Strip : "+s.strip());
		System.out.println("toLowerCase : "+s.toLowerCase());
		System.out.println("toUpperCase : "+s.toUpperCase());
		System.out.println("trim : "+s.trim());
		System.out.println("endsWith(g) : "+s.endsWith("g"));
		System.out.println("replaceAll(E, e) : "+s.replaceAll("E", "e"));
		System.out.println("lines : "+s.lines());
		char[] st = s.toCharArray();
		for(int i = 0; i < s.length(); i++) {
			System.out.println("toCharArray : "+st[i]);
		}
		
	}

}
