class college{
	String collegeName = "sggs";
	college(){
		System.out.println("college name = "+this.collegeName);
	}
}

class Techunit extends college{
	String UniName = "main name";
	
	Techunit(){
		System.out.println("uni name = "+this.UniName);
		System.out.println("college name = "+this.collegeName);
	}
	
	public static void main(String args[]){
		Techunit sggs1 = new Techunit();
		System.out.println("college name = "+sggs1.UniName);
	}
}
