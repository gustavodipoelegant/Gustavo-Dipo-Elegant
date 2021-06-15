package Gambar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;

public class Besar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Besar frame = new Besar();
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
	public Besar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel kue = new JLabel("New label");
		kue.setIcon(new ImageIcon(Besar.class.getResource("/Gambar/Opera Cake.png")));
		kue.setBounds(32, 146, 131, 104);
		contentPane.add(kue);
		
		JLabel tinggi = new JLabel(":TInggi = 50 cm");
		tinggi.setFont(new Font("Tahoma", Font.BOLD, 12));
		tinggi.setBounds(248, 163, 109, 22);
		contentPane.add(tinggi);
		
		JLabel diameter = new JLabel(":Diameter = 30 cm");
		diameter.setFont(new Font("Tahoma", Font.BOLD, 12));
		diameter.setBounds(248, 196, 138, 34);
		contentPane.add(diameter);
		
		JLabel big = DefaultComponentFactory.getInstance().createTitle("Besar");
		big.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		big.setBounds(173, 0, 88, 14);
		contentPane.add(big);
		
		JLabel ukur = new JLabel("Ukuran ");
		ukur.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		ukur.setBounds(173, 167, 61, 14);
		contentPane.add(ukur);
		
		JLabel balon = new JLabel("");
		balon.setIcon(new ImageIcon(Besar.class.getResource("/Gambar/3034068.png")));
		balon.setBounds(32, 11, 131, 136);
		contentPane.add(balon);
	}
}
