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

public class PracticeGUI {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private JTextField fnn;
	private JTextField ln;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		panel.setBounds(0, 0, 434, 261);
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
		DIS.setBounds(10, 183, 386, 67);
		panel.add(DIS);
		
		JComboBox g2 = new JComboBox();
		g2.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		g2.setBounds(86, 120, 80, 22);
		panel.add(g2);
		
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
				}
				else if(g2.getSelectedItem().equals("11"))
				{
					grade = 11;
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
		RS.setBounds(201, 109, 89, 23);
		panel.add(RS);
		
		
		
		
		
		
	}
}
