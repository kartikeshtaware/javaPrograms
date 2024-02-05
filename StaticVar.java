class StaticVar{
	static String name = "kartikesh";
	int value = 10;
	void varb(){
		name = "taware";
	}
	public static void main(String args[]){
		StaticVar v1 = new StaticVar();
		v1.varb();
		System.out.println(name);
		System.out.println(v1.value);
	}
}