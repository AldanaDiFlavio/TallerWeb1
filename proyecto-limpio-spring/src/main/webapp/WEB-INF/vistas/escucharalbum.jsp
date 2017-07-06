<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>MeetMusic</title>
   	<%@include file="../includes/head.jsp" %>
</head>

<body>
	<!-- Barra superior -->
	<%@include file="../includes/header.jsp" %>
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
                    <li class="active"><a href="bandas">Bandas</a></li>
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
				<div class="col-md-12" id="customer-orders">				  	
                	<div class="box">
                        <p class="lead">Temas</p>
                        <hr>						
                        <div class="table-responsive">
                            <table class="table table-hover">
                                <thead>
                                    <tr>
                                        <th>Tema</th>
                                        <th>Nombre</th>
                                        <th>Duración</th>
                                        <th>Youtube</th>
                                    </tr>
                                </thead>
                                <tbody>
                                	<c:forEach items = "${tema}" var="tema">                              	
                                    <tr>
                                    	<c:set var="test" value="${tema.link}" scope="page" />
                                        <th>${tema.posicion}</th>
                                        <td>${tema.nombre}</td>
                                        <td>${tema.duracion}</td>
                                        <td><a rel="external" href="https://<c:out value="${test}" />" target="_framename" class="btn btn-primary btn-sm">Escuchar</a></td>                                                      
                                    </tr>                                                                                                   
                                    </c:forEach>                                                                                                 
                                </tbody>
                            </table>
                        </div>                                         
                    </div>
                </div>
            </div>       
		</div>
		<!-- Footer -->
	 	<%@include file="../includes/footer.jsp" %>
	</div>
</body>
</html>