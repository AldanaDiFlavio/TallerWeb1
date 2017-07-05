<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="top">
    	<div class="container">
        	<div class="col-md-12" data-animate="fadeInDown">
            	<ul class="menu nav-right">
                	<c:choose>
	            		<c:when test="${usuario.id != null}">
		                	<li style="color: white">${usuario.user}</li>
		                    <li><a href="dashboard">Dashboard</a></li>
		                    <li><a href="cerrarSesion">Salir</a></li>
	            		</c:when>
	            		<c:otherwise>
		                	<li><a href="login">Login</a></li>
	            		</c:otherwise>
            		</c:choose>
                </ul>
            </div>
        </div>
	</div>