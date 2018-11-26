package java28;

import java.awt.Event;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow extends JFrame {
	JButton b;
	
	public MyWindow() {
		setTitle("나의 그래픽");
		setSize(500, 500);
		b = new JButton("나를 눌러요....");
		setLayout(new FlowLayout());  //new할때 무조건 참조형이면 주소값이 만들어질것. 기초형이라면 값이, 참조형이라면 주소값이 넘어올것
		add(b);
		ActionProcess action = new ActionProcess();
		b.addActionListener(action);    //addActionListener 괄호안에는 어떤 값이나 어떤 주소값이 있어야 그 부품을 사용할수 있을것이다. 그런데 그래픽 프로그램에서는 어떤 변수에 값을 저장해서 무언가를 처리하는게 아니므로
//		그 부품의 주소값
//		b.addActionListener(new ActionProcess());   = b.addActionListener(action); 결과는 똑같으나 new할때마다 주소값이 생성이 되므로 이게 한두개면 상관이 없는데 개수가 많아지면 프로그램의 메모리를 많이 잡아먹으므로 
//		좋은 방법은 아니다.
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		MyWindow my = new MyWindow();
	}
	

	
	
	
}
