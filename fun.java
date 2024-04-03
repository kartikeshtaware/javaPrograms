class fun{
	public static void main(String ...args){
		try{
			int a = 30/0;
			
			System.out.println(a);
		
		}
		catch(Exception e ){
			System.out.println("Divide by zero error");
		}
		
		
		try{
		
			Thread.sleep(1000);
			System.out.println("inside 1");
			Thread.sleep(1000);
			System.out.println("inside 2");
			Thread.sleep(1000);
			System.out.println(args[0]);
			System.out.println("inside 3");
		}
		catch(Exception e){
			System.out.println("array index out of bound");
		}
		
		finally{
			System.out.println("finally block");
		}

		
	}

}
