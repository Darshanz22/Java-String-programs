//10) Java Program to remove all the white spaces from a string

public class removeallthewhitespacesfromastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str = "India     Is My    Country";  
	        //1st way  
	        String noSpaceStr = str.replaceAll("\\s", ""); // using built in method  
	        System.out.println(noSpaceStr);  
	       
	        
	     //// / ////////////////////////////////////////////////////////////////////////////////////////////////////// 
	        
	        //2nd way  
	        char[] strArray = str.toCharArray();  
	        StringBuffer stringBuffer = new StringBuffer();  
	        for (int i = 0; i < strArray.length; i++) {  
	            if ((strArray[i] != ' ') && (strArray[i] != '\t')) {  
	                stringBuffer.append(strArray[i]);  
	            }  
	        }  
	        String noSpaceStr2 = stringBuffer.toString();  
	        System.out.println(noSpaceStr2);  
	    }  
	}  

	