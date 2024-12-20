package practice_assignments;

public class StringAssignment {

	public static void main(String[] args) {
		
				String a = "Hi all";
				String b = "CoreJava";
				String c = "Selenium is web-based Automation Tool.";
				/*
				i.find the length of both the Strings
				ii. find the 5th charecter based on index from b string
				iii. check both the Strings are equals or not?
				iv. convert a string to uppercase and b String to lowercase
				v. String c = "Selenium is web-based Automation Tool.";
				   1) Verify Automation word is displayed or not?
				   2) Check Selenium word is contains  or not?
				   3) Print only web word from the above String.*/
				
				
				System.out.println( "length of String a is:" + a.length() );
				System.out.println("                                                          ");
				System.out.println("5th indexed character of String b is:" + b.charAt(5) );
				System.out.println("                                                          ");
				if (a.equals(b)) {
					System.out.println("Both Strings are equal");
					
				} else {
					System.out.println("Strings are not equal");

				}
				System.out.println("                                                          ");
				System.out.println("String a in Uppercase: " + a.toUpperCase());
				System.out.println("                                                          ");
				System.out.println("String b in Lowercase: " + b.toLowerCase());
				
	}

}
