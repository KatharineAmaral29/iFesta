/**
 * Validar formulário de Busca
 * 
 */

function validarFormBusca(form) {

	if (form.titulo.value == "") {
		alert("O campo busca deve ser preenchido");
		form.titulo.focus();
		return false;
	}

}