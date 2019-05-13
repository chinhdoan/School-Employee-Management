package WorkerManagement;
//giangvien
import java.awt.*;
import java.io.*;
import java.sql.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import net.proteanit.sql.DbUtils;

public class AdminEditInfor extends JFrame {
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pstm = null;
	private JButton jButton2, jButton3, jButton4, jButton5, jButton7;
	private JLabel jLabel1, jLabel10, jLabel11, jLabel12, jLabel13, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9;
	private JPanel jPanel1, jPanel2;
	private JTextField jTextField1, jTextField10, jTextField11, jTextField12, jTextField2, jTextField3, jTextField4, jTextField5, jTextField7, jTextField8, jTextField9;
	
	private JLabel lblSearchName;
	private JTextField textField;
	private JTextField jTextField6;
	private JButton btnAdd;
	private JButton btnView;
	private JButton btnHelp;

	public AdminEditInfor() {
		setBackground(SystemColor.textHighlightText);
		getContentPane().setBackground(SystemColor.window);
		// TODO Auto-generated constructor stub
		initComponents();
		con = dbconnect.java_db();
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
		getContentPane().setPreferredSize(new Dimension(1400, 700));

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
		jLabel5 = new JLabel();
		jTextField5 = new JTextField();
		jLabel7 = new JLabel();
		jLabel8 = new JLabel();
		jTextField7 = new JTextField();
		jLabel9 = new JLabel();
		jTextField8 = new JTextField();
		jTextField9 = new JTextField();
		jLabel11 = new JLabel();
		jTextField10 = new JTextField();
		jLabel12 = new JLabel();
		jTextField11 = new JTextField();
		jLabel13 = new JLabel();
		jTextField12 = new JTextField();
		jTextField12.setEditable(false);
		jTextField12.setText("giang vien");
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

		jLabel5.setFont(new Font("Tahoma", 1, 11)); // NOI18N
		jLabel5.setText("HomeTown");

		jTextField5.setFont(new Font("Tahoma", 1, 12));

		jLabel7.setFont(new Font("Tahoma", 1, 11)); // NOI18N
		jLabel7.setText("Specialty");

		jLabel8.setFont(new Font("Tahoma", 1, 11)); // NOI18N
		jLabel8.setText("Degree");

		jTextField7.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jLabel9.setFont(new Font("Tahoma", 1, 11)); // NOI18N
		jLabel9.setText("Money Suport");

		jTextField8.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jTextField9.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jLabel11.setFont(new Font("Tahoma", 1, 11)); // NOI18N
		jLabel11.setText("Salary Factor");

		jTextField10.setFont(new Font("Tahoma", 1, 12));

		jLabel12.setFont(new Font("Tahoma", 1, 11)); // NOI18N
		jLabel12.setText("Year Working Number");

		jTextField11.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jLabel13.setFont(new Font("Tahoma", 1, 11)); // NOI18N
		jLabel13.setText("Type");

		jTextField12.setFont(new Font("Tahoma", Font.PLAIN, 12));

		jLabel6.setFont(new Font("Tahoma", 1, 18)); // NOI18N
		jLabel6.setForeground(SystemColor.activeCaptionBorder);
		jLabel6.setText("Worker Information :");
		jTextField4 = new JTextField();
		
				jTextField4.setFont(new Font("Tahoma", 1, 12));
		jLabel10 = new JLabel();
		jLabel10.setText("Period Working Number");
		
				jLabel10.setFont(new Font("Tahoma", 1, 11));
		
		jTextField6 = new JTextField();
		jTextField6.setFont(new Font("Tahoma", Font.BOLD, 12));

		GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(893, Short.MAX_VALUE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
										.addGroup(jPanel2Layout.createSequentialGroup()
											.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel2Layout.createSequentialGroup()
											.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
												.addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)))
										.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
											.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
												.addGroup(jPanel2Layout.createSequentialGroup()
													.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addGap(50))
												.addGroup(jPanel2Layout.createSequentialGroup()
													.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)))
											.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
												.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
											.addGap(87)))
									.addGap(421))
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addComponent(jLabel9, GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
									.addGap(204)))
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
										.addGroup(jPanel2Layout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(jLabel10))
										.addGroup(jPanel2Layout.createSequentialGroup()
											.addGap(38)
											.addComponent(jLabel8))
										.addGroup(jPanel2Layout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
												.addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))))
									.addGap(25)
									.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(jTextField7)
										.addComponent(jTextField9, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
										.addComponent(jTextField5)
										.addGroup(jPanel2Layout.createSequentialGroup()
											.addGap(10)
											.addComponent(jTextField10))))
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
										.addComponent(jLabel12)
										.addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
									.addGap(105)
									.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(jTextField11, Alignment.TRAILING)
										.addComponent(jTextField12, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))))
							.addGap(16))))
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(177)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jTextField9, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel10))
							.addGap(7)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addGap(40)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jTextField10, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
							.addGap(54)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(jTextField12, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
									.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addComponent(jLabel13)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jLabel12)
								.addComponent(jTextField11, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(38)
							.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addGap(71)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
								.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addGap(37)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addGap(91)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
							.addGap(126)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jLabel7)
								.addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))))
					.addGap(36))
		);
		jPanel2.setLayout(jPanel2Layout);
		jLabel1 = new JLabel();
		
				jLabel1.setFont(new Font("Tahoma", 1, 12)); // NOI18N
				jLabel1.setText("Search Worker by ID");
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				SearchingKeyReleased(arg0);
			}
		});
		
		lblSearchName = new JLabel();
		lblSearchName.setText("Search Worker By Name");
		lblSearchName.setFont(new Font("Tahoma", Font.BOLD, 12));
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

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 1251, Short.MAX_VALUE)
							.addGap(298))
						.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
							.addGap(245)
							.addComponent(jLabel1)
							.addGap(18)
							.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
							.addGap(80)
							.addComponent(lblSearchName, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGap(5)
							.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblSearchName, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGap(5)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 659, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jPanel1.setLayout(jPanel1Layout);
		jButton2 = new JButton();
		jButton2.setBackground(SystemColor.textHighlightText);
		
				jButton2.setIcon(null); // NOI18N
				jButton2.setText("Exit");
				jButton2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton2ActionPerformed(evt);
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
		
		btnAdd = new JButton();
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminAddingInfor a = new AdminAddingInfor();
				a.setVisible(true);
				dispose();
			}
		});
		btnAdd.setText("Add");
		btnAdd.setBackground(Color.WHITE);
		
		btnView = new JButton();
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminViewInfor a = new AdminViewInfor();
				a.setVisible(true);
				dispose();
			}
		});
		btnView.setText("View");
		btnView.setBackground(Color.WHITE);
		jButton4 = new JButton();
		jButton4.setBackground(SystemColor.textHighlightText);
		
				jButton4.setIcon(null); // NOI18N
				jButton4.setText("Delete");
				jButton4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton4ActionPerformed(evt);
					}
				});
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
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnHelp.setText("Help");
		btnHelp.setBackground(Color.WHITE);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setHgap(1);
		flowLayout.setVgap(1);

		GroupLayout layout = new GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jButton5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
						.addComponent(btnAdd, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
						.addComponent(btnView, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
						.addComponent(jButton4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
						.addComponent(jButton3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
						.addComponent(btnHelp, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
						.addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
						.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 1271, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(layout.createSequentialGroup()
							.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnView, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(308))
						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 624, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(btnHelp, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(64))
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
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
			String sql = "select * from test1 where worker_id=? ";

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
				String add4 = rs.getString("home_town");
				jTextField5.setText(add4);
				String add6 = rs.getString("specialty");
				jTextField6.setText(add6);
				String add7 = rs.getString("degree");
				jTextField7.setText(add7);
				String add5 = rs.getString("money_support");
				jTextField8.setText(add5);
				String add8 = rs.getString("period_working_number");
				jTextField9.setText(add8);
				String add9 = rs.getString("salary_factor");
				jTextField10.setText(add9);
				String add10 = rs.getString("working_years");
				jTextField11.setText(add10);
				String add11 = rs.getString("type");
				jTextField12.setText(add11);
				
				
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

	private void jButton2ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		// TODO add your handling code here:
		new LoginPage().setVisible(true);
		dispose();
	}// GEN-LAST:event_jButton2ActionPerformed

	private void jButton5ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
		// TODO add your handling code here:
		jTextField1.setText("");
		jTextField2.setText("");
		jTextField3.setText("");
		jTextField4.setText("");
		jTextField5.setText("");
		jTextField6.setText("");
		jTextField7.setText("");
		jTextField8.setText("");
		jTextField9.setText("");
		jTextField10.setText("");
		jTextField11.setText("");
		
		
	}// GEN-LAST:event_jButton5ActionPerformed

	private void jButton4ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
		// TODO add your handling code here:
		if (jTextField1.getText().equals("") && textField.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Record is Not Selected");
		} else {
			int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete record?", "Delete",
					JOptionPane.YES_NO_OPTION);
			if (p == 0) {
				String sql = "delete from test1 where worker_id=? ";
				String sql2 = "delete from test1 where name=? ";
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
					jTextField8.setText("");
					jTextField9.setText("");
					jTextField10.setText("");
					jTextField11.setText("");
					
					
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
					String sql2 = "select * from test1 where name Like ? ";

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
						String add4 = rs.getString("home_town");
						jTextField5.setText(add4);
						String add5 = rs.getString("specialty");
						jTextField6.setText(add5);
						String add6 = rs.getString("degree");
						jTextField7.setText(add6);
						String add7 = rs.getString("money_support");
						jTextField8.setText(add7);
						String add8 = rs.getString("period_working_number");
						jTextField9.setText(add8);
						String add9 = rs.getString("salary_factor");
						jTextField10.setText(add9);
						String add10 = rs.getString("working_years");
						jTextField11.setText(add10);
						String add11 = rs.getString("type");
						jTextField12.setText(add11);
						
						
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
					String value7 = jTextField8.getText();
					String value8 = jTextField9.getText();
					String value9 = jTextField10.getText();
					String value10 = jTextField11.getText();
				
					
					
						String sql = "update test1 set worker_id='" + value1 + "',name='" + value2 + "', birth_day='"
								+ value3 + "', " + "home_town='" + value4 + "',specialty='" + value5 + "',degree='"
								+ value6 + "',money_support='" + value7 + "',period_working_number= '" + value8 + "', " + "salary_factor='" + value9
								+ "',working_years ='" + value10 + "'" 
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
			java.util.logging.Logger.getLogger(AdminEditInfor.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AdminEditInfor.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AdminEditInfor.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AdminEditInfor.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AdminEditInfor().setVisible(true);
			}
		});
	}
}
