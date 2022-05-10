///// 1) Java Program to count the total number of characters in a string ////


public class CountTotalNumberofCharinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Darshan Zore";
		int count=0;
		 
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) !=' ') {
				count++;
			}
		}
System.out.println("Count Total NUmbers of Charcters  = "    +count);
	}

}
