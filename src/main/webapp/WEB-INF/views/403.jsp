<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page contentType="text/html; charset=UTF-8" session="false" %>

<tiles:insertDefinition name="adminTemplate">
<tiles:putAttribute name="content">

<!-- Content Header (Page header) -->
<section class="content-header">
  <h1>
    403 Error Page
  </h1>
  <ol class="breadcrumb">
    <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
    <li><a href="#">Examples</a></li>
    <li class="active">403 error</li>
  </ol>
</section>

<!-- Main content -->
<section class="content">
  <div class="error-page">
    <h2 class="headline text-yellow"> 403</h2>
    <div class="error-content" style="padding-top: 20px;">
      <h3><i class="fa fa-warning text-yellow"></i> Oops! Access Denied.</h3>
      <p>
        We could not find the page you were looking for.
        Meanwhile, you may <a href="/">return to dashboard</a> or try using the search form.
      </p>
   </div><!-- /.error-content -->
 </div><!-- /.error-page -->
</section><!-- /.content -->

</tiles:putAttribute>
</tiles:insertDefinition>