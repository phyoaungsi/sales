<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Login Page</title>
<style>
</style>
</head>
<body >
<h1 class="algincenter">Parkrite Parking Reservation System</h1>
		<form name='loginForm' class="form-signin" role="form"
		  action="<c:url value='/j_spring_security_check' />" method='POST'>
		  		
			 <h3 class="form-signin-heading">Please sign in</h3>
		 	 <input type='text' class="form-control" name='username' value='' placeholder="User Name" required autofocus>
		 	 <input type='password' class="form-control" name='password' placeholder="Password" required />
			 <input name="submit" type="submit" class="btn btn-lg btn-primary btn-block"
			 value="Login" />
		</form>
	
 
</body>
</html>