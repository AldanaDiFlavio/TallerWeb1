<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta name="robots" content="all,follow">
    <meta name="googlebot" content="index,follow,snippet,archive">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>MeetMusic</title>
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,500,700,300,100' rel='stylesheet' type='text/css'>
    <link href="css/font-awesome.css" rel="stylesheet">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/owl.carousel.css" rel="stylesheet">
    <link href="css/owl.theme.css" rel="stylesheet">
    <link href="css/style.blue.css" rel="stylesheet" id="theme-stylesheet">
    <link href="css/custom.css" rel="stylesheet">
    <script src="js/respond.min.js"></script>
    <link rel="shortcut icon" href="images/logo/favicon.png">
</head>

<body>
	<%@include file="header.jsp" %>
<!-- _________________________________________________________________________________________________________________ -->
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
       		            <p class="lead">¿No te has registrado?</p>
            	        <p class="text-muted"><a href="#"><strong>Registrarse ahora</strong></a>! Es simple y en un minuto podrás adherirte a tus bandas favoritas!!</p>
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
	<%@include file="footer.jsp" %>
	</div>
</body>
</html>