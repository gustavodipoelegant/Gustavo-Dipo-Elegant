package Gambar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class Sangatkecil extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Sangatkecil frame = new Sangatkecil();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Sangatkecil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 322);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Sangatkecil.class.getResource("/Gambar/Red.png")));
		lblNewLabel.setBounds(37, 139, 121, 112);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Ukuran ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setBounds(189, 168, 61, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel(":TInggi = 35 cm");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(260, 164, 109, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel(":Diameter = 25 cm");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(260, 196, 138, 34);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Sangatkecil.class.getResource("/Gambar/1038744.png")));
		lblNewLabel_3.setBounds(37, 26, 138, 113);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Sangat Kecil");
		lblNewJgoodiesTitle.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblNewJgoodiesTitle.setBounds(176, 0, 88, 14);
		contentPane.add(lblNewJgoodiesTitle);
	}
}
