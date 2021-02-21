package comparator;

import java.util.Comparator;

import entity.GrowthStock;

public class TotalVolumeComparator implements Comparator<GrowthStock> {

	// sắp xếp theo TotalVolume
	@Override
	public int compare(GrowthStock o1, GrowthStock o2) 
	{
		if(o1.getTotalVolume()<o2.getTotalVolume()) return -1;
		if(o1.getTotalVolume()==o2.getTotalVolume()) return 0;
		return 1;
	}
}
