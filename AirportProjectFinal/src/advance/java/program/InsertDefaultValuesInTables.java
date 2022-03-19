package advance.java.program;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.sql.Statement;
import java.util.List;

import advance.java.program.AllTheLists;


public class InsertDefaultValuesInTables {

	    private static final String url = "jdbc:mysql://localhost:3306/db_world";
	    private static final String user = "root";
	    private static final String password = "root";

	    // JDBC variables for opening and managing connection
	    private static Connection con;
	    private static Statement stmt;

	    public static void main(String args[]) {
	    	InsertDefaultValuesInTables ob = new InsertDefaultValuesInTables();
	    	ob.insertRecord(AllTheLists.loginTableInput());
	    	ob.insertRecord(AllTheLists.flightTableInput());
	    	ob.insertRecord(AllTheLists.registerTableInput());
	    	ob.insertRecord(AllTheLists.bookingTableInput());
	    }
		
	    
	    public void insertRecord(List<String> tableInput)
	    {	    	
			for(String query:tableInput) {
				executingSomeQuery(query);
			}
		}
	    public void executingSomeQuery(String query) {
	        try {     	
	        	try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
	        	con = DriverManager.getConnection(url, user, password);
	            stmt = con.createStatement();

	            int v= stmt.executeUpdate(query);
	            if(v==1)
	            {
	            	System.out.println("Record is inserted");
	            }
	            else
	            {
	            	System.out.println("Not inserted");
	            }

	        } catch (SQLException sqlEx) {
	        	sqlEx.printStackTrace();
	        	System.out.println(sqlEx.getMessage());
	        } finally {
	            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
	            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }        
	        }
	    }
}
