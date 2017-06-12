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
	            	<div id="main-slider">
                    	<div class="item">
                            <img src="images/main-silder/main-slider1.jpg" alt="" class="img-responsive">
                        </div>
                        <div class="item">
                            <img class="img-responsive" src="images/main-silder/main-slider2.jpg" alt="">
                        </div>
                        <div class="item">
                            <img class="img-responsive" src="images/main-silder/main-slider3.jpg" alt="">
                        </div>
                        <div class="item">
                            <img class="img-responsive" src="images/main-silder/main-slider4.jpg" alt="">
                        </div>
                    </div>
                </div>
            </div>
<!-- _________________________________________________________________________________________________________________ -->
			<div id="hot">
                <div class="box">
                    <div class="container">
                        <div class="col-md-12">
                            <h2>Bandas Recomendadas </h2>
                        </div>
                    </div>
                </div>

                <div class="container">
                    <div class="product-slider">
                    	<c:forEach items = "${bandas}" var="bandas">
	                        <div class="item">
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
<!-- _________________________________________________________________________________________________________________ -->
		<div id="hot">
			<div class="box">
				<div class="container">
					<div class="col-md-12">
						<h2>Próximos eventos</h2>
					</div>
				</div>
			</div>
			<div class="container">
        		<div class="product-slider">
        			<c:forEach items = "${eventos}" var="eventos">
	            		<div class="item">
	                		<div class="product">
	                    		<div class="flip-container">
	                        		<div class="flipper">
	                            		<div class="front">
	                       					<img src="${eventos.imagen}" alt="" class="img-responsive">
	                           			</div>
	                            		<div class="back">
	                                		<img src="${eventos.imagen}" alt="" class="img-responsive">
	                            		</div>
	                        		</div>
	                    		</div>
	                    		<div class="invisible">
	                        		<img src="${eventos.imagen}" alt="" class="img-responsive">
	                   			</div>
	                    		<div class="text">
		                        	<h3>${eventos.banda}</h3>
		                        	<h5>${eventos.lugar}</h5>
		                        	<h5>${eventos.fecha}</h5>
		                        	<p class="buttons">
		                            	<a href="#" class="btn btn-default">+ info</a>
		                        	</p>
		                    	</div>  
		                	</div>
		            	</div>
		            </c:forEach>
	        	</div>
			</div>
		</div>
	</div>			
<!-- ____________________________________________________________________________________________________________ -->

	<%@include file="footer.jsp" %>
	</div>
</body>
</html>

