
package service;

import java.util.List;
import entity.Index;

import static sentences.SentencesIndex.*;

public class AboutIndex {
    
	public static StringBuilder generateSentence(List<Index> indexList) {
        StringBuilder paragraph = new StringBuilder();

        paragraph.append(moCuaGiaoDich(indexList));
        paragraph.append("\n" + chotPhienGiaoDich(indexList.get(0)));
        paragraph.append("\n" + soVoiPhienTruoc(indexList));
        paragraph.append("\n" + khoiLuongGiaoDich(indexList.get(0)));
        paragraph.append("\n" + doThiCayNen(indexList.get(0)));
        paragraph.append("\n" + lienTiep(indexList));

        return paragraph;
    }

}
