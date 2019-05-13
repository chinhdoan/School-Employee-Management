package WorkerManagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame {

    public static void main(String[] args) {
         new LoginPage();

    }

    
    private JPanel p1;
    private JLabel l1, l2;
    private JTextField t1;
    private JPasswordField pass;
    private JButton b2;
    private ImageIcon img;
    private JButton btnHelp;
    private JButton btnExit;

    LoginPage() {

        p1 = new JPanel();
        p1.setBounds(0, 0, 574, 362);
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        

        getContentPane().setLayout(null);

       
        l1 = new JLabel("User\r\n");
        l1.setForeground(UIManager.getColor("inactiveCaptionText"));
        l1.setBounds(191, 108, 90, 40);
        l1.setFont(new Font("Serif", Font.PLAIN, 20));

        l2 = new JLabel("Password");
        l2.setForeground(UIManager.getColor("inactiveCaptionText"));
        l2.setBounds(191, 147, 100, 40);
        l2.setFont(new Font("Serif", Font.PLAIN, 20));

        t1 = new JTextField(30);
        t1.setBounds(291, 108, 230, 35);

        pass = new JPasswordField(10);
        pass.setBounds(291, 147, 230, 35);

        b2 = new JButton("Login");
        b2.setBounds(291, 241, 150, 50);
        b2.setBackground(SystemColor.control);
        b2.setMnemonic('a');

        p1.add(l1);
        p1.add(l2);
        p1.add(t1);
        p1.add(pass);
        p1.add(b2);

        getContentPane().add(p1);
        
        Canvas canvas = new Canvas();
        canvas.setBounds(127, 0, 1, 362);
        p1.add(canvas);
        canvas.setBackground(UIManager.getColor("menu"));
        
        btnHelp = new JButton("Help");
        btnHelp.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JOptionPane.showMessageDialog(null, "more information at: www.facebook.com/EagleTeamCFVNno1");
        	}
        });
        btnHelp.setMnemonic('u');
        btnHelp.setBackground(SystemColor.control);
        btnHelp.setBounds(29, 296, 71, 26);
        p1.add(btnHelp);
        
        btnExit = new JButton("Exit");
        
        btnExit.setMnemonic('u');
        btnExit.setBackground(SystemColor.control);
        btnExit.setBounds(29, 325, 71, 26);
        p1.add(btnExit);
        setSize(580, 390);
        setVisible(true);
        setResizable(false);
        setLocation(370, 50);
        setTitle("VNUK Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        adminlogin();
        appExit();

    }

    public void adminlogin() {
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String puname = t1.getText();
                String ppaswd = pass.getText();
                if (puname.equals("admin") && ppaswd.equals("admin")) {
                   // admin side view
                	ViewPage1 av=new ViewPage1();
                	av.setVisible(true);
                    dispose();
                } else {

                    JOptionPane.showMessageDialog(null, "Wrong Password / Username");
                    t1.setText("");
                    pass.setText("");
                    t1.requestFocus();
                }
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

