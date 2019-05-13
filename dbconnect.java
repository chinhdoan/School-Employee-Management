package WorkerManagement;

import java.sql.*;
import javax.swing.*;
public class dbconnect {
	Connection con=null;
	public static Connection java_db(){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net/sql12291406","sql12291406","e65EsiZst8");
			return con;
		}catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;

		}
	}

}
