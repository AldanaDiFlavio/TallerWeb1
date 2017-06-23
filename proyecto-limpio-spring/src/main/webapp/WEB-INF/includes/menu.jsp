<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
		
<c:choose>
	<c:when test="${user == 'admin'}">
		<div class="panel panel-default sidebar-menu">
	    	<div class="panel-heading">
	        	<h3 class="panel-title">Menú</h3>
	        </div>
	        <div class="panel-body">
	        	<ul class="nav nav-pills nav-stacked category-menu">
	           		<li><a href="notificaciones">Notificaciones</a></li>
                   	<li><a href="abmUsuarios">ABM Usuarios</a></li>
                    <li><a href="abmUsuarios">ABM Bandas</a></li>
                    <li><a href="abmUsuarios">ABM Eventos</a></li>
          		</ul>
           	</div>
	     </div>
	</c:when>
</c:choose>

<c:choose>
<c:when test="${aprobacion == 1}">

		<div class="panel panel-default sidebar-menu">
	    	<div class="panel-heading">
     			<h3 class="panel-title">Menú</h3>
 			</div>
		 	<div class="panel-body">
		     	<ul class="nav nav-pills nav-stacked category-menu">
		     		<li><a href="notificaciones">Notificaciones</a></li>
		          	<li><a href="misBandas">Mis bandas</a></li>
		          	<li><a href="misEventos">Mis eventos</a></li>
		          	<li><a href="seguidores">Seguidores</a></li>
		          	<li><a href="siguiendo">Siguiendo</a></li>
				</ul>
		 	</div>
		</div>

</c:when>
</c:choose>