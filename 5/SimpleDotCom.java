import java.util.ArrayList;
public class SimpleDotCom{
	private ArrayList<String> locationCells;
	
	
	public void setLocationCells(ArrayList<String> loc){
		locationCells = loc;
	}
	
	public String checkYourSelf(String stringGuess){
		
		String result = "Mimo";
		int index = locationCells.indexOf(stringGuess);
		if(index>=0)
		{
			locationCells.remove(index);
			if(locationCells.isEmpty())
			{
				result = "Potopil";
			}else
			{
				result = "Popal";
			}
		}
		return result;
	}
}