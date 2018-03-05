<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Home</title>
<style>
</style>
</head>
<body onload='document.loginForm.username.focus();'>
 
<script>

document.location.replace('dashboard/dashboard.do');

</script>
 
	<div id="login-box">
 
		<h3>Login with Username and Password</h3>
 
	
 
		<form name='loginForm'
		  action="<c:url value='j_spring_security_check' />" method='POST'>
 
		  <table>
			<tr>
				<td>User:a</td>
				<td><input type='text' name='username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="submit" /></td>
			</tr>
		  </table>
 
	
 
		</form>
	</div>
 
</body>
</html>