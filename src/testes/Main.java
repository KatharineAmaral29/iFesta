package testes;

import java.util.Scanner;
import dao.*;
import modelo.*;

public class Main {
	
	static Scanner op = new Scanner(System.in);
	static boolean flag = true;
	static Cliente c = new Cliente();
	static DAO cadastro = new DAO();
	static ClienteDAO cdao = new ClienteDAO();
	static boolean res;

	public static void main(String[] args) {
		while(flag){

			System.out.println("0 - Cadastro de Cliente\n1 - Procurar por CPF");
			System.out.println("2 - Altera Cliente\n3 - Deletar Cliente");
			System.out.print("Digite a opção: ");
			
			switch (op.nextInt()) 
			{
			case 0:
				c = digitarCliente();
				cadastro.inserir(c);
				break;
			case 1:

				String cpf = new String();
				
				System.out.print("Digite o cpf: ");
				cpf = op.next();
				c = cdao.findCliente(cpf);
				System.out.println(c.toString());
				break;
			case 2:
				System.out.println("Selecione o Cliente: ");
				c = cdao.findCliente(op.next());
				System.out.print("Digite o novo nome: ");
				c.setNomeCliente(op.next());
				System.out.println(cdao.updateCliente(c));
				break;
				
			case 3:
				System.out.println("Digite o CPF: ");
				c = cdao.findCliente(op.next());
				res = cdao.deleteCliente(c);
				if(res)
					System.out.println("Deletado");
				else
					System.out.println("ERRO");
				break;
			case 9:
				flag = false;
	
			default:
				break;
			}
		}

	}
	
	public static Cliente digitarCliente(){
		Cliente c = new Cliente();		
		Scanner in = new Scanner(System.in);
		String aux = new String();
		
		System.out.print("Digite o Nome: ");
		aux = in.next();
		c.setNomeCliente(aux);
		System.out.print("Digite o CPF: ");
		aux = in.next();
		c.setCpf(aux);
		System.out.print("Digite o Email: ");
		aux = in.next();
		c.setLogin_cliente(aux);
		System.out.print("Digite a Senha: ");
		aux = in.next();
		c.setSenha_cliente(aux);
		System.out.print("Digite a CEP: ");
		aux = in.next();
		c.setCep_cliente(aux);
		System.out.print("Digite a Cidade: ");
		aux = in.next();
		c.setCidade_cliente(aux);
		System.out.print("Digite a Complemento: ");
		aux = in.next();
		c.setComplemento_cliente(aux);
		System.out.print("Digite a Estado: ");
		aux = in.next();
		c.setEstado_cliente(aux);
		System.out.print("Digite a Numero: ");
		aux = in.next();
		c.setNumero_cliente(aux);
		System.out.print("Digite a Pais: ");
		aux = in.next();
		c.setPais_cliente(aux);
		System.out.print("Digite a Rua: ");
		aux = in.next();
		c.setRua_cliente(aux);
		System.out.print("Digite a SExo: ");
		aux = in.next();
		c.setSexo_cliente(aux);
		System.out.print("Digite a Telefone 1: ");
		aux = in.next();
		c.setTelefone1_cliente(aux);
		System.out.print("Digite a Telefone 2: ");
		aux = in.next();
		c.setTelefone2_cliente(aux);
				
		return c;
		
	}

}
