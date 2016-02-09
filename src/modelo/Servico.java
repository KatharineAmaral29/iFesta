package modelo;

public class Servico {
	
	private int idservico;
	private int idfornecedor;
	private String nome_servico = new String();
	private String descricao = new String();
	private int tipo_servico;
	private int tipo_evento; /* VER COMO VAI SALVAR NO BD.
	SUGESTÃO uma coluna BOOLEAN para cada tipo de evento.
	Valor TRUE = pode ser usado em evento da coluna
	Valor FALSE = não pode ser usado em evento da coluna
	
	*/
	public String getNome_servico() {
		return nome_servico;
	}

	public void setNome_servico(String nome_servico) {
		this.nome_servico = nome_servico;
	}

	public int getTipo_evento() {
		return tipo_evento;
	}

	public void setTipo_evento(int tipo_evento) {
		this.tipo_evento = tipo_evento;
	}

	private float preco_servico;
	private String regras_servico = new String();
	
	public Servico(){
		
	}
	
	public void preencherServico(int idservico, int idfornecedor, String nome_servico, String descricao, int tipo_servico,
			float preco_servico, String regras_servico) {

		this.idservico = idservico;
		this.idfornecedor = idfornecedor;
		this.nome_servico = nome_servico;
		this.descricao = descricao;
		this.tipo_servico = tipo_servico;
		this.preco_servico = preco_servico;
		this.regras_servico = regras_servico;
	}
	public int getIdservico(){
		return idservico;
	}
	
	public void setIdservico(int id){
		idservico = id;
	}
	
	public int getIdfornecedor(){
		return idfornecedor;
	}
	
	public void setIdfornecedor(int id){
		idfornecedor = id;
	}
	
	public String getNomeServico(){
		return nome_servico;
	}
	public void setNomeServico(String nome){
		nome_servico = nome;
	}
	
	public String getDescricao(){
		return descricao;
	}
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}

	public int getTipo_servico() {
		return tipo_servico;
	}

	public void setTipo_servico(int tipo_servico) {
		this.tipo_servico = tipo_servico;
	}

	public float getPreco_servico() {
		return preco_servico;
	}

	public void setPreco_servico(float preco_servico) {
		this.preco_servico = preco_servico;
	}

	public String getRegras_servico() {
		return regras_servico;
	}

	public void setRegras_servico(String regras_servico) {
		this.regras_servico = regras_servico;
	}

}
