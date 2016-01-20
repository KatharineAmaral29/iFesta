public class Cliente {
	
	private int idcliente;
	private String nome_cliente = new String();
	private String cpf = new String();
	
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

}
