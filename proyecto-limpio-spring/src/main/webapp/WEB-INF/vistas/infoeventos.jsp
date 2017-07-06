<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>MeetMusic - Bandas</title>
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
                    <li><a href="bandas">Bandas</a></li>
                    <li class="active"><a href="eventos">Eventos</a></li>
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
				<div class="col-sm-12" id="blog-listing">

                    <div class="box">
                        <h1>${evento.nombre}</h1><c:if test="${not empty error}">
					    	    <h4><span class="alert alert-danger"><strong>${error}</strong></span></h4>
					        	<br>
				        	</c:if>
                        <h4>Capacidad: ${evento.capacidad}</h4>
                        <h4>Cantidad de personas: ${evento.cantactual}</h4>
						<h4>Fecha del evento: ${evento.fecha}</h4>												
                    </div>

                    <div class="post">
                        <h3>Bandas que asisten</h3>
                        <p class="date-comments">
                        	<c:forEach items = "${bandasdelevento}" var="bandasdelevento">
		                     <i>  -	 "${bandasdelevento.nombre}"</i>
		               		 </c:forEach> 	
                        </p>
                        <hr>                      
                        <p class="author-category">- <a href="#">Solicita tu entrada en ticketek</a>
                        </p>
                        <div class="image">
                            
                        </div>
                        
                        <p class="intro">${evento.descripcion}</p>
                        
                        <c:choose>		   		                              				                              				
		                      <c:when test="${not empty error}">
		                       <h4><span class="alert alert-danger"><strong>${error}</strong></span></h4>
		                      </c:when>
		                      <c:otherwise>		                      	  
                       			  <p class="read-more"><a href="solicitarEvento?id=${evento.id}" class="btn btn-primary">Solicitar</a></p>		                           	
		                      </c:otherwise>
		                </c:choose>
                         
                    </div>


                    <div class="post">
                        <div class="row products">
                    	
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