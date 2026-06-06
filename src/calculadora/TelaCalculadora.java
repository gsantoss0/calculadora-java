package calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class TelaCalculadora extends JFrame {

	private double numero1;
    private String operador;
    
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField visor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCalculadora frame = new TelaCalculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		visor = new JTextField();
		visor.setBounds(35, 11, 238, 33);
		contentPane.add(visor);
		visor.setColumns(10);
		
		JButton btnNewButton_8 = new JButton("7");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_8.setBounds(35, 50, 49, 22);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "7");
			}
		});
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_8_1 = new JButton("8");
		btnNewButton_8_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_8_1.setBounds(90, 49, 52, 23);
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "8");
			}
		});
		contentPane.add(btnNewButton_8_1);
		
		JButton btnNewButton_8_2 = new JButton("9");
		btnNewButton_8_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_8_2.setBounds(148, 49, 53, 23);
		btnNewButton_8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "9");
			}
		});
		contentPane.add(btnNewButton_8_2);
		
		JButton btnNewButton_8_3 = new JButton("/");
		btnNewButton_8_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_8_3.setBounds(207, 49, 66, 23);
		btnNewButton_8_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(visor.getText());
			    operador = "/";
			    visor.setText("");
			}
		});
		contentPane.add(btnNewButton_8_3);
		
		JButton btnNewButton_8_4 = new JButton("4");
		btnNewButton_8_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_8_4.setBounds(35, 74, 49, 23);
		btnNewButton_8_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "4");
			}
		});
		contentPane.add(btnNewButton_8_4);
		
		JButton btnNewButton_8_5 = new JButton("5");
		btnNewButton_8_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_8_5.setBounds(90, 74, 52, 23);
		btnNewButton_8_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			        visor.setText(visor.getText() + "5");
			}
		});
		contentPane.add(btnNewButton_8_5);
		
		JButton btnNewButton_8_6 = new JButton("6");
		btnNewButton_8_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_8_6.setBounds(148, 74, 53, 23);
		btnNewButton_8_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "6");
			}
		});
		contentPane.add(btnNewButton_8_6);
		
		JButton btnNewButton_8_7 = new JButton("*");
		btnNewButton_8_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_8_7.setBounds(207, 74, 66, 23);
		btnNewButton_8_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(visor.getText());
			    operador = "*";
			    visor.setText("");
			}
		});
		contentPane.add(btnNewButton_8_7);
		
		JButton btnNewButton_8_4_1 = new JButton("1");
		btnNewButton_8_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_8_4_1.setBounds(35, 98, 49, 23);
		btnNewButton_8_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "1");
			}
		});
		contentPane.add(btnNewButton_8_4_1);
		
		JButton btnNewButton_8_4_1_1 = new JButton("0");
		btnNewButton_8_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_8_4_1_1.setBounds(35, 127, 49, 43);
		btnNewButton_8_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "0");
			}
		});
		contentPane.add(btnNewButton_8_4_1_1);
		
		JButton btnNewButton_8_4_1_2 = new JButton("2");
		btnNewButton_8_4_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_8_4_1_2.setBounds(90, 98, 52, 23);
		btnNewButton_8_4_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "2");
			}
		});
		contentPane.add(btnNewButton_8_4_1_2);
		
		JButton btnNewButton_8_4_1_3 = new JButton("C");
		btnNewButton_8_4_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_8_4_1_3.setBounds(90, 127, 52, 43);
		btnNewButton_8_4_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText("");
			}
		});
		contentPane.add(btnNewButton_8_4_1_3);
		
		JButton btnNewButton_8_4_1_4 = new JButton("3");
		btnNewButton_8_4_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_8_4_1_4.setBounds(148, 98, 53, 23);
		btnNewButton_8_4_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "3");
			}
		});
		contentPane.add(btnNewButton_8_4_1_4);
		
		JButton btnNewButton_8_4_1_5 = new JButton("=");
		btnNewButton_8_4_1_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_8_4_1_5.setBounds(207, 127, 66, 43);
		btnNewButton_8_4_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double numero2 = Double.parseDouble(visor.getText());
			    double resultado = 0;

			    switch (operador) {
			        case "+":
			            resultado = numero1 + numero2;
			            break;

			        case "-":
			            resultado = numero1 - numero2;
			            break;

			        case "*":
			            resultado = numero1 * numero2;
			            break;

			        case "/":
			            resultado = numero1 / numero2;
			            break;
			    }

			    visor.setText(String.valueOf(resultado));
			}
		});
		contentPane.add(btnNewButton_8_4_1_5);
		
		JButton btnNewButton_8_4_1_4_1 = new JButton("-");
		btnNewButton_8_4_1_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(visor.getText());
			    operador = "-";
			    visor.setText("");
			}
		});
		btnNewButton_8_4_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_8_4_1_4_1.setBounds(207, 98, 66, 23);
		contentPane.add(btnNewButton_8_4_1_4_1);
		
		JButton btnNewButton_8_4_1_4_2 = new JButton("+");
		btnNewButton_8_4_1_4_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_8_4_1_4_2.setBounds(148, 127, 52, 43);
		btnNewButton_8_4_1_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(visor.getText());
			    operador = "+";
			    visor.setText("");
			}
		});
		contentPane.add(btnNewButton_8_4_1_4_2);

	}

}
