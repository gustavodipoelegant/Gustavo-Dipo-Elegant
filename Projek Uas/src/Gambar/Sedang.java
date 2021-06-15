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

public class Sedang extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Sedang frame = new Sedang();
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
	public Sedang() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel kue = new JLabel("");
		kue.setIcon(new ImageIcon(Sedang.class.getResource("/Gambar/Cheese Cake 2.png")));
		kue.setBounds(25, 158, 128, 92);
		contentPane.add(kue);
		
		JLabel ukuran = new JLabel("Ukuran ");
		ukuran.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		ukuran.setBounds(186, 149, 61, 14);
		contentPane.add(ukuran);
		
		JLabel tinggi = new JLabel(":TInggi = 45 cm");
		tinggi.setFont(new Font("Tahoma", Font.BOLD, 12));
		tinggi.setBounds(257, 145, 109, 22);
		contentPane.add(tinggi);
		
		JLabel diameter = new JLabel(":Diameter = 35 cm");
		diameter.setFont(new Font("Tahoma", Font.BOLD, 12));
		diameter.setBounds(257, 178, 138, 34);
		contentPane.add(diameter);
		
		JLabel hbd = new JLabel("");
		hbd.setIcon(new ImageIcon(Sedang.class.getResource("/Gambar/3511606.png")));
		hbd.setBounds(25, 26, 148, 136);
		contentPane.add(hbd);
		
		JLabel sedang = DefaultComponentFactory.getInstance().createTitle("Sedang");
		sedang.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		sedang.setBounds(173, 0, 88, 22);
		contentPane.add(sedang);
	}
}
