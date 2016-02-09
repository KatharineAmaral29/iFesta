<?xml version="1.0" encoding="UTF-8" ?>
<%@page import="org.apache.catalina.ant.SessionsTask"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>iFesta.net | Carrinho </title>
	
	<!-- core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
    <link href="css/responsive.css" rel="stylesheet">
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
						<li><a href="inicial-cliente.jsp">Meu Perfil</a></li>
                        <li><a href="login.jsp">Entrar</a></li>
						<li><a class="navbar-brand" href="carrinho.jsp"><img src="images/carrinho.png"></a><br/>
					</ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->   
    </header><!--/header-->
		
	<TABLE BORDER=1>
		<TR><TH>Imagem</TH><TH>Item</TH><TH>Descrição</TH><TH>Fornecedor</TH><TH>Preço Unitário</TH><TH>Quantidade</TH><TH>Preço Total</TH><TH>Remover</TH></TR> 
		<TR><TD><img src="images/portfolio/carrinho/item1.png" alt=""></TD><TD>Docinhos Variados</TD><TD>Cento de Doces variados</TD><TD>Loja de Doces 1</TD><TD>R$ 30,00</TD><TD>3</TD><TD>R$ 90,00</TD><TD><img src="images/portfolio/carrinho/cancelar.png"></TD></TR> 
		<TR><TD><img src="images/portfolio/carrinho/item6.png" alt=""></TD><TD>Bolo Artístico</TD><TD>Bolo artístico diversos temas para 40 pessoas</TD><TD>Doceria 1</TD><TD>R$ 100,00</TD><TD>1</TD><TD>R$ 100,00</TD><TD><img src="images/portfolio/carrinho/cancelar.png"></TD></TR> 
	</TABLE>
	
	<input type=submit value="Finalizar Compra">

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
</body>
</html>