package WorkerManagement;
//laodongthoivu
import java.awt.*;
import java.io.*;
import java.sql.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import net.proteanit.sql.DbUtils;

public class AdminEditInfor2 extends JFrame {
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pstm = null;
	private JButton jButton3, jButton4, jButton5, jButton7;
	private JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel6, jLabel7, jLabel9;
	private JPanel jPanel1, jPanel2;
	private JTextField jTextField1, jTextField2, jTextField3, jTextField4, jTextField5;
	
	private JLabel lblSearchName;
	private JTextField textField;
	private JTextField jTextField6;
	private JLabel lblType;
	private JTextField jTextField7;
	private JButton btnEdit;
	private JButton btnHelp;

	public AdminEditInfor2() {
		setBackground(SystemColor.textHighlightText);
		getContentPane().setBackground(SystemColor.window);
		// TODO Auto-generated constructor stub
		initComponents();
		con = dbconnect.java_db();
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
		getContentPane().setPreferredSize(new Dimension(1200, 700));

		setResizable(false);
	
		setTitle("Worker Editor");
	}

	private void initComponents() {
		jPanel1 = new JPanel();
		jPanel2 = new JPanel();
		jLabel2 = new JLabel();
		jLabel3 = new JLabel();
		jTextField2 = new JTextField();
		jTextField2.setEditable(false);
		jTextField3 = new JTextField();
		jLabel4 = new JLabel();
		jLabel7 = new JLabel();
		jLabel9 = new JLabel();
		jTextField5 = new JTextField();
		jLabel6 = new JLabel();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(SystemColor.window);

		jPanel2.setBackground(SystemColor.window);

		jLabel2.setFont(new Font("Tahoma", Font.BOLD, 11)); // NOI18N
		jLabel2.setText("Worker Id");

		jLabel3.setFont(new Font("Tahoma", 1, 11)); // NOI18N
		jLabel3.setText("Name");

		jTextField2.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jTextField2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jTextField2ActionPerformed(evt);
			}
		});

		jTextField3.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jLabel4.setFont(new Font("Tahoma", 1, 11)); // NOI18N
		jLabel4.setText("Birth Day");

		jLabel7.setFont(new Font("Tahoma", 1, 11)); // NOI18N
		jLabel7.setText("Working Price Per Day");

		jLabel9.setFont(new Font("Tahoma", 1, 11)); // NOI18N
		jLabel9.setText("Work days");

		jTextField5.setFont(new Font("Tahoma", 1, 12));

		jLabel6.setFont(new Font("Tahoma", 1, 18)); // NOI18N
		jLabel6.setForeground(SystemColor.activeCaptionBorder);
		jLabel6.setText("Worker Information :");
		jTextField4 = new JTextField();
		
				jTextField4.setFont(new Font("Tahoma", 1, 12));
		
		jTextField6 = new JTextField();
		jTextField6.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		lblType = new JLabel();
		lblType.setText("Type");
		lblType.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		jTextField7 = new JTextField();
		jTextField7.setText("lao dong thoi vu");
		jTextField7.setEditable(false);
		jTextField7.setFont(new Font("Tahoma", Font.PLAIN, 12));

		GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(1383, Short.MAX_VALUE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
										.addGroup(jPanel2Layout.createSequentialGroup()
											.addComponent(jLabel9, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(jTextField5, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
											.addGap(70))
										.addGroup(jPanel2Layout.createSequentialGroup()
											.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel2Layout.createSequentialGroup()
											.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel2Layout.createSequentialGroup()
											.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addGap(50)
											.addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
											.addGap(87)))
									.addGap(72)
									.addComponent(lblType, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
									.addGap(62)
									.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)))
							.addGap(750))))
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addGap(38)
					.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(71)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
						.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblType))
					.addGap(37)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addGap(149)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(77)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel7)
						.addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(36))
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addGap(146)
					.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(234))
		);
		jPanel2.setLayout(jPanel2Layout);

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 1217, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addGap(67)
					.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 576, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		jPanel1.setLayout(jPanel1Layout);
		jLabel1 = new JLabel();
		
				jLabel1.setFont(new Font("Tahoma", 1, 12)); // NOI18N
				jLabel1.setText("Search Worker by ID");
		jTextField1 = new JTextField();
		
				jTextField1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jTextField1ActionPerformed(evt);
					}
				});
				jTextField1.addKeyListener(new KeyAdapter() {
					public void keyReleased(KeyEvent evt) {
						jTextField1KeyReleased(evt);
					}
				});
		
		lblSearchName = new JLabel();
		lblSearchName.setText("Search Worker By Name");
		lblSearchName.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				SearchingKeyReleased(arg0);
			}
		});
		jButton3 = new JButton();
		jButton3.setBackground(SystemColor.textHighlightText);
		
				jButton3.setIcon(null); // NOI18N
				jButton3.setText("Update");
				jButton3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton3ActionPerformed(evt);
					}
				});
		jButton5 = new JButton();
		jButton5.setBackground(SystemColor.window);
		
				jButton5.setIcon(null); // NOI18N
				jButton5.setText("Reload\r\n");
				jButton5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton5ActionPerformed(evt);
					}
				});
		jButton4 = new JButton();
		jButton4.setBackground(SystemColor.textHighlightText);
		
				jButton4.setIcon(null); // NOI18N
				jButton4.setText("Delete");
				jButton4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton4ActionPerformed(evt);
					}
				});
		
		JButton btnDit = new JButton();
		btnDit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdminViewInfor1 a = new AdminViewInfor1();
				a.setVisible(true);
				dispose();
			}
		});
		btnDit.setText("View");
		btnDit.setBackground(Color.WHITE);
		
		btnEdit = new JButton();
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminAddingInfor2 a = new AdminAddingInfor2();
				a.setVisible(true);
				dispose();
			}
		});
		btnEdit.setText("Add");
		btnEdit.setBackground(Color.WHITE);
		jButton7 = new JButton();
		jButton7.setBackground(SystemColor.textHighlightText);
		
				jButton7.setIcon(null); // NOI18N
				jButton7.setText("Back");
				jButton7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton7ActionPerformed(evt);
					}
				});
		
		btnHelp = new JButton();
		btnHelp.setText("Help");
		btnHelp.setBackground(Color.WHITE);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setHgap(1);
		
		JButton btnHelp_1 = new JButton();
		btnHelp_1.setText("Help");
		btnHelp_1.setBackground(Color.WHITE);
		
		JButton btnExit = new JButton();
		btnExit.setText("Exit");
		btnExit.setBackground(Color.WHITE);

		GroupLayout layout = new GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addGap(39)
					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
							.addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(jButton3, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
							.addComponent(jButton5, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
							.addComponent(btnDit, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
							.addComponent(btnEdit, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
							.addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnHelp_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)))
					.addGap(14)
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
							.addGap(23)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
							.addGap(45)
							.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 1019, GroupLayout.PREFERRED_SIZE)
								.addGroup(layout.createSequentialGroup()
									.addGap(53)
									.addComponent(jLabel1)
									.addGap(18)
									.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
									.addGap(80)
									.addComponent(lblSearchName, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))))
						.addComponent(btnHelp, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap(11, Short.MAX_VALUE)
					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblSearchName, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 624, GroupLayout.PREFERRED_SIZE)
					.addGap(222))
				.addGroup(layout.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnHelp, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
					.addGap(59)
					.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnDit, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnEdit, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(15)
					.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 354, Short.MAX_VALUE)
					.addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(btnHelp_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(19)
					.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(108))
		);
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jTextField1ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jTextField1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField1ActionPerformed

	private void jTextField1KeyReleased(KeyEvent evt) {// GEN-FIRST:event_jTextField1KeyReleased
		// TODO add your handling code here:
		try {
			String sql = "select * from test2 where worker_id=? ";

			pstm = con.prepareStatement(sql);
			pstm.setString(1, jTextField1.getText());
			rs = pstm.executeQuery();
			while (rs.next()) {

				String add1 = rs.getString("worker_id");
				jTextField2.setText(add1);
				String add2 = rs.getString("name");
				jTextField3.setText(add2);
				String add3 = rs.getString("birth_day");
				jTextField4.setText(add3);
				String add4 = rs.getString("number_workdays");
				jTextField5.setText(add4);
				String add5 = rs.getString("workdays_unit_price");
				jTextField6.setText(add5);
				String add6 = rs.getString("type");
				jTextField7.setText(add6);
				
				
				
			}
		} catch (Exception e) {

		} finally {

			try {

				rs.close();
				pstm.close();

			} catch (Exception e) {

			}
		}

	}// GEN-LAST:event_jTextField1KeyReleased

	private void jTextField2ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jTextField2ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField2ActionPerformed

	private void jButton5ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
		// TODO add your handling code here:
		jTextField1.setText("");
		jTextField2.setText("");
		jTextField3.setText("");
		jTextField4.setText("");
		jTextField5.setText("");
		jTextField6.setText("");
		jTextField7.setText("");
		textField.setText("");
	
		
		
	}// GEN-LAST:event_jButton5ActionPerformed

	private void jButton4ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
		// TODO add your handling code here:
		if (jTextField1.getText().equals("") && textField.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Record is Not Selected");
		} else {
			int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete record?", "Delete",
					JOptionPane.YES_NO_OPTION);
			if (p == 0) {
				String sql = "delete from test2 where worker_id=? ";
				String sql2 = "delete from test2 where name=? ";
				try {
					pstm = con.prepareStatement(sql);
					pstm.setString(1, jTextField1.getText());
					pstm = con.prepareStatement(sql2);
					pstm.setString(1, textField.getText());
					pstm.execute();

					JOptionPane.showMessageDialog(null, "Record Deleted successfully");
					textField.setText("");
					jTextField1.setText("");
					jTextField2.setText("");
					jTextField3.setText("");
					jTextField4.setText("");
					jTextField5.setText("");
					jTextField6.setText("");
					jTextField7.setText("");
					textField.setText("");
					
					
					
				} catch (Exception e) {

					JOptionPane.showMessageDialog(null, e);
				} finally {

					try {
						rs.close();
						pstm.close();

					} catch (Exception e) {

					}
				}
			}
		}
	}// GEN-LAST:event_jButton4ActionPerformed
	private void SearchingKeyReleased(KeyEvent arg0) {// GEN-FIRST:event_textFieldKeyReleased
		// TODO add your handling code here:
				try {
					String sql2 = "select * from test2 where name Like ? ";

					pstm = con.prepareStatement(sql2);
					pstm.setString(1, "%" + textField.getText() + "%");
					rs = pstm.executeQuery();
					while (rs.next()) {

						String add1 = rs.getString("worker_id");
						jTextField2.setText(add1);
						String add2 = rs.getString("name");
						jTextField3.setText(add2);
						String add3 = rs.getString("birth_day");
						jTextField4.setText(add3);
						String add4 = rs.getString("number_workdays");
						jTextField5.setText(add4);
						String add5 = rs.getString("workdays_unit_price");
						jTextField6.setText(add5);
						String add6 = rs.getString("type");
						jTextField7.setText(add6);
						
						
						
					}
				} catch (Exception e) {

				} finally {

					try {

						rs.close();
						pstm.close();

					} catch (Exception e) {

					}
				}

			}// GEN-LAST:event_jTextField1KeyReleased


	// GEN-LAST:event_jTextField1KeyReleased
	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		// TODO add your handling code here:
		if (jTextField1.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "WorkerID is Not Selected");
		} else {
			int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to update?", "Update Record",
					JOptionPane.YES_NO_OPTION);
			if (p == 0) {
				try {
					String value0 = jTextField1.getText();
					String value1 = jTextField2.getText();
					String value2 = jTextField3.getText();
					String value3 = jTextField4.getText();
					String value4 = jTextField5.getText();
					String value5 = jTextField6.getText();
					String value6 = jTextField7.getText();
					
					
				
					
					
						String sql = "update test2 set worker_id='" + value1 + "',name='" + value2 + "', birth_day='"
								+ value3 + "', " + "number_workdays='" + value4 + "',workdays_unit_price='" + value5 +"'" 
								+ "where worker_id='" + value0 + "' ";
						pstm = con.prepareStatement(sql);
						pstm.execute();
					
					
		

					
				
					// pst.setBytes(1,person_image);
					
					JOptionPane.showMessageDialog(null, "RecordSuccessfully Updated");

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				} finally {

					try {
						rs.close();
						pstm.close();

					} catch (Exception e) {

					}
				}
			}

		}
	}// GEN-LAST:event_jButton3ActionPerformed

	private void jButton7ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton7ActionPerformed
		// TODO add your handling code here:
		new ViewPage3().setVisible(true);
		dispose();
	}// GEN-LAST:event_jButton7ActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
		// code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(AdminEditInfor2.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AdminEditInfor2.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AdminEditInfor2.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AdminEditInfor2.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AdminEditInfor2().setVisible(true);
			}
		});
	}
}
