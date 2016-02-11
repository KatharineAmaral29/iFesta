package modelo;

import java.util.ArrayList;

public class Evento {
	
	private int idevento;
	private int idcliente;
	private String nome_evento = new String();
	private String descricao = new String();
	private int tipo;
	private String data = new String();
	
	public Evento(){
		
	}
	public Evento(int idevento,int idcliente,String nome, String descricao, int tipo){
		setIdevento(idevento);
		setIdcliente(idcliente);
		setNome_evento(nome);
		setDescricao(descricao);
		setTipo(tipo);
	}
	
	public void preencherEvento(int idevento,int idcliente,String nome, String descricao, int tipo, String data){
				
		this.idevento = idevento;
		this.idcliente = idcliente;
		this.nome_evento = nome;
		this.descricao = descricao;
		this.tipo = tipo;
		this.data = data;
	
	}

	public int getIdevento() {
		return idevento;
	}

	public void setIdevento(int idevento) {
		this.idevento = idevento;
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getNome_evento() {
		return nome_evento;
	}

	public void setNome_evento(String nome_evento) {
		this.nome_evento = nome_evento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setTipo(int tipo){
		this.tipo = tipo;
	}
	
	public int getTipo(){
		return tipo;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
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
