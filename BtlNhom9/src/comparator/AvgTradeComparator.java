package comparator;

import java.util.Comparator;

import entity.GrowthStock;

public class AvgTradeComparator implements Comparator<GrowthStock> {
	
	// sắp xếp theo AvgTrade
	@Override
	public int compare(GrowthStock o1, GrowthStock o2) 
	{
		if(o1.getAvgTrade()<o2.getAvgTrade()) return -1;
		if(o1.getAvgTrade()==o2.getAvgTrade()) return 0;
		return 1;
	}
	
}
