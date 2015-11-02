<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" session="false" %>
<!DOCTYPE html>
<html ng-app="sampleApp">
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>AngularJS User Registration and Login Example</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    
	<link rel="stylesheet" href="/css/bootstrap/3.3.5/bootstrap.min.css">    
    <!-- Font Awesome -->
    <link rel="stylesheet" href="/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="/css/AdminLTE.css">
    <link rel="stylesheet" href="/css/skins/skin-black-light.css">

    <%-- plugin
    <!-- iCheck -->
    <link rel="stylesheet" href="plugins/iCheck/flat/blue.css">
    <!-- Morris chart -->
    <link rel="stylesheet" href="plugins/morris/morris.css">
    <!-- jvectormap -->
    <link rel="stylesheet" href="plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <!-- Date Picker -->
    <link rel="stylesheet" href="plugins/datepicker/datepicker3.css">
    <!-- Daterange picker -->
    <link rel="stylesheet" href="plugins/daterangepicker/daterangepicker-bs3.css">
    <!-- bootstrap wysihtml5 - text editor -->
    <link rel="stylesheet" href="plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    --%> 
</head>
<body class="hold-transition skin-black-light sidebar-mini">
    <div class="wrapper">
    	<header class="main-header">
	        <!-- Logo -->
	        <a href="" class="logo">
				<!-- mini logo for sidebar mini 50x50 pixels -->
				<span class="logo-mini"><b>M</b>bility</span>
				<!-- logo for regular state and mobile devices -->
				<span class="logo-lg"><b>PIDO</b>TECH</span>
	        </a>
	        
	        <nav class="navbar navbar-static-top" role="navigation">
				<!-- Sidebar toggle button-->
				<a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
				  <span class="sr-only">Toggle navigation</span>
				</a>
				<div class="navbar-custom-menu">
				  
				</div>
			</nav>
		</header>
		<aside class="main-sidebar">
		</aside>
		<!-- Content Wrapper. Contains page content -->
		<div ng-view="" class="content-wrapper">
		</div>
		
		<footer class="main-footer">
			<div class="pull-right hidden-xs">
			  <b>Version</b> 2.3.0
			</div>
			<strong>Copyright &copy; 2015-2016 <a href="http://almsaeedstudio.com">Almsaeed Studio</a>.</strong> All rights reserved.
		</footer>
		<!-- Control Sidebar -->
		<aside class="control-sidebar control-sidebar-dark">
		</aside>
		<div class="control-sidebar-bg"></div>
    </div>

    <script src="/js/cmm/angular.1.4.7.min.js"></script>
    <script src="/js/cmm/angular-route.1.4.7.min.js"></script>
    <script src="/js/cmm/angular-cookies1.4.7.min.js"></script>

    <script src="/js/app.js"></script>

	<!-- controller js
    <script src="home/home.controller.js"></script>
    <script src="login/login.controller.js"></script>
    <script src="register/register.controller.js"></script>
	 -->
</body>
</html>