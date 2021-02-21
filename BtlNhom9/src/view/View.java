package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import crawldata.*;
import entity.*;
import service.*;
import table.TableForeignerLove;
import table.TableGrowthStock;
import table.TableIndex;
import table.TableTopStockInDay;

import java.awt.Font;

public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public View() {
		
		setTitle("BTL - Nhóm 9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 881, 760);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 367, 766, 333);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JLabel lblNewLabel = new JLabel("BÀI TẬP LỚN OOPS - 20192");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(275, 13, 342, 68);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tổng quan thị trường");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(50, 100, 173, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("NĐT nước ngoài quan tâm");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setBounds(50, 170, 173, 16);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Biến động mạnh trong ngày");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setBounds(50, 240, 173, 16);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Cổ phiếu hot");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3.setBounds(50, 310, 173, 16);
		contentPane.add(lblNewLabel_1_3);
		
		JButton btnIndex = new JButton("VNI_HNX_Upcom");
		btnIndex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<Index> indexList = GetIndex.crawlData();
				String str = AboutIndex.generateSentence(indexList).toString();
				new TableIndex(indexList);
				textArea.setText(str);
			}
		});
		btnIndex.setBounds(371, 96, 152, 25);
		contentPane.add(btnIndex);
		
		JButton btnTop = new JButton("Top 5");
		btnTop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<TopStockForeignersLove> foreignerList = GetTopStockForeignersLove.crawlData();
				String str = AboutForeignerLove.generateSentence(foreignerList);;
	            textArea.setText(str);
	            new TableForeignerLove(foreignerList);
			}
		});
		btnTop.setBounds(403, 166, 97, 25);
		contentPane.add(btnTop);
		
		JButton btnChangeMax = new JButton("Tăng mạnh");
		btnChangeMax.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<TopStockInDay> upStockList = GetTopStockInDay.crawlData("Up");
				String str = AboutTopStockInDay.upStock(upStockList);
	            textArea.setText(str);
	            new TableTopStockInDay(upStockList, "Up");
			}
		});
		btnChangeMax.setBounds(275, 236, 115, 25);
		contentPane.add(btnChangeMax);
		
		JButton btnChangeMin = new JButton("Giảm mạnh");
		btnChangeMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<TopStockInDay> downStockList = GetTopStockInDay.crawlData("Down");
				String str = AboutTopStockInDay.downStock(downStockList);
	            textArea.setText(str);
	            new TableTopStockInDay(downStockList, "Down");
			}
		});
		btnChangeMin.setBounds(509, 236, 108, 25);
		contentPane.add(btnChangeMin);
		
		JButton btnHot = new JButton("Trong tuần");
		btnHot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Vui lòng đợi......\nNếu chương trình không sinh câu vui lòng thử lại.");
				List<GrowthStock> growthList = GetGrowthStock.crawlData();
				String str = AboutGrowthStock.Generate(growthList);
	            textArea.setText(str);
	            new TableGrowthStock(growthList);
			}
		});
		btnHot.setBounds(403, 306, 97, 25);
		contentPane.add(btnHot);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(50, 79, 766, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(50, 352, 766, 2);
		contentPane.add(separator_1);		
	}
}