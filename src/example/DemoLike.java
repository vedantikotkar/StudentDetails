package example;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DemoLike extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private final JLabel lblNewLabel_3 = new JLabel("Select Hobbies:");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoLike frame = new DemoLike();
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
	public DemoLike() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 439);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(23, 25, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Address:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(23, 79, 62, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gender:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(23, 139, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Highest Degrees:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(23, 267, 105, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Languages Known:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(23, 333, 116, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Student Details");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_6.setBounds(144, 0, 121, 14);
		contentPane.add(lblNewLabel_6);
		
		txtName = new JTextField();
		txtName.setBounds(128, 22, 132, 27);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JTextArea txtAddr = new JTextArea();
		txtAddr.setBounds(128, 74, 132, 48);
		contentPane.add(txtAddr);
		
		JCheckBox chk2 = new JCheckBox("Dancing");
		chk2.setBackground(new Color(211, 211, 211));

		chk2.setFont(new Font("Tahoma", Font.BOLD, 11));
		chk2.setBounds(218, 198, 71, 23);
		contentPane.add(chk2);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(23, 194, 96, 31);
		contentPane.add(lblNewLabel_3);
		
		JCheckBox chk1 = new JCheckBox("Singing");
		chk1.setBackground(new Color(211, 211, 211));

		chk1.setFont(new Font("Tahoma", Font.BOLD, 11));
		chk1.setBounds(128, 198, 77, 23);
		contentPane.add(chk1);
		
		JCheckBox chk3 = new JCheckBox("Sports");
		chk3.setFont(new Font("Tahoma", Font.BOLD, 11));
		chk3.setBackground(new Color(211, 211, 211));

		chk3.setBounds(309, 198, 97, 23);
		contentPane.add(chk3);
		
		JRadioButton rbMale = new JRadioButton("Male");
		rbMale.setBackground(new Color(211, 211, 211));

		rbMale.setFont(new Font("Tahoma", Font.BOLD, 11));
		rbMale.setBounds(128, 135, 53, 23);
		contentPane.add(rbMale);
		
		JRadioButton rbFemale = new JRadioButton("Female");
		rbFemale.setFont(new Font("Tahoma", Font.BOLD, 11));
		rbFemale.setBackground(new Color(211, 211, 211));

		rbFemale.setBounds(218, 135, 71, 23);
		contentPane.add(rbFemale);
		
		JComboBox cbDegree = new JComboBox();
		cbDegree.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cbDegree.setModel(new DefaultComboBoxModel(new String[] {"Select your highest Qualification", "PHD", "BTech", "MTech", "MBBS", "BAMS", "BHMS"}));
		cbDegree.setBounds(126, 263, 180, 22);
		contentPane.add(cbDegree);
		
		JComboBox lstLanguages = new JComboBox();
		lstLanguages.setModel(new DefaultComboBoxModel(new String[] {"Select the Language", "English", "Hindi", "Marathi", "French"}));
		lstLanguages.setBounds(151, 329, 132, 22);
		contentPane.add(lstLanguages);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
			     txtAddr.setText("");
			//  buttonGroup.clearSelection();
			     chk1.setSelected(false);
			     chk2.setSelected(false);
			     chk3.setSelected(false);
			     cbDegree.setSelectedIndex(0);
			     lstLanguages.setSelectedIndex(0);
			     
			     
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnReset.setBounds(172, 366, 89, 23);
		contentPane.add(btnReset);
	}
}
