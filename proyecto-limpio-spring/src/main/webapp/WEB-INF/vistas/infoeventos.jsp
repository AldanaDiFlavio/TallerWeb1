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
               <div class="col-md-3">
               	    <div class="panel panel-default sidebar-menu">
                       	<div class="panel-heading">
                           	<h3 class="panel-title">Género</h3>
                       	</div>
                       	<div class="panel-body">
                           	<ul class="nav nav-pills nav-stacked category-menu">
                               	<li class="active"><a href="#">Todos<span class="badge pull-right">8</span></a></li>
                               	<li><a href="#">Rock Nacional<span class="badge pull-right">4</span></a></li>
                                <li><a href="#">Rock Internacional<span class="badge pull-right">4</span></a></li>
                      		</ul>
                       	</div>
                   	</div>
               	</div>
				<div class="col-sm-9" id="blog-listing">

                    <div class="box">

                        <h1>${evento.nombre}</h1>
                        <p>${evento.descripcion}</p>
						<p>${evento.fecha}</p>
						<p>${evento.capacidad}</p>			
                    </div>

                    <div class="post">
                        <h2><a href="post.html">Algo Mas</a></h2>
                        <p class="author-category">By <a href="#">info</a> in <a href="">info</a>
                        </p>
                        <hr>
                        <p class="date-comments">
                            <a href="post.html"><i class="fa fa-calendar-o"></i>info</a>
                            <a href="post.html"><i class="fa fa-comment-o"></i>info</a>
                        </p>
                        <div class="image">
                            
                        </div>
                        <p class="intro">info</p>
                        <p class="read-more"><a href="post.html" class="btn btn-primary">info</a>
                        </p>
                    </div>


                    <div class="post">
                        <div class="row products">
                    	<c:forEach items = "${bandas}" var="bandas">
		                   	<div class="col-md-4 col-sm-6">
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
		                                    	<a href="#" class="btn btn-primary">Adherirse</a>
		                                    </p>
		                                </div>                                
		                            </div>
                         	</div>
                       	</c:forEach>
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