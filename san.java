

import java.awt.EventQueue;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

public class san implements ActionListener {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					san window = new san();
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
	public san() {
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
		textField.setBounds(158, 23, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(158, 63, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(158, 104, 96, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		 btnNewButton = new JButton("click");
		btnNewButton.setBounds(165, 155, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("enter id");
		lblNewLabel.setBounds(39, 26, 100, 17);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("enter name");
		lblNewLabel_1.setBounds(39, 66, 100, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("enter address");
		lblNewLabel_2.setBounds(39, 107, 100, 17);
		frame.getContentPane().add(lblNewLabel_2);
		btnNewButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JDialog d = new JDialog(frame, "dialog Box");
		Panel p1=new Panel();
		p1.setLayout(null);
		String s1=textField.getText().trim();
		String s2=textField_1.getText().trim();
		String s3=textField_2.getText().trim();

            	JLabel l = new JLabel();
		JLabel l2 = new JLabel();
		JLabel l3 = new JLabel();
		l.setBounds(50,20,150,20);
		l2.setBounds(50,70,150,20);
		l3.setBounds(50,120,150,20);
	     l.setText("id:-"+s1);
	      l2.setText("name:-"+s2);
		l3.setText("address:-"+s3);
         //   d.add(l);
		//d.add(l2);
		//d.add(l3);
		p1.add(l);
		p1.add(l2);
		p1.add(l3);
		d.getContentPane().add(p1);
 
            // setsize of dialog
            d.setSize(300, 200);
 
            // set visibility of dialog
            d.setVisible(true);
		
	}
}
