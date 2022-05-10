//9) Java Program to find all the permutations of a string
public class PermutingString {
	// Function for swaping the charcters at position i with charcter at position j 
	public static String swapString(String a,int i, int j) 
	{ char[]b = a.toCharArray();
	char ch;
	ch = b[i];
	b[i] = b[j];
	b[j] = ch;
		return String.valueOf(b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="ABC";
		int len = str.length();
		System.out.println("All the Permutations of the String are:");
		generatePermutation(str,0,len);
		
	}
//Function for generating different permutations of the string
	private static void generatePermutation(String str, int start, int end) {
	
		// TODO Auto-generated method stub
		//print the permutations
		 if(start == end-1)
			 System.out.println(str);
		 else 
		 {
			 for(int i = start; i<end; i++)
			 {
				 //Swaping  the string by fixing charcter
				 str = swapString(str,start , i);
				 // Recursivesly calling function generate pernutation
				  generatePermutation(str,start+1,end);
				   // BAcktrackibng and swaping the charcters again.
				   str= swapString(str,start,i)
;			 }
				
		 }
		
		
	}

}
