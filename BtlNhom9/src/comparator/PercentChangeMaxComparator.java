package comparator;

import java.util.Comparator;

import entity.GrowthStock;

public class PercentChangeMaxComparator implements Comparator<GrowthStock> {

	// sắp xếp theo PercentChangeMax
	@Override
	public int compare(GrowthStock o1, GrowthStock o2) 
	{
		if(o1.getPercentChangeMax()<o2.getPercentChangeMax()) return -1;
		if(o1.getPercentChangeMax()==o2.getPercentChangeMax()) return 0;
		return 1;		
	}
}
