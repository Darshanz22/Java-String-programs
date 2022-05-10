
public class CountNumberofCharIn2Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String String = "MindFlur, Darshan ";
		int count=0;
		  for(int i=0; i<String.length(); i++) {
			  if(String.charAt(i)!=' ') {
				  count++;
				  
				  
			  }
		  }
System.out.println("Count the total no of char =" +count);

	}

}
