package LabDay;

public class Stringss {

	public static void main(String[] args) {
		
		String str = new String("Welcome to java world ");
		String str2= new String("welcome");
		
		System.out.println(str.compareToIgnoreCase(str2));
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.concat(" Who is Switch_X"));
		
		System.out.println(str.indexOf("a"));
		
		System.out.println(str.replaceAll("a","x"));
		
		System.out.println(str.substring(3, 12));
		
		System.out.println(str.toLowerCase());
		
	}

}
