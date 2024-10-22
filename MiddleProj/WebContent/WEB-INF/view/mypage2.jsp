<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var='contextPath' value='${pageContext.request.contextPath}'></c:set>
<c:set var="member" value="${sessionScope.member}"></c:set>
<%@page import="jakarta.servlet.ServletContext"%>
<%@page import="java.util.List"%>

<head>

<style>
section {
    display: flex;
   flex-direction: column; /* 세로 방향 정렬 */
    justify-content: center; /* 수직 중앙 정렬 */  
    align-items: center; /* 가로 중앙 정렬 */ 
    height: 100vh; /* 화면 전체 높이 사용 */
}


.sect-person-info {
	padding: 20px;
	border-bottom: 1px solid #eaeaea;
}

.person-info {
	margin: 10px 0;
}

.person-info strong {
	font-size: 1.5em;
	color: #333;
}

.btn {
	display: inline-block;
	padding: 10px 20px;
	margin: 5px;
	border: none;
	border-radius: 5px;
	background-color: #007bff;
	color: white;
	text-decoration: none;
	transition: background-color 0.3s ease;
}

.btn:hover {
	background-color: #0056b3;
}

.card {
	margin: 20px 0;
	padding: 20px;
	border-radius: 8px;
	background-color: #ffffff;
	box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
}

.card h3 {
	margin-bottom: 10px;
	color: #333;
}

/* Responsive Design */
@media ( max-width : 768px) {
	.btn {
		width: 100%;
		text-align: center;
	}
	.container {
		width: 95%;
		padding: 15px;
	}
}
</style>

</head>

<body>
	<%@include file="../../includes/top.jsp"%>

	<section class="upcoming-meetings">

		<div class="container">
			<div class="card mx-auto">
				<div class="sect-person-info">
					<div class="person-info">
						<strong>${memName}님 환영합니다!</strong> 
						<a href="myinfo.do"	class="btn">나의 정보 변경</a>
						<a href="myreview.do" class="btn">나의 리뷰</a> 
						<a href="mypurchase.do" class="btn">결제 내역</a> 
<!-- 						<a href="myticket.do" class="btn">예매 내역</a>  -->
						<a href="myqna.do" class="btn">문의 내역</a>
						<a href="withdraw.do" class="btn">회원 탈퇴</a> 
					</div>
				</div>
				<!-- 			<div class="cols-benefit-info"> -->

				<!-- 				<div class="col-one-point"> -->
				<!-- 					<h3>Boogie POINT</h3> -->
				<!-- 					<a href="/user/mycgv/cjone-point/pointlist.aspx">적립금</a> -->
				<!-- 					<ul> -->
				<!-- 						<li><strong>사용가능 포인트</strong> <span><em -->
				<!-- 								class="txt-maroon"><a -->
				<!-- 									href="/user/mycgv/cjone-point/pointlist.aspx">1,526</a></em> 점</span></li> -->

				<!-- 					</ul> -->



				<!-- 				</div> -->
				<!-- 				<div class="col-favorite-theater"> -->
				<!-- 					<h3 class="hidden">자주가는 Boogie</h3> -->
				<!-- 					<div class="sect-favorite"> -->
				<!-- 						<ul id="favoriteTheaters"> -->

				<!-- 							<li><a href="#" data-regioncode="205" -->
				<!-- 								data-theatercode="0282"><span>1<em>순위</em></span>CGV청주율량</a></li> -->

				<!-- 							<li><a href="#" data-regioncode="205" -->
				<!-- 								data-theatercode="0228"><span>2<em>순위</em></span>CGV청주(서문)</a></li> -->

				<!-- 							<li><a href="#" data-regioncode="205" -->
				<!-- 								data-theatercode="0297"><span>3<em>순위</em></span>CGV청주성안길(종료)</a></li> -->

				<!-- 							<li><a href="#" data-regioncode="" data-theatercode=""><span>4<em>순위</em></span></a></li> -->

				<!-- 							<li><a href="#" data-regioncode="" data-theatercode=""><span>5<em>순위</em></span></a></li> -->

				<!-- 						</ul> -->
				<!-- 						<button id="btn_set_my_favorite" title="새창" type="button" -->
				<!-- 							class="setting"> -->
				<!-- 							자주가는 Boogie<br>설정하기 -->
				<!-- 						</button> -->
				<!-- 					</div> -->
				<!-- 				</div> -->


				<!-- 			</div> -->
				</div>
			</div>
			<%@include file="../../includes/bottom.jsp"%>
	</section>
</body>



</html>