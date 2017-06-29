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
               			<div class="box">
                        <h1>Alta Eventos</h1>
                        <p class="lead"><a href="#"><strong>Modificar Evento</strong></a></p>
                        <p class="text-muted"><a href="#"><strong>Eliminar Evento</strong></a></p>
                        <hr>
		                        	<form:form action="validar-evento" method="post" modelAttribute="evento">
			                            <div class="form-group">
			                                <form:input path="nombre" type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre"/>
			                            </div>
			                            <div class="form-group">	
											
								         
										
										<label for="evento">Seleccione las bandas del evento</label></br>											    
										            <c:forEach items="${bandas}" var="bandas" varStatus="status"> 
										            	  <label class="checkbox-inline"><form:checkbox path="bandas" value="${bandas}" />${bandas.nombre}</label>	 
								           			 </c:forEach>	
										
										
										
										
										</div>
			                            <div class="form-group">
			                                <form:input path="imagen" type="text" class="form-control" id="imagen" name="imagen" placeholder="eventox.jsp"/>
			                            </div>
			                            <div class="form-group">
			                                <form:input path="capacidad" type="text" class="form-control" id="capacidad" name="capacidad" placeholder="Cantidad de gente"/>
			                            </div>
										<div class="form-group">
			                                <form:input path="comienzo" type="text" class="form-control" id="comienzo" name="comienzo" placeholder="Fecha de inicio"/>
			                            </div>
			                            <div class="form-group">
			                                <form:input path="finalizacion" type="text" class="form-control" id="finalizacion" name="finalizacion" placeholder="Fecha de finalizacion"/>
			                            </div>
															
			                            <p class="text-center">
			                                <button class="btn btn-primary" name="Submit" value="Login" type="Submit"><i class="fa fa-sign-in"></i> Guardar</button>
			                            </p>
			                        </form:form>
									<c:if test="${not empty error}">
					        			<h4><span>${error}</span></h4>
					        			<br>
				        			</c:if>
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

