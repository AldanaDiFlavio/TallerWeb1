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
               	
               	<div class="col-md-9" id="customer-orders">				  	
                	<div class="box">
                        <p class="lead">Eventos Solicitados</p>
                        <hr>
                       								<c:choose>		   		                              				                              				
		                                    				<c:when test="${not empty ueventos}">
		                                    					<div class="table-responsive">
										                            <table class="table table-hover">
										                                <thead>
										                                    <tr>
										                                        <th>Nombre</th>
										                                        <th>Eliminar asistencia</th>
										                                    </tr>
										                                </thead>
										                                <tbody>
										                                	<c:forEach items = "${ueventos}" var="i">                              	
										                                    <tr>
										                                        <th>${i.nombre}</th>  
										                                        <td><a href="desvinculardelevento?id=${i.id}" class="btn btn-primary">No asistire</a></td>                                              
										                                    </tr>                                                                                                   
										                                    </c:forEach>                                                                                                 
										                                </tbody>
										                            </table>
							                        			</div>
		                                    					
		                                    				</c:when>
		                                    				<c:otherwise>
		                                    					<p class="text-center">No participas de ningun evento</p>	
		                                    				</c:otherwise>
		                                    			</c:choose>                   
                    </div>
                </div>
               	
      		</div>
      	</div>	
      	<!-- Footer -->
		<%@include file="../includes/footer.jsp" %>
	</div>
</body>
</html>