package money;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JButton;

public class BankManager extends JFrame {
	private JTextField text1;   //id
	private JTextField text2;   //name
	private JTextField text3;   //age
	private JTextField text4;   //tel
	BankDAO dao;
	BankDTO dto;
	
	public BankManager() {
		setTitle("은행 관리");
		setSize(283, 474);
		
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("회원 가입");
		label.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		label.setBackground(new Color(128, 128, 128));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 0, 267, 56);
		label.setOpaque(true);
		getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel.setBounds(42, 106, 48, 15);
		getContentPane().add(lblNewLabel);
		
		text1 = new JTextField();
		text1.setBounds(70, 103, 134, 21);
		getContentPane().add(text1);
		text1.setColumns(10);
		
		JLabel lblName = new JLabel("name");
		lblName.setFont(new Font("굴림", Font.PLAIN, 13));
		lblName.setBounds(32, 134, 48, 15);
		getContentPane().add(lblName);
		
		text2 = new JTextField();
		text2.setColumns(10);
		text2.setBounds(70, 131, 134, 21);
		getContentPane().add(text2);
		
		JLabel lblAge = new JLabel("age");
		lblAge.setFont(new Font("굴림", Font.PLAIN, 13));
		lblAge.setBounds(32, 162, 48, 15);
		getContentPane().add(lblAge);
		
		text3 = new JTextField();
		text3.setColumns(10);
		text3.setBounds(70, 159, 134, 21);
		getContentPane().add(text3);
		
		JLabel lblTel = new JLabel("tel");
		lblTel.setFont(new Font("굴림", Font.PLAIN, 13));
		lblTel.setBounds(42, 187, 48, 15);
		getContentPane().add(lblTel);
		
		text4 = new JTextField();
		text4.setColumns(10);
		text4.setBounds(70, 184, 134, 21);
		getContentPane().add(text4);
		
		JButton complete = new JButton("완료");
		complete.setBounds(70, 225, 134, 32);
		getContentPane().add(complete);
		complete.addActionListener(new ActionListener() { //완료 버튼을 눌렀을시 수행할 동작 정의
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dao = new BankDAO();
				dto = new BankDTO();
				try {
					dto.setId(text1.getText());
					dto.setName(text2.getText());
					int a = Integer.parseInt(text3.getText());
					dto.setAge(a);
					dto.setTel(text4.getText());
					dao.insert(dto);
					JOptionPane.showMessageDialog(null,"완료되었습니다!");
				} catch (SQLException e1) {
					e1.printStackTrace();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		JButton revise = new JButton("수정");
		revise.setBounds(70, 267, 134, 32);
		getContentPane().add(revise);
		revise.addActionListener(new ActionListener() { //수정 버튼 클릭시 수행할 동작 정의
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dao = new BankDAO();
				dto = new BankDTO();
				try {
					dto.setId(text1.getText());
					dto.setTel(text4.getText());
					dao.updateSet(dto);  //id를 이용해 전화번호만 수정 가능
					JOptionPane.showMessageDialog(null, "수정완료!");
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		JButton del = new JButton("삭제");
		del.setBounds(70, 309, 134, 32);
		getContentPane().add(del);
		del.addActionListener(new ActionListener() { //삭제 버튼 클릭시 수행할 동작 정의
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dao = new BankDAO();
				dto = new BankDTO();
				try {
					dto.setId(text1.getText());
					dao.delete(dto);
					JOptionPane.showMessageDialog(null, "삭제완료!");
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		JButton select = new JButton("검색");
		select.setBounds(70, 351, 134, 32);
		getContentPane().add(select);
		select.addActionListener(new ActionListener() { //검색 버튼 클릭시 수행할 동작 정의
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dao = new BankDAO();
				dto = new BankDTO();
				try {
					String result = JOptionPane.showInputDialog(null, "id를 입력하세요.");
					BankDTO dto = dao.selectStaff(result);
					System.out.println("====입력하신 id로 검색한 결과입니다.====");
					System.out.println("id: "+dto.getId());
					System.out.println("이름: "+dto.getName());
					System.out.println("나이: "+dto.getAge());
					System.out.println("연락처: "+dto.getTel());
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		JButton all = new JButton("전체검색");
		all.setBounds(70, 393, 134, 32);
		getContentPane().add(all);
		all.addActionListener(new ActionListener() { //전체 검색 버튼 클릭시 수행할 동작 정의
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dao = new BankDAO();
				dto = new BankDTO();
				try {
					ArrayList<BankDTO> list = dao.selectAll(); 
					System.out.println("====전체 검색결과 입니다====");
					for (BankDTO bankDTO : list) {
						System.out.println(list);
					}
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
			}
		});
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new BankManager();
	}
}
