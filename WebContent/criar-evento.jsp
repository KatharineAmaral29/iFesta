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
    <title>iFesta.net | Cadastro Evento</title>
	
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
                        <li><a href="login.jsp">Entrar</a></li>
                        <li><a href="LogoutServlet">Sair</a></li>              
						<li><a class="navbar-brand" href="carrinho.jsp"><img src="images/carrinho.png"></a><br/>
					</ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->    
    </header><!--/header-->

<section>
        
           <form action="CadastroEventoServlet" method="get" id="validate" role="form">                  
                <label>Nome do Evento</label>
                <input name="nomeevento" type="text" class="g"><br>

                <label>Data</label>
                <input name="dataevento" type="text" class="p" id="data"><br>
                <!-- Calendario bonito -> id="datepicker1" -->
                              
                <label>Tipo de Evento</label>
                <select name="tipoevento" class="p" id="tipoevento">
					<option value="1">Aniversário Adulto</option>
					<option value="2">Aniversário Infantil</option>
					<option value="3">Bodas</option>
					<option value="4">Carnaval</option>
					<option value="5">Casamento</option>
					<option value="6">Chá Bar</option>
					<option value="7">Chá De Baby</option>
					<option value="8">Chá De Fralda</option>
					<option value="9">Chá Lingerie</option>
					<option value="10">Chá De Panela</option>
					<option value="11">Churrasco</option>
					<option value="12">Coffee Break</option>
					<option value="13">Confraternização</option>
					<option value="14">Descasamento</option>
					<option value="15">Despedida De Solteiro</option>
					<option value="16">Dia Das Crianças</option>
					<option value="17">Dia Das Mães</option>
					<option value="18">Dia Dos Namorados</option>
					<option value="19">Dia Dos Pais</option>
					<option value="20">Feijoada</option>
					<option value="21">Festa A Fantasia</option>
					<option value="22">Festa Beneficente</option>
					<option value="23">Festa Empresarial</option>
					<option value="24">Festa Junina</option>
					<option value="25">Festas Religiosas</option>
					<option value="26">Festa Temática</option>
					<option value="27">Formatura</option>
					<option value="28">Halloween</option>
					<option value="29">Natal</option>
					<option value="30">Noivado</option>
					<option value="31">Páscoa</option>
					<option value="32">Reveillón</option>
					<option value="33">Velório</option>
                </select><br>
          
                <label>Descricao</label>
                <input name="descricao" type="text" class="g"><br>

                <input type="submit" value="Enviar">
            </form>
                
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