/**
 * validação do cadastro do formulário
 */

function validacaoFormCadastro(form){
	
	if(form.titulo.value==""){
		alert("O campo titulo deve ser preenchido");
		form.nome.focus();
		return false;	
		}

	if(form.isbn.value==""){
		alert("O campo isbn deve ser preenchido");
		form.isbn.focus();
		return false;
	}
	
	if(form.editora.value==""){
		alert("O campo Editora deve ser preenchido");
		form.editora.focus();
		return false;
	}
}