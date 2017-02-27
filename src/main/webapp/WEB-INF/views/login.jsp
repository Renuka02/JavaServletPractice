<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>yahooo</title>
</head>
<body>
<!--  you are welcome : ${name} 
your password is: ${password}-->

<form action="/login.do" method="post">
${errormessage}
Enter your name<input type="text" name="name"/>
Enter your password<input type="password" name="password"/>
<input type="submit" value="login"/>
<p>

</p>
</form>
</body>
</html>