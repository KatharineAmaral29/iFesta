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
    <title>iFesta.net </title>
	
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
	
	<div> 
	<h3>Alimentícios Doces</h3> 
	            <div class="col-xs-12 col-sm-4 col-md-3">
                    <div class="recent-work-wrap">
                        <img class="img-responsive" src="images/portfolio/recent/item1.png" alt="">
                        <div class="overlay">
                            <div class="recent-work-inner">
                                <h3><a href="#">Docinhos</a> </h3>
                                <p>Docinhos variados</p>
                                <p>Loja de Doces 1</p>
								<p>R$ 30,00 o cento</p>
								<a class="preview" href="images/portfolio/full/item1.jpg" rel="prettyPhoto"><i class="fa fa-eye"></i> Adicionar ao Carrinho</a>
                            </div> 
                        </div>
                    </div>
                </div>   
	
	                <div class="col-xs-12 col-sm-4 col-md-3">
                    <div class="recent-work-wrap">
                        <img class="img-responsive" src="images/portfolio/recent/item2.png" alt="">
                        <div class="overlay">
                            <div class="recent-work-inner">
                                <h3><a href="#">Docinhos</a> </h3>
                                <p>Docinhos variados</p>
                                <p>Loja de Doces 2</p>
								<p>R$ 40,00 o cento</p>
                                <a class="preview" href="images/portfolio/full/item2.jpg" rel="prettyPhoto"><i class="fa fa-eye"></i> Adicionar ao Carrinho</a>
                            </div> 
                        </div>
                    </div>
                </div> 
     <div class="col-xs-12 col-sm-4 col-md-3">
                    <div class="recent-work-wrap">
                        <img class="img-responsive" src="images/portfolio/recent/item6.png" alt="">
                        <div class="overlay">
                            <div class="recent-work-inner">
								<h3><a href="#">Bolo artístico</a> </h3>
                                <p>Bolo artístico diversos temas para 40 pessoas</p>
                                <p>Doceria 1</p>
								<p>R$ 100,00</p>
                                <a class="preview" href="images/portfolio/full/item6.jpg" rel="prettyPhoto"><i class="fa fa-eye"></i> Adicionar ao Carrinho</a>
							</div> 
                        </div>
                    </div>
                </div> 
	<br><br><br><br><br><br><br><h3> Alimentícios Salgados </h3>
	                <div class="col-xs-12 col-sm-4 col-md-3">
                    <div class="recent-work-wrap">
                        <img class="img-responsive" src="images/portfolio/recent/item3.png" alt="">
                        <div class="overlay">
                            <div class="recent-work-inner">
                                <h3><a href="#">Salgadinhos</a> </h3>
                                <p>Salgadinhos variados</p>
                                <p>Loja de Salgados 1</p>
								<p>R$ 40,00 o cento</p>
                                <a class="preview" href="images/portfolio/full/item3.jpg" rel="prettyPhoto"><i class="fa fa-eye"></i> Adicionar ao Carrinho</a>
							</div> 
                        </div>
                    </div>
                </div>   

                <div class="col-xs-12 col-sm-4 col-md-3">
                    <div class="recent-work-wrap">
                        <img class="img-responsive" src="images/portfolio/recent/item4.png" alt="">
                        <div class="overlay">
                            <div class="recent-work-inner">
								<h3><a href="#">Salgadinhos</a> </h3>
                                <p>Salgadinhos variados</p>
                                <p>Loja de Salgados 2</p>
								<p>R$ 35,00 o cento</p>
                                <a class="preview" href="images/portfolio/full/item4.jpg" rel="prettyPhoto"><i class="fa fa-eye"></i> Adicionar ao Carrinho</a>
                            </div> 
                        </div>
                    </div>
                </div>  
	<br><h3> Animação </h3>
	<br><br><br><br><br><br><br><h3> Artesanal </h3>
	<br><h3> Artigos de Festa </h3> 
	<br><h3> Bebidas </h3>
	<br><h3> Beleza </h3>
	<br><h3> Decoração </h3>
	<br><h3> Espaço de Eventos </h3>
	                <div class="col-xs-12 col-sm-4 col-md-3">
                    <div class="recent-work-wrap">
                        <img class="img-responsive" src="images/portfolio/recent/item5.png" alt="">
                        <div class="overlay">
                            <div class="recent-work-inner">
								<h3><a href="#">Espaço de Eventos</a> </h3>
                                <p>Espaço de Eventos 1</p>
                                <p>Espaço 1</p>
								<p>R$ 800,00 por 4 horas</p>
                                <a class="preview" href="images/portfolio/full/item5.jpg" rel="prettyPhoto"><i class="fa fa-eye"></i> Adicionar ao Carrinho</a>
                            </div> 
                        </div>
                    </div>
                </div>
    
                    <div class="col-xs-12 col-sm-4 col-md-3">
                    <div class="recent-work-wrap">
                        <img class="img-responsive" src="images/portfolio/recent/item7.png" alt="">
                        <div class="overlay">
                            <div class="recent-work-inner">
								<h3><a href="#">Espaço de Eventos</a> </h3>
                                <p>Espaço de Eventos 2</p>
                                <p>Espaço 2</p>
								<p>R$ 1000,00 por 4 horas</p>
                                <a class="preview" href="images/portfolio/full/item7.jpg" rel="prettyPhoto"><i class="fa fa-eye"></i> Adicionar ao Carrinho</a>
                            </div> 
                        </div>
                    </div>
                </div>   

                <div class="col-xs-12 col-sm-4 col-md-3">
                    <div class="recent-work-wrap">
                        <img class="img-responsive" src="images/portfolio/recent/item8.png" alt="">
                        <div class="overlay">
                            <div class="recent-work-inner">
								<h3><a href="#">Espaço de Eventos</a> </h3>
                                <p>Espaço de Eventos 3</p>
                                <p>Espaço 3</p>
								<p>R$ 2800,00 por 4 horas</p>
                                <a class="preview" href="images/portfolio/full/item8.png" rel="prettyPhoto"><i class="fa fa-eye"></i> Adicionar ao Carrinho</a>                            </div> 
                        </div>
                    </div>
                </div>   
    
	<br><h3> Estruturas </h3>
	<br><h3> Foto e Vídeo </h3>
	<br><h3> Material Gráfico </h3>
	<br><h3> Musical </h3>
	<br><h3> Organização </h3>
	<br><h3> Profissional </h3>
	<br><h3> Som e Iluminação </h3>
	<br><h3> Veículos </h3>
	<br><h3> Vestuário </h3>
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