package advance.java.program;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.sql.Statement;

public class TablesConstruction {

    private static final String url = "jdbc:mysql://localhost:3306/db_world";
    private static final String user = "root";
    private static final String password = "root";

    private static Connection con;
    private static Statement stmt;

    public static void main(String args[]) {
    	TablesConstruction ob = new TablesConstruction();
    	ob.createTables();        
    }
	
    public void createTables() {
    	String createLoginTable = 
    			"CREATE TABLE IF NOT EXISTS login("
    			+ "username varchar(255) not null, "
    			+ "password varchar(255) not null, "
    			+ "primary key (username));";
    	
    	String createFlightDetailsTable =
    			"CREATE TABLE IF NOT EXISTS flight_details("
    			+ "airline_name varchar(255), "
    			+ "price float(30,2), "
    			+ "flight_number varchar(255) not null, "
    			+ "source_city varchar(255), "
    			+ "destination_city varchar(255), "
    			+ "departure_time DATETIME, "
    			+ "arrival_time DATETIME, "
    			+ "total_seats int, "
    			+ "booked_seats int, "
    			+ "seat_availability int, "
    			+ "date_of_travel DATE, "
    			+ "is_economic BOOL, "
    			+ "primary key (flight_number));";
    	
    	String createRegisterDetailsTable = 
    			"create table IF NOT EXISTS register_details("
    			+ "full_name varchar(255), "
    			+ "address varchar(255), "
    			+ "age int(3), "
    			+ "mobile varchar(255), "
    			+ "email_id varchar(255) not null, "
    			+ "drop_down varchar(255), "
    			+ "country varchar(255), "
    			+ "primary key (email_id));";
    	
    	String createBookingTable = 
    			"create table IF NOT EXISTS booking("
    			+ "FKemail_id varchar(255), "
    			+ "booking_id int NOT NULL auto_increment, "
    			+ "FKflight_number varchar(255), "
    			+ "primary key (booking_id), "
    			+ "foreign key (FKflight_number) references flight_details(flight_number), "
    			+ "foreign key (FKemail_id) references register_details(email_id));";
    	try {     	
        	try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}  	
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            
	    	stmt.executeUpdate(createLoginTable); 
	    	stmt.executeUpdate(createFlightDetailsTable); 
	    	stmt.executeUpdate(createRegisterDetailsTable); 
	    	stmt.executeUpdate(createBookingTable); 
	    	
       }
    	catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            try { con.close(); } catch(SQLException se) {}
            try { stmt.close(); } catch(SQLException se) {}
        }
   }
}