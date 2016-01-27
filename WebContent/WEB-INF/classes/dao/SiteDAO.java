import java.sql.*;

public class SiteDAO {
	
	//private String url;
    private Connection con;
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet rs;

	SiteDAO() {
		try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost/ifesta", "postgres", "12345");
        } catch (ClassNotFoundException e1) {
            System.out.println(e1.getMessage());
        } catch (SQLException e1) {
            System.out.println(e1.getMessage());
        }

	}
	
	

}
