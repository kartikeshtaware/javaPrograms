/*
Sum the lengths A of  and B.
Determine if  A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
Capitalize the first letter in A and B and print them on a single line, separated by a space.

*/
import java.util.*;

class sumStr{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		String A = str1.toLowerCase();
		String B = str2.toLowerCase();
		
		System.out.println(A.length() + B.length());
		
		if(A.codePointAt(0)>B.codePointAt(0)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		
		String Aup = A.substring(0,1).toUpperCase()+A.substring(1);
		String Bup = B.substring(0,1).toUpperCase()+B.substring(1);
		System.out.println(Aup+" "+Bup);
		
		
		
		
		
		
		
		
	}


}