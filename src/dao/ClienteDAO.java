package dao;

import java.sql.*;
import java.util.ArrayList;

import com.sun.javafx.runtime.SystemProperties;

import conexao.ConectionFactory;
import conexao.Conexao;
import modelo.Cliente;
import modelo.Fornecedor;

public class ClienteDAO extends Conexao{
	
	Connection con = getConexao();
	private PreparedStatement ps;
	private ResultSet rs;


	public boolean insertCliente(Cliente c) {		
		
		String clausula = "INSERT INTO cliente(cpf,nome_cliente,senha_cliente, cidade_cliente, estado_cliente,"
				+ "cep_cliente,numero_cliente,rua_cliente,email_cliente,telefone_cliente_1, telefone_cliente_2,"
				+ "pais_cliente,sexo_cliente)"
				+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
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
			ps.setString(12, c.getPais_cliente());
			ps.setString(13, c.getSexo_cliente());
			ps.execute();
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
            
            ps.close();
			con.close();
        } catch (SQLException e1) {
            System.out.println(e1.getMessage());
        }
        return clientes; 
    }
	public Cliente findCliente(String cpf) { //Procura o cliente por seu CPF

        Cliente c = new Cliente();
        
        String clausula = "select * from cliente where cpf = ?";
        try {
        	System.out.println("Procurando...");
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
				System.out.println("Achou!!");
				
			}
            ps.close();
			con.close();
		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}
		return c;
	}
	public Cliente findCliente(String login, String senha){ //Procura o cliente por login e senha
		Cliente c = new Cliente();
		String clausula = "SELECT * FROM cliente WHERE email_cliente = ? AND senha_cliente = ?";
		
		try{
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
			ps.close();
			con.close();
		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}
		return null;
	}
	public boolean updateCliente(Cliente c) {
		boolean sucesso = false;
		String clausula = "update cliente set nome_cliente = ?,"
				+ "set cpf = ?,"
				+ "set email_cliente = ?,"
				+ "set senha_cliente  = ?,"
				+ "set rua_cliente = ?,"
				+ "set numero_cliente = ?,"
				+ "set complemento_cliente = ?,"
				+ "set cidade_cliente = ?,"
				+ "set cep_cliente = ?,"
				+ "set telefone_cliente_1 = ?,"
				+ "set telefone_cliente_2 = ?,"
				+ "set sexo_cliente = ?,"
				+ "set estado_cliente = ?,"
				+ "set pais_cliente = ? "
				+ "where cpf = ?";

		try {
			ps = con.prepareStatement(clausula);
			ps.setString(1, c.getNomeCliente());
			ps.setString(2, c.getCpf());
			ps.setString(3, c.getLogin_cliente());
			ps.setString(4, c.getSenha_cliente());
			ps.setString(5, c.getRua_cliente());
			ps.setString(6, c.getNumero_cliente());
			ps.setString(7, c.getComplemento_cliente());
			ps.setString(8, c.getCidade_cliente());
			ps.setString(9, c.getCep_cliente());
			ps.setString(10, c.getTelefone1_cliente());
			ps.setString(11, c.getTelefone2_cliente());
			ps.setString(12, c.getSexo_cliente());
			ps.setString(13, c.getEstado_cliente());
			ps.setString(14, c.getPais_cliente());
			ps.setString(15, c.getCpf());
			

			sucesso = true;
			System.out.println("Atualizado");	
			ps.close();
			con.close();
		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}
		return sucesso;
	}
	public boolean deleteCliente(Cliente c) {
		boolean sucesso = false;
		String clausula = "delete from cliente where cpf = ?";
		try {
			ps = con.prepareStatement(clausula);
			ps.setString(1, c.getCpf());
			ps.execute();
			ps.close();
			con.close();
			sucesso = true;
		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}

		return sucesso;
	}
}
