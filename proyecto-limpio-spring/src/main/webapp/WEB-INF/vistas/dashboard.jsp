<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>MeetMusic - Usuario</title>
    <%@include file="../includes/head.jsp" %>
</head>

<body>
	<!-- barra superior -->
	<%@include file="../includes/header.jsp" %>
	<!-- Men� -->
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
                    <li><a href="contacto">Contacto</a></li>
                </ul>
            </div>
	        <!-- Aca va el buscador desplegable q no funciona -->
		</div>
	</div>
	<!-- Contenido del sitio -->
	<div id="all">
		<div id="content">
		<div class="container">
			<div class="col-md-3">
                   <%@include file="../includes/menu.jsp" %>
               	</div>
               	
               	<div class="col-md-9">
               		<div class="jumbotron">
               			<h2><b>Bienvenido, ${usuario.user }!!!</b></h2>
               			<p>Desde ac� vas a poder getionar tus bandas favoritas y los eventos a los que vas
               			a asistir!!</p>
               		</div>
               	
               	</div>
      		</div>
      	</div>	
      	<!-- Footer -->
		<%@include file="../includes/footer.jsp" %>
	</div>
</body>
</html>