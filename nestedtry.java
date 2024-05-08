class nestedtry {
  public static void main(String args[])
  {
  	try{
  		
  		String str = "kartikesh";
  		
  		System.out.println(str.length()); 
  		
		try{
			int a = 30/0;
		}	
		catch(ArithmeticException e){
			System.out.println("divide by zero error");
		}
		
		try{
			int b[] = {1,2,3};
			int c = b[7];
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("index out of bound");
		}
	}
	catch(Exception e){
		System.out.println("exception occured");
	}
  }
	

}
