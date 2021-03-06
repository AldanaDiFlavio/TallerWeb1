<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>MeetMusic - Login</title>
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
					<ul class="breadcrumb">
                       	<li><a href="home">Inicio</a></li>
                        <li>Login</li>
                    </ul>
                </div>
				<div id="loginbox" class="col-md-12">
					<div class="box">
						<h1>Login</h1>
       		            <p class="lead">�No te has registrado?</p>
            	        <p class="text-muted"><a href="registro"><strong>Registrarse ahora</strong></a>! Es simple y en un minuto podr�s adherirte a tus bandas favoritas!!</p>
                	    <hr>
						<form:form action="validar-login" method="POST" modelAttribute="usuario">
							<br>      
							<form:input path="user" id="user" type="text" class="form-control" placeholder="Usuario"/>
							<br> 
							<form:input path="password" type="password" id="password" class="form-control" placeholder="Clave"/>     		  
							<br> 
							<button class="btn btn-lg btn-primary btn-block"  name="Submit" value="Login" type="Submit">Ingresar</button>  			
						</form:form>
						
							<c:if test="${not empty error}">
					    	    <h4><span>${error}</span></h4>
					        	<br>
				        	</c:if>
				        
					</div>
				</div>
			</div>
		</div>
<!-- ____________________________________________________________________________________________________________ -->
	<%@include file="../includes/footer.jsp" %>
	</div>
</body>
</html>