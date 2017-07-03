<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>MeetMusic - Contacto</title>
   	<%@include file="../includes/head.jsp" %>
</head>

<body>
	<!-- Barra superior -->
	<%@include file="../includes/header.jsp" %>
	<!-- Menú -->
	<div class="navbar navbar-default yamm" role="navigation" id="navbar">
    	<div class="container">
        	<div class="navbar-header">
            	<a class="navbar-brand home"data-animate-hover="bounce">
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
                    <li><a href="home">Inicio</a></li>
                    <li><a href="bandas">Bandas</a></li>
                    <li><a href="eventos">Eventos</a></li>
                    <li class="active"><a href="contacto">Contacto</a></li>
                </ul>
            </div>
	        <!-- Aca va el buscador desplegable q no funciona -->
		</div>
	</div>
	<!--  Contenido del sitio -->
	<div id="all">
		<div id="content">
           	<div class="container">
				<div class="col-md-12">
					<ul class="breadcrumb">
                       	<li><a href="home">Inicio</a></li>
                        <li>Contacto</li>
                    </ul>
                </div>
				<div id="loginbox" class="col-md-12">
					<div class="box" id="contact">
                        <h1>Contacto</h1>
                        <hr>
                        <div class="row">
                            <div class="col-sm-4">
                                <h3><i class="fa fa-map-marker"></i> Dirección</h3>
                                <p>Florencio Varela 1903
                                    <br>San Justo
                                    <br>BA1754
                                    <br>Buenos Aires
                                    <br>
                                    <strong>Argentina</strong>
                                </p>
                            </div>
                            <!-- /.col-sm-4 -->
                            <div class="col-sm-4">
                                <h3><i class="fa fa-phone"></i> Call center</h3>
                                <p class="text-muted">Este número es gratuito si llama de Argentina de lo contrario le aconsejamos que utilice la forma electrónica de comunicación.</p>
                                <p><strong>0800-111-1234</strong>
                                </p>
                            </div>
                            <!-- /.col-sm-4 -->
                            <div class="col-sm-4">
                                <h3><i class="fa fa-envelope"></i> Correo Electrónico</h3>
                                <p class="text-muted">Por favor no dude en consultarnos, sobre alguna falla en el sistema.</p>
                                <ul>
                                    <li><strong><a href="mailto:">info@meetmusic.com.ar</a></strong>
                                    </li>
        
                                </ul>
                            </div>
                            <!-- /.col-sm-4 -->
                        </div>
                        <!-- /.row -->

                        <hr>

                        <div id="map">
							<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3281.3988756722815!2d-58.56479398512851!3d-34.66988116850816!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x95bcc62cc3e02599%3A0x5f178c9d980d3f8b!2sFlorencio+Varela+1903%2C+B1754JEC+San+Justo%2C+Buenos+Aires!5e0!3m2!1ses!2sar!4v1498154565681" width="100%" height="100%" frameborder="0" style="border:0" allowfullscreen></iframe>
						</div>
                        <hr>
                        <h2>Contáctanos</h2>
                        <!-- cambiar el formulario para jsp -->
                        <form>
                            <div class="row">
                                <div class="col-sm-6">
                                    <div class="form-group">
                                        <label for="firstname">Nombre</label>
                                        <input type="text" class="form-control" id="firstname">
                                    </div>
                                </div>
                                <div class="col-sm-6">
                                    <div class="form-group">
                                        <label for="lastname">Apellido</label>
                                        <input type="text" class="form-control" id="lastname">
                                    </div>
                                </div>
                                <div class="col-sm-6">
                                    <div class="form-group">
                                        <label for="email">Email</label>
                                        <input type="text" class="form-control" id="email">
                                    </div>
                                </div>
                                <div class="col-sm-6">
                                    <div class="form-group">
                                        <label for="subject">Asunto</label>
                                        <input type="text" class="form-control" id="subject">
                                    </div>
                                </div>
                                <div class="col-sm-12">
                                    <div class="form-group">
                                        <label for="message">Mensaje</label>
                                        <textarea id="message" class="form-control"></textarea>
                                    </div>
                                </div>

                                <div class="col-sm-12 text-center">
                                    <button type="submit" class="btn btn-primary"><i class="fa fa-envelope-o"></i> Enviar</button>

                                </div>
                            </div>
                            <!-- /.row -->
                        </form>
                    </div>
				</div>
			</div>
		</div>
	<!-- Footer -->
	<%@include file="../includes/footer.jsp" %>
	</div>
</body>
</html>