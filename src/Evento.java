public class Evento {
	
	private int idevento;
	private int idcliente;
	private String nome_evento = new String();
	private String descricao = new String();
	
	public Evento(int idevento,int idcliente,String nome, String descricao){
		setIdevento(idevento);
		setIdcliente(idcliente);
		setNomeEvento(nome);
		setDescricao(descricao);
	}
	
	public int getIdcliente(){
		return idcliente;
	}
	
	public void setIdcliente(int id){
		idcliente = id;
	}
	
	public int getIdevento(){
		return idevento;
	}
	
	public void setIdevento(int id){
		idevento = id;
	}
	
	public String getNomeEvento(){
		return nome_evento;
	}
	public void setNomeEvento(String nome){
		nome_evento = nome;
	}
	
	public String getDescricao(){
		return descricao;
	}
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}

}
