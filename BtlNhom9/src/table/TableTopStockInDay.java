package table;

import entity.TopStockInDay;
import javax.swing.*;
import java.util.List;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TableTopStockInDay extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTable jt;

    public TableTopStockInDay (List<TopStockInDay> topInDayList, String s) {

        String[] column = {"Mã CK", "Giá mở cửa", "Giá đóng cửa", " Giá tham chiếu", "% thay đổi", "KLGD khớp lệnh"};
        String[][] content = new String[5][6];
        for(int i=0; i<5; i++) {
        	content[i][0] = topInDayList.get(i).getName();
            content[i][1] = String.valueOf(topInDayList.get(i).getOpenPrice());
            content[i][2] = String.valueOf(topInDayList.get(i).getClosePrice());
            content[i][3] = String.valueOf(topInDayList.get(i).getReferencePrice());
            content[i][4] = String.valueOf(topInDayList.get(i).getPercentChange());
            if (topInDayList.get(i).getTotalVolume() == 0) content[i][5] = "0";
            else content[i][5] = String.valueOf(topInDayList.get(i).getTotalVolume())+"000000";
        }
        getContentPane().setLayout(null);
        jt = new JTable(content, column);
        jt.setEnabled(false);
        JScrollPane js = new JScrollPane(jt);
        js.setEnabled(false);
        js.setBounds(12, 13, 628, 111);
        getContentPane().add(js);
        
        JButton btnNewButton = new JButton("Đóng");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		setVisible(false);
        	}
        });
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton.setBounds(275, 151, 97, 25);
        getContentPane().add(btnNewButton);
        setVisible(true);
        
        if (s == "Up") setTitle("Bảng chỉ số top 5 cổ phiếu tăng trưởng nhanh nhất trong ngày");
        else setTitle("Bảng chỉ số top 5 cổ phiếu suy thoái mạnh nhất trong ngày");
        
        setSize(670, 248);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
