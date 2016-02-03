package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Fornecedor;
import modelo.Servico;

public class FornecedorDAO {
	
	private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;


	    private FornecedorDAO() {
	        try {
	            Class.forName("org.postgresql.Driver");
	            con = DriverManager.getConnection("jdbc:postgresql://localhost/ifesta", "postgres", "12345");
	        } catch (ClassNotFoundException e1) {
	            System.out.println(e1.getMessage());
	        } catch (SQLException e1) {
	            System.out.println(e1.getMessage());
	        }

	    }
	    
	    
	    public boolean insertFornecedor(Fornecedor f) {

	    	String clausula = "INSERT INTO servico (razao_social,nome_fantasia,cnpj,email_fornecedor,telefone_fornecedor_1,telefone_fornecedor_2,rua_fornecedor,"
	    			+ "cidade_fornecedor,estado_fornecedor,cep_fornecedor,bairro_fornecedor, pais_fornecedor)"
	    								 + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
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
	        	pstmt.executeQuery();
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
	            	f.preencherFornecedor(idfornecedor, 
	            			nome_fantasia, 
	            			razao_social, 
	            			cnpj, 
	            			rua_fornecedor, 
	            			cep_fornecedor, 
	            			numero_fornecedor, 
	            			cidade_fornecedor, 
	            			telefone1_fornecedor, 
	            			telefone2_fornecedor, 
	            			email_fornecedor, 
	            			senha_fornecedor);
	            	(rs.getInt("id_servico"), 
	            					rs.getInt("idfornecedor"), 
	            					rs.getString("nome_servico"), 
	            					rs.getString("descricao_servico"), 
	            					rs.getInt("tipo_servico"), 
	            					rs.getFloat("preco_servico"), 
	            					rs.getString("regras_servico"));
	            						
	            	servicos.add(s);
	                
	            }
	        } catch (SQLException e1) {
	            System.out.println(e1.getMessage());
	        }
	        return servicos; 
	    }
	    public Fornecedor findFornecedor(){
	    	Fornecedor f = new Fornecedor();
	    	
	    	return f;
	    }
	    public boolean updateServico(Servico s, int tipo_update) { //tipo 1 é nome, tipo 2 é descrição e tipo 3 é tipo de evento
	        boolean sucesso = false;
	        String clausula = "update servico set ? = ? where id_servico = ?";

	        try {
	            pstmt = con.prepareStatement(clausula);
	            if(tipo_update == 1){
	            	pstmt.setString(1, "nome_servico");
	            	pstmt.setString(2, s.getNomeServico());
	            	pstmt.setInt(3, s.getIdservico());

	            }
	            else if(tipo_update == 2){
	            	pstmt.setString(1, "descricao_servico");
	            	pstmt.setString(2, s.getDescricao());
	            	pstmt.setInt(3, s.getIdservico());

	            }
	            else if(tipo_update == 3){
	            	pstmt.setString(1, "tipo_servico");
	            	pstmt.setInt(2, s.getTipo_servico());
	            	pstmt.setInt(3, s.getIdservico());
	            	
	            }
            	pstmt.close();
            	con.close();
	            pstmt.executeUpdate(clausula);
	            sucesso = true;
	        } catch (SQLException e1) {
	            System.out.println(e1.getMessage());
	        }
	        return sucesso;
	    }

	    public boolean deleteServico(Servico s) {
	        boolean sucesso = false;

	        String clausula = "delete from servico where id_servico = ?";
	        try {
	        	pstmt = con.prepareStatement(clausula);
	        	pstmt.setInt(1, s.getIdservico());
	            pstmt.executeUpdate(clausula);
	        } catch (SQLException e1) {
	            System.out.println(e1.getMessage());
	        }

	        return sucesso;
	    }

	

}
