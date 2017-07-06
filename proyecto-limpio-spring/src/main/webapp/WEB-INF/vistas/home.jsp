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
                    <li class="active"><a href="home">Inicio</a></li>
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
	                                            <img src="images/bandas/${bandas.imagen}" alt="" class="img-responsive">
	                                        </div>
	                                        <div class="back">
	                                            <img src="images/bandas/${bandas.imagen}" alt="" class="img-responsive">
	                                        </div>
	                                    </div>
	                                </div>
	                                <div class="invisible">
	                                    <img src="images/bandas/${bandas.imagen}" alt="" class="img-responsive">
	                                </div>
	                                <div class="text">
	                                    <h3>${bandas.nombre}</h3>
	                                    <p class="buttons">
	                                        <a href="infobandas?id=${bandas.id}" class="btn btn-default">+ info</a>	                                   
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
						<h2>Eventos mas solicitados</h2>
					</div>
				</div>
			</div>
			<div class="container">
        		<div class="product-slider">
        			<c:forEach items = "${eventos}" var="eventos">
	            		<div class="item">
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
		                        	<h4>Asisten: ${eventos.cantactual}</h4>
		                        	<h4>Capacidad: ${eventos.capacidad}</h4>
		                        	<p class="buttons">
		                            	<a href="infoeventos?id=${eventos.id}" class="btn btn-default">+ info</a>
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

