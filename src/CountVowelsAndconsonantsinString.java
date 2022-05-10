//4) Java Program to count the total number of vowels and consonants in a string
public class CountVowelsAndconsonantsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Today we will learn a simple java";
		int Vcount=0 , Ccount=0;
	      str=str.toLowerCase();
	      for(int i=0; i<str.length(); i++) {
	    	
	    	//Check  vowels
	    	  if(str.charAt(i)=='a'|| str.charAt(i)=='e' || str.charAt(i)=='i' ||str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='y' || str.charAt(i)=='w') {
	    		  Vcount++;
	    	  }
	    	  //Check Consonants
	    	  else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
	    		Ccount++;  
	    	  }
	      }
	      
	      System.out.println("The Total Number of Vowel =" +Vcount);
	      System.out.println("The Total Number of Consonants =" +Ccount);
	      
	      
	      
	      }

}
