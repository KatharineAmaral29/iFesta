import java.sql.*;

public class ClienteDAO {

	//private String url;
    private Connection con;
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet rs;


	    ClienteDAO() {
	        try {
	            Class.forName("org.postgresql.Driver");
	            con = DriverManager.getConnection("jdbc:postgresql://localhost/ifesta", "postgres", "12345");
	        } catch (ClassNotFoundException e1) {
	            System.out.println(e1.getMessage());
	        } catch (SQLException e1) {
	            System.out.println(e1.getMessage());
	        }

	    }
	    
	    
	    public void insertCliente(Cliente c) {

	        try {
	        	pstmt = con.prepareStatement("insert into cliente (nome_cliente, cpf) values (? ?)");
	        	stmt.setString(1, "Lucas de Andrade"); //stmt.setString(1, c.getNome);
	        	stmt.setString(2, "123456789"); //stmt.setString(2, c.getCpf);
	        	stmt.execute();
	        	stmt.close();
	        	con.close();
	        } catch (SQLException e1) {
	            System.out.println(e1.getMessage());
	        } catch (Exception e1) {
	            System.out.println(e1.getMessage());
	        }
	    }
	    
	    public Cliente findCliente(String cpf) {
	        Cliente c = null;
	        String nome = new String();
	        int id;
	        String clausula = "select * from cliente where cpf = " + "\'" + cpf + "\'";
	        try {
	            rs = stmt.executeQuery(clausula);
	            if (rs.next()) {
	                nome = rs.getString("nome_cliente");
	                id = Integer.parseInt(rs.getString("idcliente"));
	                c = new Cliente(id,nome, cpf);
	            }
	        } catch (SQLException e1) {
	            System.out.println(e1.getMessage());
	        }
	        return c; //Alterar para Array de Clientes, pois irá retornar uma lista de clientes
	    }
	    //public Cliente findCliente(String cpf);
	    //sobrecarregar a função findCliente para as variadas consultas

	    public boolean updateCliente(Cliente c) {
	        boolean sucesso = false;

	        try {
	            String clausula = "update cliente set nome = " + c.getNomeCliente() + " where cpf = " + "\'" + c.getCpf() + "\'";
	            stmt.executeUpdate(clausula);
	            sucesso = true;
	        } catch (SQLException e1) {
	            System.out.println(e1.getMessage());
	        }
	        return sucesso;
	    }

	    public boolean deleteCliente(Cliente c) {
	        boolean sucesso = false;

	        String clausula = "delete from cliente where cpf = " + "\'" + c.getCpf() + "\'";
	        try {
	            stmt.executeUpdate(clausula);
	        } catch (SQLException e1) {
	            System.out.println(e1.getMessage());
	        }

	        return sucesso;
	    }
}
