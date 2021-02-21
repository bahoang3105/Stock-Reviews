package service;

import java.util.List;
import entity.GrowthStock;
import sentences.SentencesGrowthStock;

public class AboutGrowthStock {
	
    public static String Generate(List <GrowthStock> list) {
    	
        String generate = "Trong tuần này, " + SentencesGrowthStock.GenerateEvaluationOfMinPrice(list)
        				+ "\n Đối lập lại, " + SentencesGrowthStock.GenerateEvaluationOfMaxPrice(list) 
        				+ "\n Trong khi đó," + SentencesGrowthStock.GenerateEvaluationOfMinTotalVolume(list)
        				+ "\n Ngược lại, " + SentencesGrowthStock.GenerateEvaluationOfMaxTotalVolume(list)
        				+ "\n Tiếp theo, " + SentencesGrowthStock.GenerateEvaluationOfMaxAvgTrage(list)
        				+ "\n Bên phía ngược lại, " + SentencesGrowthStock.GenerateEvaluationOfMinAvgTrage(list)
        				+ "\n Cũng không bất ngờ khi " + SentencesGrowthStock.GenerateEvaluationOfMaxPercentChange(list)
        				+ "\n Bên cạnh đó " + SentencesGrowthStock.GenerateEvaluationOfMinPercentChange(list)
        				+ "\n Cuối cùng, " + SentencesGrowthStock.GenerateEvaluationOfMaxTotalAsset(list)
        				+ "\n Và " + SentencesGrowthStock.GenerateEvaluationOfMinTotalAsset(list);
        return generate;
    }  
}
