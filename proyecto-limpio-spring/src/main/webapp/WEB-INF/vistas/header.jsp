<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<div id="top">
    	<div class="container">
        	<div class="col-md-12" data-animate="fadeInDown">
            	<ul class="menu nav-right">
                	<c:choose>
	            		<c:when test="${user != null}">
		                	<li><a href="#">${user}</a></li>
		                    <li><a href="#">Perfil</a></li>
		                    <li><a href="home">Salir</a></li>
	            		</c:when>
	            		<c:otherwise>
		                	<li><a href="login">Login</a></li>
	                    	<li><a href="registro">Registrarse</a></li>
	            		</c:otherwise>
            		</c:choose>
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
                    <li><a href="eventos">Eventos</a></li>
                    <li><a href="#">Contacto</a></li>
                </ul>
            </div>
	        <!-- Aca va el buscador desplegable q no funciona -->
		</div>
	</div>
