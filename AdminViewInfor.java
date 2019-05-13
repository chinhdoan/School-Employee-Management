package WorkerManagement;
//giangvien
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class AdminViewInfor extends JFrame {
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pst = null;
	String sql;
	private JButton jButton1, jButton2, jButton3;
	private JLabel lbl;
	private JPanel jPanel1, jPanel2;
	private JScrollPane jScrollPane1;
	private JTable jTable1;
	private JTextField jTextField1;
	private Label label1, label2, label3;
	private JLabel lblIdSearch;
	private JTextField textField;
	private JButton btnAdd;
	private JButton btnExit;
	private JButton btnHelp;
	private JButton btnEdit;
	private JTextField textField_1;

	public AdminViewInfor() {
		getContentPane().setBackground(SystemColor.text);
		// TODO Auto-generated constructor stub
		initComponents();
		conn = dbconnect.java_db();
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		 setLocation(size.width / 2 - getWidth() / 2,size.height / 2 - getHeight() / 2);
		//setLocation(60, 0);
		setResizable(false);
		setTitle("Worker View");
		updatetable();
		appBack();

	}
	 public void appBack() {
	    	jButton1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		ViewPage3 av = new ViewPage3();
	        		av.setVisible(true);
	        		dispose();
	        	}
	        });
	    }
	private void updatetable() {
		try {

			String sql = "select * from test1";

			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			jTable1.setModel(DbUtils.resultSetToTableModel(rs));

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {

			try {
				rs.close();
				pst.close();

			} catch (Exception e) {

			}
		}
	}

	private void initComponents() {
		label1 = new Label();
		label2 = new Label();
		jPanel1 = new JPanel();
		jPanel2 = new JPanel();
		jPanel2.setForeground(SystemColor.text);
		jScrollPane1 = new JScrollPane();
		jTable1 = new JTable();
		jTable1.setForeground(SystemColor.windowText);

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		label1.setText("label1");

		label2.setText("label2");

		jPanel1.setBackground(SystemColor.window);
		
		JLabel lblWorkersList = new JLabel();
		lblWorkersList.setText("Workers Viewer List");
		lblWorkersList.setFont(new Font("Tunga", Font.PLAIN, 20));

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addGap(498)
					.addComponent(lblWorkersList)
					.addContainerGap(506, Short.MAX_VALUE))
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblWorkersList, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		jPanel1.setLayout(jPanel1Layout);

		jPanel2.setBackground(SystemColor.text);

		jTable1.setBackground(SystemColor.control);
		jTable1.setFont(new Font("Tahoma", Font.PLAIN, 12)); // NOI18N
		jTable1.setModel(
				new DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jTable1.setIntercellSpacing(new Dimension(2, 0));
		jScrollPane1.setViewportView(jTable1);
		jButton2 = new JButton();
		
				jButton2.setBackground(SystemColor.textHighlightText);
				jButton2.setFont(new Font("Tahoma", 1, 12)); // NOI18N
				jButton2.setIcon(null); // NOI18N
				jButton2.setText("Reload");
				jButton2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton2ActionPerformed(evt);
					}
				});
		jButton1 = new JButton();
		
				jButton1.setBackground(SystemColor.textHighlightText);
				jButton1.setFont(new Font("Tahoma", 1, 12)); // NOI18N
				jButton1.setIcon(null); // NOI18N
				jButton1.setText("Back");
		
		btnExit = new JButton();
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setText("Exit");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExit.setBackground(Color.WHITE);
		
		btnHelp = new JButton();
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "more information at: www.facebook.com/EagleTeamCFVNno1");
			}
		});
		btnHelp.setText("Help");
		btnHelp.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnHelp.setBackground(Color.WHITE);

		GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addGap(38)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnExit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnHelp, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
						.addComponent(jButton2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
					.addGap(57)
					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 958, GroupLayout.PREFERRED_SIZE))
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(Alignment.TRAILING)
				.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addGap(19)
					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 313, Short.MAX_VALUE)
					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnHelp, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addGap(27))
		);
		jPanel2.setLayout(jPanel2Layout);
		
		lblIdSearch = new JLabel();
		lblIdSearch.setText("WorkerID Search\r\n");
		lblIdSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jTextField1 = new JTextField();
		
				jTextField1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jTextField1ActionPerformed(evt);
					}
				});
				jTextField1.addKeyListener(new KeyAdapter() {
					public void keyReleased(KeyEvent evt) {
						SearchKeyReleased(evt);
					}
				});
		lbl = new JLabel();
		
				lbl.setFont(new Font("Tahoma", Font.PLAIN, 14)); // NOI18N
				lbl.setText("Name Search");
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				SearchingKeyReleased(arg0);
			}
		});
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jButton3 = new JButton();
		
				jButton3.setBackground(SystemColor.textHighlightText);
				jButton3.setFont(new Font("Tahoma", 1, 12)); // NOI18N
				jButton3.setIcon(null); // NOI18N
				jButton3.setText("Delete");
				jButton3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton3ActionPerformed(evt);
					}
				});
		
		btnAdd = new JButton();
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminAddingInfor av = new AdminAddingInfor();
				av.setVisible(true);
				dispose();
			}
		});
		btnAdd.setText("Add");
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAdd.setBackground(Color.WHITE);
		
		btnEdit = new JButton();
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdminEditInfor a = new AdminEditInfor();
				a.setVisible(true);
				dispose();
			}
		});
		btnEdit.setText("Edit");
		btnEdit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEdit.setBackground(Color.WHITE);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent arg1) {
				SearchingKeyReleasedDOB(arg1);
			}
		});
			
		
		
		JLabel lblDobSearch = new JLabel();
		lblDobSearch.setText("DOB Search");
		lblDobSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
				

		GroupLayout layout = new GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.TRAILING)
				.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 1142, Short.MAX_VALUE)
				.addGroup(layout.createSequentialGroup()
					.addGap(42)
					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnEdit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnAdd, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(layout.createSequentialGroup()
							.addComponent(lblIdSearch, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(lbl)
							.addGap(18)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblDobSearch, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
							.addGap(16))
						.addGroup(layout.createSequentialGroup()
							.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 958, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addGap(84)
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addComponent(lbl, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblIdSearch, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblDobSearch, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createSequentialGroup()
							.addGap(2)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
					.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(layout.createSequentialGroup()
							.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addGap(52))
						.addGroup(layout.createSequentialGroup()
							.addComponent(btnEdit, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 543, GroupLayout.PREFERRED_SIZE))
		);
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton3ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		// TODO add your handling code here:
		AdminDeleteInforTest av = new AdminDeleteInforTest(); 
		av.setVisible(true);
		// setVisible(true);
		dispose();

	}// GEN-LAST:event_jButton3ActionPerformed

	

	private void jTextField1ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jTextField1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField1ActionPerformed

	private void SearchingKeyReleased(KeyEvent arg0) {// GEN-FIRST:event_textFieldKeyReleased
		// TODO add your handling code here:
		try {
			
			String sql2 = "select * from test1 where name Like ?";
			
				pst = conn.prepareStatement(sql2);
				pst.setString(1, "%" + textField.getText() + "%");
				rs = pst.executeQuery();
				jTable1.setModel(DbUtils.resultSetToTableModel(rs));
			
			

			

		

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {

			try {

				rs.close();
				pst.close();

			} catch (Exception e) {

			}
		}

	}// GEN-LAST:event_jTextField1KeyReleased
	private void SearchKeyReleased(KeyEvent ev) {// GEN-FIRST:event_textFieldKeyReleased
		// TODO add your handling code here:
		try {
			String sql = "select* from test1 where worker_id = ?";
			
		

		
				pst = conn.prepareStatement(sql);
				pst.setString(1, jTextField1.getText());
				rs = pst.executeQuery();
				jTable1.setModel(DbUtils.resultSetToTableModel(rs));
			

		

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {

			try {

				rs.close();
				pst.close();

			} catch (Exception e) {

			}
		}

	}// GEN-LAST:event_jTextField1KeyReleased
	private void SearchingKeyReleasedDOB(KeyEvent arg1) {// GEN-FIRST:event_textFieldKeyReleased
		// TODO add your handling code here:
		try {
			
			String sql3 = "select * from test1 where birth_day Like ?";
			
				pst = conn.prepareStatement(sql3);
				pst.setString(1, "%" + textField_1.getText() + "%");
				rs = pst.executeQuery();
				jTable1.setModel(DbUtils.resultSetToTableModel(rs));
			
			

			

		

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {

			try {

				rs.close();
				pst.close();

			} catch (Exception e) {

			}
		}

	}
	private void jButton2ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		// TODO add your handling code here:
		updatetable();
		jTextField1.setText("");
	}// GEN-LAST:event_jButton2ActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(AdminViewInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AdminViewInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AdminViewInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AdminViewInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AdminViewInfor().setVisible(true);

			}
		});
	}
}
