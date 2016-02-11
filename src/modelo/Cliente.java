package modelo;

import java.util.ArrayList;

public class Cliente {
	
	private int idcliente;
	private String nome_cliente = new String();
	private String cpf = new String();
	private String login_cliente = new String();
	private String senha_cliente = new String();
	private String rua_cliente = new String();
	private String numero_cliente = new String();
	private String complemento_cliente = new String();
	private String cidade_cliente = new String();
	private String cep_cliente = new String();
	private String telefone1_cliente = new String();
	private String telefone2_cliente = new String();
	private String sexo_cliente = new String();
	private String estado_cliente = new String();
	private String pais_cliente = new String();
	//Date dt_nasc_cliente = new Date();
	private String url_foto_cliente = new String();

	public Cliente() {
		
	}
	
	public Cliente(int id,String nome, String cpf, String login, String senha){
		setIdcliente(id);
		setNomeCliente(nome);
		setCpf(cpf);
		setLogin_cliente(login);
		setSenha_cliente(senha);	
	}
	
	
	
	public boolean preencheCliente(int idcliente, String nome_cliente, String cpf, String login_cliente, String senha_cliente,
			String rua_cliente, String numero_cliente, String complemento_cliente, String cidade_cliente,
			String cep_cliente, String telefone1_cliente, String telefone2_cliente, String sexo_cliente,
			String estado_cliente, String pais_cliente) {
		this.idcliente = idcliente;
		this.nome_cliente = nome_cliente;
		this.cpf = cpf;
		this.login_cliente = login_cliente;
		this.senha_cliente = senha_cliente;
		this.rua_cliente = rua_cliente;
		this.numero_cliente = numero_cliente;
		this.complemento_cliente = complemento_cliente;
		this.cidade_cliente = cidade_cliente;
		this.cep_cliente = cep_cliente;
		this.telefone1_cliente = telefone1_cliente;
		this.telefone2_cliente = telefone2_cliente;
		this.sexo_cliente = sexo_cliente;
		this.estado_cliente = estado_cliente;
		this.pais_cliente = pais_cliente;
		
		return true;
	}

	public Cliente(String nome, String cpf, String login, String senha){
		setNomeCliente(nome);
		setCpf(cpf);
		setLogin_cliente(login);
		setSenha_cliente(senha);

	}
	
	public int getIdcliente(){
		return idcliente;
	}
	public void setIdcliente(int id){
		idcliente = id;
	}
	public String getNomeCliente(){
		return nome_cliente;
	}
	public void setNomeCliente(String nome){
		nome_cliente = nome;
	}
	public String getCpf(){
		return cpf;
	}
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	
	public String getLogin_cliente() {
		return login_cliente;
	}

	public void setLogin_cliente(String login_cliente) {
		this.login_cliente = login_cliente;
	}

	public String getSenha_cliente() {
		return senha_cliente;
	}

	public void setSenha_cliente(String senha_cliente) {
		this.senha_cliente = senha_cliente;
	}
	
	public String getRua_cliente() {
		return rua_cliente;
	}

	public void setRua_cliente(String rua_cliente) {
		this.rua_cliente = rua_cliente;
	}

	public String getNumero_cliente() {
		return numero_cliente;
	}

	public void setNumero_cliente(String numero_cliente) {
		this.numero_cliente = numero_cliente;
	}

	public String getComplemento_cliente() {
		return complemento_cliente;
	}

	public void setComplemento_cliente(String complemento_cliente) {
		this.complemento_cliente = complemento_cliente;
	}

	public String getCidade_cliente() {
		return cidade_cliente;
	}

	public void setCidade_cliente(String cidade_cliente) {
		this.cidade_cliente = cidade_cliente;
	}

	public String getCep_cliente() {
		return cep_cliente;
	}

	public void setCep_cliente(String cep_cliente) {
		this.cep_cliente = cep_cliente;
	}

	public String getTelefone1_cliente() {
		return telefone1_cliente;
	}

	public void setTelefone1_cliente(String telefone1_cliente) {
		this.telefone1_cliente = telefone1_cliente;
	}

	public String getTelefone2_cliente() {
		return telefone2_cliente;
	}

	public void setTelefone2_cliente(String telefone2_cliente) {
		this.telefone2_cliente = telefone2_cliente;
	}
	
	public String getSexo_cliente() {
		return sexo_cliente;
	}

	public void setSexo_cliente(String sexo_cliente) {
		this.sexo_cliente = sexo_cliente;
	}

	public String getEstado_cliente() {
		return estado_cliente;
	}

	public void setEstado_cliente(String estado_cliente) {
		this.estado_cliente = estado_cliente;
	}

	public String getPais_cliente() {
		return pais_cliente;
	}

	public void setPais_cliente(String pais_cliente) {
		this.pais_cliente = pais_cliente;
	}

	public String getUrl_foto_cliente() {
		return url_foto_cliente;
	}

	public void setUrl_foto_cliente(String url_foto_cliente) {
		this.url_foto_cliente = url_foto_cliente;
	}

	public String toString(){
		String termo;
		
		termo = "Nome Cliente: "+getNomeCliente() + "\n"
				+ "Email: " + getLogin_cliente()+"\n";
		return termo; 
	}
	
	public String getEnderecoComp(){
		String endereco = new String();
		
		endereco = getRua_cliente() + ", " + getNumero_cliente() + " - " + getCidade_cliente() +
				", " + getEstado_cliente() + " - " + getPais_cliente();
		
		return endereco;
	}
	/*
	public void editarEvento(Evento ev){
		
	}
	public void atualizarDados(Cliente c){
		
	}*/
}
