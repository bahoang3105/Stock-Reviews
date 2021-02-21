package sentences;

import java.util.Collections;
import java.util.List;
import comparator.AvgTradeComparator;
import comparator.PercentChangeMaxComparator;
import comparator.PriceComparator;
import comparator.TotalAssetComparator;
import comparator.TotalVolumeComparator;
import entity.GrowthStock;

public class SentencesGrowthStock {
	
	String[] Paraphasef = {"Nhìn chung: ", "Như vậy: "};
	public static String[] percentchange = {" có giá so với tuần trước bằng ", " có sự thay đổi về giá so với tuần trước là : "," với giá là so với tuần trước bằng "};
	public static String totalvolume = "có khối lượng dao dịch trong tuần là: ";
	public static String[] price = {" với giá: ", " có giá : "," hôm nay có giá giao dịch"}; 
	public static String[] first = {"","Mã ",""};
	public static String[] minprice = {" có giá thấp nhất là ", " là mã có giá thấp nhất trong tuần : "," cán mốc cuối bảng với giá "};
	public static String[] maxprice = {" có giá cao nhất trong tuần là ", "là mã có giá cao nhất trong tuần : "," nằm ở đầu bảng với giá :  ", "đạt mốc đầu bảng với giá "};
	public static String[] maxtotalvolume = {" dù là mã có khối lượng giao dịch nhiều nhất trong hôm nay - "," dù được giao dịch nhiều nhất trong tuần với khối lượng là ", "dù đang rất được quan tâm với khối lượng giao dịch nhiều nhất "};;
	public static String[] aftermaxtotalvolume = {" nhưng giá chỉ tăng :"," nhưng giá chỉ tăng : "," nhưng giá chỉ tăng :"};
	public static String[] mintotalvolume = {" và đang có khối lượng mua bán trong tuần nằm ở vị trí cuối bảng "," đang chững lại với khối lượng giao dịch thấp nhất tuần- ", "nhưng là mã được giao dịch thấp nhất tuần với "};
	public static String[] maxpercentchange = {" có sự thay đổi về giá cao nhất so với tuần trước, tăng: ", " tuần này đã có sự tăng giá nhiều nhất so với các mã còn lại: ", " tăng giá rất mạnh so với tuần qua: " };
	public static String[] minpercentchange = {" giảm giá vô cùng mạnh, so với tuần trước giảm đến: ", " có sự tụt giảm về giá lớn nhất trong tuần: "," đang là mã cố phiếu giảm giá nhiều nhất: "};
	public static String[] maxavgtrade = {" có khối lượng giao dịch trung bình trong một tuần tương đối cao, đứng ở vị trí đầu bảng: "," là mã cổ phiếu có khối lượng giao dịch lớn nhất tuần qua, đạt mức: ", " trong tuần lã mã có khối lượng giao dịch lớn nhất, có số liệu là: "};
	public static String[] minavgtrade = {" có khối lượng giao dịch trung bình trong một tuần tương đối thấp, đứng ở vị trí cuối bảng: "," là mã cổ phiếu có khối lượng giao dịch thấp nhất tuần qua, đạt mức: ", " trong tuần lã mã có khối lượng giao dịch thấp nhất, có số liệu là: "};
	public static String[] maxtotalasset = {" có vốn hóa lớn nhất: ", " với vốn hóa vô cùng lớn, đứng đầu bảng : ", " với số vốn hóa nằm ở đầu bảng "};
	public static String[] mintotalasset= {" có vốn hóa nhỏ nhất: "," có vốn hóa đứng cuối bảng, chỉ "," có vốn hóa nằm ở vị trí dưới cùng trong bảng: ",};
	
	//1
	public static String GenerateEvaluationOfMinPrice(List<GrowthStock> list) {
		
    	String Sentence = "";
        Collections.sort(list, new PriceComparator());
        int Nums= (int)(Math.random()*10)%3;
        int Numt= (int)(Math.random()*10)%3;
       	Sentence = first[Nums] + list.get(0).getName() + " " + minprice[Numt] + list.get(0).getPrice() 
       			   + percentchange[Nums] + " "+ list.get(0).getPercentChange() + "%";
        return Sentence;	
    }
    //2	
    public static String GenerateEvaluationOfMaxPrice(List<GrowthStock> list) {
        	
    	String Sentence = "";
        Collections.sort(list, new PriceComparator());
        int Nums= (int)(Math.random()*10)%3;
        int Numt= (int)(Math.random()*10)%3;
       	Sentence = first[Nums] + list.get(list.size()-1).getName() + " " + percentchange[Nums]
       			+ list.get(list.size()-1).getPercentChange() + "%, " + maxprice[Numt] + list.get(list.size()-1).getPrice();
        return Sentence; 	
    } 
    //3    
    public static String GenerateEvaluationOfMinTotalVolume(List<GrowthStock> list) {
        	
        String Sentence = "";
        Collections.sort(list, new TotalVolumeComparator());
        int Nums = (int)(Math.random()*10)%3;
        int Numt = (int)(Math.random()*10)%3;
        int Numf = (int)(Math.random()*10)%3;
        Sentence = first[Nums]+list.get(0).getName() + percentchange[Numf] + list.get(0).getPercentChange() + "%"
        		   + mintotalvolume[Numt] + list.get(0).getTotalVolume();
        return Sentence; 
    }
    //4
    public static String GenerateEvaluationOfMaxTotalVolume(List<GrowthStock> list) {
        	
        String Sentence ="";
        Collections.sort(list, new TotalVolumeComparator());
        int Nums = (int)(Math.random()*10)%3;
        int Numt = (int)(Math.random()*10)%3;
        int Numf = (int)(Math.random()*10)%3;
        Sentence = first[Nums] + list.get(list.size()-1).getName() + maxtotalvolume[Numt] + list.get(list.size()-1).getTotalVolume()
        		   + percentchange[Numf] + list.get(list.size()-1).getPercentChange() + "%";
        return Sentence;  
    }
    //5
    public static String GenerateEvaluationOfMaxPercentChange(List<GrowthStock>list) {
        	
        String Sentence = "";
        Collections.sort(list, new PercentChangeMaxComparator());
        int Nums = (int)(Math.random()*10)%3;
        int Numt = (int)(Math.random()*10)%3;
        int Numf = (int)(Math.random()*10)%3;
        Sentence = "1" + first[Nums] + list.get(list.size()-1).getName() + price[Numf]+ list.get(list.size()-1).getPrice()
        		   + maxpercentchange[Numt] + list.get(list.size()-1).getPercentChangeMax() + "% và " + totalvolume +
        		     list.get(list.size()-1).getTotalVolume();
        return Sentence;
    }
    //6
    public static String GenerateEvaluationOfMinPercentChange(List<GrowthStock>list) {
        	
        String Sentence = "";
        Collections.sort(list, new PercentChangeMaxComparator());
        int Nums = (int)(Math.random()*10)%3;
        int Numt = (int)(Math.random()*10)%3;
        Sentence = first[Nums] + list.get(0).getName() + minpercentchange[Numt] + list.get(0).getPercentChangeMax() + "%";
        return Sentence;
    }
        
    public static String GenerateEvaluationOfMaxAvgTrage(List<GrowthStock>list) {
        	
        String Sentence = "";
        Collections.sort(list, new AvgTradeComparator());
        int Nums = (int)(Math.random()*10)%3;
        int Numt = (int)(Math.random()*10)%3;
        Sentence = first[Nums] + list.get(list.size()-1).getName() + maxavgtrade[Numt] + list.get(list.size()-1).getAvgTrade();
        return Sentence;
        }
        
    public static String GenerateEvaluationOfMinAvgTrage(List<GrowthStock>list) {
        	
        String Sentence = "";
        Collections.sort(list, new AvgTradeComparator());
        int Nums = (int)(Math.random()*10)%3;
        int Numt = (int)(Math.random()*10)%3;
        int Numf = (int)(Math.random()*10)%3;
        Sentence = first[Nums] + list.get(0).getName() + minavgtrade[Numt] + list.get(0).getAvgTrade() + price[Numf]
        		   + list.get(0).getPrice() + " và " + totalvolume + list.get(0).getTotalVolume();
        return Sentence;
    }
        
    public static String GenerateEvaluationOfMaxTotalAsset (List<GrowthStock>list) {
        	
        String Sentence = "";
        Collections.sort(list, new TotalAssetComparator());
        int Nums = (int)(Math.random()*10)%3;
        int Numt = (int)(Math.random()*10)%3;
        int Numf = (int)(Math.random()*10)%3;
        Sentence = first[Nums] + list.get(list.size()-1).getName() + maxtotalasset[Numt]
        		   + list.get(list.size()-1).getTotalAsset() + percentchange[Numf] + list.get(list.size()-1).getPercentChange() + "%" ;
        return Sentence;
    }
        
    public static String GenerateEvaluationOfMinTotalAsset (List<GrowthStock>list) {
        	
        String Sentence = "";
        Collections.sort(list, new TotalAssetComparator());
        int Nums = (int)(Math.random()*10)%3;
        int Numt = (int)(Math.random()*10)%3;
        int Numf = (int)(Math.random()*10)%3;
        Sentence = first[Nums] + list.get(0).getName() + percentchange[Numf] + list.get(0).getPercentChange() + "%" 
                   + mintotalasset[Numt] + list.get(0).getAvgTrade();
        return Sentence;
    }
}
