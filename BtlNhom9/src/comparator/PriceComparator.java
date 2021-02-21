package comparator;

import java.util.Comparator;

import entity.GrowthStock;

public class PriceComparator implements Comparator<GrowthStock> {

	// sắp xếp theo Price
	@Override
	public int compare(GrowthStock o1, GrowthStock o2) 
	{
		if(o1.getPrice()<o2.getPrice()) return -1;
		if(o1.getPrice()==o2.getPrice()) return 0;
		return 1;
	} 
}
