<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>iFesta.net | Cadastro Serviço </title>
	
	<!-- core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
    <link href="css/responsive.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=OpenSans:300,400,700' rel='stylesheet' type='text/css'>
    <link href="css/style.css" rel="stylesheet" type="text/css">
</head><!--/head-->

<body class="homepage">

    <header id="header">
        <nav class="navbar navbar-inverse" role="banner">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.jsp"><img src="images/logo.png" alt="logo"></a>
                </div>
                
                <div class="collapse navbar-collapse navbar-right">
                    <ul class="nav navbar-nav">
                        <li><div class="search">
                                <form role="form">
                                    <input type="text" class="search-form" autocomplete="off" placeholder="Pesquisa">
                                    <i class="fa fa-search"></i>
                                </form>
                        </div>
                        <li><a href="criar-evento.jsp">Criar Evento</a></li>
                        <li><a href="login.jsp">Entrar</a></li>
						<li><a class="navbar-brand" href="carrinho.jsp"><img src="images/carrinho.png"></a><br/>
					</ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->
    </header><!--/header-->
  
  
  <script type="text/javascript">
    function marcarTodos(marcar){
        var itens = document.getElementsByName('evento');

        if(marcar){
            document.getElementById('acao').innerHTML = 'Desmarcar Todos';
        }else{
            document.getElementById('acao').innerHTML = 'Marcar Todos';
        }

        var i = 0;
        for(i=0; i<itens.length;i++){
            itens[i].checked = marcar;
        }

    }
</script>  
  
            <form action="CadastroServicoServlet" method="get" id="validate">                          
                <label>Título do Serviço*</label>
                <input name="nomeservico" type="text" class="g"><br>

                <label>Descrição*</label>
                <input name="descricao" type="text" class="g"><br>
                
                <label>Regras/Observações</label>
                <input name="regras" type="text" class="g"><br>

                <label>Preço*</label>
                <input name="preco" type="text" class="g"><br>

                <label>Tipo de Serviço*</label><br>
					<input type=radio name="servico" value="1">Alimentícios Doces</input><br>                
					<input type=radio name="servico" value="2">Alimentícios Salgados</input><br>
					<input type=radio name="servico" value="3">Animação</input><br>
					<input type=radio name="servico" value="4">Artesanal</input><br>
					<input type=radio name="servico" value="5">Artigos de Festa</input><br>
					<input type=radio name="servico" value="6">Bebidas</input><br>
					<input type=radio name="servico" value="7">Beleza</input><br>
					<input type=radio name="servico" value="8">Decoração</input><br>
					<input type=radio name="servico" value="9">Espaço de Eventos</input><br>
					<input type=radio name="servico" value="10">Estruturas</input><br>
					<input type=radio name="servico" value="11">Foto e Vídeo</input><br>
					<input type=radio name="servico" value="12">Material Gráfico</input><br>
					<input type=radio name="servico" value="13">Musical</input><br>
					<input type=radio name="servico" value="14">Organização</input><br>
					<input type=radio name="servico" value="15">Profissional</input><br>
					<input type=radio name="servico" value="16">Som e Iluminação</input><br>					
					<input type=radio name="servico" value="17">Veículos</input><br>
					<input type=radio name="servico" value="18">Vestuário</input><br>								

                <label>Esse serviço combina com os eventos de tipo:*</label><br><br>
				    <input type="checkbox" name="evento" onclick="marcarTodos(this.checked);">
    				<span id="acao">Marcar Todos</span> <br>
					<input type=checkbox name="evento" value="1">Aniversário Adulto</input><br>
					<input type=checkbox name="evento" value="2">Aniversário Infantil</input><br>
					<input type=checkbox name="evento" value="3">Bodas</input><br>
					<input type=checkbox name="evento" value="4">Carnaval</input><br>
					<input type=checkbox name="evento" value="5">Casamento</input><br>
					<input type=checkbox name="evento" value="6">Chá Bar</input><br>
					<input type=checkbox name="evento" value="7">Chá De Baby</input><br>
					<input type=checkbox name="evento" value="8">Chá De Fralda</input><br>
					<input type=checkbox name="evento" value="9">Chá Lingerie</input><br>
					<input type=checkbox name="evento" value="10">Chá De Panela</input><br>
					<input type=checkbox name="evento" value="11">Churrasco</input><br>
					<input type=checkbox name="evento" value="12">Coffee Break</input><br>
					<input type=checkbox name="evento" value="13">Confraternização</input><br>
					<input type=checkbox name="evento" value="14">Descasamento</input><br>
					<input type=checkbox name="evento" value="15">Despedida De Solteiro</input><br>
					<input type=checkbox name="evento" value="16">Dia Das Crianças</input><br>
					<input type=checkbox name="evento" value="17">Dia Das Mães</input><br>
					<input type=checkbox name="evento" value="18">Dia Dos Namorados</input><br>
					<input type=checkbox name="evento" value="19">Dia Dos Pais</input><br>
					<input type=checkbox name="evento" value="20">Feijoada</input><br>
					<input type=checkbox name="evento" value="21">Festa A Fantasia</input><br>
					<input type=checkbox name="evento" value="22">Festa Beneficente</input><br>
					<input type=checkbox name="evento" value="23">Festa Empresarial</input><br>
					<input type=checkbox name="evento" value="24">Festa Junina</input><br>
					<input type=checkbox name="evento" value="25">Festas Religiosas</input><br>
					<input type=checkbox name="evento" value="26">Festa Temática</input><br>
					<input type=checkbox name="evento" value="27">Formatura</input><br>
					<input type=checkbox name="evento" value="28">Halloween</input><br>
					<input type=checkbox name="evento" value="29">Natal</input><br>
					<input type=checkbox name="evento" value="30">Noivado</input><br>
					<input type=checkbox name="evento" value="31">Páscoa</input><br>
					<input type=checkbox name="evento" value="32">Reveillón</input><br>
					<input type=checkbox name="evento" value="33">Velório</input><br>

                <input type="submit" value="Enviar">          
            </form>
		
    <section id="bottom">
    </section><!--/#bottom-->
	
    <footer id="footer" class="midnight-blue">
        <div class="container text-center">
			<ul>
                <li>Formas de Pagamento:</li>
				<li><img src="images/ico/visa.png" 
				onmouseover="this.src='images/ico/visaC.png'" 
				onmouseout="this.src='images/ico/visa.png'" /></li>				
                <li><img src = "images/ico/master.png"
				onmouseover="this.src='images/ico/masterC.png'" 
				onmouseout="this.src='images/ico/master.png'"></li>
                <li><img src = "images/ico/american.png"
				onmouseover="this.src='images/ico/americanC.png'" 
				onmouseout="this.src='images/ico/american.png'"></li> 
                <li><img src = "images/ico/diners.png"
				onmouseover="this.src='images/ico/dinersC.png'" 
				onmouseout="this.src='images/ico/diners.png'"></li>
                <li><img src = "images/ico/boleto.png"
                onmouseover="this.src='images/ico/boletoC.png'" 
				onmouseout="this.src='images/ico/boleto.png'"></li>
				<li>iFesta nas Redes Sociais: </li>
				<li><img src= "images/ico/face.png"
				onmouseover="this.src='images/ico/faceC.png'" 
				onmouseout="this.src='images/ico/face.png'"></li>
				<li><img src= "images/ico/insta.png"
				onmouseover="this.src='images/ico/instaC.png'" 
				onmouseout="this.src='images/ico/insta.png'"></li>
				<li><img src= "images/ico/twt.png"
				onmouseover="this.src='images/ico/twtC.png'" 
				onmouseout="this.src='images/ico/twt.png'"></li>
			</ul>
		</div>
		
		<div class="container text-center">
			<ul> <br>iFesta.net.br é uma empresa do grupo <a href="kathsoftware.jsp">Kath Software</a> </ul>
			<ul> CNPJ nº XX.XXX.XXX/XXXX-XX</ul>
			<ul> NOSSO ENDEREÇO </ul>
			<ul> Fortaleza - CE</ul>
		</div>
    </footer><!--/#footer-->

    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/jquery.isotope.min.js"></script>
    <script src="js/main.js"></script>
    <script src="js/wow.min.js"></script>
    <script src="js/jquery-1.10.2.min.js"></script>
    <script src="js/jquery.maskedinput.min.js"></script>
    <script src="js/jquery.validate.min.js"></script>
    <script src="js/jquery.zebra-datepicker.js"></script>
</body>
</html>