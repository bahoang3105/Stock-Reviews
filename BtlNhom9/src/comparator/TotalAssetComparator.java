package comparator;

import java.util.Comparator;

import entity.GrowthStock;

public class TotalAssetComparator implements Comparator<GrowthStock>
{

	// sắp xếp theo TotalAsset
	@Override
	public int compare(GrowthStock o1, GrowthStock o2) 
	{
		if(o1.getTotalAsset()<o2.getTotalAsset()) return -1;
		if(o1.getTotalAsset()==o2.getTotalAsset()) return 0;
		return 1;
	}

}