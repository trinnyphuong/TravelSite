<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%><%@ page session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
        <spring:url value="/ressources/css/bootstrap-3.3.7-dist/css/bootstrap.min.css" var="bootstrapCss"/>
        <spring:url value="/ressources/css/style.css" var="mainCss"/>
        <spring:url value="/ressources/css/font-awesome-4.4.0/css/font-awesome.css" var="fontAwesomeCss"/> 
        <spring:url value="/ressources/css/images" var="images" />
        <link href="${bootstrapCss}" rel="stylesheet"/>
        <link href="${mainCss}" rel="stylesheet"/>
        <link href="${fontAwesomeCss}" rel="stylesheet"/>
 
		<title>NearbyResults</title>
	</head>
	<body>
        <div>
        	<div id="header">
        		<a href="/springrestclient/main" id="header">Main Header<br><br><br><br><br><br><br><br><br><br><br></a>
           	</div>
        	<div>
		   		 <ul id="links" class="row">
                 	<li><a href="/springrestclient/application"  class="linkpage col-md-3" id="t1">Application </a></li>
                 	<li><a href="/springrestclient/login"  class="linkpage col-md-3" id="t2">Login </a></li>
                 	<li><a href="/springrestclient/register" class="linkpage col-md-3" id="t3">Create an account </a></li>
             	</ul>
         	</div>	
        </div>
        
        <section class="bloc1">
            <div id="lookup">
            	<br>
            	<form action="/springrestclient/nearby/auto" method="POST">
	                <input class="user_input" autofocus="autofocus" name="s">
		            <input type="submit" name="send" class="btn btn-default" value="Confirm"/>
		        	 OR <input type="submit" name="geo" class="btn btn-default" value="Geolocalise me"/>
		        </form>
				<br><br><br>
		
				
			</div>
			
			<P>
				<h2 class="left-align">Points of interest :</h2>
				<c:forEach items="${nearbyResults}" var="result">
			   		<P><a class="linksearch" class="left-align" href="/springrestclient/nearby/result/details/${result.placeId}" target="_blank"><c:out value="${result.name}"/></a></P>
				</c:forEach>
				<br>
			</P>
            
            <div class="weather">
           		<h2>Weather :</h2>
            	<c:forEach items="${w}" var="result">
			   		<P><img src="${result[1]}" width="30px"><a class="linksearch" class="left-align" href="/springrestclient/nearby/result/weatherDetail/${result[2]}" target="_blank"><c:out value="${result[0]}"/></a></P>
				</c:forEach>
				<br>
            </div>
            <br><br>
        </section>
        
        <footer class="text-centrer">
        	<a href="https://www.wunderground.com/" target="_blank" id="refAPI1"><img src="${images}/weatherunderground.jpg" width="50px"></a>
           	<a href="https://developers.google.com/places/?hl=fr" target="_blank" id="refAPI2"><img src="${images}/googleplaces.jpg" width="50px"></a>
        	 
        	
			<div>
                <i class="fa fa-sun-o" aria-hidden="true"></i><br><br>				
                Trinh Hong Phuong Ngo - a1504535<br>
			</div>
		</footer>
        
    </body>
</html>