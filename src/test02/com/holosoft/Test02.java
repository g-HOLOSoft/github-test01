package test02.com.holosoft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test02 extends JFrame implements ActionListener {
	JButton btn;
	
	public Test02() {
		super("GUI 테스트 중...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn = new JButton("누르던가 말든가...");
		btn.addActionListener(this);
		
		add(btn);
		pack();
		setVisible(true);
	}
	
	public static void main(String args[]) {
		new Test02();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "THIS IS ERROR MESSAGE","ERROR TITLE", JOptionPane.ERROR_MESSAGE);
	}
}