import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrcaticeGUI2 {

	private JFrame frame;
	private JTextField e2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrcaticeGUI2 window = new PrcaticeGUI2();
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
	public PrcaticeGUI2() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel E2 = new JLabel("Enter 2 digits");
		E2.setBounds(10, 35, 86, 23);
		panel.add(E2);
		
		e2 = new JTextField();
		e2.setBounds(102, 36, 86, 20);
		panel.add(e2);
		e2.setColumns(10);
		
		JLabel DIS = new JLabel("");
		DIS.setBounds(29, 147, 334, 70);
		panel.add(DIS);
		
		JButton En = new JButton("Enter ");
		En.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String E2 = e2.getText();//record the two digits
				
				int twoD = Integer.parseInt(E2);//get the integer part
				
				int firstD = twoD / 10;//record first digit
				int secondD = twoD % 10;//record second digit
				
				int sum = firstD + secondD;//record sum 
				
				int prdc = firstD + secondD; //record product
				
				int check = sum + prdc;
				if(check == twoD)
				{
					DIS.setText(twoD + " is a special two digit number");
				}
				else
				{
				DIS.setText(twoD+" is not a special two digit number"); //display special #
				}
			}
		});
		En.setBounds(247, 35, 89, 23);
		panel.add(En);
		
		JButton Cl = new JButton("Clear");
		Cl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				e2.setText("");
				DIS.setText("");
			}
		});
		Cl.setBounds(247, 85, 89, 23);
		panel.add(Cl);
	}
}
