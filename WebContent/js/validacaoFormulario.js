/**
 * Validação de formularios javaScript puro.
 */


function validarFormulario(form){
	

	var alphaExp = /^[a-zA-Z]+$/; 
	var filtro_mail = /^.+@.+\..{2,3}$/

	if(form.nome.value==""){ //verifica se o campo está em branco
		alert("O compo nome deve ser preenchido.");
		form.nome.focus();
		return false;	
		}
	else if(form.nome.value.length < 2){ //verifica se o campo foi preechido com um texto muito pequeno
		alert("O nome inserido no compo nome é pequeno");
		form.nome.focus();
		return false;	
	}
	else if(form.nome.value.length > 20){//verifica se o campo foi preenchido com um texto muito grande.
		alert("O compo nome inserido é muito grande");
		form.nome.focus();
		return false;	
	}
	else if(!isNaN(form.nome.value)){ //
	alert("Prencha o campo nome somente com letras");
	form.nome.focus();
	return false;
	}
	
	//campo com somente letras sem caractres especias e números.
	
	else if(!form.nome.value.match(alphaExp)){    
	   alert("Permitido Somente Letras no campo nome");  
	   form.focus();  
	   return false;  
	    }  
	
	
	else if(form.email.value==""){
		alert("ops! E-mail em branco");
		form.focus();
		return false;
	}
	
	else if (!filtro_mail.test(form.email.value) ) {
		alert("Preencha o e-mail corretamente.");
		form.focus();
		return false;
		}
	else if (form.email.value!=form.confEmail.value || form.email.value==""){
		alert("E-mail diferente");
		form.focus();
		return false;
	}
	//campo senha em branco:
	else if(form.senha.value==""){
		alert("Campo senha deve ser preenchido");
		form.focus();
		return false;
	}

	else if(form.senha.value.length < 6){
		alert("Senha pequena");
		form.focus();
		return false;
	}
	 
	//verificar formato de Email e se o campo email não esta nulo:
	/*Erros que falat
	 * E-mail
	 * 1- vericar o formato "algo@algo.com
	 * 2- verificar se ele foi preenchido com espações em branco
	 * 3 - verificar se ele não foi preenchido "
	 * 
	 * Insira o E-mail novamente:
	 * 1 - verifcar se não foi inserido
	 * 2 - verificar se esta inserido com espaços em branco
	 * 3 - verificar se ele esta inserido da mesma forma que o e-mail (campo acima) 
	 * 
	 * Senha:
	 * 1 - verifica se o campo senha foi inserido no mínimo 6 caracteres
	 * 2 - verifica se o campo senha foi preenchido com espeçõs em branco
	 * 
	 * Termo de Uso:
	 * 1 - Verifcar se o termo de uso foi assinalado como lido.
	 * 
	 * */
	
}