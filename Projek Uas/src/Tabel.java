import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tabel {

	private JFrame frmMyTabelUnchhh;
	public static JTable table;

	public static void tampilkanData() {
		
		try {
			String query = "select * from pesanan;";
			Connection con = (Connection)Mysql.con();
			PreparedStatement pst = con.prepareStatement(query);
			ResultSet rs = pst.executeQuery(query);
			
			DefaultTableModel data = (DefaultTableModel)table.getModel();
	        data.setRowCount(0);
	        
	        String [] save = new String [8];
	        
	        while(rs.next()) {
	        	save[0] = rs.getString("id");
	        	save[1] = rs.getString("nama");
	        	save[2] = rs.getString("nomorhp");
	        	save[3] = rs.getString("zona");
	        	save[4] = rs.getString("alamat");
	        	save[5] = rs.getString("jeniskue");
	        	save[6] = rs.getString("ukurankue");
	        	save[7] = rs.getString("lilin");
	        	
	            data.addRow(save); 
	        }
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Gagal Insert Data\n");
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


	public Tabel() {
		initialize();
		tampilkanData();
	}

	@SuppressWarnings({ "unchecked", "rawtypes", "serial" })
	private void initialize() {
		frmMyTabelUnchhh = new JFrame();
		frmMyTabelUnchhh.setTitle("My Tabel Unchhh");
		frmMyTabelUnchhh.getContentPane().setBackground(new Color(233, 150, 122));
		frmMyTabelUnchhh.setBounds(330, 150, 724, 352);
		frmMyTabelUnchhh.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmMyTabelUnchhh.getContentPane().setLayout(null);
		frmMyTabelUnchhh.setVisible(true);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("Tabel Pembayaran");
		scrollPane.setBounds(10, 47, 688, 256);
		frmMyTabelUnchhh.getContentPane().add(scrollPane);
		
	
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID Pesanan", "Nama Pemesan", "Nomor HP", "Zona Pengiriman", "Alamat", "Jenis Kue", "Ukuran Kue", "Angka Lilin", ""
			}
		) {
			
			/**
			 * 
			 */
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, Object.class, Object.class, String.class, String.class, Integer.class, Integer.class
			};
			
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
					false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(1).setPreferredWidth(87);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(4).setPreferredWidth(194);
		table.getColumnModel().getColumn(8).setPreferredWidth(0);
		
		JLabel tabelbayar = new JLabel("Tabel Pemesanan");
		tabelbayar.setForeground(new Color(128, 0, 0));
		tabelbayar.setFont(new Font("Stencil", Font.BOLD, 22));
		tabelbayar.setHorizontalAlignment(SwingConstants.CENTER);
		tabelbayar.setBounds(246, 11, 210, 25);
		frmMyTabelUnchhh.getContentPane().add(tabelbayar);
		
		JButton clear = new JButton("Clear All");
		clear.setFocusable(false);
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirm = JOptionPane.showConfirmDialog(clear, "Apakah anda yakin ingin menghapus seluruh record pesanan?", "Konfirmasi dulu ya...", JOptionPane.YES_NO_OPTION);
				
				try {
					String query = "truncate table pesanan";
					Connection conn = (Connection)Mysql.con();
					PreparedStatement st = conn.prepareStatement(query);
					
					if (confirm==0) {
						st.executeUpdate();
						JOptionPane.showMessageDialog(clear, "Berhasil menghapus data...");
						tampilkanData();
					}
					
					 if (conn != null) {
				        	try {
				        		conn.close();
							} catch (SQLException e4) {}
				     }
					 
					 if (st != null) {
				        	try {
				        		st.close();
							} catch (SQLException e5) {}
				     }
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(clear, "Gagal!!!");
				}
				
			}
		});
		clear.setBounds(609, 13, 89, 23);
		frmMyTabelUnchhh.getContentPane().add(clear);
	}
}
