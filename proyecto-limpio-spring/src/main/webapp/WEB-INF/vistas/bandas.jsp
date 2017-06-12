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
                       	<li>Bandas</li>
                   	</ul>
               	</div>
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

               	<div class="col-md-9">
                   	<div class="box">
                       	<h1>Bandas</h1>
                   	</div>
                  
                   	<div class="row products">
                    	<c:forEach items = "${bandas}" var="bandas">
		                   	<div class="col-md-4 col-sm-6">
	                            	<div class="product">
	                                	<div class="flip-container">
	                                    	<div class="flipper">
	                                        	<div class="front">
		                                        	<img src="${bandas.imagen}" alt="" class="img-responsive">
		                                    	</div>
		                                    	<div class="back">
		                                        	<img src="${bandas.imagen}" alt="" class="img-responsive">
		                                    	</div>
		                                	</div>
			                        	</div>
		                            	<div class="invisible">
			                            	<img src="${bandas.imagen}" alt="" class="img-responsive">
		                            	</div>
			                        	<div class="text">
		                                	<h3>${bandas.nombre}</h3>
		                                    <p class="buttons">
		                                    	<a href="#" class="btn btn-default">+ info</a>
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
<!-- __________________________________________________________________________________________________________________ -->
 		<%@include file="footer.jsp" %>
 	</div>
</body>
</html>