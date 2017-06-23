<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>MeetMusic - Administración</title>
    <%@include file="../includes/head.jsp" %>
</head>

<body>
	<!-- barra superior -->
	<%@include file="../includes/header.jsp" %>
	<!-- Menú -->
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
               		sadasdsdasdadsdasdsd
               		</div>
               	</div>
      		</div>
      	</div>	
      	<!-- Footer -->
		<%@include file="../includes/footer.jsp" %>
	</div>
</body>
</html>

