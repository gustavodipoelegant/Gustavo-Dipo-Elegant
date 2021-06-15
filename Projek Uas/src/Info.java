
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Info extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;

	/**
	 * Create the frame.
	 */
	public Info() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 150, 615, 503);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		JLabel infoHarga = DefaultComponentFactory.getInstance().createTitle("INFO HARGA");
		infoHarga.setFont(new Font("Times New Roman", Font.BOLD, 20));
		infoHarga.setBounds(223, 11, 135, 14);
		panel.add(infoHarga);
		
		JLabel UK = new JLabel("Ukuran Kue");
		UK.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		UK.setBounds(54, 57, 95, 14);
		panel.add(UK);
		
		JLabel SB = new JLabel("Sangat Besar (RP.30.000)");
		SB.setFont(new Font("Tahoma", Font.PLAIN, 12));
		SB.setBounds(31, 84, 155, 14);
		panel.add(SB);
		
		JLabel B = new JLabel("Besar (RP.25.000)");
		B.setFont(new Font("Tahoma", Font.PLAIN, 12));
		B.setBounds(31, 120, 140, 14);
		panel.add(B);
		
		JLabel S = new JLabel("Sedang (RP.20.000)");
		S.setFont(new Font("Tahoma", Font.PLAIN, 12));
		S.setBounds(31, 162, 140, 14);
		panel.add(S);
		
		JLabel K = new JLabel("Kecil (RP.15.000)");
		K.setFont(new Font("Tahoma", Font.PLAIN, 12));
		K.setBounds(31, 202, 140, 14);
		panel.add(K);
		
		JLabel SK = new JLabel("Sangat Kecil (RP.10.000)");
		SK.setFont(new Font("Tahoma", Font.PLAIN, 12));
		SK.setBounds(31, 247, 140, 14);
		panel.add(SK);
		
		JLabel JK = new JLabel("Jenis Kue");
		JK.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		JK.setBounds(428, 57, 107, 14);
		panel.add(JK);
		
		JLabel black = new JLabel("Black Forest (RP.15.000)");
		black.setHorizontalAlignment(SwingConstants.TRAILING);
		black.setFont(new Font("Tahoma", Font.PLAIN, 12));
		black.setBounds(380, 84, 155, 14);
		panel.add(black);
		
		JLabel opera = new JLabel("Opera Cake (RP.15.000)");
		opera.setHorizontalAlignment(SwingConstants.TRAILING);
		opera.setFont(new Font("Tahoma", Font.PLAIN, 12));
		opera.setBounds(380, 120, 155, 14);
		panel.add(opera);
		
		JLabel cheese = new JLabel("Cheese Cake (RP.15.000)");
		cheese.setHorizontalAlignment(SwingConstants.TRAILING);
		cheese.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cheese.setBounds(388, 162, 147, 14);
		panel.add(cheese);
		
		JLabel chocolate = new JLabel("Chocolate Cake (RP.10.000)");
		chocolate.setHorizontalAlignment(SwingConstants.TRAILING);
		chocolate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chocolate.setBounds(396, 202, 155, 14);
		panel.add(chocolate);
		
		JLabel red = new JLabel("Red Velvet (RP.10.000)");
		red.setHorizontalAlignment(SwingConstants.TRAILING);
		red.setFont(new Font("Tahoma", Font.PLAIN, 12));
		red.setBounds(380, 247, 155, 14);
		panel.add(red);
		
		JLabel pengiriman = new JLabel("Pengiriman");
		pengiriman.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		pengiriman.setBounds(32, 291, 95, 35);
		panel.add(pengiriman);
		
		JLabel kalimantan = new JLabel("Kalimantan (RP.20.000)");
		kalimantan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		kalimantan.setBounds(31, 327, 140, 14);
		panel.add(kalimantan);
		
		JLabel diluarKalimantan = new JLabel("Diluar Kalimantan (RP.40.000)");
		diluarKalimantan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		diluarKalimantan.setBounds(31, 366, 167, 14);
		panel.add(diluarKalimantan);
		
		JLabel gambarKue = new JLabel("");
		gambarKue.setIcon(new ImageIcon(Info.class.getResource("/Gambar/2454297.png")));
		gambarKue.setBounds(380, 327, 135, 131);
		panel.add(gambarKue);
		
		JLabel daftar = new JLabel("");
		daftar.setIcon(new ImageIcon(Info.class.getResource("/Gambar/3566336.png")));
		daftar.setBounds(223, 86, 135, 119);
		panel.add(daftar);
		
		JLabel mobil = new JLabel("");
		mobil.setIcon(new ImageIcon(Info.class.getResource("/Gambar/Kirim2.png")));
		mobil.setBounds(58, 391, 128, 67);
		panel.add(mobil);
	}
}
