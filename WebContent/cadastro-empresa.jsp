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
    <title>iFesta.net | Cadastro Empresa </title>
    
    <!-- core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
    <link href="css/responsive.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=OpenSans:300,400,700' rel='stylesheet' type='text/css'>
    <link href="css/style.css" rel="stylesheet" type="text/css">
    
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->       
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
</head><!--/head-->

<body>

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
                                    <input type="text" class="search-form" autocomplete="off" placeholder="Search">
                                    <i class="fa fa-search"></i>
                                </form>
                        </div>
                        <li><a href="promocoes.jsp">Promoções</a></li>
                        <li><a href="login.jsp">Entrar</a></li>
						<li><a class="navbar-brand" href="carrinho.jsp"><img src="images/carrinho.png"></a><br/>
						</ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->     
    </header><!--/header-->
	
    <section class="pricing-page">
        <div class="container">
            <div class="center">  
                <h2>Conheça nossos planos</h2>
                <p class="lead">Compare nossos planos e comece a trabalhar conosco!</p>
            </div>  
            <div class="pricing-area text-center">
                <div class="row">
                    <div class="col-sm-4 plan price-one wow fadeInDown">
                        <ul>
                            <li class="heading-one">
                                <h1>Plano Ouro</h1>
                                <span>R$ XX/Mês</span>
                            </li>
                            <li>Caracteristica 1</li>
                            <li>Caracteristica 2</li>
                            <li>Caracteristica 3</li>
                            <li>Caracteristica 4</li>
                            <li>Caracteristica 5</li>
                            <li class="plan-action">
                                <a href="" class="btn btn-primary">Inscrever-se</a>
                            </li>
                        </ul>
                    </div>

                    <div class="col-sm-4 plan price-two wow fadeInDown">
                        <ul>
                            <li class="heading-two">
                                <h1>Plano Prata</h1>
                                <span>R$ XX/Mês</span>
                            </li>
                            <li>Caracteristica 1</li>
                            <li>Caracteristica 2</li>
                            <li>Caracteristica 3</li>
                            <li>Caracteristica 4</li>
                            <li>Caracteristica 5</li>
                            <li class="plan-action">
                                <a href="" class="btn btn-primary">Inscrever-se</a>
                            </li>
                        </ul>
                    </div>

                    <div class="col-sm-4 plan price-three wow fadeInDown">
                        <ul>
                            <li class="heading-three">
                                <h1>Plano Bronze</h1>
                                <span>R$ XX/Mês</span>
                            </li>
                            <li>Caracteristica 1</li>
                            <li>Caracteristica 2</li>
                            <li>Caracteristica 3</li>
                            <li>Caracteristica 4</li>
                            <li>Caracteristica 5</li>
                            <li class="plan-action">
                                <a href="" class="btn btn-primary">Inscrever-se</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div><!--/pricing-area-->
        </div><!--/container-->
    </section><!--/pricing-page-->
    
    <section>
    	<div>
    		<form action="" method="post" id="validate">
    			<label>Nome Fantasia* </label>
				<input name ="nomefantasia" type="text" class="g"><br>    		
    			<label>Razão Social* </label>
				<input name ="razaosocial" type="text" class="g"><br>
				<label>CNPJ*</label>
				<input name ="cnpj" type="text" class="g"><br>
				<label>Rua*</label>
				<input name ="rua" type="text" class="g"><br>
				<label>Número*</label>
				<input name ="numero" type="text" class="g"><br>
				<label>CEP</label>
				<input name ="cep" type="text" class="g"><br>
				<label>Bairro*</label>
				<input name ="bairro" type="text" class="g"><br>
				<label>Cidade*</label>
				<input name ="cidade" type="text" class="g"><br>
				<label>Estado*</label>
				<input name ="estado" type="text" class="g"><br>
				<label>País*</label>
				<input name ="pais" type="text" class="g"><br>
				<label>Telefone 1*</label>
				<input name ="telefone1" type="text" class="g"><br>
				<label>Telefone 2</label>
				<input name ="telefone2" type="text" class="g"><br>
				<label>E-mail*</label>
				<input name ="email" type="text" class="g"><br>
				<label>Senha*</label>
				<input name ="senha" type="password" class="g"><br>
				<label>Plano*</label>
				<select name=“plano">
					<option value="1">Plano Ouro</option>
					<option value="2">Plano Prata</option>
					<option value="3">Plano Bronze</option>
				</select><br>
				
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
    <script type="text/javascript">
        $('.carousel').carousel()
    </script>
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