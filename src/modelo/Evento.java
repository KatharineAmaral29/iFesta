package modelo;
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
	
	public void preencherEvento(int idevento,int idcliente,String nome, String descricao, int tipo){
				
		setIdevento(idevento);
		setIdcliente(idcliente);
		setNome_evento(nome);
		setDescricao(descricao);
		setTipo(tipo);
	
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

}
