package java28; 

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyWindow3 extends JFrame {
	
	public MyWindow3() {
		
		setTitle("나의 그래픽3");
		setSize(500, 500);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("나를 누르세요");
		btnNewButton.addActionListener(new ActionListener() {  //문법적으로 new ActionListener라고 하면 안된다. 왜냐하면 저것은 인터페이스인데 인터페이스는 new를 사용할수 없기때문. 그러나 익명클래스라고 생각하니까 가능
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 또또 눌렀군요..!!!");
			}
		});  //익명클래스로 구현함
		
		
		
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("나눔고딕", Font.PLAIN, 26));
		btnNewButton.setBounds(126, 49, 215, 113);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(126, 200, 215, 46);
		getContentPane().add(btnNewButton_1);
		
		
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		MyWindow3 my3 = new MyWindow3();
	}
}
