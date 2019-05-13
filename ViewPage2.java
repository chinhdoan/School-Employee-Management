package WorkerManagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Window.Type;

public class ViewPage2 extends JFrame {

    public static void main(String[] args) {
         new ViewPage2();

    }

    
    private JPanel p1;
    private ImageIcon img;
    private JButton btnHelp;
    private JButton btnExit;
    private JButton btnAdd;
    private JButton btnEdit;
    private JButton btnDelete;
    private JButton btnBack;

    ViewPage2() {
    	setResizable(false);

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
        
        btnAdd = new JButton("Addition");
        
        btnAdd.setMnemonic('u');
        btnAdd.setBackground(SystemColor.menu);
        btnAdd.setBounds(32, 64, 80, 30);
        p1.add(btnAdd);
        
        btnEdit = new JButton("Editor");
        btnEdit.setMnemonic('u');
        btnEdit.setBackground(SystemColor.menu);
        btnEdit.setBounds(32, 114, 80, 30);
        p1.add(btnEdit);
        
        btnDelete = new JButton("Deleter");
        btnDelete.setMnemonic('u');
        btnDelete.setBackground(SystemColor.menu);
        btnDelete.setBounds(32, 161, 80, 30);
        p1.add(btnDelete);
        
        btnBack = new JButton("Back");
       
        btnBack.setMnemonic('u');
        btnBack.setBackground(SystemColor.menu);
        btnBack.setBounds(32, 574, 80, 30);
        p1.add(btnBack);
        setSize(1200, 700);
        setVisible(true);
        setLocation(370, 50);
        setTitle("VNUK Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewWorkers();
        addWorkers();
        editWorkers();
        deleteWorkers();
        appBack();
        appExit();

    }

    public void viewWorkers() {
    }
    public void addWorkers() {
    	btnAdd.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ViewPage3 av=new ViewPage3();
            	av.setVisible(true);
                dispose();
        	}
        });
    }

    public void editWorkers() {
    	btnEdit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ViewPage3 av = new ViewPage3();
        		av.setVisible(true);
        		dispose();
        	}
        });
    }

    public void deleteWorkers() {
    	btnDelete.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ViewPage3 av = new ViewPage3();
        		av.setVisible(true);
        		dispose();
        		
        	}
        });
    }

    public void appBack() {
    	btnBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ViewPage1 av = new ViewPage1();
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

