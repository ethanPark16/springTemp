<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page contentType="text/html; charset=UTF-8" session="false" %>

<tiles:insertDefinition name="adminTemplate">
<tiles:putAttribute name="content">

<!-- Content Header (Page header) -->
<section class="content-header">
	<ul>
		<li>
			<h1>
				Tables
				<small>advanced tables</small>
			</h1>
			<ul>
				<li><h3><a href="/sample/dataTableList.do">Data Table</a></h3></li>
				<li><h3><a href="/sample/handsontable.do">handsontable</a></h3></li>
			</ul>
		</li>
		<li>
			<h1>
				Forms
			</h1>
			<ul>
				<li><h3><a href="/sample/generalForm.do">General Form</a></h3></li>
			</ul>
		</li>
	</ul>
</section>
<!-- Main content -->
<section class="content"></section>

</tiles:putAttribute>
</tiles:insertDefinition>