package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conexao;
import modelo.Feedback;

public class FeedbackDAO extends Conexao{
	
    private Connection con = getConexao();
    private PreparedStatement pstmt;
    private ResultSet rs;
	
	public boolean insertFeedback(Feedback fb){
		
		String clausula = "INSERT INTO feedback (idcliente, idservico, nota,comentario)"
    			+ " VALUES (?,?,?,?)";
        try {
        	pstmt = con.prepareStatement(clausula);
        	pstmt.setInt(1, fb.getId_cliente_avaliador());
        	pstmt.setInt(2, fb.getId_servico_avaliado());
        	pstmt.setFloat(3, fb.getNota());
        	pstmt.setString(4, fb.getComentario());
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

}
