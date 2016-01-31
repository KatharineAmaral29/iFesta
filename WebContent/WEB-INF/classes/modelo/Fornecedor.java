public class Fornecedor {
	
	private int idfornecedor;
	private String nome_fantasia = new String();
	private String razao_social = new String();
	private String cnpj = new String();
	private String rua_fornecedor = new String();
	private String cep_fornecedor = new String();
	private String numero_fornecedor = new String();
	private String cidade_fornecedor = new String();
	private String telefone1_fornecedor = new String();
	private String telefone2_fornecedor = new String();
	private String login_fornecedor = new String();
	private String senha_fornecedor = new String();
	
	public Fornecedor(int idfornecedor,String nome,String razao, String cnpj){ //precisa adicionar o restante dos campos
		setIdfornecedor(idfornecedor);
		setNomeFantasia(nome);
		setRazaoSocial(razao);
		setCnpj(cnpj);
	}
	
	public int getIdfornecedor(){
		return idfornecedor;
	}
	
	public void setIdfornecedor(int id){
		idfornecedor = id;
	}
	
	public String getNomeFantasia(){
		return nome_fantasia;
	}
	
	public void setNomeFantasia(String nome){
		nome_fantasia = nome;
	}
	
	public String getRazaoSocial(){
		return razao_social;
	}
	public void setRazaoSocial(String razao){
		razao_social = razao;
	}
	
	public String getCnpj(){
		return cnpj;
	}
	public void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nome_fantasia;
	}

	public void setNomeFantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}

	public String getRazaoSocial() {
		return razao_social;
	}

	public void setRazaoSocial(String razao_social) {
		this.razao_social = razao_social;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua_fornecedor) {
		this.rua = rua_fornecedor;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep_fornecedor) {
		this.cep = cep_fornecedor;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero_fornecedor) {
		this.numero = numero_fornecedor;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade_fornecedor) {
		this.cidade = cidade_fornecedor;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1_fornecedor) {
		this.telefone1 = telefone1_fornecedor;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2_fornecedor) {
		this.telefone2 = telefone2_fornecedor;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login_fornecedor) {
		this.login = login_fornecedor;
	}

	public String getSenha() {
		return senha_fornecedor;
	}

	public void setSenha(String senha_fornecedor) {
		this.senha = senha_fornecedor;
	}

}
