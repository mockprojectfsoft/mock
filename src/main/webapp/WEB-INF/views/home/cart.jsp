<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<jsp:include page="../head.jsp" />
</head>
<body>
	<jsp:include page="../header.jsp" />
	<jsp:include page="../menu.jsp" />	
		<div id="content">
			<div class="container">
				<div class="row">
					<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
						<table class="table table-condensed table-hover table-bordered">
							<thead>
								<tr>
									<th style="width: 17%;">Hình ảnh</th>
									<th style="width: 28%;">Tên sản phẩm</th>
									<th style="width: 15%;">Giá</th>
									<th style="width: 14%;">Số lượng</th>
									<th style="width: 15%;">Thành tiền</th>
									<th style="width: 11%;">Hành động</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td><img src="images/1.jpg" alt="" width="75"></td>
									<td>Assus P550LD Top Sell</td>
									<td>19.000.000d</td>
									<td>2</td>
									<td>38.000.000d</td>
									<td><a href="#" title=""><i class="fas fa-trash-alt"></i></a></td>
								</tr>
							</tbody>
							<tfoot>
								<tr>
									<td colspan="6">
										<a href="#" title="" class="btn btn-info pull-left">Xóa giỏ hàng</a>
										<a href="#" title="" class="btn btn-primary pull-right">Tiếp tục mua hàng</a>
									</td>
								</tr>
							</tfoot>
						</table>
					</div>
				</div>
				<div class="row">
					<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
						<div class="amout">
							<table class="table table-bordered table-hover table-amout">
								<tfoot>
									<tr style="float: right;">
										<td>Tổng tiền thanh toán: </td>
										<td>20000000</td>
									</tr>
								</tfoot>
							</table>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
						<a href="#" title="" class="btn btn-primary pull-right">Thanh toán</a>
					</div>
				</div>
			</div>
		</div>
	<jsp:include page="../footer.jsp" />
</body>
</html>