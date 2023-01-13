package programs;

public class stringmethods {
	
	public static void main(String[]args) {
	
	String name ="ZEAL EDUCATION";
	System.out.println(name);
	
	int value = name.length();
	System.out.println(value);
	
	String Lcase =name.toLowerCase();
	System.out.println(Lcase);
	
	String Ucase=name.toUpperCase();
	System.out.println(Ucase);
	
	String Strim =name.trim();
	System.out.println(Strim);
	
	System.out.println(name.substring(4));
	
	System.out.println(name.substring(1,10));
	
	System.out.println(name.replace('A','B'));
	
	System.out.println(name.replace("ZEAL","Akp"));
	
	System.out.println(name.startsWith("ZE"));
	
	System.out.println(name.endsWith("ON"));
	
	System.out.println(name.charAt(2));
	
	System.out.println(name.indexOf("ED"));
	
	System.out.println(name.indexOf("AL",3));
	
	System.out.println(name.lastIndexOf("A"));
	
	System.out.println(name.lastIndexOf("AL", 4));
	
	System.out.println(name.equals("zeal"));
	

	}
}
