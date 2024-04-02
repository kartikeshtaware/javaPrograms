//count number using log

import java.util.*;

class Count{
	static public void main(String args[]){
		//System.out.println("Enter numbers");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = (int)(Math.log10(n)+1);
		System.out.println(cnt);
	}
}