<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page contentType="text/html; charset=UTF-8" session="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>PIDOTECH</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    
	<link rel="stylesheet" href="/resources/css/bootstrap/3.3.5/bootstrap.min.css">    
	<link rel="stylesheet" href="/resources/css/bootstrap/dataTables.bootstrap.css">    
    <!-- Font Awesome -->
    <link rel="stylesheet" href="/resources/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="/resources/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="/resources/css/AdminLTE.css">
    <link rel="stylesheet" href="/resources/css/skins/skin-black.css">

	<link rel="stylesheet" href="/resources/css/handsontable.full.css">    

	<!-- jQuery 2.1.4 -->
    <script src="/resources/js/cmm/jQuery-2.1.4.min.js"></script>
    <!-- jQuery UI 1.11.4 -->
    <script src="/resources/js/cmm/jquery-ui-1.11.4.min.js"></script>
    
    <script src="/resources/js/cmm/jquery.dataTables.js"></script>
    <script src="/resources/js/cmm/dataTables.bootstrap.js"></script>
	<script src="/resources/js/cmm/handsontable.full.js"></script>
    
	<!-- require -->
    <script src="/resources/js/cmm/require.js"></script>
    <!-- bootstrap js -->
    <script src="/resources/js/app.js"></script>
    <script src="/resources/js/aspect.js"></script>
</head>
<body class="hold-transition skin-black sidebar-mini">
	<div class="wrapper">
		<tiles:insertAttribute name="header"/>
		<tiles:insertAttribute name="leftmenu"/>
		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<tiles:insertAttribute name="content"/>
		</div>
		<tiles:insertAttribute name="footer"/>
	</div>
    
</body>
</html>