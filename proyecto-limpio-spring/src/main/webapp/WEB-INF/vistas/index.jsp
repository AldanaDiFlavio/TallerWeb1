<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta name="robots" content="all,follow">
    <meta name="googlebot" content="index,follow,snippet,archive">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>MeetMusic</title>
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,500,700,300,100' rel='stylesheet' type='text/css'>
    <link href="css/font-awesome.css" rel="stylesheet">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/owl.carousel.css" rel="stylesheet">
    <link href="css/owl.theme.css" rel="stylesheet">
    <link href="css/style.blue.css" rel="stylesheet" id="theme-stylesheet">
    <link href="css/custom.css" rel="stylesheet">
    <script src="js/respond.min.js"></script>
    <link rel="shortcut icon" href="images/logo/favicon.png">
</head>

<body>
	<div id="top">
    	<div class="container">
        	<div class="col-md-12" data-animate="fadeInDown">
            	<ul class="menu nav-right">
                	<li><a href="login">Login</a></li>
                    <li><a href="#">Registrarse</a></li>
                </ul>
            </div>
        </div>
 	</div>
<!-- _________________________________________________________________________________________________________________ -->
	<div class="navbar navbar-default yamm" role="navigation" id="navbar">
    	<div class="container">
        	<div class="navbar-header">
            	<a class="navbar-brand home" href="#" data-animate-hover="bounce">
                	<img src="images/logo/logo.png" alt="MeetMusic logo" class="hidden-xs">
                    <img src="images/logo/logo-small.png" alt="MeetMusic logo" class="visible-xs"><span class="sr-only"></span>
                </a>
                <div class="navbar-buttons">
                	<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navigation">
                    	<i class="fa fa-align-justify"></i>
                    </button>
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#search">
                        <i class="fa fa-search"></i>
                    </button>
                </div>
           	</div>
	
            <div class="navbar-collapse collapse" id="navigation">
                <ul class="nav navbar-nav navbar-left">
             		<li class="active"><a href="home">Inicio</a></li>
                    <li><a href="bandas">Bandas</a></li>
                    <li><a href="#">Eventos</a></li>
	                <li><a href="#">Contacto</a></li>
               	</ul>
            </div>
	       	<!-- Aca va el buscador desplegable q no funciona -->
		</div>
	</div>
<!-- _________________________________________________________________________________________________________________ -->
    <div id="all">
        <div id="content">
            <div class="container">
                <div class="col-md-12">
                    <div id="main-slider">
                        <div class="item">
                            <img src="images/main-silder/main-slider1.jpg" alt="" class="img-responsive">
                        </div>
                        <div class="item">
                            <img class="img-responsive" src="images/main-silder/main-slider2.jpg" alt="">
                        </div>
                        <div class="item">
                            <img class="img-responsive" src="images/main-silder/main-slider3.jpg" alt="">
                        </div>
                        <div class="item">
                            <img class="img-responsive" src="images/main-silder/main-slider4.jpg" alt="">
                        </div>
                    </div>
                </div>
           	</div>
<!-- _________________________________________________________________________________________________________________ -->
			<div id="hot">
    	        <div class="box">
                    <div class="container">
                       	<div class="col-md-12">
                            <h2>Bandas Recomendadas </h2>
                        </div>
                    </div>
                </div>

                <div class="container">
                    <div class="product-slider">
                        <c:forEach items = "${bandas}" var="bandas">
	                        <div class="item">
	                            <div class="product">
	                                <div class="flip-container">
	                                    <div class="flipper">
	                                        <div class="front">
	                                            <img src="${bandas.imagen}" alt="" class="img-responsive">
	                                        </div>
	                                        <div class="back">
	                                            <img src="${bandas.imagen}" alt="" class="img-responsive">
	                                        </div>
	                                    </div>
	                                </div>
	                                <div class="invisible">
	                                    <img src="${bandas.imagen}" alt="" class="img-responsive">
	                                </div>
	                                <div class="text">
	                                    <h3>${bandas.nombre}</h3>
	                                    <p class="buttons">
	                                        <a href="#" class="btn btn-default">+ info</a>
	                                        <a href="#" class="btn btn-primary">Adherirse</a>
	                                    </p>
	                                </div>
	                            </div>
	                        </div>
	                	</c:forEach>
					</div>
            	</div>
            </div>
<!-- _________________________________________________________________________________________________________________ -->
		    <div id="hot">
   	            <div class="box">
                    <div class="container">
                        <div class="col-md-12">
                            <h2>Próximos eventos</h2>
                        </div>
                    </div>
                </div>
                <div class="container">
                    <div class="product-slider">
                        <div class="item">
                            <div class="product">
                                <div class="flip-container">
                                    <div class="flipper">
                                        <div class="front">
			                                <img src="images/eventos/evento1.jpg" alt="" class="img-responsive">
   		                                </div>
                                        <div class="back">
                                            <img src="images/eventos/evento1.jpg" alt="" class="img-responsive">
                                        </div>
                                    </div>
                                </div>
                                <div class="invisible">
                                    <img src="images/eventos/evento1.jpg" alt="" class="img-responsive">
                                </div>
                                <div class="text">
                                    <h3>Babasónicos</h3>
                                    <h5>Teatro Gran Rex</h5>
                                    <h5>2017-05-12</h5>
                                    <p class="buttons">
                                        <a href="#" class="btn btn-default">+ info</a>
                                    </p>
                                </div>  
                            </div>
                        </div>
                        <div class="item">
                            <div class="product">
                                <div class="flip-container">
                                    <div class="flipper">
                                        <div class="front">
                                        	<img src="images/eventos/evento2.jpg" alt="" class="img-responsive">
		                                </div>
                                        <div class="back">
                                        	<img src="images/eventos/evento2.jpg" alt="" class="img-responsive">
                                        </div>
                                    </div>
                                </div>
                                <div class="invisible">
                                    <img src="images/eventos/evento2.jpg" alt="" class="img-responsive">
                                </div>
                                <div class="text">
                                    <h3>Rhapsody</h3>
                                    <h5>Teatro Flores</h5>
                                    <h5>2017-05-14</h5>
                                    <p class="buttons">
                                        <a href="#" class="btn btn-default">+ info</a>
                                    </p>
                                </div>
                            </div>
                        </div>
                        
                        <div class="item">
                            <div class="product">
                                <div class="flip-container">
                                    <div class="flipper">
                                        <div class="front">
                                        	<img src="images/eventos/evento3.jpg" alt="" class="img-responsive">
                                        </div>
                                        <div class="back">
                                            <img src="images/eventos/evento3.jpg" alt="" class="img-responsive">
                                        </div>
                                    </div>
                                </div>
                                <div class="invisible">
                                    <img src="images/eventos/evento3.jpg" alt="" class="img-responsive">
                                </div>
                                <div class="text">
                                    <h3>La Beriso</h3>
                                    <h5>Plaza de la música</h5>
                                    <h5>2017-05-12</h5>
                                    <p class="buttons">
                                    	<a href="#" class="btn btn-default">+ info</a>
                                    </p>
                                </div>
                            </div>
                        </div>
	
                        <div class="item">
                            <div class="product">
                                <div class="flip-container">
                                    <div class="flipper">
                                        <div class="front">
                                        	<img src="images/eventos/evento4.jpg" alt="" class="img-responsive">
                                        </div>
                                        <div class="back">
                                            <img src="images/eventos/evento4.jpg" alt="" class="img-responsive">
                                        </div>
                                    </div>
                                </div>
                                <div class="invisible">
                                    <img src="images/eventos/evento4.jpg" alt="" class="img-responsive">
                                </div>
                                <div class="text">
                                    <h3>No te va gustar</h3>
                                    <h5>Estadio Belgrano</h5>
                                    <h5>2017-05-12</h5>
                                    <p class="buttons">
                                        <a href="#" class="btn btn-default">+ info</a>
                                    </p>
                                </div>
                            </div>
                        </div>

                        <div class="item">
                            <div class="product">
                                <div class="flip-container">
                                    <div class="flipper">
                                        <div class="front">
                                           	<img src="images/eventos/evento5.jpg" alt="" class="img-responsive">
                                        </div>
                                        <div class="back">
                                            <img src="images/eventos/evento5.jpg" alt="" class="img-responsive">
                                        </div>
                                    </div>
                                </div>
                                <div class="invisible">
                                    <img src="images/eventos/evento5.jpg" alt="" class="img-responsive">
                                </div>
                                <div class="text">
                                    <h3>Carajo</h3>
                                    <h5>Pinar de Rocha</h5>
                                    <h5>2017-05-13</h5>
                                    <p class="buttons">
                                        <a href="#" class="btn btn-default">+ info</a>
                                    </p>
                                </div>
                            </div>
                        </div>

                        <div class="item">
                            <div class="product">
                                <div class="flip-container">
                                    <div class="flipper">
                                        <div class="front">
                                            <img src="images/eventos/evento6.jpg" alt="" class="img-responsive">
                                        </div>
                                        <div class="back">
                                            <img src="images/eventos/evento6.jpg" alt="" class="img-responsive">
                                        </div>
                                    </div>
                                </div>
                                <div class="invisible">
                                    <img src="images/eventos/evento6.jpg" alt="" class="img-responsive">
                                </div>
                                <div class="text">
                                    <h3>La 25</h3>
                                    <h5>GAP</h5>
                                    <h5>2017-05-13</h5>
                                    <p class="buttons">
                                        <a href="#" class="btn btn-default">+ info</a>
                                    </p>
                                </div>
                            </div>
                        </div>

                       <div class="item">
                            <div class="product">
                                <div class="flip-container">
                                    <div class="flipper">
                                        <div class="front">
                                        	<img src="images/eventos/evento7.jpg" alt="" class="img-responsive">
                                        </div>
                                        <div class="back">
                                            <img src="images/eventos/evento7.jpg" alt="" class="img-responsive">
                                        </div>
                                    </div>
                                </div>
                                <div class="invisible">
                                    <img src="images/eventos/evento7.jpg" alt="" class="img-responsive">
                                </div>
                                <div class="text">
                                    <h3>Cabezones</h3>
                                    <h5>Refugio Guernica</h5>
                                    <h5>2017-05-12</h5>
                                    <p class="buttons">
                                    	<a href="#" class="btn btn-default">+ info</a>
                                    </p>
                                </div>
                            </div>
                        </div>

                        <div class="item">
                            <div class="product">
                                <div class="flip-container">
                                    <div class="flipper">
                                        <div class="front">
	                                        <img src="images/eventos/evento8.jpg" alt="" class="img-responsive">
                                        </div>
                                        <div class="back">
                                            <img src="images/eventos/evento8.jpg" alt="" class="img-responsive">
                                        </div>
                                    </div>
                                </div>
                                <div class="invisible">
                                    <img src="images/eventos/evento8.jpg" alt="" class="img-responsive">
                                </div>
                                <div class="text">
                                    <h3>Los Cafres</h3>
                                    <h5>AcercArte</h5>
                                    <h5>2017-05-14</h5>
                                    <p class="buttons">
                                        <a href="#" class="btn btn-default">+ info</a>
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
		</div>	
<!-- ____________________________________________________________________________________________________________ -->
		<div id="footer" data-animate="fadeInUp">
        	<div class="container">
	        	<div class="row">
	            	<div class="col-md-3 col-sm-6">
	                	<h4>Panel de administrador</h4>
                        <ul>
                            <li><a href="login">Login</a></li>
	                    </ul>
	                    <hr class="hidden-md hidden-lg hidden-sm">
					</div>
	
	                <div class="col-md-3 col-sm-6">
                    	<h4>Menú</h4>
                        <ul>
                        	<li><a href="bandas">Bandas</a></li>
                            <li><a href="#">Eventos</a></li>
	                    </ul>
	                    <hr class="hidden-md hidden-lg">
                    </div>
	
	                <div class="col-md-3 col-sm-6">
                    	<h4>¿Dónde nos encontramos?</h4>
                        <p><strong>MeetMusic - Viví tu música</strong>
                        	<br>Florencio Varela 1905
                        	<br>San Justo
                        	<br>BA1754
                        	<br>Buenos Aires
                        	<br>
                        	<strong>Argentina</strong>
                        </p>
                        <a href="#">Contacto</a>
                        <hr class="hidden-md hidden-lg">
                    </div>

                    <div class="col-md-3 col-sm-6">
                        <h4>Suscribite ya!!</h4>
                        <p class="text-muted">Te enviaremos las últimas bandas agregadas y lo próximos eventos!!</p>
                        <form>
                            <div class="input-group">
                                <input type="email" class="form-control">
                                <span class="input-group-btn">
			                         <button class="btn btn-default" type="button">Subscribirse!</button>
                                </span>
                            </div>
                        </form>
                        <hr>
	
                        <h4>Redes Sociales</h4>
                        <p class="social">
                            <a href="#" class="facebook external" data-animate-hover="shake"><i class="fa fa-facebook"></i></a>
                            <a href="#" class="twitter external" data-animate-hover="shake"><i class="fa fa-twitter"></i></a>
                            <a href="#" class="instagram external" data-animate-hover="shake"><i class="fa fa-instagram"></i></a>
                            <a href="#" class="gplus external" data-animate-hover="shake"><i class="fa fa-google-plus"></i></a>
                            <a href="#" class="email external" data-animate-hover="shake"><i class="fa fa-envelope"></i></a>
                        </p>
                    </div>
                </div>
            </div>
        </div>
 	
<!--  __________________________________________________________________________________________________________________________ -->
		<div id="copyright">
            <div class="container">
                <div class="col-md-6">
                    <p class="pull-left">© 2017 MeetMusic</p>
                </div>
            </div>
       </div>
	</div>
	
    <script src="js/jquery-1.11.0.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.cookie.js"></script>
    <script src="js/waypoints.min.js"></script>
    <script src="js/modernizr.js"></script>
    <script src="js/bootstrap-hover-dropdown.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/front.js"></script>
</body>
</html>

