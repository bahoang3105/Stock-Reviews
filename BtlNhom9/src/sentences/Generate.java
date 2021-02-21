package sentences;

import entity.Index;

import java.util.Random;

public class Generate {

    public static String getRandomForm(String[] sentenceForm) {
        Random rd = new Random();
        int form = rd.nextInt(sentenceForm.length);
        return sentenceForm[form];
    }

    public static String insertData(String sample, Index index) {

        sample = sample.replace("[name]" , index.getName());
        sample = sample.replace("[change]", Double.toString(Math.abs(index.getChangePrice())) );
        sample = sample.replace("[percentChange]", Double.toString(Math.abs(index.getPercentChange())) );
        sample = sample.replace("[point]", Double.toString(index.getClosingPrice()) );
        sample = sample.replace("[closingPrice]", Double.toString(index.getOpeningPrice()) );
        sample = sample.replace("[totalVolume]",Long.toString(index.getTotalVolume()/1000000) );
        sample = sample.replace("[totalMarket]", Long.toString(index.getTotalMarket()/1000) );

        return sample;
    }
}