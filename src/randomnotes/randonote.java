package randomnotes;

public class randonote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//showing what the .length is
		String randomWord = "inconsequential";
		if (randomWord.length()>10){
	        System.out.println("That is a really long word!");
	    }else{
	        System.out.println("Your word is not that long.");
	    }
		
		//example of .toUpperCase
		String str = "hello, world!";
		String upperStr = str.toUpperCase();
		System.out.println(upperStr); // Output: "HELLO, WORLD!"
		
		//example of .toLowerCase
		String stri = "HELLO, WORLD!";
		String lowerStr = stri.toLowerCase();
		System.out.println(lowerStr); // Output: "hello, world!"
	
	
	
	
	
	}

}
