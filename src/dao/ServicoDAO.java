package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexao.Conexao;
import modelo.Servico;

public class ServicoDAO extends Conexao{
	
	private Connection con = getConexao();
    private PreparedStatement pstmt;
    private ResultSet rs;	    
	    
	    public boolean insertServico(Servico s) {
	    	
	    	String clausula = "INSERT INTO servico (nome_servico,descricao_servico,idfornecedor,tipo_servico,preco_servico,regras_servico,"
	    			+ "aniversarioadulto,aniversarioinfantil,bodas,carnaval,casamento,chabar,chadebaby,chadefralda,chalingerie,chadepanela,"
	    			+ "churrasco,coffebreak,confraternizacao,descasamento,despedidadesolteiro,diadascriancas,diadasmaes,diadosnamorados,diadospais,"
	    			+ "feijoada,festaafantasia,festabeneficente,festaempresarial,festajunina,festasreligiosas,festastematicas,formatura,halloween,natal,"
	    			+ "noivado,pascoa,reveillon,velorio) "
	    			+ "VALUES (?,?,?,?,?,?"
	    			+ ",?,?,?,?,?,?,?,?"
	    			+ ",?,?,?,?,?,?,?,?"
	    			+ ",?,?,?,?,?,?,?,?"
	    			+ ",?,?,?,?,?,?,?,?,?)";
	        try {
	        	pstmt = con.prepareStatement(clausula);
	        	pstmt.setString(1, s.getNomeServico()); 
	        	pstmt.setString(2, s.getDescricao()); 
	        	pstmt.setInt(3, s.getIdfornecedor());
	        	pstmt.setInt(4, s.getTipo_servico());
	        	pstmt.setFloat(5, s.getPreco_servico());
	        	pstmt.setString(6, s.getRegras_servico());
	        	int j = 7;
	        	for(int i = 0;i<s.getTipo_eventos().size();i++){
	        		pstmt.setBoolean(j, s.getTipo_eventos().get(i));
	        		j++;
	        	}
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
	    
	    public ArrayList<Servico> findServico(int idfornecedor) { //Retornará um Array de Servico
	        ArrayList<Servico> servicos = new ArrayList<>();
	        Servico s = new Servico();
	        
	        String clausula = "select * from evento where idcliente = ?";
	        try {
	        	pstmt = con.prepareStatement(clausula);
	        	pstmt.setInt(1, idfornecedor);
	            rs = pstmt.executeQuery();
	            if (rs.next()) {
	            	s.preencherServico(rs.getInt("id_servico"), 
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
	    
	    public ArrayList<Servico> findServico(String nome) { //Retornará um Array de Servico
	        ArrayList<Servico> servicos = new ArrayList<>();
	        Servico s = new Servico();
	        
	        String clausula = "select * from evento where nome_servico = ?";
	        try {
	        	pstmt = con.prepareStatement(clausula);
	        	pstmt.setString(1, nome);
	            rs = pstmt.executeQuery();
	            if (rs.next()) {
	            	s.preencherServico(rs.getInt("id_servico"), 
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
