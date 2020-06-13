package jdbc;

public class jdbc {

	// connection
			public static <E> void main(String [] args) throws SQLException {
					System.setProperty("Jdbc.drivers","com.mysql.jdbc.Driver");
					Properties properties = new Properties();
					properties.put("user", "root");
					properties.put("password", "root");
					String url = "jdbc:mysql://localhost:3306/internity";
					Connection con = DriverManager.getConnection(url, properties);
					System.out.println("connection established:" +con);
					@SuppressWarnings("unused")
					String sql = "insert data into employee(username, password, phone_no,job_status,company" + "values(?,?,?,?,?)";
					}
			// data store		
			
			for(Csv csv: csvList) {
				//insert
				csv.getUsername();
				csv.getPassword();
				csv.getPhone_no();
				csv.getJob_status();
				csv.getCompany();
			}
		}
}
