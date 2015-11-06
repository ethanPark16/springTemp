<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" session="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>AngularJS User Registration and Login Example</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    
	<link rel="stylesheet" href="/resources/css/bootstrap/3.3.5/bootstrap.min.css">    
    <!-- Font Awesome -->
    <link rel="stylesheet" href="/resources/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="/resources/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="/resources/css/AdminLTE.css">
    <link rel="stylesheet" href="/resources/css/skins/skin-black.css">

</head>
<body class="hold-transition skin-black sidebar-mini">
    <div class="wrapper">
    	<header class="main-header">
	        <!-- Logo -->
	        <a href="" class="logo">
				<!-- mini logo for sidebar mini 50x50 pixels -->
				<span class="logo-mini"><b>P</b></span>
				<!-- logo for regular state and mobile devices -->
				<span class="logo-lg"><b>PIDO</b>TECH</span>
	        </a>
	        
	        <nav class="navbar navbar-static-top" role="navigation">
				<!-- Sidebar toggle button-->
				<a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
				  <span class="sr-only">Toggle navigation</span>
				</a>
				<div class="navbar-custom-menu">
					<ul class="nav navbar-nav">
						<li class="dropdown messages-menu">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">
							  <i class="fa fa-envelope-o"></i>
							  <span class="label label-success">4</span>
							</a>
						</li>
						<li class="dropdown notifications-menu">
			                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
								<i class="fa fa-bell-o"></i>
								<span class="label label-warning">10</span>
			                </a>
						</li>
						<li class="dropdown tasks-menu">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">
								<i class="fa fa-flag-o"></i>
								<span class="label label-danger">9</span>
							</a>
						</li>
						<li class="dropdown user user-menu">
			                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
								<img src="/resources/img/ethan-160x160.jpg" class="user-image" alt="User Image">
								<span class="hidden-xs">Ethan Park</span>
			                </a>
			            </li>
			            <li>
							<a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a>
						</li>
					</ul>
				</div>
			</nav>
		</header>
		<aside class="main-sidebar">
			<section class="sidebar">
				<!-- Sidebar user panel -->
				<div class="user-panel">
				  <div class="pull-left image">
				    <img src="/resources/img/ethan-160x160.jpg" class="img-circle" alt="User Image">
				  </div>
				  <div class="pull-left info">
				    <p>Ethan Park</p>
				    <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
				  </div>
				</div>
				<!-- search form -->
				<form action="#" method="get" class="sidebar-form">
				  <div class="input-group">
				    <input type="text" name="q" class="form-control" placeholder="Search...">
				    <span class="input-group-btn">
				      <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i></button>
				    </span>
				  </div>
				</form>
				<!-- /.search form -->
				<!-- sidebar menu: : style can be found in sidebar.less -->
				  <ul class="sidebar-menu">
				    <li class="header">MAIN NAVIGATION</li>
				    <li class="active treeview">
				      <a href="#">
				        <i class="fa fa-dashboard"></i> <span>Dashboard</span> <i class="fa fa-angle-left pull-right"></i>
				      </a>
				      <ul class="treeview-menu">
				        <li class="active"><a href="index.html"><i class="fa fa-circle-o"></i> Dashboard v1</a></li>
				        <li><a href="index2.html"><i class="fa fa-circle-o"></i> Dashboard v2</a></li>
				      </ul>
				    </li>
				    <li class="treeview">
				      <a href="#">
				        <i class="fa fa-files-o"></i>
				        <span>Layout Options</span>
				        <span class="label label-primary pull-right">4</span>
				      </a>
				      <ul class="treeview-menu">
				        <li><a href="pages/layout/top-nav.html"><i class="fa fa-circle-o"></i> Top Navigation</a></li>
				        <li><a href="pages/layout/boxed.html"><i class="fa fa-circle-o"></i> Boxed</a></li>
				        <li><a href="pages/layout/fixed.html"><i class="fa fa-circle-o"></i> Fixed</a></li>
				        <li><a href="pages/layout/collapsed-sidebar.html"><i class="fa fa-circle-o"></i> Collapsed Sidebar</a></li>
				      </ul>
				    </li>
				    <li>
				      <a href="pages/widgets.html">
				        <i class="fa fa-th"></i> <span>Widgets</span> <small class="label pull-right bg-green">new</small>
				      </a>
				    </li>
				    <li class="treeview">
				      <a href="#">
				        <i class="fa fa-pie-chart"></i>
				        <span>Charts</span>
				        <i class="fa fa-angle-left pull-right"></i>
				      </a>
				      <ul class="treeview-menu">
				        <li><a href="pages/charts/chartjs.html"><i class="fa fa-circle-o"></i> ChartJS</a></li>
				        <li><a href="pages/charts/morris.html"><i class="fa fa-circle-o"></i> Morris</a></li>
				        <li><a href="pages/charts/flot.html"><i class="fa fa-circle-o"></i> Flot</a></li>
				        <li><a href="pages/charts/inline.html"><i class="fa fa-circle-o"></i> Inline charts</a></li>
				      </ul>
				    </li>
				    <li class="treeview">
				      <a href="#">
				        <i class="fa fa-laptop"></i>
				        <span>UI Elements</span>
				        <i class="fa fa-angle-left pull-right"></i>
				      </a>
				      <ul class="treeview-menu">
				        <li><a href="pages/UI/general.html"><i class="fa fa-circle-o"></i> General</a></li>
				        <li><a href="pages/UI/icons.html"><i class="fa fa-circle-o"></i> Icons</a></li>
				        <li><a href="pages/UI/buttons.html"><i class="fa fa-circle-o"></i> Buttons</a></li>
				        <li><a href="pages/UI/sliders.html"><i class="fa fa-circle-o"></i> Sliders</a></li>
				        <li><a href="pages/UI/timeline.html"><i class="fa fa-circle-o"></i> Timeline</a></li>
				        <li><a href="pages/UI/modals.html"><i class="fa fa-circle-o"></i> Modals</a></li>
				      </ul>
				    </li>
				    <li class="treeview">
				      <a href="#">
				        <i class="fa fa-edit"></i> <span>Forms</span>
				        <i class="fa fa-angle-left pull-right"></i>
				      </a>
				      <ul class="treeview-menu">
				        <li><a href="pages/forms/general.html"><i class="fa fa-circle-o"></i> General Elements</a></li>
				        <li><a href="pages/forms/advanced.html"><i class="fa fa-circle-o"></i> Advanced Elements</a></li>
				        <li><a href="pages/forms/editors.html"><i class="fa fa-circle-o"></i> Editors</a></li>
				      </ul>
				    </li>
				    <li class="treeview">
				      <a href="#">
				        <i class="fa fa-table"></i> <span>Tables</span>
				        <i class="fa fa-angle-left pull-right"></i>
				      </a>
				      <ul class="treeview-menu">
				        <li><a href="pages/tables/simple.html"><i class="fa fa-circle-o"></i> Simple tables</a></li>
				        <li><a href="pages/tables/data.html"><i class="fa fa-circle-o"></i> Data tables</a></li>
				      </ul>
				    </li>
				    <li>
				      <a href="pages/calendar.html">
				        <i class="fa fa-calendar"></i> <span>Calendar</span>
				        <small class="label pull-right bg-red">3</small>
				      </a>
				    </li>
				    <li>
				      <a href="pages/mailbox/mailbox.html">
				        <i class="fa fa-envelope"></i> <span>Mailbox</span>
				        <small class="label pull-right bg-yellow">12</small>
				      </a>
				    </li>
				    <li class="treeview">
				      <a href="#">
				        <i class="fa fa-folder"></i> <span>Examples</span>
				        <i class="fa fa-angle-left pull-right"></i>
				      </a>
				      <ul class="treeview-menu">
				        <li><a href="pages/examples/invoice.html"><i class="fa fa-circle-o"></i> Invoice</a></li>
				        <li><a href="pages/examples/profile.html"><i class="fa fa-circle-o"></i> Profile</a></li>
				        <li><a href="pages/examples/login.html"><i class="fa fa-circle-o"></i> Login</a></li>
				        <li><a href="pages/examples/register.html"><i class="fa fa-circle-o"></i> Register</a></li>
				        <li><a href="pages/examples/lockscreen.html"><i class="fa fa-circle-o"></i> Lockscreen</a></li>
				        <li><a href="pages/examples/404.html"><i class="fa fa-circle-o"></i> 404 Error</a></li>
				        <li><a href="pages/examples/500.html"><i class="fa fa-circle-o"></i> 500 Error</a></li>
				        <li><a href="pages/examples/blank.html"><i class="fa fa-circle-o"></i> Blank Page</a></li>
				      </ul>
				    </li>
				    <li class="treeview">
				      <a href="#">
				        <i class="fa fa-share"></i> <span>Multilevel</span>
				        <i class="fa fa-angle-left pull-right"></i>
				      </a>
				      <ul class="treeview-menu">
				        <li><a href="#"><i class="fa fa-circle-o"></i> Level One</a></li>
				        <li>
				          <a href="#"><i class="fa fa-circle-o"></i> Level One <i class="fa fa-angle-left pull-right"></i></a>
				          <ul class="treeview-menu">
				            <li><a href="#"><i class="fa fa-circle-o"></i> Level Two</a></li>
				            <li>
				              <a href="#"><i class="fa fa-circle-o"></i> Level Two <i class="fa fa-angle-left pull-right"></i></a>
				              <ul class="treeview-menu">
				                <li><a href="#"><i class="fa fa-circle-o"></i> Level Three</a></li>
				                <li><a href="#"><i class="fa fa-circle-o"></i> Level Three</a></li>
				              </ul>
				            </li>
				          </ul>
				        </li>
				        <li><a href="#"><i class="fa fa-circle-o"></i> Level One</a></li>
				      </ul>
				    </li>
				    <li><a href="documentation/index.html"><i class="fa fa-book"></i> <span>Documentation</span></a></li>
				    <li class="header">LABELS</li>
				    <li><a href="#"><i class="fa fa-circle-o text-red"></i> <span>Important</span></a></li>
				    <li><a href="#"><i class="fa fa-circle-o text-yellow"></i> <span>Warning</span></a></li>
				    <li><a href="#"><i class="fa fa-circle-o text-aqua"></i> <span>Information</span></a></li>
				  </ul>
			</section>
			<!-- /.sidebar -->
		</aside>
		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
            <!-- Content Header (Page header) -->
        	<section class="content-header">
	          <h1>
	            Data Tables
	            <small>advanced tables</small>
	          </h1>
	          <ol class="breadcrumb">
	            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
	            <li><a href="#">Tables</a></li>
	            <li class="active">Data tables</li>
	          </ol>
	        </section>
	        <!-- Main content -->
        	<section class="content">
        		<div class="row">
		            <div class="col-xs-12">
		              	<div class="box">
		                	<div class="box-header">
		                  		<h3 class="box-title">Hover Data Table</h3>
		                	</div><!-- /.box-header -->
		                	<div class="box-body">
		                		<table id="example2" class="table table-bordered table-hover">
				                    <thead>
				                      <tr>
				                        <th>Rendering engine</th>
				                        <th>Browser</th>
				                        <th>Platform(s)</th>
				                        <th>Engine version</th>
				                        <th>CSS grade</th>
				                      </tr>
				                    </thead>
				                    <tbody>
				                      <tr>
				                        <td>Trident</td>
				                        <td>Internet
				                          Explorer 4.0</td>
				                        <td>Win 95+</td>
				                        <td> 4</td>
				                        <td>X</td>
				                      </tr>
				                    </tbody>
				                </table>
		                	</div>
		                </div>
		            </div>
				</div>
        	</section>
		</div>
		
		<footer class="main-footer">
			<div class="pull-right hidden-xs">
			  <b>Version</b> 1.0.0
			</div>
			<strong>Copyright &copy; 2015-2016 <a href="http://www.pidotech.com">PIDOTECH</a>.</strong> All rights reserved.
		</footer>
		
    </div>

    <!-- jQuery 2.1.4 -->
    <script src="/resources/js/cmm/jQuery-2.1.4.min.js"></script>
    <!-- jQuery UI 1.11.4 -->
    <script src="/resources/js/cmm/jquery-ui-1.11.4.min.js"></script>

    <script src="/resources/js/app.js"></script>

</body>
</html>