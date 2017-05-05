<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%><%@ page session="false"%>
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
 
       
       <title>Sunny Travel</title>
	</head>
    
    <body>
        <div>
        	<div id="header">
        		<a href="main" id="header">Main Header<br><br><br><br><br><br><br><br><br><br><br></a>
           	</div>
        	<div>
		   		 <ul id="links" class="row">
                 	<li><a href="application"  class="linkpage col-md-3" id="t1">Application </a></li>
                 	<li><a href="login"  class="linkpage col-md-3" id="t2">Login </a></li>
                 	<li><a href="register" class="linkpage col-md-3" id="t3">Create an account </a></li>
             	</ul>
         	</div>	
        </div>
        
        <section class="bloc1">
            
            <div class="login_window">
                <p>Login</p>
                <form action="loginissue" method="POST">
	                <br>ID<br>
	                <input class="user_input" autofocus="autofocus" name="id" value="">
	                <br>PASSWORD<br>
	                <input type="password" class="user_input" autofocus="autofocus" name="password" value="">
	                <br><br><input type="submit" value="Confirm" />
            	</form>
            </div>
				
            <div class="bloc">
				<img src="" height="200" align="left">
				<div class="unic">							
					<h3>WELCOME TO SUNNY TRAVEL!</h3>
					<p>Sunny Travel is a web application which suggests tourist attractions based on the location and real-time weather. I hope to give you the best advice for your trips!</p>
                    <a href="application" target="_BLANK" class="lien">TRY THE APPLICATION</a>
				</div>
				<div class="clear"></div>
            </div>
			<div class="bloc" id="correct_bloc">
				<img src="" height ="200" align="left"> 
				<div class="unic">
					<h3>HAVEN'T GOT AN ACCOUNT YET? CREATE ONE HERE!</h3>
					<p>By creating an account, you are able to save all of your recent searches so that you can access the information faster next time~!</p>
                    <a href="register" target="_BLANK" class="lien">CREATE AN ACCOUNT</a>
				</div>
			<div class="clear"></div>
			</div>
            <br><br><br><br>
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
