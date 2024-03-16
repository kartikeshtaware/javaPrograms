class parent{
	static String str1 = "parent";
	
	parent(){
		System.out.println("parant cunstructor = "+this.str1);

	}
}
class child extends parent{
	static String str1 = "child";
	
	child(){
		System.out.println("child cunstructor = "+this.str1);
		System.out.println("parant cunstructor = "+parent.str1);
	}
	
	static public void main(String args[]){
		//parent p1 = new parent();
		child c1 = new child();
		System.out.println("parent cunstructor = "+parent.str1);
		System.out.println("child cunstructor = "+child.str1);
	}
}
