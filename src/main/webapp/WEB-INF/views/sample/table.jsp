<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page contentType="text/html; charset=UTF-8" session="false" %>
<tiles:insertDefinition name="adminTemplate">
<tiles:putAttribute name="content">

<input type=text id="test" value = "" />
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
								<th>User ID</th>
								<th>User Name</th>
								<th>registration date</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${dataList}" var="list">
							<tr>
								<td><a href="/sample/dataTableList.do">${list.user_id }</a></td>
								<td>${list.user_name }</td>
								<td>${list.regist_dt }</td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
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
	test2();
	test3();
	test4();
	test5();
	test6();
	test7();
	test8();
	test9();
	test0();
	test11();
	test();
});
function test() {
	console.log('테스트 입니다.');
}

function test2() {
}
function test3() {
}
function test4() {
}
function test5() {
}
function test6() {
}
function test7() {
}
function test8() {
}
function test9() {
}
function test0() {
}
function test11() {
}
</script>
<!-- script area -->


</tiles:putAttribute>
</tiles:insertDefinition>
<script src="/resources/js/init.js"></script>
