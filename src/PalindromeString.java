///13) Java Program to determine whether a given string is palindrome
public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string = "kayak";    
        boolean flag = true;    
            
        //Converts the given string into lowercase    
        string = string.toLowerCase();    
            
        //Iterate the string forward and backward, compare one character at a time     
        //till middle of the string is reached    
        for(int i = 0; i < string.length()/2; i++){    
            if(string.charAt(i) != string.charAt(string.length()-i-1)){    
                flag = false;    
                break;    
            }    
        }    
        if(flag)    
            System.out.println("Given string is palindrome");    
        else    
            System.out.println("Given string is not a palindrome");    
    }    
}    
/*STEP 1: START
STEP 2: DEFINE String string = "Kayak"
STEP 3: SET flag = true
STEP 4: CONVERT string into lowercase.
STEP 5: SET i =0. REPEAT STEP 6 to STEP 7 UNTIL i
STEP 6: IF (string.charAt(i) != string.charAt(string.length()-i-1))
              then
              SET flag = false
              break
STEP 7: SET i = i + 1
STEP 8: IF flag
              then PRINT "Yes"
              else
              PRINT "No"
STEP 9: END*/