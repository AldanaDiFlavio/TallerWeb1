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
               	<div class="col-md-12">
                   	<div class="box"><div class="pull-right"><h3>Cantidad de adheridos: <strong class="text-info">${banda.cantidadAdheridos}</strong></h3></div>
                       	<h1>${banda.nombre}</h1>
                       							<c:choose>		   		                              				                              				
								                      <c:when test="${not empty error}">
								                       <h4><span class="alert alert-danger"><strong>${error}</strong></span></h4>
								                      </c:when>
								                      <c:otherwise>
								                      	  <form:form action="adherirse-bandas?id=${banda.id}" modelAttribute="adherirseBanda" method = "POST">
		                                    						<input type="hidden" value="true" name="verdadero"/>
		                                    						<p class="buttons"><button type="submit" class="btn btn-primary">+ Adherirse</button></p>
		                                    			 </form:form>
								                      </c:otherwise>
								                </c:choose>
                   	</div>
                   	<div class="row products">
                    	<c:forEach items = "${album}" var="album">
		                   	<div class="col-md-4 col-sm-6">
	                            	<div class="product">
	                                	<div class="flip-container">
	                                    	<div class="flipper">
	                                        	<div class="front">
		                                        	<img src="images/bandas/albumes/${album.imagen}" alt="" class="img-responsive">
		                                    	</div>
		                                    	<div class="back">
		                                        	<img src="images/bandas/albumes/${album.imagen}" alt="" class="img-responsive">
		                                    	</div>
		                                	</div>
			                        	</div>
		                            	<div class="invisible">
			                            	<img src="images/bandas/albumes/${album.imagen}" alt="" class="img-responsive">
		                            	</div>
			                        	<div class="text">
		                                	<h3>${album.nombre}</h3>
		                                	<h3>${album.anio}</h3>
		                                	<p class="buttons">	                                        
		                                    	<a href="escucharalbum?id=${album.id}" class="btn btn-default">-> Escuchar</a>
		                                    	<a href="bandas" class="btn btn-primary">Volver a bandas</a>
		                                    </p>
		                                </div>		                                
		                            </div>
                         	</div>
                       	</c:forEach>
                   	</div>                	
		    	</div>          
           	</div>
       	</div>
		<!-- Footer -->
 		<%@include file="../includes/footer.jsp" %>
 	</div>
</body>
</html>