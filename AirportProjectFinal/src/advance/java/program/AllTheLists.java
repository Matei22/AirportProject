package advance.java.program;

import java.util.ArrayList;
import java.util.List;

public class AllTheLists {

	public static List<String> loginTableInput(){
		List<String> loginTableInput = new ArrayList<String>();
		loginTableInput.add("INSERT INTO login VALUES ('ma.hav@gmail.com', 'ma.hav');");
		loginTableInput.add("INSERT INTO login VALUES ('me.hav@gmail.com', 'me.hav');");
		loginTableInput.add("INSERT INTO login VALUES ('mi.hav@gmail.com', 'mi.hav');");
		loginTableInput.add("INSERT INTO login VALUES ('mo.hav@gmail.com', 'mo.hav');");
		loginTableInput.add("INSERT INTO login VALUES ('mu.hav@gmail.com', 'mu.hav');");
		return loginTableInput;
	}
	public static List<String> flightTableInput(){
		List<String> flightTableInput = new ArrayList<String>();
		flightTableInput.add("INSERT INTO flight_details VALUES ('RomanianAirlines', 150.00, 'RA1', 'Bucharest', 'Paris', '2022-03-17 13:30:00',  '2022-03-17 17:45:00', 200, 100, 100, '2022-03-17', TRUE);");
		flightTableInput.add("INSERT INTO flight_details VALUES ('RomanianAirlines', 250.00, 'RA2', 'Bucharest', 'Iasi', '2022-04-18 03:30:00',  '2022-04-18 04:15:00', 150, 100, 50, '2022-04-18', TRUE);");
		flightTableInput.add("INSERT INTO flight_details VALUES ('RomanianAirlines', 350.00, 'RA3', 'Bucharest', 'Paris', '2022-04-20 04:00:00',  '2022-04-20 08:45:00', 100, 50, 50, '2022-04-20', FALSE);");
		flightTableInput.add("INSERT INTO flight_details VALUES ('RomanianAirlines', 100.00, 'RA4', 'Iasi', 'Paris', '2022-04-22 13:45:00',  '2022-04-22 17:45:00', 200, 199, 1, '2022-04-22', TRUE);");
		flightTableInput.add("INSERT INTO flight_details VALUES ('RomanianAirlines', 50.00, 'RA5', 'Iasi', 'Paris', '2022-04-21 20:45:00',  '2022-04-22 00:45:00', 200, 200, 0, '2022-04-21', TRUE);");
		flightTableInput.add("INSERT INTO flight_details VALUES ('AmericanAirlines', 170.00, 'AA1', 'Bucharest', 'Paris', '2022-05-30 13:30:00',  '2022-05-30 17:30:00', 30, 27, 4, '2022-05-30', TRUE);");
		flightTableInput.add("INSERT INTO flight_details VALUES ('IndianAirlines', 300.00, 'IA1', 'Bucharest', 'Paris', '2022-05-30 13:30:00',  '2022-05-30 17:30:00', 30, 27, 2, '2022-05-30', TRUE);");
		flightTableInput.add("INSERT INTO flight_details VALUES ('EnglandAirlines', 270.00, 'EA1', 'Bucharest', 'Paris', '2022-05-30 13:30:00',  '2022-05-30 17:30:00', 30, 27, 1, '2022-05-30', TRUE);");
		flightTableInput.add("INSERT INTO flight_details VALUES ('IsraelAirlines', 120.00, 'ISA1', 'Bucharest', 'Paris', '2022-05-30 13:30:00',  '2022-05-30 17:30:00', 30, 27, 2, '2022-05-30', TRUE);");
		flightTableInput.add("INSERT INTO flight_details VALUES ('VaticanAirlines', 150.00, 'VA1', 'Bucharest', 'Paris', '2022-05-30 13:30:00',  '2022-05-30 17:30:00', 30, 27, 3, '2022-05-30', TRUE);");
		flightTableInput.add("INSERT INTO flight_details VALUES ('AstraAirlines', 300.00, 'ASA1', 'Bucharest', 'Paris', '2022-05-30 13:30:00',  '2022-05-30 17:30:00', 30, 27, 4, '2022-05-30', TRUE);");
		flightTableInput.add("INSERT INTO flight_details VALUES ('AstraAirlines', 270.00, 'ASA10', 'Bucharest', 'Paris', '2022-05-30 13:30:00',  '2022-05-30 17:30:00', 30, 27, 1, '2022-05-30', TRUE);");
		flightTableInput.add("INSERT INTO flight_details VALUES ('AmericanAirlines', 370.00, 'AA11', 'Bucharest', 'Paris', '2022-05-30 13:30:00',  '2022-05-30 17:30:00', 30, 27, 2, '2022-05-30', TRUE);");
		flightTableInput.add("INSERT INTO flight_details VALUES ('AmericanAirlines', 325.00, 'AA12', 'Bucharest', 'Paris', '2022-05-30 13:30:00',  '2022-05-30 17:30:00', 30, 27, 3, '2022-05-30', TRUE);");
		flightTableInput.add("INSERT INTO flight_details VALUES ('AmericanAirlines', 120.00, 'AA13', 'Bucharest', 'Paris', '2022-05-30 13:30:00',  '2022-05-30 17:30:00', 30, 27, 2, '2022-05-30', TRUE);");
		flightTableInput.add("INSERT INTO flight_details VALUES ('AmericanAirlines', 125.00, 'AA14', 'Bucharest', 'Paris', '2022-05-30 13:30:00',  '2022-05-30 17:30:00', 30, 27, 4, '2022-05-30', TRUE);");
		flightTableInput.add("INSERT INTO flight_details VALUES ('AmericanAirlines', 140.00, 'AA15', 'Bucharest', 'Paris', '2022-05-30 13:30:00',  '2022-05-30 17:30:00', 30, 27, 1, '2022-05-30', TRUE);");
		flightTableInput.add("INSERT INTO flight_details VALUES ('AmericanAirlines', 190.00, 'AA16', 'Bucharest', 'Paris', '2022-05-30 13:30:00',  '2022-05-30 17:30:00', 30, 27, 2, '2022-05-30', TRUE);");

		flightTableInput.add("INSERT INTO flight_details VALUES ('AmericanAirlines', 190.00, 'AA2', 'Bucharest', 'Paris', '2022-05-29 21:30:00',  '2022-05-30 01:30:00', 40, 10, 30, '2022-05-29', TRUE);");
		flightTableInput.add("INSERT INTO flight_details VALUES ('AmericanAirlines', 400.00, 'AA3', 'Bucharest', 'Paris', '2022-06-14 05:15:00',  '2022-06-14 09:15:00', 20, 18, 2, '2022-06-14', TRUE);");
		flightTableInput.add("INSERT INTO flight_details VALUES ('AmericanAirlines', 1000.00, 'AA4', 'Bucharest', 'DC', '2022-06-13 06:20:00',  '2022-06-13 10:20:00', 50, 20, 30, '2022-06-13', FALSE);");
		flightTableInput.add("INSERT INTO flight_details VALUES ('AmericanAirlines', 1500.00, 'AA5', 'Bucharest', 'DC', '2022-10-10 07:00:00',  '2022-10-10 10:00:00', 400, 399, 1, '2022-10-10', FALSE);");
		return flightTableInput;
	}
	public static List<String> registerTableInput(){
		List<String> registerTableInput = new ArrayList<String>();
		registerTableInput.add("INSERT INTO register_details VALUES ('Havarneanu Matei Teodor', 'Str Vica, nr 47, Sat. Breazu, Jud. Iasi, Romania', 25, '0763253865', 'ma.hav@gmail.com', 'SSN1960909270432', 'Romania');");
		registerTableInput.add("INSERT INTO register_details VALUES ('Havar Teodor', 'Str Vica, nr 50, Sat. Breazu, Jud. Iasi, Romania', 20, '0767253865', 'me.hav@gmail.com', 'SSN1960909270432', 'Romania' );");
		registerTableInput.add("INSERT INTO register_details VALUES ('Havi Matei', 'Str Vica, nr 48, Sat. Breazu, Jud. Iasi, Romania', 29, '0765253865', 'mi.hav@gmail.com', 'Passport1960909270432', 'Romania');");
		registerTableInput.add("INSERT INTO register_details VALUES ('Ha Ma', 'Str Vica, nr 49, Sat. Breazu, Jud. Iasi, Romania', 30, '0766253865', 'mo.hav@gmail.com', 'SSN1960909270432', 'Romania');");
		registerTableInput.add("INSERT INTO register_details VALUES ('Havarneanu Teodor', 'Str Vica, nr 51, Sat. Breazu, Jud. Iasi, Romania', 45, '0768253865', 'mu.hav@gmail.com', 'SSN1960909270432', 'Romania');");
		return registerTableInput;
	}
	public static List<String> bookingTableInput(){
		List<String> bookingTableInput = new ArrayList<String>();
		bookingTableInput.add("INSERT INTO booking(FKemail_id, FKflight_number) VALUES ('ma.hav@gmail.com', 'RA1');");
		bookingTableInput.add("INSERT INTO booking(FKemail_id, FKflight_number) VALUES ('me.hav@gmail.com', 'RA2');");
		bookingTableInput.add("INSERT INTO booking(FKemail_id, FKflight_number) VALUES ('mi.hav@gmail.com', 'RA3');");
		bookingTableInput.add("INSERT INTO booking(FKemail_id, FKflight_number) VALUES ('mo.hav@gmail.com', 'RA4');");
		bookingTableInput.add("INSERT INTO booking(FKemail_id, FKflight_number) VALUES ('mu.hav@gmail.com', 'RA5');");
		bookingTableInput.add("INSERT INTO booking(FKemail_id, FKflight_number) VALUES ('ma.hav@gmail.com', 'AA1');");
		bookingTableInput.add("INSERT INTO booking(FKemail_id, FKflight_number) VALUES ('me.hav@gmail.com', 'AA2');");
		bookingTableInput.add("INSERT INTO booking(FKemail_id, FKflight_number) VALUES ('mi.hav@gmail.com', 'AA3');");
		bookingTableInput.add("INSERT INTO booking(FKemail_id, FKflight_number) VALUES ('mo.hav@gmail.com', 'AA4');");
		bookingTableInput.add("INSERT INTO booking(FKemail_id, FKflight_number) VALUES ('mu.hav@gmail.com', 'AA5');");
		return bookingTableInput;
	}
}
