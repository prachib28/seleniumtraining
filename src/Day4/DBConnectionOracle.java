package Day4;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import org.seleniumhq.jetty9.io.Connection;

public class DBConnectionOracle {

	public static void main(String[] args) {
		//Create connection to d/b
		//Create statement
		//Execute query
		
		 Class.forName("oracle.jdbc.driver.OracleDriver");
	        //"jdbc:oracle:thin:@//"+"host"+":"+port+"/"+"service_name","username","password"
	        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@//"+""+":"++"/"+"","","");
	        System.out.println("DB connection done");
	        
	        Statement smt=((java.sql.Connection) con).createStatement();
	        ResultSet rst=smt.executeQuery("Select * from logical_date");
	        
	        /*while(rst.next())
	        {
	            System.out.println("The BAN is :::::::"+rst.getString("BAN"));
	            System.out.println(" The Titan BAN is ::::::::: " +rst.getString("TITAN_BAN"));
	        }*/
	        
	        ResultSetMetaData rsmd=rst.getMetaData();
	        int colnumber=rsmd.getColumnCount();
	        while(rst.next())
	        {
	            for (int i=1;i<=colnumber;i++)
	            {
	                System.out.print("  "+rst.getString(i));
	            }    
	            System.out.println("");
	        }
	        
	        con.close();
	        
	    }
			
		    
		        
		       
	}


}
