
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class About extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public About() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 459, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel gambar = new JLabel("");
		gambar.setIcon(new ImageIcon(About.class.getResource("/Gambar/3753050.png")));
		gambar.setBounds(0, 52, 174, 182);
		contentPane.add(gambar);
		
		JLabel javaCakeShop = new JLabel("Java Cake Shop 1.0");
		javaCakeShop.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		javaCakeShop.setBounds(211, 11, 145, 51);
		contentPane.add(javaCakeShop);
		
		JLabel nama = new JLabel("Nama : Gustavo Dipo Elegant");
		nama.setFont(new Font("Times New Roman", Font.BOLD, 13));
		nama.setBounds(211, 92, 174, 14);
		contentPane.add(nama);
		
		JLabel nim = new JLabel("Nim : H1051201066");
		nim.setFont(new Font("Times New Roman", Font.BOLD, 13));
		nim.setBounds(211, 127, 145, 14);
		contentPane.add(nim);
		
		JLabel prodi = new JLabel("Prodi : Rekayasa Sistem Komputer");
		prodi.setFont(new Font("Times New Roman", Font.BOLD, 13));
		prodi.setBounds(211, 164, 191, 14);
		contentPane.add(prodi);
		
		JLabel universitas = new JLabel("Universitas Tanjungpura");
		universitas.setFont(new Font("Times New Roman", Font.BOLD, 13));
		universitas.setBounds(211, 203, 158, 14);
		contentPane.add(universitas);
	}
}
