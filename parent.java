class base1{
		
		int a = 8;
	

}

interface base2{
	
		int b =9;
	
}

class parent extends base1 implements base2{
	public static void main(String args[]){
		parent p1 = new parent(); 
		System.out.println(p1.a);
		System.out.println(b);
	}
}