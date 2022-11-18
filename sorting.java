

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class sorting implements ActionListener {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNewLabel_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sorting window = new sorting();
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
	public sorting() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(200, 22, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(200, 53, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(200, 84, 96, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(200, 119, 96, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(200, 150, 96, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("click for sort");
		btnNewButton.setBounds(142, 202, 150, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		JLabel lblNewLabel = new JLabel("enter no 1");
		lblNewLabel.setBounds(79, 25, 100, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("enter no 2");
		lblNewLabel_1.setBounds(79, 56, 100, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("enter no 3");
		lblNewLabel_2.setBounds(79, 87, 100, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("enetr no 4");
		lblNewLabel_3.setBounds(79, 122, 100, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("enter no 5");
		lblNewLabel_4.setBounds(79, 153, 100, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		 lblNewLabel_5 = new JLabel();
		lblNewLabel_5.setBounds(114, 271, 200, 14);
		frame.getContentPane().add(lblNewLabel_5);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int a[]=new int[5];
		a[0]=Integer.parseInt(textField.getText());
		a[1]=Integer.parseInt(textField_1.getText());
		a[2]=Integer.parseInt(textField_2.getText());
		a[3]=Integer.parseInt(textField_3.getText());
		a[4]=Integer.parseInt(textField_4.getText());
		// TODO Auto-generated method stub
		Arrays.sort(a);
		String str=Integer.toString(a[0]);
		String str1=Integer.toString(a[1]);
		String str2=Integer.toString(a[2]);
		String str3=Integer.toString(a[3]);
		String str4=Integer.toString(a[4]);
		lblNewLabel_5.setText(" "+str+" "+str1+" "+str2+" "+str3+" "+str4);
	}

}
