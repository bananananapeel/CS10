import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.*;

public class PracticeGUI {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private JTextField fnn;
	private JTextField ln;
	
	ImageIcon img1 = new ImageIcon("../Chapter3/src/download.png");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() 
			{
				try {
					PracticeGUI window = new PracticeGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PracticeGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 611, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		panel.setBounds(0, 0, 595, 388);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel FN = new JLabel("First Name...");
		FN.setBounds(10, 55, 74, 14);
		panel.add(FN);
		
		JLabel LN = new JLabel("Last Name...");
		LN.setBounds(10, 88, 88, 14);
		panel.add(LN);
		
		fnn = new JTextField();
		fnn.setBounds(86, 52, 86, 20);
		panel.add(fnn);
		fnn.setColumns(10);
		
		ln = new JTextField();
		ln.setBounds(86, 85, 86, 20);
		panel.add(ln);
		ln.setColumns(10);
		
		JLabel AG = new JLabel("Age");
		AG.setBounds(10, 113, 46, 14);
		panel.add(AG);
		
		JLabel DIS = new JLabel("");
		DIS.setBackground(Color.PINK);
		DIS.setBounds(394, 256, 155, 97);
		panel.add(DIS);
		
		JComboBox g2 = new JComboBox();
		g2.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		g2.setBounds(86, 120, 80, 22);
		panel.add(g2);
		
		JLabel pic = new JLabel("");
		pic.setBounds(38, 192, 289, 136);
		panel.add(pic);
		
		JButton sb = new JButton("Submit");
		sb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String FN = fnn.getText();
				String LN = ln.getText();
				int grade;
				
				if(g2.getSelectedItem().equals("10"))
				{
					grade = 10;
					pic.setIcon(img1);;
				}
				else if(g2.getSelectedItem().equals("11"))
				{
					grade = 11;
					Version2 k = new Version2();
					
				}
				else
				{
					grade = 12;
				}
				
				DIS.setText("First Name: "+ FN + " Last Name: "+ LN
						+ " and your Grade is: "+ grade);
			}
		});
		sb.setBounds(212, 51, 89, 23);
		panel.add(sb);
		
		JButton RS = new JButton("RESET");
		RS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				fnn.setText("");
				ln.setText("");
				
			}
		});
		RS.setBounds(212, 109, 89, 23);
		panel.add(RS);
		

		
		
		
		
		
		
	}
}
