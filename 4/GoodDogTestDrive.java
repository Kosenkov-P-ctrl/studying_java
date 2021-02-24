class GoodDog{
	private int size;
	
	public int getSize(){
		return size;
	}
	
	public void setSize(int s){
		size=s;
	}
	
	void bark(){
		if(size>60){
			System.out.println("Gav Gav!");
		}
		else if(size>14){
			System.out.println("Vuf vuf!");
		}
		else{
			System.out.println("Tyaf tyaf!");
		}
	}
}
class GoodDogTestDrive{
	public static void main(String[] args){
		
		GoodDog one = new GoodDog();
		one.setSize(70);
		
		GoodDog two = new GoodDog();
		two.setSize(8);
		
		System.out.println("Pervaya sobaka: "+one.getSize());
		System.out.println("Vtoraya sobaka: "+two.getSize());
		one.bark();
		two.bark();
	}
}