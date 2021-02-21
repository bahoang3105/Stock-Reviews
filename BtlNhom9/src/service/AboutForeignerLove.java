package service;

import java.util.List;
import entity.TopStockForeignersLove;
import sentences.SentencesForeignerLove;

public class AboutForeignerLove{
	
	//sinh bang va cau
    public static String generateSentence(List<TopStockForeignersLove> lst) {
    	SentencesForeignerLove a = new SentencesForeignerLove();
    	String s = a.createSentences(lst);
        return s;
    }   
}
