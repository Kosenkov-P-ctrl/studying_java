class DrumKit{
	boolean topHat = true;
	boolean snare = true;

	void playSnare(){
		System.out.println("��� ��� ��-���");	

	}
	void playTopHat(){
		System.out.println("���� ���� ��-����");

	}	
}
class DrumKitTestDrive{
	public static void main(String []args){
		DrumKit d = new DrumKit();
		d.playSnare();
		d.playTopHat();

	}

}
