package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexao.Conexao;
import modelo.Evento;

public class EventoDAO extends Conexao{

    private Connection con = getConexao();
    private PreparedStatement pstmt;
    private ResultSet rs;
	    
	    
	    public boolean insertEvento(Evento ev) {

	    	String clausula = "INSERT INTO evento (idcliente, nome_evento, descricao_evento,tipo_evento,data_evento)"
	    			+ " VALUES (?,?,?,?,?)";
	        try {
	        	pstmt = con.prepareStatement(clausula);
	        	pstmt.setInt(1, ev.getIdcliente()); 
	        	pstmt.setString(2, ev.getNome_evento()); 
	        	pstmt.setString(3, ev.getDescricao());
	        	pstmt.setInt(4, ev.getTipo());
	        	pstmt.setString(5, ev.getData());
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
	    
	    
	    public ArrayList<Evento> findEvento(int idcliente) { //Retornar� um Array de Eventos
	        ArrayList<Evento> evs = new ArrayList<>();
	        Evento ev;
	        int i = 0;
	        
	        String clausula = "select * from evento where idcliente = ?";
	        try {
	        	pstmt = con.prepareStatement(clausula);
	        	pstmt.setInt(1, idcliente);
	            rs = pstmt.executeQuery();
	            while (rs.next()) {
	            	ev = new Evento();
	            	ev.preencherEvento(rs.getInt("id_evento"), 
	            						rs.getInt("idcliente"),
				            			rs.getString("nome_evento"),
				            			rs.getString("descricao_evento"),
				            			rs.getInt("tipo_evento"),
				            			rs.getString("data_evento"));
	            	evs.add(ev);

	            	
	                
	            }

	        } catch (SQLException e1) {
	            System.out.println(e1.getMessage());
	        }
	        return evs; //Alterar para Array de Eventos, pois ir� retornar uma lista de eventos
	    }
	    //public Evento findEvento(int idcliente);
	    //sobrecarregar a fun��o findEvento para as variadas consultas

	    public boolean updateEvento(Evento ev, int tipo_update) { //tipo 1 � nome, tipo 2 � descri��o e tipo 3 � tipo de evento
	        boolean sucesso = false;
	        String clausula = "update evento set ? = ? where id_evento = ?";

	        try {
	            pstmt = con.prepareStatement(clausula);
	            if(tipo_update == 1){
	            	pstmt.setString(1, "nome_evento");
	            	pstmt.setString(2, ev.getNome_evento());
	            	pstmt.setInt(3, ev.getIdevento());

	            }
	            else if(tipo_update == 2){
	            	pstmt.setString(1, "descricao_evento");
	            	pstmt.setString(2, ev.getDescricao());
	            	pstmt.setInt(3, ev.getIdevento());

	            }
	            else if(tipo_update == 3){
	            	pstmt.setString(1, "tipo_evento");
	            	pstmt.setInt(2, ev.getTipo());
	            	pstmt.setInt(3, ev.getIdevento());
	            	
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

	    public boolean deleteEvento(Evento ev) {
	        boolean sucesso = false;

	        String clausula = "delete from evento where id_evento = ?";
	        try {
	        	pstmt = con.prepareStatement(clausula);
	        	pstmt.setInt(1, ev.getIdevento());
	            pstmt.executeUpdate(clausula);
	        } catch (SQLException e1) {
	            System.out.println(e1.getMessage());
	        }

	        return sucesso;
	    }
	    


}
