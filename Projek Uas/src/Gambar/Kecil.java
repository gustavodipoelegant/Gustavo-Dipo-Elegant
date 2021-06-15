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

public class Kecil extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Kecil frame = new Kecil();
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
	public Kecil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel kue = new JLabel("");
		kue.setIcon(new ImageIcon(Kecil.class.getResource("/Gambar/Chocolate.png")));
		kue.setBounds(23, 186, 168, 115);
		contentPane.add(kue);
		
		JLabel ukuran = new JLabel("Ukuran ");
		ukuran.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		ukuran.setBounds(167, 217, 61, 14);
		contentPane.add(ukuran);
		
		JLabel tinggi = new JLabel(":TInggi = 40 cm");
		tinggi.setFont(new Font("Tahoma", Font.BOLD, 12));
		tinggi.setBounds(230, 213, 109, 22);
		contentPane.add(tinggi);
		
		JLabel diameter = new JLabel(":Diameter = 30 cm");
		diameter.setFont(new Font("Tahoma", Font.BOLD, 12));
		diameter.setBounds(230, 244, 138, 34);
		contentPane.add(diameter);
		
		JLabel hias = new JLabel("");
		hias.setIcon(new ImageIcon(Kecil.class.getResource("/Gambar/1040617.png")));
		hias.setBounds(26, 33, 140, 142);
		contentPane.add(hias);
		
		JLabel small = DefaultComponentFactory.getInstance().createTitle("Kecil");
		small.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		small.setBounds(175, 0, 88, 14);
		contentPane.add(small);
	}
}
