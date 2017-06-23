<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="top">
    	<div class="container">
        	<div class="col-md-12" data-animate="fadeInDown">
            	<ul class="menu nav-right">
                	<c:choose>
	            		<c:when test="${user != null}">
		                	<li><a>${user}</a></li>
		                    <li><a href="perfil">Perfil</a></li>
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