<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Danh sách bài viết</title>
</head>
<body>
	<form action="<c:url value='/admin-new'/>" id="formSubmit" method="get">
		<div class="main-content-inner">
			<div class="breadcrumbs ace-save-state" id="breadcrumbs">
				<ul class="breadcrumb">
					<li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Trang
							chủ</a></li>
				</ul>
				<!-- /.breadcrumb -->
			</div>
			<div class="page-content">
				<div class="row">
					<div class="col-xs-12">
						<div class="row">
							<div class="col-xs-12">
								<div class="table-responsive">
									<table class="table table-bordered">
										<thead>
											<tr>
												<th>Title</th>
												<th>Short description</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<c:forEach var="item" items="${model.listResult}">
													<td>item.Title</td>
													<td>item.shortDescription</td>
												</c:forEach>

											</tr>
										</tbody>
									</table>
									 <ul class="pagination" id="pagination"></ul> 
									<input type="hidden" value="" id="page" name="page"/>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form>
		     <script >
      $(function () {
          window.pagObj = $('#pagination').twbsPagination({
              totalPages: 10,
              visiblePages: 5,
              startPage: 4,
              onPageClick: function (event, page) {
            	  $('#page').val(page);
            	  $('#formSubmit').submit();
              }
          }).on('page', function (event, page) {
              console.info(page + ' (from event listening)');
          });
      });
  </script>
</body>
</html>