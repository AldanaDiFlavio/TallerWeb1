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
               	<div class="col-md-12">
                   	<ul class="breadcrumb">
                       	<li><a href="home">Inicio</a></li>
                       	<li>Eventos</li>
                   	</ul>
               	</div>
               	
               	<div class="col-md-12">
                   	<div class="box">
                       	<h1>Eventos</h1>
                   	</div>
                   	<div class="row products">
                    	<c:forEach items = "${eventos}" var="eventos">
		                   	<div class="col-md-4 col-sm-6">
	                            	<div class="product">
	                                	<div class="flip-container">
	                                    	<div class="flipper">
	                                        	<div class="front">
		                                        	<img src="images/eventos/${eventos.imagen}" alt="" class="img-responsive">
		                                    	</div>
		                                    	<div class="back">
		                                        	<img src="images/eventos/${eventos.imagen}" alt="" class="img-responsive">
		                                    	</div>
		                                	</div>
			                        	</div>
		                            	<div class="invisible">
			                            	<img src="images/eventos/${eventos.imagen}" alt="" class="img-responsive">
		                            	</div>
			                        	<div class="text">
		                                	<h3>${eventos.nombre}</h3>
		                                    <p class="buttons">	                                        
		                                    	<a href="infoeventos?id=${eventos.id}" class="btn btn-default">+ info</a>	                                    		                                    		                                    
		                                    </p>
		                                    <h3>Bandas que asisten</h3>
		                                    <p class="buttons">		                                    
		                                    <c:forEach items = "${eventos.bandas}" var="eb">  

		                                 		<a href="infobandas?id=${eb.id}" class="btn btn-default">${eb.nombre}</a>                                 	
		                                    </c:forEach>
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