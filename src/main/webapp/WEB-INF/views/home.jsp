<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	한글테스트
	Hello world!<br/>   
	${map.val1}<br/>
	${map.val2}
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
