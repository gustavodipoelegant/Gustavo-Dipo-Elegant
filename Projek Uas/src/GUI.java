
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;

import Gambar.Besar;
import Gambar.Kecil;
import Gambar.Sangatkecil;
import Gambar.Sedang;

import javax.swing.SwingConstants;
import java.awt.Font;

import java.awt.Color;

import javax.swing.JTextArea;
import javax.swing.ButtonGroup;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUmur;
	private JTextField txtNama;
	private JTextField txtNoHP;
	private JTextField txtId;
	private JTextArea textArea;
	private JButton Checkout;

	private void deskripsi() {
		
		try {
			String query = "select bayar.*, sum(harga_jenis+harga+ongkir) as total from bayar where id='"+txtId.getText()+"'";
			Connection con = (Connection)Mysql.con();
			PreparedStatement pst = con.prepareStatement(query);
			ResultSet rs = pst.executeQuery(query);
			
			String [] co = new String[12];
			
			if (rs.next()) {
				co[0] = ("ID Pesanan\t: "+rs.getString("id"));
				co[1] = ("\nNama\t: "+rs.getString("nama"));
				co[2] = ("\nNomor HP\t: "+rs.getString("nomorhp"));
				co[3] = ("\nZona Kirim\t: "+rs.getString("zona"));
				co[4] = ("\nAlamat\t: "+rs.getString("alamat"));
				co[5] = ("\nJenis Kue\t: "+rs.getString("jeniskue"));
				co[6] = ("\nUkuran Kue\t: "+rs.getString("ukurankue"));
				co[7] = ("\nLilin Umur\t: "+"Angka "+rs.getString("lilin"));
				co[8] = ("\nHarga Jenis\t: "+rs.getString("harga_jenis"));
				co[9] = ("\nHarga Ukuran\t: "+rs.getString("harga"));
				co[10] = ("\nOngkos Kirim\t: "+rs.getString("ongkir"));
				co[11] = ("\nTotal Bayar\t: "+rs.getString("total"));
				
				
				for (int i=0; i<11; i++) {
					textArea.append(co[i]);
				}
				textArea.append("\n==================================="+co[11].toUpperCase());
				
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(Checkout, "Gagal Tampilkan Data", "Peringatan!!", ABORT);
		}
		
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new GUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setVisible(true);
		setTitle("Java Cake Shop");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(GUI.class.getResource("/Gambar/Kue latar.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(230, 100, 933, 539);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(new Color(233, 150, 122));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		Codingan pilih satu
		ButtonGroup Ukuran = new ButtonGroup();
		
//		Codingan pilih satu
		ButtonGroup Jenis = new ButtonGroup();
		
//		Codingan pilih satu
		ButtonGroup pengiriman = new ButtonGroup();
		
		JButton About = new JButton("");
		About.setIcon(new ImageIcon(GUI.class.getResource("/Gambar/About2.png")));
		About.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				About D = new About ();
				D.setVisible(true);
				D.setDefaultCloseOperation(HIDE_ON_CLOSE);
				About.setFocusable(false);
			}
		});
		About.setBounds(545, 11, 79, 40);
		contentPane.add(About);
	
		JButton InfoHarga = new JButton("Info Kue");
		InfoHarga.setIcon(new ImageIcon(GUI.class.getResource("/Gambar/Harga 2.png")));
		InfoHarga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Info E = new Info  ();
				E.setVisible(true);
				E.setDefaultCloseOperation(HIDE_ON_CLOSE);
				InfoHarga.setFocusable(false);
			}
		});
		
		
		InfoHarga.setBounds(406, 11, 129, 40);
		contentPane.add(InfoHarga);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), "Pemesanan Kue", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(new Color(233, 150, 122));
		panel.setBounds(10, 51, 614, 438);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton Tanya1 = new JButton(".");
		Tanya1.setBounds(230, 24, 40, 23);
		panel.add(Tanya1);
		Tanya1.setForeground(Color.WHITE);
		Tanya1.setBackground(Color.WHITE);
		Tanya1.setIcon(new ImageIcon(GUI.class.getResource("/Gambar/tanya 2.png")));
		
//		Codingan Button Tanda Tanya
		
		Tanya1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Sangatbesar F = new Sangatbesar  ();
				F.setVisible(true);
				F.setDefaultCloseOperation(HIDE_ON_CLOSE);
				Tanya1.setFocusable(false);
			}
		});
		
		JCheckBox SangatBesar = new JCheckBox("Sangat Besar");
		SangatBesar.setBackground(new Color(233, 150, 122));
		SangatBesar.setBounds(113, 24, 111, 23);
		panel.add(SangatBesar);
		Ukuran.add(SangatBesar);
		SangatBesar.setActionCommand("Sangat Besar");
		
		JCheckBox Besar = new JCheckBox("Besar");
		Besar.setBackground(new Color(233, 150, 122));
		Besar.setBounds(113, 49, 97, 23);
		panel.add(Besar);
		Ukuran.add(Besar);
		Besar.setActionCommand("Besar");
		
		JCheckBox Sedang = new JCheckBox("Sedang");
		Sedang.setBackground(new Color(233, 150, 122));
		Sedang.setBounds(113, 75, 97, 23);
		panel.add(Sedang);
		Ukuran.add(Sedang);
		Sedang.setActionCommand("Sedang");
		
		JCheckBox Kecil = new JCheckBox("Kecil");
		Kecil.setBackground(new Color(233, 150, 122));
		Kecil.setBounds(113, 101, 97, 23);
		panel.add(Kecil);
		Ukuran.add(Kecil);
		Kecil.setActionCommand("Kecil");
		
		JCheckBox SangatKecil = new JCheckBox("Sangat Kecil");
		SangatKecil.setBackground(new Color(233, 150, 122));
		SangatKecil.setBounds(113, 127, 97, 23);
		panel.add(SangatKecil);
		Ukuran.add(SangatKecil);
		SangatKecil.setActionCommand("Sangat Kecil");
		
	
	
		
		JButton Tanya2 = new JButton("1");
		Tanya2.setBounds(230, 49, 40, 23);
		panel.add(Tanya2);
		Tanya2.setIcon(new ImageIcon(GUI.class.getResource("/Gambar/tanya 2.png")));
		Tanya2.setForeground(Color.WHITE);
		Tanya2.setBackground(Color.WHITE);
		
		JButton Tanya3 = new JButton("2");
		Tanya3.setBounds(230, 75, 40, 23);
		panel.add(Tanya3);
		Tanya3.setIcon(new ImageIcon(GUI.class.getResource("/Gambar/tanya 2.png")));
		Tanya3.setForeground(Color.WHITE);
		Tanya3.setBackground(Color.WHITE);
		
		JButton Tanya4 = new JButton("3");
		Tanya4.setBounds(230, 101, 40, 23);
		panel.add(Tanya4);
		Tanya4.setIcon(new ImageIcon(GUI.class.getResource("/Gambar/tanya 2.png")));
		Tanya4.setForeground(Color.WHITE);
		Tanya4.setBackground(Color.WHITE);
		
		JButton Tanya5 = new JButton("4");
		Tanya5.setBounds(230, 127, 40, 23);
		panel.add(Tanya5);
		Tanya5.setIcon(new ImageIcon(GUI.class.getResource("/Gambar/tanya 2.png")));
		Tanya5.setForeground(Color.WHITE);
		Tanya5.setBackground(Color.WHITE);
		
		JCheckBox BlackForest = new JCheckBox("Black Forest");
		BlackForest.setBounds(470, 17, 111, 23);
		panel.add(BlackForest);
		BlackForest.setForeground(Color.WHITE);
		BlackForest.setBackground(Color.BLACK);
		Jenis.add(BlackForest);
		BlackForest.setActionCommand("Black Forest");
		
		JCheckBox OperaCake = new JCheckBox("Opera Cake");
		OperaCake.setBounds(470, 59, 111, 23);
		panel.add(OperaCake);
		OperaCake.setForeground(Color.WHITE);
		OperaCake.setBackground(new Color(128, 0, 0));
		Jenis.add(OperaCake);
		OperaCake.setActionCommand("Opera Cake");
		
		JCheckBox CheeseCake = new JCheckBox("Cheese Cake");
		CheeseCake.setBounds(470, 101, 111, 23);
		panel.add(CheeseCake);
		CheeseCake.setBackground(Color.YELLOW);
		CheeseCake.setForeground(Color.BLACK);
		Jenis.add(CheeseCake);
		CheeseCake.setActionCommand("Cheese Cake");
		
		JCheckBox ChocolateCake = new JCheckBox("Chocolate Cake");
		ChocolateCake.setBounds(470, 139, 111, 23);
		panel.add(ChocolateCake);
		ChocolateCake.setForeground(Color.WHITE);
		ChocolateCake.setBackground(new Color(102, 0, 0));
		Jenis.add(ChocolateCake);
		ChocolateCake.setActionCommand("Chocolate Cake");
		
		JCheckBox RedVelvet = new JCheckBox("Red Velvet");
		RedVelvet.setForeground(new Color(255, 255, 255));
		RedVelvet.setBounds(470, 181, 111, 23);
		panel.add(RedVelvet);
		RedVelvet.setBackground(Color.RED);
		Jenis.add(RedVelvet);
		RedVelvet.setActionCommand("Red Velvet");
		
		
		JLabel Umur = new JLabel("Lilin Umur");
		Umur.setBounds(10, 157, 106, 31);
		panel.add(Umur);
		Umur.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Umur.setIcon(new ImageIcon(GUI.class.getResource("/Gambar/lilin2.png")));
				
			
				
				JLabel KueBlFo = new JLabel("");
				KueBlFo.setBounds(434, 16, 37, 31);
				panel.add(KueBlFo);
				KueBlFo.setIcon(new ImageIcon(GUI.class.getResource("/Gambar/Black Forest 2.png")));
				
				JLabel KueOC = new JLabel("");
				KueOC.setBounds(434, 49, 37, 31);
				panel.add(KueOC);
				KueOC.setIcon(new ImageIcon(GUI.class.getResource("/Gambar/Opera Cake 2.png")));
				
				JLabel KueChC = new JLabel("");
				KueChC.setBounds(434, 93, 37, 31);
				panel.add(KueChC);
				KueChC.setIcon(new ImageIcon(GUI.class.getResource("/Gambar/Cheese Cake 3.png")));
				
				JLabel KueChocoC = new JLabel("");
				KueChocoC.setBounds(434, 127, 37, 40);
				panel.add(KueChocoC);
				KueChocoC.setIcon(new ImageIcon(GUI.class.getResource("/Gambar/Chocolate 2.png")));
				
				JLabel lblNewLabel_9 = new JLabel("");
				lblNewLabel_9.setBounds(434, 176, 37, 31);
				panel.add(lblNewLabel_9);
				lblNewLabel_9.setIcon(new ImageIcon(GUI.class.getResource("/Gambar/Red 2.png")));
				
				txtUmur = new JTextField();
				txtUmur.setToolTipText("Gratis");
				txtUmur.setBounds(123, 163, 55, 20);
				panel.add(txtUmur);
				txtUmur.setColumns(10);
				
				JLabel JenisKue = new JLabel("Jenis Kue");
				JenisKue.setForeground(Color.WHITE);
				JenisKue.setBounds(327, 27, 97, 14);
				panel.add(JenisKue);
				JenisKue.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
				JenisKue.setHorizontalAlignment(SwingConstants.CENTER);
				
				JPanel panel_1_1 = new JPanel();
				panel_1_1.setLayout(null);
				panel_1_1.setBackground(new Color(139, 69, 19));
				panel_1_1.setBounds(327, 24, 97, 21);
				panel.add(panel_1_1);
				
				JPanel panel_1_2 = new JPanel();
				panel_1_2.setLayout(null);
				panel_1_2.setBackground(new Color(139, 69, 19));
				panel_1_2.setBounds(10, 24, 97, 21);
				panel.add(panel_1_2);
				
				JLabel UkuranKue = new JLabel("Ukuran Kue");
				UkuranKue.setHorizontalAlignment(SwingConstants.CENTER);
				UkuranKue.setBounds(0, 0, 96, 21);
				panel_1_2.add(UkuranKue);
				UkuranKue.setForeground(Color.WHITE);
				UkuranKue.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
				
				JPanel panel_1 = new JPanel();
				panel_1.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "Detail Pemesan", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_1.setBackground(new Color(233, 150, 122));
				panel_1.setBounds(10, 199, 414, 228);
				panel.add(panel_1);
				panel_1.setLayout(null);
				
				JLabel lblNewLabel_2 = new JLabel("Nama Pemesan");
				lblNewLabel_2.setForeground(Color.BLACK);
				lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblNewLabel_2.setBounds(22, 54, 93, 20);
				panel_1.add(lblNewLabel_2);
				
				JLabel lblNewLabel_2_1 = new JLabel("Nomor HP");
				lblNewLabel_2_1.setForeground(Color.BLACK);
				lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblNewLabel_2_1.setBounds(22, 85, 93, 20);
				panel_1.add(lblNewLabel_2_1);
				
				JLabel lblNewLabel_2_2 = new JLabel("Zona Kirim");
				lblNewLabel_2_2.setForeground(Color.BLACK);
				lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblNewLabel_2_2.setBounds(22, 114, 93, 20);
				panel_1.add(lblNewLabel_2_2);
				
				JLabel lblNewLabel_2_3 = new JLabel("Alamat");
				lblNewLabel_2_3.setForeground(Color.BLACK);
				lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblNewLabel_2_3.setBounds(22, 145, 93, 20);
				panel_1.add(lblNewLabel_2_3);
				
				txtNama = new JTextField();
				txtNama.setColumns(10);
				txtNama.setBounds(125, 55, 273, 20);
				panel_1.add(txtNama);
				
				txtNoHP = new JTextField();
				txtNoHP.setColumns(10);
				txtNoHP.setBounds(125, 86, 273, 20);
				panel_1.add(txtNoHP);
				
				JTextArea textAreaAlamat = new JTextArea();
				textAreaAlamat.setBounds(125, 144, 273, 73);
				panel_1.add(textAreaAlamat);
				
				JCheckBox kalimantan = new JCheckBox("Kalimantan");
				kalimantan.setBackground(new Color(233, 150, 122));
				kalimantan.setForeground(new Color(0, 0, 0));
				kalimantan.setBounds(121, 116, 97, 23);
				panel_1.add(kalimantan);
				pengiriman.add(kalimantan);
				kalimantan.setActionCommand("Kalimantan");
				
				JCheckBox luarkalimantan = new JCheckBox("Luar Kalimantan");
				luarkalimantan.setForeground(Color.BLACK);
				luarkalimantan.setBackground(new Color(233, 150, 122));
				luarkalimantan.setBounds(245, 116, 130, 23);
				panel_1.add(luarkalimantan);
				pengiriman.add(luarkalimantan);
				luarkalimantan.setActionCommand("Luar Kalimantan");
				
				JLabel lblNewLabel_2_4 = new JLabel("ID Pesanan");
				lblNewLabel_2_4.setForeground(Color.BLACK);
				lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblNewLabel_2_4.setBounds(22, 23, 93, 20);
				panel_1.add(lblNewLabel_2_4);
				
				txtId = new JTextField();
				txtId.setColumns(10);
				txtId.setBounds(125, 24, 273, 20);
				panel_1.add(txtId);
				
				JPanel panel_2 = new JPanel();
				panel_2.setBackground(new Color(139, 69, 19));
				panel_2.setBounds(632, 1, 285, 505);
				contentPane.add(panel_2);
				panel_2.setLayout(null);
				
				JButton TotalHarga = new JButton("BAYAR YA!!");
				TotalHarga.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showConfirmDialog(TotalHarga, "TERIMAKASIH SUDAH MEMBELI :D", "INFO", JOptionPane.PLAIN_MESSAGE);
						try {
							Tabel.tampilkanData();
							textArea.setText("");
							    
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, "Periksa lagi inputan anda."+e1, "KESALAHAN INPUT!!", 0);
						}
					}
				});
				
				TotalHarga.setFont(new Font("Tahoma", Font.BOLD, 11));
				TotalHarga.setBounds(75, 443, 139, 39);
				panel_2.add(TotalHarga);
				TotalHarga.setBackground(Color.GREEN);
				TotalHarga.setForeground(Color.BLACK);
				TotalHarga.setIcon(new ImageIcon(GUI.class.getResource("/Gambar/uang 3.png")));
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 181, 265, 206);
				panel_2.add(scrollPane);
				
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setIcon(new ImageIcon(GUI.class.getResource("/Gambar/3753050.png")));
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setBounds(10, 11, 265, 133);
				panel_2.add(lblNewLabel);
				
				JLabel lblNewLabel_1 = new JLabel("DESKRIPSI PESANAN KUE");
				lblNewLabel_1.setForeground(new Color(255, 255, 255));
				lblNewLabel_1.setFont(new Font("Cambria Math", Font.BOLD, 15));
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1.setBounds(10, 149, 265, 29);
				panel_2.add(lblNewLabel_1);
				
				textArea = new JTextArea();
				textArea.setBounds(12, 181, 263, 204);
				panel_2.add(textArea);
				
				JLabel lblTabel = new JLabel("");
				lblTabel.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						new Tabel();
					}
				});
				lblTabel.setBounds(317, 7, 79, 44);
				contentPane.add(lblTabel);
				lblTabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblTabel.setIcon(new ImageIcon(GUI.class.getResource("/Gambar/Kirim.png")));
		
		Tanya5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Sangatkecil J = new Sangatkecil  ();
				J.setVisible(true);
				J.setDefaultCloseOperation(HIDE_ON_CLOSE);
			}
		});
		
		Tanya4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Kecil I = new Kecil  ();
				I.setVisible(true);
				I.setDefaultCloseOperation(HIDE_ON_CLOSE);
			}
		});
		
			Tanya3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Sedang H = new Sedang  ();
					H.setVisible(true);
					H.setDefaultCloseOperation(HIDE_ON_CLOSE);
				}
			});
		
		Tanya2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Besar G = new Besar  ();
				G.setVisible(true);
				G.setDefaultCloseOperation(HIDE_ON_CLOSE);
			}
		});
		
		JButton Checkout = new JButton("Checkout");
		Checkout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nanyalok = JOptionPane.showConfirmDialog(Checkout, "Lanjut ke pembayaran?", "Tunggu Bentar", JOptionPane.YES_NO_OPTION);
				try {
					String sql = "insert into pesanan values('"+Integer.parseInt(txtId.getText())+"','"+txtNama.getText()+"','"+txtNoHP.getText()+"','"+pengiriman.getSelection().getActionCommand()+"','"+textAreaAlamat.getText()+"','"+Jenis.getSelection().getActionCommand()+"','"+Ukuran.getSelection().getActionCommand()+"','"+Integer.parseInt(txtUmur.getText())+"')";
					Connection con = (Connection)Mysql.con();
					PreparedStatement pst = con.prepareStatement(sql);
					pst.execute();
					if (nanyalok == 0) {
						deskripsi();
						Ukuran.clearSelection();;
						Jenis.clearSelection();
						txtUmur.setText("");
						txtId.setText("");
						txtNama.setText("");
						txtNoHP.setText("");
						pengiriman.clearSelection();
						textAreaAlamat.setText("");
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(Checkout, "Gagal Checkout", "Perhatian!!", 0);
				}
			}
		});
		
		Checkout.setFont(new Font("Tahoma", Font.BOLD, 14));
		Checkout.setBounds(445, 347, 145, 38);
		panel.add(Checkout);
		
		JLabel lblNewLabel_3 = new JLabel("Toko Kue DIPOOOO");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setForeground(new Color(139, 0, 0));
		lblNewLabel_3.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_3.setBounds(10, 11, 276, 32);
		contentPane.add(lblNewLabel_3);
}
}