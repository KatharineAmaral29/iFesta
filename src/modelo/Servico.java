package modelo;

import java.util.ArrayList;

public class Servico {
	
	private int idservico;
	private int idfornecedor;
	private String nome_servico = new String();
	private String descricao = new String();
	private int tipo_servico;
	private float preco_servico;
	private String regras_servico = new String();
	ArrayList<Boolean> tipo_eventos = new ArrayList<>(33);
	//private int tipo_evento; 
	/* VER COMO VAI SALVAR NO BD.
	SUGESTÃO uma coluna BOOLEAN para cada tipo de evento.
	Valor TRUE = pode ser usado em evento da coluna
	Valor FALSE = não pode ser usado em evento da coluna
	
	*/
	
	public Servico(){
		for(int i = 0;i<tipo_eventos.size();i++){
			tipo_eventos.add(false);
		}
			
		
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
	
	
	public String getNome_servico() {
		return nome_servico;
	}

	public void setNome_servico(String nome_servico) {
		this.nome_servico = nome_servico;
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
	
    public String conversaoTipo(int x){
    	ArrayList<String> tipos  = new ArrayList<>();
    	
    	tipos.add("Alimentícios Doces");tipos.add("Alimentícios Salgados");tipos.add("Animação");tipos.add("Artesanal");tipos.add("Artigos de Festa");tipos.add("Bebidas");tipos.add("Beleza");tipos.add("Decoração");
    	tipos.add("Espaço de Eventos");tipos.add("Estruturas");tipos.add("Foto e Vídeo");tipos.add("Material Gráfico");tipos.add("Musical");tipos.add("Organização");tipos.add("Profissional");tipos.add("Som e Iluminação");
    	tipos.add("Veículos");tipos.add("Vestuário");
    	
    	
    	return tipos.get(x);
    }
    
    public int conversaoTipo(String x){
    	int tipo = 0;
    	ArrayList<String> tipos  = new ArrayList<>();
    	
    	tipos.add("Alimentícios Doces");tipos.add("Alimentícios Salgados");tipos.add("Animação");tipos.add("Artesanal");tipos.add("Artigos de Festa");tipos.add("Bebidas");tipos.add("Beleza");tipos.add("Decoração");
    	tipos.add("Espaço de Eventos");tipos.add("Estruturas");tipos.add("Foto e Vídeo");tipos.add("Material Gráfico");tipos.add("Musical");tipos.add("Organização");tipos.add("Profissional");tipos.add("Som e Iluminação");
    	tipos.add("Veículos");tipos.add("Vestuário");
    	
    	for(int i = 0;i < tipos.size();i++)
    		if(x == tipos.get(i))
    			tipo = i;
    	
    	return tipo;
    }



}
