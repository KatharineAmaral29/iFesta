import java.sql.Date;

public class Cliente {
	
	private int idcliente;
	private String nome_cliente = new String();
	private String cpf = new String();
	private String email_cliente = new String();
	private String senha_cliente = new String();
	private String rua_cliente = new String();
	private String numero_cliente = new String();
	private String complemento_cliente = new String();
	private String cidade_cliente = new String();
	private String cep_cliente = new String();
	private String telefone1_cliente = new String();
	private String telefone2_cliente = new String();
	//Date dt_nasc_cliente = new Date();

	public Cliente(int id,String nome, String cpf){
		setIdcliente(id);
		setNomeCliente(nome);
		setCpf(cpf);
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
	
	public String getEmail_cliente() {
		return email_cliente;
	}

	public void setEmail_cliente(String email_cliente) {
		this.email_cliente = email_cliente;
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

	/*public Evento criarEvento(){
		Evento ev = new Evento();
		
		return ev;
	}
	public void editarEvento(Evento ev){
		
	}
	public void atualizarDados(Cliente c){
		
	}*/
}
