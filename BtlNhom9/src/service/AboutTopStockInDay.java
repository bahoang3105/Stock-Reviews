package service;

import sentences.SentencesTopStockInDay;
import comparator.PercentChangeComparator;
import entity.TopStockInDay;
import java.util.List;

public class AboutTopStockInDay {

    //Sinh câu với mã tăng
    public static String upStock(List<TopStockInDay> upList) {
        upList.sort(new PercentChangeComparator());
        SentencesTopStockInDay cr = new SentencesTopStockInDay();
        String strUp;


        if (upList.size() > 0) {
            strUp = ("\nTổng kết lại đây là những mã cổ phiếu mới nổi,còn nhỏ nhưng đã tăng " +
                    "trưởng rất tốt và rất nhiều tiềm năng.");
            strUp = cr.comment(upList) +
                    cr.creatUpSentences(upList.get(0)) + strUp;
        } else {
            strUp = ("Hôm nay thị trường đi xuống, không có mã cổ phiếu nào tăng điểm.");
        }
        return strUp;
    }

    // Sinh câu với mã giảm
    public static String downStock(List<TopStockInDay> downList) {
        downList.sort(new PercentChangeComparator());
        SentencesTopStockInDay cr = new SentencesTopStockInDay();
        String strDown;

        if (downList.size() > 0) {
            strDown = ("\nNói chung đây là các mã không quá lớn nên chưa ảnh hưởng nhiều tới toàn bộ thị trường,\n" +
                    "các nhà đầu xin hãy bình tĩnh cân nhắc đầu tư trong thời điểm này.");
            strDown = cr.comment(downList) +
                      cr.creatDownSentences(downList.get(0)) + strDown;
        } else {
            strDown = ("Hôm nay quả thật là ngày rất vui khi không có mã cổ phiếu nào giảm điểm.");
        }
        return strDown;
    }
}
