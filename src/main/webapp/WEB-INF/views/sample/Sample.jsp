<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" session="false" %>
<html>
<head>
	<title>Sample</title>
</head>
<body>
<h1>
	Sample page
</h1>
<form name="sampleForm" action="/mobility/sample/insertSampleUser.do">
	<input type="text" name="user_id" value="cho" />
	<input type="text" name="user_pw" value="1234" />
	<input type="text" name="user_name" value="미스터조" />
	<input type="text" name="regist_user" value="ethan" />
	<button type="submit" >등록</button>
</form>
</body>
</html>
