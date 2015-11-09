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
				<a href="/sample/dataTableList.do">Data Tables</a>
				<small>advanced tables</small>
			</h1>
		</li>
		<li>
			<h1>
				<a href="">Input Form</a>
			</h1>
		</li>
	</ul>
</section>
<!-- Main content -->
<section class="content"></section>

</tiles:putAttribute>
</tiles:insertDefinition>