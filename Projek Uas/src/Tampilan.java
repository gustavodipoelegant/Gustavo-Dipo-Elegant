
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JTextField;

public class Tampilan extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtYukRayakanDan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tampilan frame = new Tampilan();
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
	public Tampilan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 763, 749);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Tampilan.class.getResource("/Gambar/Latar kue 2.jpg")));
		lblNewLabel.setBounds(10, -14, 789, 724);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(266, 211, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("aaaaa");
		lblNewLabel_2.setBackground(SystemColor.text);
		lblNewLabel_2.setBounds(286, 211, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtYukRayakanDan = new JTextField();
		txtYukRayakanDan.setEditable(false);
		txtYukRayakanDan.setText("yuk rayakan dan syukuri hari yang spesial ini");
		txtYukRayakanDan.setBackground(SystemColor.text);
		txtYukRayakanDan.setBounds(225, 180, 347, 20);
		contentPane.add(txtYukRayakanDan);
		txtYukRayakanDan.setColumns(10);
	}
}
