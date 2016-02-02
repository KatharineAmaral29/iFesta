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
    <title>iFesta.net </title>
	
	<!-- core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
    <link href="css/responsive.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=OpenSans:300,400,700' rel='stylesheet' type='text/css'>
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->       
    <link rel="shortcut icon" href="images/ico/logo.png">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
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

	<section>
    	 <div class="formulario">  
            <form action="CadastroServicoServlet" method="post" id="validate">                          
                <label>Título do Serviço*</label>
                <input name="nomeservico" type="text" class="g">

                <label>Descrição*</label>
                <input name="descricao" type="text" class="g">
                
                <label>Regras/Observações</label>
                <input name="regras" type="text" class="g">

                <label>Preço*</label>
                <input name="preco" type="text" class="g">

                <label>Tipo de Serviço*</label><br><br>
					<input type=radio name="servico" value="doces">Alimentícios Doces</input><br>                
					<input type=radio name="servico" value="salgados">Alimentícios Salgados</input><br>
					<input type=radio name="servico" value="animacao">Animação</input><br>
					<input type=radio name="servico" value="artesanal">Artesanal</input><br>
					<input type=radio name="servico" value="artigosdefesta">Artigos de Festa</input><br>
					<input type=radio name="servico" value="bebidas">Bebidas</input><br>
					<input type=radio name="servico" value="beleza">Beleza</input><br>
					<input type=radio name="servico" value="decoracao">Decoração</input><br>
					<input type=radio name="servico" value="espacodeeventos">Espaço de Eventos</input><br>
					<input type=radio name="servico" value="estruturas">Estruturas</input><br>
					<input type=radio name="servico" value="fotoevideo">Foto e Vídeo</input><br>
					<input type=radio name="servico" value="materialgrafico">Material Gráfico</input><br>
					<input type=radio name="servico" value="musical">Musical</input><br>
					<input type=radio name="servico" value="organizacao">Organização</input><br>
					<input type=radio name="servico" value="profissional">Profissional</input><br>
					<input type=radio name="servico" value="someiluminacao">Som e Iluminação</input><br>					
					<input type=radio name="servico" value="veiculos">Veículos</input><br>
					<input type=radio name="servico" value="vestuario">Vestuário</input><br>					

                <label>Tipo de Evento*</label><br><br>
					<input type=checkbox name="evento" value="aniversarioadulto">Aniversário Adulto</input><br>
					<input type=checkbox name="evento" value="aniversarioinfantil">Aniversário Infantil</input><br>
					<input type=checkbox name="evento" value="bodas">Bodas</input><br>
					<input type=checkbox name="evento" value="carnaval">Carnaval</input><br>
					<input type=checkbox name="evento" value="casamento">Casamento</input><br>
					<input type=checkbox name="evento" value="chabar">Chá Bar</input><br>
					<input type=checkbox name="evento" value="chadebaby">Chá De Baby</input><br>
					<input type=checkbox name="evento" value="chadefralda">Chá De Fralda</input><br>
					<input type=checkbox name="evento" value="chalingerie">Chá Lingerie</input><br>
					<input type=checkbox name="evento" value="chadepanela">Chá De Panela</input><br>
					<input type=checkbox name="evento" value="churrasco">Churrasco</input><br>
					<input type=checkbox name="evento" value="coffeebreak">Coffee Break</input><br>
					<input type=checkbox name="evento" value="confraternizacao">Confraternização</input><br>
					<input type=checkbox name="evento" value="descasamento">Descasamento</input><br>
					<input type=checkbox name="evento" value="despedidadesolteiro">Despedida De Solteiro</input><br>
					<input type=checkbox name="evento" value="diadascriancas">Dia Das Crianças</input><br>
					<input type=checkbox name="evento" value="diadasmaes">Dia Das Mães</input><br>
					<input type=checkbox name="evento" value="diadosnamorados">Dia Dos Namorados</input><br>
					<input type=checkbox name="evento" value="diadospais">Dia Dos Pais</input><br>
					<input type=checkbox name="evento" value="feijjoada">Feijoada</input><br>
					<input type=checkbox name="evento" value="festaafantasia">Festa A Fantasia</input><br>
					<input type=checkbox name="evento" value="festabeneficente">Festa Beneficente</input><br>
					<input type=checkbox name="evento" value="festaempresarial">Festa Empresarial</input><br>
					<input type=checkbox name="evento" value="festajunina">Festa Junina</input><br>
					<input type=checkbox name="evento" value="festasreligiosas">Festas Religiosas</input><br>
					<input type=checkbox name="evento" value="festatematica">Festa Temática</input><br>
					<input type=checkbox name="evento" value="formatura">Formatura</input><br>
					<input type=checkbox name="evento" value="halloween">Halloween</input><br>
					<input type=checkbox name="evento" value="natal">Natal</input><br>
					<input type=checkbox name="evento" value="noivado">Noivado</input><br>
					<input type=checkbox name="evento" value="pascoa">Páscoa</input><br>
					<input type=checkbox name="evento" value="reveillon">Reveillón</input><br>
					<input type=checkbox name="evento" value="velorio">Velório</input><br>

                <input type="submit" value="Enviar">
                
            </form>
    	</div><!--/formulario-->      
	</section>	
		
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