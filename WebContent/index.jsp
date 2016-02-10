<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>iFesta.net | Home </title>
	
	<!-- core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
    <link href="css/responsive.css" rel="stylesheet">
</head> <!--/head-->

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
                    <a class="navbar-brand" href="index.jsp"><img src="images/logo.png" align="middle" alt="logo"></a>
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
                        <li><a href="login.jsp">Entrar</a></li>
						<li><a class="navbar-brand" href="carrinho.jsp"><img src="images/carrinho.png"></a><br/>
					</ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->
        
    </header><!--/header-->
	
	Hello, <%= session.getAttribute( "loginUsuario" ) %>
		
	<div class="categoria" align="middle">
		<TABLE BORDER=0>
			<TR>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/AniversarioAdulto.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/AniversarioInfantil.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/Bodas.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/Carnaval.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/Casamento.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/ChaBar.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/ChaDeBaby.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/ChaDeFralda.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/ChaLingerie.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/ChaDePanela.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/Churrasco.png" align="middle"></a></TD>
			</TR> 
			<TR>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/CoffeeBreak.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/Confraternizacao.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/Descasamento.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/DespedidaDeSolteiro.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/DiaDasCriancas.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/DiaDasMaes.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/DiaDosNamorados.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/DiaDosPais.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/Feijoada.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/FestaAFantasia.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/FestaBeneficente.png" align="middle"></a></TD>
			</TR> 
			<TR>

				<TD><a href="criar-evento.jsp"><img src="images/categorias/FestaEmpresarial.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/FestaJunina.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/FestasReligiosas.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/FestaTematica.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/Formatura.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/Halloween.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/Natal.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/Noivado.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/Pascoa.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/Reveillon.png" align="middle"></a></TD>
				<TD><a href="criar-evento.jsp"><img src="images/categorias/Velorio.png" align="middle"></a></TD>
			</TR> 
		</TABLE>			
	</div>
	
    <section id="main-slider" class="no-margin">
        <div class="carousel slide">
            <ol class="carousel-indicators">
                <li data-target="#main-slider" data-slide-to="0" class="active"></li>
                <li data-target="#main-slider" data-slide-to="1"></li>
                <li data-target="#main-slider" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner">

                <div class="item active" style="background-image: url(images/slider/bg1.jpg)">
                    <div class="container">
                        <div class="row slide-margin">
                            <div class="col-sm-6 hidden-xs animation animated-item-4">
                                <div class="slider-img">
                                    <img src="images/slider/img1.png">
                                </div>
                            </div>
                        </div>
                    </div>
                </div><!--/.item-->

                <div class="item" style="background-image: url(images/slider/bg2.jpg)">
                    <div class="container">
                        <div class="row slide-margin">
                            <div class="col-sm-6 hidden-xs animation animated-item-4">
                                <div class="slider-img">
                                    <img src="images/slider/img2.png">
                                </div>
                            </div>
                        </div>
                    </div>
                </div><!--/.item-->

                <div class="item" style="background-image: url(images/slider/bg3.jpg)">
                    <div class="container">
                        <div class="row slide-margin">
                            <div class="col-sm-6 hidden-xs animation animated-item-4">
                                <div class="slider-img">
                                    <img src="images/slider/img3.png">
                                </div>
                            </div>
                        </div>
                    </div>
                </div><!--/.item-->
            </div><!--/.carousel-inner-->
        </div><!--/.carousel-->
        <a class="prev hidden-xs" href="#main-slider" data-slide="prev">
            <i class="fa fa-chevron-left"></i>
        </a>
        <a class="next hidden-xs" href="#main-slider" data-slide="next">
            <i class="fa fa-chevron-right"></i>
        </a>
    </section><!--/#main-slider-->
	
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