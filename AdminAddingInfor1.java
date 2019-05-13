package WorkerManagement;
//nhanvienhanhchinh 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


import java.io.*;
import java.sql.*;


public class AdminAddingInfor1 extends JFrame {
	public static void main(String[] args) {
		new AdminAddingInfor1();
		
	}

	Container c;
	JPanel p3, p5;
	ImageIcon img;
	JLabel l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l15;
	JTextField t1, t4, t7, t2, t3, t8, t5, t6, t9, t10, t11;
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	String s;
	private JPanel panel;
	private JButton btnBack;
	private JButton button_1;
	private JButton btnExit;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton btnUpdate;

	public AdminAddingInfor1() {
		// TODO Auto-generated constructor stub
		// first panel
		c = getContentPane();


		// fifth panel
		p5 = new JPanel();
		p5.setLayout(null);
		p5.setBackground(SystemColor.window);
		c.add(p5);
		JLabel label1 = new JLabel("Fill the Following Information:");
		label1.setBounds(173, 11, 300, 50);
		p5.add(label1);
		label1.setFont(new Font(label1.getName(), Font.BOLD, 20));
		label1.setForeground(SystemColor.controlShadow);
		
		// third panel
		p3 = new JPanel();
		p5.add(p3);
		p3.setLayout(null);
		p3.setBackground(SystemColor.window);
		p3.setBounds(183, 57, 991, 530);
		
		// fifth panel end and start function of third panel body
		l2 = new JLabel("WorkerID");
		l2.setBounds(20, 136, 80, 30);
		t1 = new JTextField(50);
		t1.setBounds(90, 136, 150, 30);
				
		l5 = new JLabel("HomeTown");
		l5.setBounds(20, 310, 130, 30);
		t4 = new JTextField(50);
		t4.setBounds(120, 310, 160, 30);
						
		l8 = new JLabel("Salary Factor");
		l8.setBounds(562, 70, 130, 30);
		t7 = new JTextField(50);
		t7.setBounds(672, 70, 150, 30);
								
		l3 = new JLabel("Name");
		l3.setBounds(20, 196, 80, 30);
		t2 = new JTextField(50);
		t2.setBounds(90, 196, 150, 30);
										
		l4 = new JLabel("Date Of Birth");
		l4.setBounds(20, 256, 130, 30);
		t3 = new JTextField(50);
		t3.setBounds(120, 256, 160, 30);
												
		l9 = new JLabel("Money Support");
		l9.setBounds(562, 121, 160, 30);
		t8 = new JTextField(50);
		t8.setBounds(728, 121, 150, 30);

		l6 = new JLabel("Department");
		l6.setBounds(20, 374, 80, 30);
		t5 = new JTextField(50);
		t5.setBounds(90, 374, 150, 30);
																
		l7 = new JLabel("Work days");
		l7.setBounds(20, 430, 130, 30);
		t6 = new JTextField(50);
		t6.setBounds(120, 430, 160, 30);
																		
		l10 = new JLabel("Position");
		l10.setBounds(562, 173, 130, 30);
		t9 = new JTextField(50);
		t9.setBounds(672, 173, 150, 30);
																				
		l11 = new JLabel("Year Working Number");
		l11.setBounds(562, 239, 130, 30);
		t10 = new JTextField(50);
		t10.setBounds(703, 239, 250, 30);
																						
		l12 = new JLabel("Type");
		l12.setBounds(20, 70, 130, 30);
		t11 = new JTextField(50);
		t11.setEditable(false);
		t11.setText("nhanvienhanhchinh");
		t11.setBounds(90, 70, 250, 30);
		
		
		panel = new JPanel();
		panel.setBackground(SystemColor.controlHighlight);
		panel.setBounds(150, 0, 2, 672);
		p5.add(panel);
		
		btnBack = new JButton("Back");
		btnBack.setMnemonic('u');
		btnBack.setBackground(SystemColor.menu);
		btnBack.setBounds(34, 573, 80, 30);
		p5.add(btnBack);
		
		button_1 = new JButton("Help");
		button_1.setMnemonic('u');
		button_1.setBackground(SystemColor.menu);
		button_1.setBounds(34, 602, 80, 30);
		p5.add(button_1);
		
		btnExit = new JButton("Exit");
		btnExit.setMnemonic('u');
		btnExit.setBackground(SystemColor.menu);
		btnExit.setBounds(34, 631, 80, 30);
		p5.add(btnExit);
		
		button_3 = new JButton("Editor");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminEditInfor1 av = new AdminEditInfor1();
				av.setVisible(true);
				dispose();
			}
		});
		button_3.setMnemonic('u');
		button_3.setBackground(SystemColor.menu);
		button_3.setBounds(34, 81, 80, 30);
		p5.add(button_3);
		
		button_4 = new JButton("Deleter");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
						AdminDeleteInforTest2 av = new AdminDeleteInforTest2();
						av.setVisible(true);
						dispose();
					}
				});
			
		
		button_4.setMnemonic('u');
		button_4.setBackground(SystemColor.menu);
		button_4.setBounds(34, 128, 80, 30);
		p5.add(button_4);
		
		button_5 = new JButton("Viewer");
		button_5.setMnemonic('u');
		button_5.setBackground(SystemColor.menu);
		button_5.setBounds(34, 179, 80, 30);
		p5.add(button_5);
		
		btnUpdate = new JButton("Update");
		btnUpdate.setBounds(1064, 626, 120, 40);
		p5.add(btnUpdate);
		btnUpdate.setBackground(SystemColor.textHighlightText);
		// create a constructor for logout save and show button
		
		p3.add(l2);
		p3.add(t1);
		p3.add(l3);
		p3.add(t2);
		p3.add(l4);
		p3.add(t3);
		p3.add(l5);
		p3.add(t4);
		p3.add(l6);
		p3.add(t5);
		p3.add(l7);
		p3.add(t6);
		p3.add(l8);
		p3.add(t7);
		p3.add(l9);
		p3.add(t8);
		p3.add(l10);
		p3.add(t9);
		p3.add(l11);
		p3.add(t10);
		p3.add(l12);
		p3.add(t11);
			
		
		
		

		setSize(1200, 700);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		setTitle("Adding Worker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appView();
		appExit();
		appBack();
		save();
	}

	public void appExit() {
    	btnExit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		System.exit(0);
        	}
        });
    }
	public void appView() {
    	button_5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		AdminViewInfor2 av = new AdminViewInfor2();
        		av.setVisible(true);
        		dispose();
        	}
        });
    }
	public void appBack() {
    	btnBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ViewPage3 av = new ViewPage3();
        		av.setVisible(true);
        		dispose();
        	}
        });
    }
	public void save() {
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn = null;
				Statement stmt = null;
				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = t3.getText();
				String s4 = t4.getText();
				String s5 = t5.getText();
				String s6 = t6.getText();
				String s7 = t7.getText();
				String s8 = t8.getText();
				String s9 = t9.getText();
				String s10 = t10.getText();
				String s11 = t11.getText();
				

				if (t1.getText().equals("") || t2.getText().equals("") || t3.getText().equals("")
						|| t4.getText().equals("") || t5.getText().equals("") || t6.getText().equals("")
						|| t7.getText().equals("") || t8.getText().equals("") || t9.getText().equals("")
						|| t10.getText().equals("") || t11.getText().equals("")) {
					JOptionPane.showMessageDialog(btnUpdate, "All record Must be fill Out");
				} else {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						con = dbconnect.java_db();
						System.out.println("every thing is ok in connection");
						JOptionPane.showConfirmDialog(null, "Are you sure Insert Data?", "Delete",
								JOptionPane.YES_NO_OPTION);
						ps = con.prepareStatement(
								"INSERT INTO test3(worker_id,name,birth_day,home_town,department,"
										+ "workdays_number,salary_factor,money_support,position,working_years,type)"
										+ "VALUES(?,?,?,?,?,?,?,?,?,?,?)");
						System.out.println("ok in prepared statement");
						ps.setString(1, s1);
						ps.setString(2, s2);
						ps.setString(3, s3);
						ps.setString(4, s4);
						ps.setString(5, s5);
						ps.setString(6, s6);
						ps.setString(7, s7);
						ps.setString(8, s8);
						ps.setString(9, s9);
						ps.setString(10, s10);
						ps.setString(11, s11);
						ps.executeUpdate();
						System.out.println("ok while execute ");
						JOptionPane.showMessageDialog(btnUpdate, "sucessfully inserted Data");
						t1.setText("");
						t2.setText("");
						t3.setText("");
						t4.setText("");
						t5.setText("");
						t6.setText("");
						t7.setText("");
						t8.setText("");
						t9.setText("");
						t10.setText("");
					
					

					} catch (SQLException se) {
						se.printStackTrace();

					} catch (Exception ek) {
						ek.printStackTrace();
					} finally {
						try {
							if (stmt != null) {
								conn.close();
							}
						} catch (SQLException se) {
						}
						try {
							if (conn != null) {
								conn.close();
							}
						} catch (SQLException se) {
							se.printStackTrace();
						} // end finally try
					} // end try
					System.out.println("good bye");
				}
			}
		});
	}
}
