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
    <title>iFesta.net | Login </title>
	
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
                        <li><a href="promocoes.jsp">Promoções</a></li>
                        <li><a href="criar-evento.jsp">Criar Evento</a></li>             
						<li><a class="navbar-brand" href="carrinho.jsp"><img src="images/carrinho.png"></a><br/>
					</ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->
    </header><!--/header-->

      <!-- Modal content-->

			<div class="modal-header">
		  <button type="button" class="close" dat-dismiss="modal">&times;</button>
			  <h4 class="modal-title">Entre ou cadastre-se!</h4>
			</div>

			<div>
				  <table border="1000000000000">
						<tr>
							<div role="main" class="col-sm-6">
								<div class="login">
									<div class="col-md-6">
										<form role="form" class="form-inline" id="formLogin" action="LoginClienteServlet" method="get">
											<h2>Sou cliente</h2>
											<h3>Já sou cadastrado</h3>
											<a class="navbar-brand" href=""><img src="images/login/facebook.png" align="middle"></a><br/>
											<h3>ou</h3>
											<div class="form-group">
												<input class="form-control" type="email" id="emailc" placeholder="Email" name="emailc">
												<input class="form-control" type="password" id="senhac" placeholder="Senha" name="senhac">
											</div>
											<div class="form-group">
												<button type="submit" class="btn btn-default">Entrar</button>
											</div>
											<h3>Não sou cadastrado</h3>
											<a class="navbar-brand" href="cadastro-cliente.jsp"><img src="images/login/inscrever.png" align="middle"></a><br/>							
										</form>
									</div>
								</div> 
							</div>

						</tr>
						<tr>
							<div role="main" class="col-sm-6">
								<div class="login">
									<div class="col-md-6">
										<form role="form" class="form-inline" id="formLogin" action="LoginFornecedorServlet" method="get">
											<h2>Sou fornecedor</h2>
											<h3>Já sou cadastrado</h3>
											<div class="form-group">

												<input class="form-control" type="email" id="email" placeholder="Email" name="emailf">
												<input class="form-control" type="password" id="senha" placeholder="Senha" name="senhaf">
											</div>
											<div class="form-group">
												<button type="submit" class="btn btn-default">Entrar</button>
											</div>
											<h3>Não sou cadastrado</h3>
											<a class="navbar-brand" href="cadastro-empresa.jsp"><img src="images/login/planos.png" align="middle"></a><br/>
										</form>
									</div>
								</div> 
							</div>
						</tr>
				  </table>
			</form>
			</div>

	
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