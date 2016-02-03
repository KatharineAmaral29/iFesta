package modelo;
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
	private String email_fornecedor = new String();
	private String senha_fornecedor = new String();
	private String bairro_fornecedor = new String();
	private String estado_fornecedor = new String();
	private String pais_fornecedor = new String();
	
	public Fornecedor(){
		
	}
	
	public void preencherFornecedor(int idfornecedor, String nome_fantasia, String razao_social, String cnpj, String rua_fornecedor,
			String cep_fornecedor, String numero_fornecedor, String cidade_fornecedor, String telefone1_fornecedor,
			String telefone2_fornecedor, String email_fornecedor, String senha_fornecedor) {
		
		this.idfornecedor = idfornecedor;
		this.nome_fantasia = nome_fantasia;
		this.razao_social = razao_social;
		this.cnpj = cnpj;
		this.rua_fornecedor = rua_fornecedor;
		this.cep_fornecedor = cep_fornecedor;
		this.numero_fornecedor = numero_fornecedor;
		this.cidade_fornecedor = cidade_fornecedor;
		this.telefone1_fornecedor = telefone1_fornecedor;
		this.telefone2_fornecedor = telefone2_fornecedor;
		this.email_fornecedor = email_fornecedor;
		this.senha_fornecedor = senha_fornecedor;
	}

	public int getIdfornecedor() {
		return idfornecedor;
	}
	public void setIdfornecedor(int idfornecedor) {
		this.idfornecedor = idfornecedor;
	}
	public String getNome_fantasia() {
		return nome_fantasia;
	}
	public void setNome_fantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}
	public String getRazao_social() {
		return razao_social;
	}
	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRua_fornecedor() {
		return rua_fornecedor;
	}
	public void setRua_fornecedor(String rua_fornecedor) {
		this.rua_fornecedor = rua_fornecedor;
	}
	public String getCep_fornecedor() {
		return cep_fornecedor;
	}
	public void setCep_fornecedor(String cep_fornecedor) {
		this.cep_fornecedor = cep_fornecedor;
	}
	public String getNumero_fornecedor() {
		return numero_fornecedor;
	}
	public void setNumero_fornecedor(String numero_fornecedor) {
		this.numero_fornecedor = numero_fornecedor;
	}
	public String getCidade_fornecedor() {
		return cidade_fornecedor;
	}
	public void setCidade_fornecedor(String cidade_fornecedor) {
		this.cidade_fornecedor = cidade_fornecedor;
	}
	public String getTelefone1_fornecedor() {
		return telefone1_fornecedor;
	}
	public void setTelefone1_fornecedor(String telefone1_fornecedor) {
		this.telefone1_fornecedor = telefone1_fornecedor;
	}
	public String getTelefone2_fornecedor() {
		return telefone2_fornecedor;
	}
	public void setTelefone2_fornecedor(String telefone2_fornecedor) {
		this.telefone2_fornecedor = telefone2_fornecedor;
	}
	public String getEmail_fornecedor() {
		return email_fornecedor;
	}
	public void setEmail_fornecedor(String email_fornecedor) {
		this.email_fornecedor = email_fornecedor;
	}
	public String getSenha_fornecedor() {
		return senha_fornecedor;
	}
	public void setSenha_fornecedor(String senha_fornecedor) {
		this.senha_fornecedor = senha_fornecedor;
	}

	public String getBairro_fornecedor() {
		return bairro_fornecedor;
	}

	public void setBairro_fornecedor(String bairro_fornecedor) {
		this.bairro_fornecedor = bairro_fornecedor;
	}

	public String getEstado_fornecedor() {
		return estado_fornecedor;
	}

	public void setEstado_fornecedor(String estado_fornecedor) {
		this.estado_fornecedor = estado_fornecedor;
	}

	public String getPais_fornecedor() {
		return pais_fornecedor;
	}

	public void setPais_fornecedor(String pais_fornecedor) {
		this.pais_fornecedor = pais_fornecedor;
	}
	

	
	

}
