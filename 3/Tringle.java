class Tringle{
	
	double area;
	int height;
	int length;
	
	public static void main(String[] args){
		
		Tringle[] ta = new Tringle[4];
		int x = 0;
		
		while(x<4){
			ta[x]=new Tringle();
			ta[x].height = (x+1)*2;
			ta[x].length = x+4;
			ta[x].setArea();
			System.out.print("treugolnik "+x+", zona");
			System.out.println(" = "+ta[x].area);
			x=x+1;
		}
		
		int y = x;
		x=27;
		Tringle t5 = ta[2];
		ta[2].area = 343;
		System.out.print("y = "+y);
		System.out.println(", zona t5 = "+t5.area);
	}
	
	void setArea(){
		area = (height*length)/2;
	}
}