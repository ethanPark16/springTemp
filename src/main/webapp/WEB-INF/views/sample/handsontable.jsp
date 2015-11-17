<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page contentType="text/html; charset=UTF-8" session="false" %>
<tiles:insertDefinition name="adminTemplate">
<tiles:putAttribute name="content">

<!-- Content Header (Page header) -->
<section class="content-header">
	<h1>
		Handsontable
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
					<!-- target이 되는 div는 .handsontable 100% x 600px 를 사용거나 되도록 width와 height 를 지정하여 사용하고, 
							Handsontable 옵션중 stretchH 'all'(width 100% 기능) 옵션은 가급적 사용을 피한다.(반응형 웹형태에서 이상동작)  -->
					<div id="example1" class="handsontable htRowHeaders htColumnHeaders"></div>
				</div>
			</div>
		</div>
	</div>
</section>
<!-- script area -->
<script >
/*
 * 렌더링 순서에 따라 화면 로직을 위한 javascript는 문서 하단에 위치시켜주세요. 
 */
$(document).ready(function(){
	var
	  example = document.getElementById('example1'),
	  maxed = false,
	  resizeTimeout,
	  availableWidth,
	  availableHeight,
	  hot1;
	  
	hot1 = new Handsontable(example,{
		data: Handsontable.helper.createSpreadsheetData(1000, 1000),
		rowHeaders: true,
		colHeaders: true,
		minSpareRows: 1,
		contextMenu: true
	});
});


</script>
<!-- script area -->
</tiles:putAttribute>
</tiles:insertDefinition>

