package sk.stuba.fiit.zoop.string;

public class StringExample {
	
	public static void main(String[] args) {
		
		String str = new String("The String");
		StringBuffer strBuf = new StringBuffer("The String Buffer"); 
		
		str = "New Value";
		str = "The Newest Value";
		
		System.out.println(str);
		System.out.println(strBuf);
	}
}
