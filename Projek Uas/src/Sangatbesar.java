
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;

public class Sangatbesar extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Sangatbesar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel sangatbesar = DefaultComponentFactory.getInstance().createTitle("Sangat Besar");
		sangatbesar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		sangatbesar.setBounds(166, 0, 117, 19);
		contentPane.add(sangatbesar);
		
		
		JLabel kue = new JLabel("");
		kue.setIcon(new ImageIcon(Sangatbesar.class.getResource("/Gambar/Black Forest.png")));
		kue.setBounds(22, 143, 143, 128);
		contentPane.add(kue);
		
		JLabel tinggi = new JLabel("Tinggi : 60 cm");
		tinggi.setBounds(229, 102, 98, 14);
		contentPane.add(tinggi);
		
		JLabel diameter = new JLabel("Diameter : 40 cm");
		diameter.setBounds(229, 150, 98, 14);
		contentPane.add(diameter);
	
		
		JLabel hiasan = new JLabel("");
		hiasan.setIcon(new ImageIcon(Sangatbesar.class.getResource("/Gambar/857282.png")));
		hiasan.setBounds(22, 24, 137, 121);
		contentPane.add(hiasan);
	}
}
