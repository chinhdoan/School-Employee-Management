package WorkerManagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ViewPage1 extends JFrame {

    public static void main(String[] args) {
         new ViewPage1();

    }

    
    private JPanel p1;
    private ImageIcon img;
    private JButton btnHelp;
    private JButton btnExit;
    private JButton btnWorker;
    private JButton btnSalary;

    ViewPage1() {
    	
        p1 = new JPanel();
        p1.setBounds(0, 0, 1200, 700);
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        

        getContentPane().setLayout(null);

        getContentPane().add(p1);
        
        Canvas canvas = new Canvas();
        canvas.setBounds(150, 0, 1, 700);
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
        
        btnWorker = new JButton("Worker\r\n");
        
        btnWorker.setMnemonic('u');
        btnWorker.setBackground(SystemColor.menu);
        btnWorker.setBounds(32, 77, 80, 30);
        p1.add(btnWorker);
        
        btnSalary = new JButton("Salary");
        btnSalary.setMnemonic('u');
        btnSalary.setBackground(SystemColor.menu);
        btnSalary.setBounds(32, 118, 80, 30);
        p1.add(btnSalary);
        setSize(1200, 700);
        setVisible(true);
        setResizable(false);
        setLocation(370, 50);
        setTitle("VNUK Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewworkers();
        adminlogin();
        appExit();

    }

    public void viewworkers() {
    	btnWorker.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ViewPage2 av = new ViewPage2();
        		av.setVisible(true);
                dispose();
        	}
        });
    }

    public void adminlogin() {
    }
    public void appExit() {
    	btnExit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		System.exit(0);
        	}
        });
    }
}

