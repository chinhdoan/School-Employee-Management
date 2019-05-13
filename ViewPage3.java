package WorkerManagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Window.Type;

public class ViewPage3 extends JFrame{

    public static void main(String[] args) {
         new ViewPage3();
         
    }

    
    private JPanel p1;
    private ImageIcon img;
    private JButton btnHelp;
    private JButton btnExit;
    private JButton btnDelete;
    private JButton btnView;
    private JButton btnBack;
    private JButton btnUpdate;
    private JButton btnEdit;

    ViewPage3() {
    	setResizable(false);
    	String[] types = {"giang vien","nhan vien hanh chinh" , "lao dong thoi vu"};
        p1 = new JPanel();
        p1.setBounds(0, 0, 1200, 700);
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        

        getContentPane().setLayout(null);

        getContentPane().add(p1);
        
        Canvas canvas = new Canvas();
        canvas.setBounds(150, 0, 1, 672);
        p1.add(canvas);
        canvas.setBackground(UIManager.getColor("menu"));
        
        btnHelp = new JButton("Help");
        btnHelp.setMnemonic('u');
        btnHelp.setBackground(SystemColor.control);
        btnHelp.setBounds(32, 603, 80, 30);
        p1.add(btnHelp);
        
        btnExit = new JButton("Exit");
        
        btnExit.setMnemonic('u');
        btnExit.setBackground(SystemColor.control);
        btnExit.setBounds(32, 632, 80, 30);
        p1.add(btnExit);
        
        btnDelete = new JButton("Deleter");
   
        btnDelete.setMnemonic('u');
        btnDelete.setBackground(SystemColor.menu);
        btnDelete.setBounds(32, 171, 80, 30);
        p1.add(btnDelete);
        
        btnView = new JButton("Viewer");
       
        btnView.setMnemonic('u');
        btnView.setBackground(SystemColor.menu);
        btnView.setBounds(32, 228, 80, 30);
        p1.add(btnView);
        
        btnBack = new JButton("Back");
       
        btnBack.setMnemonic('u');
        btnBack.setBackground(SystemColor.menu);
        btnBack.setBounds(32, 574, 80, 30);
        p1.add(btnBack);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setBackground(SystemColor.control);
        comboBox.addItem("nhan vien hanh chinh");
        comboBox.addItem("lao dong thoi vu");
        comboBox.addItem("giang vien");
        comboBox.setSelectedItem(1);
        Object obj = comboBox.getSelectedItem();
        comboBox.setBounds(288, 115, 158, 40);
        
        p1.add(comboBox);
        
        JLabel lblType = new JLabel("Choose Type:");
        lblType.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblType.setBounds(191, 122, 120, 22);
        p1.add(lblType);
        
        btnUpdate = new JButton("Add New User");
        btnUpdate.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		if(comboBox.getSelectedItem().equals("giang vien")) {    			
         			AdminAddingInfor av = new AdminAddingInfor();
     				av.setVisible(true);
     				dispose();
         		}	
         		if(comboBox.getSelectedItem().equals("nhan vien hanh chinh")) {    			
         			AdminAddingInfor1 av = new AdminAddingInfor1();
     				av.setVisible(true);
     				dispose();
         		}		
         		if(comboBox.getSelectedItem().equals("lao dong thoi vu")) {    			
         			AdminAddingInfor2 av = new AdminAddingInfor2();
     				av.setVisible(true);
     				dispose();
         		}		
         	}
         });
        btnView.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(comboBox.getSelectedItem().equals("giang vien")) {    			
         			AdminViewInfor av = new AdminViewInfor();
     				av.setVisible(true);
     				dispose();
         		}	
         		if(comboBox.getSelectedItem().equals("nhan vien hanh chinh")) {    			
         			AdminViewInfor2 av = new AdminViewInfor2();
     				av.setVisible(true);
     				dispose();
         		}		
         		if(comboBox.getSelectedItem().equals("lao dong thoi vu")) {    			
         			AdminViewInfor1 av = new AdminViewInfor1();
     				av.setVisible(true);
     				dispose();
         		}		
        	}
        });
        btnDelete.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(comboBox.getSelectedItem().equals("giang vien")) {    			
        			AdminDeleteInforTest avi = new AdminDeleteInforTest();
     				avi.setVisible(true);
     				dispose();
         		}	
         		if(comboBox.getSelectedItem().equals("nhan vien hanh chinh")) {    			
         			AdminDeleteInforTest2 avi = new AdminDeleteInforTest2();
     				avi.setVisible(true);
     				dispose();
         		}		
         		if(comboBox.getSelectedItem().equals("lao dong thoi vu")) {    			
         			AdminDeleteInforTest1 avi = new AdminDeleteInforTest1();
     				avi.setVisible(true);
     				dispose();
         		}		
        	}
        	
        });
        	
     
       
        btnUpdate.setMnemonic('u');
        btnUpdate.setBackground(SystemColor.menu);
        btnUpdate.setBounds(1021, 613, 158, 49);
        p1.add(btnUpdate);
        
        btnEdit = new JButton("Editor");

        btnEdit.setMnemonic('u');
        btnEdit.setBackground(SystemColor.menu);
        btnEdit.setBounds(32, 114, 80, 30);
        btnEdit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
             		if(comboBox.getSelectedItem().equals("giang vien")) {    			
             			new AdminEditInfor().setVisible(true);;
         				
         				dispose();
             		}	
             		if(comboBox.getSelectedItem().equals("nhan vien hanh chinh")) {    			
             			 new AdminEditInfor1().setVisible(true);;
         				
         				dispose();
             		}		
             		if(comboBox.getSelectedItem().equals("lao dong thoi vu")) {    			
             			new AdminEditInfor2().setVisible(true);;
         				
         				dispose();
             		}		
             	}
             });
        p1.add(btnEdit);
        setSize(1200, 700);
        setVisible(true);
        setLocation(370, 50);
        setTitle("Worker Types VNUK Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        addWorkers();
        editWorkers();
       
        appBack();
        appExit();
      
    }

    
    public void addWorkers() {
    }

    public void editWorkers() {
    	
    }

    
    public void appBack() {
    	btnBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ViewPage2 av = new ViewPage2();
        		av.setVisible(true);
        		dispose();
        	}
        });
    }

    public void appExit() {
    	btnExit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		System.exit(0);
        	}
        });
    }
  
    
}

