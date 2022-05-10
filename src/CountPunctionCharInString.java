//3) Java Program to count the total number of punctuation characters exists in a String//
public class CountPunctionCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int countPuncMarks = 0;  
	        String str = "Good Morning! Mr. Darshan Zore. Had your breakfast?**";  
	        for (int i = 0; i < str.length(); i++) {  
	                //Checks whether given character is punctuation mark  
	            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||        str.charAt(i) == '?' || str.charAt(i) == '-' ||  
	                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':'||str.charAt(i) =='*') {  
	                countPuncMarks++;  
	            }  
	        }  
	        System.out.println("Total number of punctuation characters exists in string: " +        countPuncMarks);  
	    }  
	}  