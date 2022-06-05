package calculatorproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class CalculatorProject {

	private JFrame frame;
	private String operator = "+";
	private int firstNumber;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorProject window = new CalculatorProject();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CalculatorProject() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 355, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel answer = new JLabel("0");
		answer.setFont(new Font("굴림", Font.PLAIN, 45));
		answer.setHorizontalAlignment(SwingConstants.RIGHT);
		answer.setBounds(12, 22, 315, 72);
		frame.getContentPane().add(answer);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("굴림", Font.PLAIN, 20));
		btn7.setBounds(12, 138, 70, 80);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("굴림", Font.PLAIN, 20));
		btn8.setBounds(94, 138, 70, 80);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("굴림", Font.PLAIN, 20));
		btn9.setBounds(176, 138, 70, 80);
		frame.getContentPane().add(btn9);
				
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("굴림", Font.PLAIN, 20));
		btn4.setBounds(12, 228, 70, 80);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("굴림", Font.PLAIN, 20));
		btn5.setBounds(94, 228, 70, 80);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("굴림", Font.PLAIN, 20));
		btn6.setBounds(176, 228, 70, 80);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("굴림", Font.PLAIN, 20));
		btn1.setBounds(12, 318, 70, 80);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("굴림", Font.PLAIN, 20));
		btn2.setBounds(94, 318, 70, 80);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("굴림", Font.PLAIN, 20));
		btn3.setBounds(176, 318, 70, 80);
		frame.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("굴림", Font.PLAIN, 20));
		btn0.setBounds(94, 408, 70, 80);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("굴림", Font.PLAIN, 20));
		btnDot.setBounds(12, 408, 70, 80);
		frame.getContentPane().add(btnDot);
	
		JButton btnMul = new JButton("X");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Integer.parseInt(curr);
				answer.setText("0");
				operator = "*";
			}
		});
		btnMul.setFont(new Font("굴림", Font.PLAIN, 20));
		btnMul.setBounds(258, 138, 70, 80);
		frame.getContentPane().add(btnMul);		
	
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Integer.parseInt(curr);
				answer.setText("0");
				operator = "-";
			}
		});
		btnSub.setFont(new Font("굴림", Font.PLAIN, 20));
		btnSub.setBounds(258, 228, 70, 80);
		frame.getContentPane().add(btnSub);			
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Integer.parseInt(curr);
				answer.setText("0");
				operator = "+";
			}
		});
		btnPlus.setFont(new Font("굴림", Font.PLAIN, 20));
		btnPlus.setBounds(258, 318, 70, 80);
		frame.getContentPane().add(btnPlus);		
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Integer.parseInt(curr);
				answer.setText("0");
				operator = "/";
			}
		});
		btnDiv.setFont(new Font("굴림", Font.PLAIN, 20));
		btnDiv.setBounds(258, 408, 70, 80);
		frame.getContentPane().add(btnDiv);		
		
		JButton btnEnter = new JButton("=");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(operator) {
				case"+":{
					int currValue = Integer.parseInt(answer.getText());
					answer.setText((firstNumber+currValue) + "");
					break;
				}
				case"-":{
					int currValue = Integer.parseInt(answer.getText());
					answer.setText((firstNumber-currValue) + "");
					break;
				}
				case"*":{
					int currValue = Integer.parseInt(answer.getText());
					answer.setText((firstNumber*currValue) + "");
					break;
			}
				case"/":{
					int currValue = Integer.parseInt(answer.getText());
					answer.setText((firstNumber/currValue) + "");
					break;
			  	    }
			 	}
			}
		});
		btnEnter.setFont(new Font("굴림", Font.PLAIN, 20));
		btnEnter.setBounds(176, 408, 70, 80);
		frame.getContentPane().add(btnEnter);
		
		btn0.addActionListener(new NumberActionListener(answer, "0") );
		btn1.addActionListener(new NumberActionListener(answer, "1") );
		btn2.addActionListener(new NumberActionListener(answer, "2") );
		btn3.addActionListener(new NumberActionListener(answer, "3") );
		btn4.addActionListener(new NumberActionListener(answer, "4") );
		btn5.addActionListener(new NumberActionListener(answer, "5") );
		btn6.addActionListener(new NumberActionListener(answer, "6") );
		btn7.addActionListener(new NumberActionListener(answer, "7") );
		btn8.addActionListener(new NumberActionListener(answer, "8") );
		btn9.addActionListener(new NumberActionListener(answer, "9") );
	
	}
}

class NumberActionListener implements ActionListener{

	private JLabel label;
	private String text;
	
	public NumberActionListener(JLabel l, String s) {
		label = l;
		text = s;
	}
	
	public void actionPerformed(ActionEvent e) {
		String curr = label.getText()
;
		if(curr.equals("0")) {
			label.setText(text);
		}else {
			label.setText(label.getText()+text);
		}
	}
	
}
