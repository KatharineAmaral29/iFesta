package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexao.Conexao;
import modelo.Cliente;
import modelo.Fornecedor;
import modelo.Servico;

public class FornecedorDAO extends Conexao{
	
	private Connection con = getConexao();
    private PreparedStatement pstmt;
    private ResultSet rs;
	    
	    
	    public boolean insertFornecedor(Fornecedor f) {

	    	String clausula = "INSERT INTO fornecedor (razao_social,nome_fantasia,cnpj,email_fornecedor,telefone_fornecedor_1,"
	    			+ "telefone_fornecedor_2,rua_fornecedor,cidade_fornecedor,estado_fornecedor,cep_fornecedor,"
	    			+ "bairro_fornecedor, pais_fornecedor,plano_fornecedor, senha_fornecedor)"
	    			+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	        try {
	        	pstmt = con.prepareStatement(clausula);
	        	pstmt.setString(1, f.getRazao_social());
	        	pstmt.setString(2, f.getNome_fantasia());
	        	pstmt.setString(3, f.getCnpj());
	        	pstmt.setString(4, f.getEmail_fornecedor());
	        	pstmt.setString(5, f.getTelefone1_fornecedor());
	        	pstmt.setString(6, f.getTelefone2_fornecedor());
	        	pstmt.setString(7, f.getRua_fornecedor());
	        	pstmt.setString(8, f.getCidade_fornecedor());
	        	pstmt.setString(9, f.getEstado_fornecedor());
	        	pstmt.setString(10, f.getCep_fornecedor());
	        	pstmt.setString(11, f.getBairro_fornecedor());
	        	pstmt.setString(12, f.getPais_fornecedor());
	        	pstmt.setInt(13, f.getPlano_fornecedor());
	        	pstmt.setString(14, f.getSenha_fornecedor());
	        	pstmt.execute();
	        	pstmt.close();
	        	con.close();
	        	return true;
	        } catch (SQLException e1) {
	            System.out.println(e1.getMessage());
	            return false;
	        } catch (Exception e1) {
	            System.out.println(e1.getMessage());
	            return false;
	        }
	    }
	    
	    public ArrayList<Fornecedor> findFornecedor() { //Retornará um Array de todos os fornecedores
	        ArrayList<Fornecedor> fornecedores = new ArrayList<>();
	        Fornecedor f = new Fornecedor();
	        
	        String clausula = "select * from fornecedor";
	        try {
	        	pstmt = con.prepareStatement(clausula);
	            rs = pstmt.executeQuery();
	            if (rs.next()) {
	            	f.preencherFornecedor(rs.getInt("id_fornecedor"), 
	            			rs.getString("nome_fantasia"), 
	            			rs.getString("razao_social"), 
	            			rs.getString("cnpj"), 
	            			rs.getString("rua_fornecedor"), 
	            			rs.getString("cep_fornecedor"), 
	            			rs.getString("cidade_fornecedor"), 
	            			rs.getString("telefone_fornecedor_1"), 
	            			rs.getString("telefone_fornecedor_2"), 
	            			rs.getString("email_fornecedor"), 
	            			rs.getString("senha_fornecedor"),
	            			rs.getString("bairro_fornecedor"),
	            			rs.getString("estado_fornecedor"),
	            			rs.getString("pais_fornecedor"),
	            			rs.getInt("plano_fornecedor"),
	            			rs.getString("numero_forncedor"));
	            	
	            	fornecedores.add(f);	                
	            }
	        } catch (SQLException e1) {
	            System.out.println(e1.getMessage());
	        }
	        return fornecedores; 
	    }
	    public Fornecedor findFornecedor(int cnpj){ 
	    	Fornecedor f = new Fornecedor();
	    	
	    	String clausula = "select * from fornecedor where cnpj = ?";
	        try {
	        	pstmt = con.prepareStatement(clausula);
	        	pstmt.setInt(1, cnpj);
	            rs = pstmt.executeQuery();
	            if (rs.next()) {
	            	f.preencherFornecedor(rs.getInt("id_fornecedor"), 
	            			rs.getString("nome_fantasia"), 
	            			rs.getString("razao_social"), 
	            			rs.getString("cnpj"), 
	            			rs.getString("rua_fornecedor"), 
	            			rs.getString("cep_fornecedor"), 
	            			rs.getString("cidade_fornecedor"), 
	            			rs.getString("telefone_fornecedor_1"), 
	            			rs.getString("telefone_fornecedor_2"), 
	            			rs.getString("email_fornecedor"), 
	            			rs.getString("senha_fornecedor"),
	            			rs.getString("bairro_fornecedor"),
	            			rs.getString("estado_fornecedor"),
	            			rs.getString("pais_fornecedor"),
	            			rs.getInt("plano_fornecedor"),
	            			rs.getString("numero_fornecedor"));	                
	            }
	        } catch (SQLException e1) {
	            System.out.println(e1.getMessage());
	        }
	    	
	    	return f;
	    }
	    
	    public Fornecedor findFornecedor(String login, String senha){ //Procura o cliente por login e senha
			Fornecedor f = new Fornecedor();
			String clausula = "SELECT * FROM fornecedor WHERE email_fornecedor = ? AND senha_fornecedor = ?";
			
			try{
				pstmt = con.prepareStatement(clausula);
				pstmt.setString(1, login);
				pstmt.setString(2, senha);
				rs = pstmt.executeQuery();
				if (rs.next()) {
					f.preencherFornecedor(rs.getInt("id_fornecedor"),
								    rs.getString("nome_fantasia"),
								    rs.getString("razao_social"),
								    rs.getString("cnpj"),
								    rs.getString("rua_fornecedor"),
								    rs.getString("cep_fornecedor"),
								    rs.getString("cidade_fornecedor"),
								    rs.getString("telefone_fornecedor_1"),
								    rs.getString("telefone_fornecedor_2"),
								    rs.getString("email_fornecedor"),
								    rs.getString("senha_fornecedor"),
								    rs.getString("bairro_fornecedor"),
								    rs.getString("estado_fornecedor"),
								    rs.getString("pais_fornecedor"),
								    rs.getInt("plano_fornecedor"),
								    rs.getString("numero_fornecedor"));
				
					return f;
					
				}
				pstmt.close();
				con.close();
			} catch (SQLException e1) {
				System.out.println(e1.getMessage());
			}
			return null;
		}
	    public boolean updateFornecedor(Fornecedor f) { 
	        boolean sucesso = false;
	        String clausula = "update fornecedor set ? = ? where id_fornecedor = ?";

	        try {
	            pstmt = con.prepareStatement(clausula);
	            pstmt.setString(1, "nome_fantasia");
	            pstmt.setString(2, f.getNome_fantasia());
	            pstmt.setInt(3, f.getIdfornecedor());
	            pstmt.executeUpdate(clausula);
            	pstmt.close();
            	con.close();	            
	            sucesso = true;
	        } catch (SQLException e1) {
	            System.out.println(e1.getMessage());
	        }
	        return sucesso;
	    }

	    public boolean deleteFornecedor(Fornecedor f) {
	        boolean sucesso = false;

	        String clausula = "delete from fornecedor where id_fornecedor = ?";
	        try {
	        	pstmt = con.prepareStatement(clausula);
	        	pstmt.setInt(1, f.getIdfornecedor());
	            pstmt.executeUpdate(clausula);
	            pstmt.close();
	            con.close();
	        } catch (SQLException e1) {
	            System.out.println(e1.getMessage());
	        }

	        return sucesso;
	    }
	    


	

}
