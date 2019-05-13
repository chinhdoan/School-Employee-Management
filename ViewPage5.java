package WorkerManagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Window.Type;

public class ViewPage5 extends JFrame{

    public static void main(String[] args) {
         new ViewPage5();
         
    }

    
    private JPanel p1;
    private ImageIcon img;
    private JButton btnHelp;
    private JButton btnExit;
    private JButton btnView;
    private JButton btnBack;
    private JButton btnUpdate;
    private JButton btnEdit;
    private JLabel lblNhaa;
    private JTextField textField;
    private JButton btnUpdate_1;

    ViewPage5() {
    	setResizable(false);
    	String[] types = {"giang vien","nhan vien hanh chinh" , "lao dong thoi vu"};
        p1 = new JPanel();
        p1.setBounds(0, 0, 1200, 700);
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        
        img = new ImageIcon(getClass().getResource("/StudentMgmtSys/User-icon.png"));
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
        
        btnView = new JButton("Subcribe");
       
        btnView.setMnemonic('u');
        btnView.setBackground(SystemColor.menu);
        btnView.setBounds(32, 157, 80, 30);
        p1.add(btnView);
        
        btnBack = new JButton("Back");
       
        btnBack.setMnemonic('u');
        btnBack.setBackground(SystemColor.menu);
        btnBack.setBounds(32, 574, 80, 30);
        p1.add(btnBack);
        
        btnUpdate = new JButton("Add New User");
        btnUpdate.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		
         	}
         });
        btnView.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        	}
        });
        	
     
       
        btnUpdate.setMnemonic('u');
        btnUpdate.setBackground(SystemColor.menu);
        btnUpdate.setBounds(1021, 613, 158, 49);
        p1.add(btnUpdate);
        
        btnEdit = new JButton("View");

        btnEdit.setMnemonic('u');
        btnEdit.setBackground(SystemColor.menu);
        btnEdit.setBounds(32, 114, 80, 30);
        btnEdit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		}
             });
        p1.add(btnEdit);
        
        lblNhaa = new JLabel("New Base Salary Input :");
        lblNhaa.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNhaa.setBounds(347, 293, 131, 16);
        p1.add(lblNhaa);
        
        textField = new JTextField();
        textField.setBounds(503, 293, 121, 20);
        p1.add(textField);
        textField.setColumns(10);
        
        btnUpdate_1 = new JButton("Update");
        btnUpdate_1.setMnemonic('u');
        btnUpdate_1.setBackground(SystemColor.menu);
        btnUpdate_1.setBounds(458, 364, 80, 30);
        p1.add(btnUpdate_1);
        setSize(1200, 700);
        setVisible(true);
        setLocation(370, 50);
        setTitle("Salary VNUK Management");
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

