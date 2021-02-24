class Test{
	{
		System.out.println("2");
	}
}
class Tst{
	public static void main(String[] args){
		Test t = new Test();
	}
	static{
		System.out.println("5");
	}
}