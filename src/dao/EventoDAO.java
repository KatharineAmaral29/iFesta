package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Evento;

public class EventoDAO {

    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

	    public EventoDAO() {
	        try {
	            Class.forName("org.postgresql.Driver");
	            con = DriverManager.getConnection("jdbc:postgresql://localhost/ifesta", "postgres", "12345");
	        } catch (ClassNotFoundException e1) {
	            System.out.println(e1.getMessage());
	        } catch (SQLException e1) {
	            System.out.println(e1.getMessage());
	        }

	    }
	    
	    
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
	        Evento ev = new Evento();
	        
	        String clausula = "select * from evento where idcliente = ?";
	        try {
	        	pstmt = con.prepareStatement(clausula);
	        	pstmt.setString(1, String.valueOf(idcliente));
	            rs = pstmt.executeQuery();
	            if (rs.next()) {
	            	ev.preencherEvento(Integer.parseInt(rs.getString("id_evento")), 
	            						Integer.parseInt(rs.getString("idcliente")),
				            			rs.getString("nome_evento"),
				            			rs.getString("descricao_evento"),
				            			Integer.parseInt(rs.getString("tipo_evento")));
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
	    
	    public String conversaoTipo(int x){
	        ArrayList<String> tipos = new ArrayList<>();
	        
	        tipos.add("Anivers�rio Adulto");tipos.add("Anivers�rio Infantil");tipos.add("Bodas");tipos.add("Carnaval");tipos.add("Casamento");tipos.add("Ch� Bar");tipos.add("Ch� De Baby");tipos.add("Ch� De Fralda");
	        tipos.add("Ch� Lingerie");tipos.add("Ch� De Panela");tipos.add("Churrasco");tipos.add("Coffee Break");tipos.add("Confraterniza��o");tipos.add("Descasamento");tipos.add("Despedida De Solteiro");tipos.add("Dia Das Crian�as");
	        tipos.add("Dia Das M�es");tipos.add("Dia Dos Namorados");tipos.add("Dia Dos Pais");tipos.add("Feijoada");tipos.add("Festa A Fantasia");tipos.add("Festa Beneficente");tipos.add("Festa Empresarial");tipos.add("Festa Junina");
	        tipos.add("Festas Religiosas");tipos.add("Festa Tem�tica");tipos.add("Formatura");tipos.add("Halloween");tipos.add("Natal");tipos.add("Noivado");tipos.add("P�scoa");tipos.add("Reveill�n");
	        tipos.add("Vel�rio");
	        
	    	return tipos.get(x);
	    }
	    
	    public int conversaoTipo(String x){
	    	int tipo = 0;
	        ArrayList<String> tipos = new ArrayList<>();
	        
	        tipos.add("Anivers�rio Adulto");tipos.add("Anivers�rio Infantil");tipos.add("Bodas");tipos.add("Carnaval");tipos.add("Casamento");tipos.add("Ch� Bar");tipos.add("Ch� De Baby");tipos.add("Ch� De Fralda");
	        tipos.add("Ch� Lingerie");tipos.add("Ch� De Panela");tipos.add("Churrasco");tipos.add("Coffee Break");tipos.add("Confraterniza��o");tipos.add("Descasamento");tipos.add("Despedida De Solteiro");tipos.add("Dia Das Crian�as");
	        tipos.add("Dia Das M�es");tipos.add("Dia Dos Namorados");tipos.add("Dia Dos Pais");tipos.add("Feijoada");tipos.add("Festa A Fantasia");tipos.add("Festa Beneficente");tipos.add("Festa Empresarial");tipos.add("Festa Junina");
	        tipos.add("Festas Religiosas");tipos.add("Festa Tem�tica");tipos.add("Formatura");tipos.add("Halloween");tipos.add("Natal");tipos.add("Noivado");tipos.add("P�scoa");tipos.add("Reveill�n");
	        tipos.add("Vel�rio");
	    	
	    	for(int i = 0;i < tipos.size();i++){
	    		if(x == tipos.get(i))
	    			tipo = i;
	    	}
	    	
	    	return tipo;
	    }

}
