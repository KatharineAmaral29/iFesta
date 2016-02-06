package dao;

import java.sql.*;
import java.util.ArrayList;

import conexao.ConectionFactory;
import modelo.Cliente;
import modelo.Fornecedor;

public class ClienteDAO {

	private PreparedStatement ps;
	private ResultSet rs;
	Connection conexao;

//	public Connection getConexao(){
//		Connection conexao = null;
//		String usuario = "postgres";
//		String senha = "12345";
//		String nomeBancoDados = "ifesta";
//
//		try {
//			System.out.println("Entrou TRY Conection");
//
//			Class.forName("org.postgresql.Driver");
//			System.out.println("Passou no CLASS FOR NAME");
//			conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + nomeBancoDados,
//					usuario, senha);
//			System.out.println("COnexao = DRIVER MANAGER");
//		} catch (Exception e) {
//			System.out.println("Entrou CATCH Conection");
//			e.printStackTrace();
//		}
//		return conexao;
//	}
	
	public ClienteDAO() {

		String usuario = "postgres";
		String senha = "12345";
		String nomeBancoDados = "ifesta";

		try {
			System.out.println("Entrou TRY Conection");
			Class.forName("org.postgresql.Driver");
			System.out.println("Passou no CLASS FOR NAME");
			conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + nomeBancoDados,
					usuario, senha);
			System.out.println("COnexao = DRIVER MANAGER");
		} catch (Exception e) {
			System.out.println("Entrou CATCH Conection");
			e.printStackTrace();
		}
	}

	public boolean insertCliente(Cliente c) {		
		
		String clausula = "INSERT INTO cliente(cpf,nome_cliente,senha_cliente, cidade_cliente, estado_cliente,"
				+ "cep_cliente,numero_cliente,rua_cliente,email_cliente,telefone_cliente_1, telefone_cliente_2) "
				+ "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		
		try {

			System.out.println("insertCliente Iniciando Conexao");
			Connection con = conexao;
			ps = con.prepareStatement(clausula);
			ps.setString(1, c.getCpf());
			ps.setString(2, c.getNomeCliente());
			ps.setString(3, c.getSenha_cliente());
			ps.setString(4, c.getCidade_cliente());
			ps.setString(5, c.getEstado_cliente());
			ps.setString(6, c.getCep_cliente());
			ps.setString(7, c.getNumero_cliente());
			ps.setString(8, c.getRua_cliente());
			ps.setString(9, c.getLogin_cliente());
			ps.setString(10, c.getTelefone1_cliente());
			ps.setString(11, c.getTelefone2_cliente());
			ps.executeQuery();
			ps.close();
			con.close();


			return true;
		} catch (SQLException e1) {
			return false;
		} catch (Exception e1) {
			return false;
		}
	}
	
	public ArrayList<Cliente> findCliente() { //Retornará um Array de todos os clientes
        ArrayList<Cliente> clientes = new ArrayList<>();
        Cliente c = new Cliente();
        
        String clausula = "select * from cliente";
        try {
        	Connection con = conexao;
        	ps = con.prepareStatement(clausula);
            rs = ps.executeQuery();
            if (rs.next()) {
				c.preencheCliente(Integer.parseInt(rs.getString("idcliente")),
					    rs.getString("nome_cliente"),
					    rs.getString("cpf"),
					    rs.getString("email_cliente"),
					    rs.getString("senha_cliente"),
					    rs.getString("rua_cliente"),
					    rs.getString("numero_cliente"),
					    rs.getString("complemento_cliente"),
					    rs.getString("cidade_cliente"),
					    rs.getString("cep_cliente"),
					    rs.getString("telefone_cliente_1"),
					    rs.getString("telefone_cliente_2"),
					    rs.getString("sexo_cliente"),
					    rs.getString("estado_cliente"),
					    rs.getString("pais_cliente"));
            	
            	clientes.add(c);	                
            }
        } catch (SQLException e1) {
            System.out.println(e1.getMessage());
        }
        return clientes; 
    }
	
	public Cliente findCliente(String cpf) {

        Cliente c = new Cliente();
        
        String clausula = "select * from cliente where cpf = ?";
        try {
        	Connection con = conexao;
        	ps = con.prepareStatement(clausula);
        	ps.setString(1, cpf);
            rs = ps.executeQuery();
            if (rs.next()) {
				c.preencheCliente(Integer.parseInt(rs.getString("idcliente")),
					    rs.getString("nome_cliente"),
					    rs.getString("cpf"),
					    rs.getString("email_cliente"),
					    rs.getString("senha_cliente"),
					    rs.getString("rua_cliente"),
					    rs.getString("numero_cliente"),
					    rs.getString("complemento_cliente"),
					    rs.getString("cidade_cliente"),
					    rs.getString("cep_cliente"),
					    rs.getString("telefone_cliente_1"),
					    rs.getString("telefone_cliente_2"),
					    rs.getString("sexo_cliente"),
					    rs.getString("estado_cliente"),
					    rs.getString("pais_cliente"));

			}
		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}
		return c;
	}
	public Cliente findCliente(String login, String senha){
		Cliente c = new Cliente();
		String clausula = "SELECT * FROM cliente WHERE email_cliente = ? AND senha_cliente = ?";
		
		try{
			Connection con = conexao;
			ps = con.prepareStatement(clausula);
			ps.setString(1, login);
			ps.setString(2, senha);
			rs = ps.executeQuery();
			if (rs.next()) {
				c.preencheCliente(Integer.parseInt(rs.getString("idcliente")),
							    rs.getString("nome_cliente"),
							    rs.getString("cpf"),
							    rs.getString("email_cliente"),
							    rs.getString("senha_cliente"),
							    rs.getString("rua_cliente"),
							    rs.getString("numero_cliente"),
							    rs.getString("complemento_cliente"),
							    rs.getString("cidade_cliente"),
							    rs.getString("cep_cliente"),
							    rs.getString("telefone_cliente_1"),
							    rs.getString("telefone_cliente_2"),
							    rs.getString("sexo_cliente"),
							    rs.getString("estado_cliente"),
							    rs.getString("pais_cliente"));
				return c;
				
			}
		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}
		return null;
	}


	public boolean updateCliente(Cliente c) {
		boolean sucesso = false;
		String clausula = "update cliente set nome_cliente = ? where cpf = ?";

		try {
			Connection con = conexao;
			ps = con.prepareStatement(clausula);
			ps.setString(1, c.getNomeCliente());
			ps.setString(2, c.getCpf());
			sucesso = true;
			System.out.println("Atualizado");	
		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}
		return sucesso;
	}

	public boolean deleteCliente(Cliente c) {
		boolean sucesso = false;
		String clausula = "delete from cliente where cpf = '?'";
		try {
			Connection con = conexao;
			ps = con.prepareStatement(clausula);
			ps.setString(1, c.getCpf());
			ps.execute();
			ps.close();
			con.close();
		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}

		return sucesso;
	}
}
