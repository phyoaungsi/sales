<?xml version="1.0" encoding="UTF-8" ?>
<!-- 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"> -->
<!DOCTYPE html>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">
<title><decorator:title></decorator:title></title>
<s:include value="common_head.jsp" />
<s:include value="javascript_header.jsp" />

<!-- Bootstrap core CSS -->
<link href="<s:url value="/dist/css/bootstrap.css"/>" rel="stylesheet">

	<!--Fonts-->
<link
	href="https://fonts.googleapis.com/css?family=Montserrat:300,300i,400,400i,500,500i,600,600i,700,700i"
	rel="stylesheet">

	<!-- Icons -->
<link href="<s:url value="/css/admin4/font-awesome.css"/>"
	rel="stylesheet">

	<!-- Custom styles for this template -->
<link href="<s:url value="/css/style.css"/>" rel="stylesheet">
<decorator:head></decorator:head>
</head>

<body>



	<div class="">

		<s:set name="menu" value="namespace" />
		<s:if test="%{#menu=='carparkowner'}">
			<s:include value="carparkowner.jsp" />
		</s:if>
		<s:if test="%{#menu=='carpark'}">
			<s:include value="carparkowner.jsp" />
		</s:if>
		<s:if test="%{#menu=='member'}">
			<s:include value="member.jsp" />
		</s:if>
		<s:if test="%{#menu=='reports'}">
			<s:include value="report.jsp" />
		</s:if>
		<s:if test="%{#menu=='user'}">
			<s:include value="user.jsp" />
		</s:if>
		<s:if test="%{#menu=='ticket'}">
			<s:include value="ticket.jsp" />
		</s:if>

	</div>









	<div class="container-fluid" id="wrapper">
		<div class="row">
			<nav
				class="sidebar col-xs-12 col-sm-4 col-lg-3 col-xl-2 bg-faded sidebar-style-1">
				<h1 class="site-title">
					<a href="index.html"><em class="fa fa-rocket"></em> Brand.name</a>
				</h1>

				<a href="#menu-toggle" class="btn btn-default" id="menu-toggle"><em
					class="fa fa-bars"></em></a>

				<ul class="nav nav-pills flex-column sidebar-nav">
					<li class="nav-item"><a class="nav-link" href="index.html"><em
							class="fa fa-dashboard"></em> Dashboard</a></li>
					<li class="nav-item"><a class="nav-link active"
						href="widgets.html"><em class="fa fa-calendar-o"></em> Widgets
							<span class="sr-only">(current)</span></a></li>
					<li class="nav-item"><a class="nav-link" href="charts.html"><em
							class="fa fa-bar-chart"></em> Charts</a></li>
					<li class="nav-item"><a class="nav-link" href="elements.html"><em
							class="fa fa-hand-o-up"></em> UI Elements</a></li>
					<li class="nav-item"><a class="nav-link" href="cards.html"><em
							class="fa fa-clone"></em> Cards</a></li>
				</ul>


				<ul class="nav nav-pills flex-column sidebar-nav">
					<li class="nav-item"><s:a namespace="/dashboard"
							action="dashboard">Dashboard </s:a></li>



					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Orders</a>
						<ul class="dropdown-menu">
							<li><s:a cssClass="nav-link" namespace="/order"
									action="createOrderForm">Create Order</s:a></li>
							<li><s:a cssClass="nav-link" namespace="/carparkowner"
									action="searchcarparkownerform">Update Order</s:a></li>

						</ul></li>




					<li class="nav-item dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">User Access</a>
						<ul class="dropdown-menu">
							<li><s:a namespace="/user" action="createUserForm">Create User</s:a></li>
							<li><s:a namespace="/user" action="userList">Maintain User</s:a></li>

						</ul></li>




					<li class="nav-item dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">Car Park Owner</a>
						<ul class="dropdown-menu">
							<li><s:a namespace="/carparkowner"
									action="createcarparkownerform">Create CPO</s:a></li>
							<li><s:a namespace="/carparkowner"
									action="searchcarparkownerform">Maintain CPO</s:a></li>
							<li><s:a namespace="/carpark" action="carparkcreateform">Create Car Park</s:a></li>
							<li><s:a namespace="/carpark" action="searchcarparkform">Maintain Car Park</s:a></li>
						</ul></li>



					<li class=" nav-item dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">Member</a>
						<ul class="dropdown-menu">
							<li><s:a namespace="/member" action="createMemberForm">Create Member</s:a></li>
							<li><s:a namespace="/member" action="searchmemberform">Maintain Member</s:a></li>
							<li><s:a namespace="/member" action="searchmemberform">Search Member</s:a></li>
						</ul></li>


					<li class="nav-item dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">Ticket</a>
						<ul class="dropdown-menu">
							<li><s:a namespace="/ticket"
									action="createcomplimentaryform">Complimentary</s:a></li>
							<li><s:a namespace="/ticket" action="createredemptionform">Redemption</s:a></li>
						</ul></li>


					<li class="nav-item dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">Report</a>
						<ul class="dropdown-menu">
							<li><s:a namespace="/reports/download"
									action="carparkOwnerReport">Car Park Owner Report</s:a></li>
							<li><s:a namespace="/reports/download" action="memberReport">Member Report</s:a></li>
							<li><s:a namespace="/reports/download"
									action="bookingReport">Booking Report</s:a></li>
							<li><s:a namespace="/reports/download"
									action="redemptionReport">Redemption Report</s:a></li>
							<li><s:a namespace="/reports/download"
									action="complimentaryReport">Complimentary Report</s:a></li>
						</ul></li>

				</ul>

				<s:a cssClass="logout-button" namespace="/logout" action="logout">
					<em class="fa fa-power-off"></em>Logout</s:a>
			</nav>
			<main
				class="col-xs-12 col-sm-8 offset-sm-4 col-lg-9 offset-lg-3 col-xl-10 offset-xl-2 pt-3 pl-4">
			<header class="page-header row justify-center">
				<div class="col-md-6 col-lg-8">
					<h1 class="float-left text-center text-md-left">System</h1>
				</div>




				<div
					class="dropdown user-dropdown col-md-6 col-lg-4 text-center text-md-right">


					<a class="btn btn-stripped dropdown-toggle"
						href="https://example.com" id="dropdownMenuLink"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">

						<img src="images/profile-pic.jpg" alt="profile photo"
						class="circle float-left profile-photo" width="50" height="auto">
					</img>
						<div class="username mt-1">
							<h4 class="mb-1">
								<s:property value="loginUserId" />
							</h4>

							<h6 class="text-muted">
								<s:property value="access" />
							</h6>
						</div>
					</a>

					<div class="dropdown-menu dropdown-menu-right"
						style="margin-right: 1.5rem;" aria-labelledby="dropdownMenuLink">
						<a class="dropdown-item" href="#"><em
							class="fa fa-user-circle mr-1"></em> View Profile</a> <a
							class="dropdown-item" href="#"><em class="fa fa-sliders mr-1"></em>
							Preferences</a> <a class="dropdown-item" href="#"><em
							class="fa fa-power-off mr-1"></em> Logout</a>
					</div>
				</div>

				<div class="clear"></div>
			</header>





			<section class="row">

				<div style="text-align: right" class="col-12 mb-2">
				<div class="dropdown ">
						<button class="btn btn-sm btn-subtle dropdown-toggle"
							type="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false">
							<em class="fa fa-cog"></em>
						</button>

						<div class="dropdown-menu dropdown-menu-right" aria-labelledby="dropdownMenuButton">
							<a class="dropdown-item" href="#">Action</a> <a
								class="dropdown-item" href="#">Another action</a> <a
								class="dropdown-item" href="#">Something else here</a>
						</div>

					</div>
				</div>
				<div class="col-12 mb-2">


					<s:if test="hasActionMessages()">

						<div id="msgPlaceHolder"></div>
					</s:if>
					<s:if test="hasActionErrors()">
						<div id="errorPlaceHolder"></div>
					</s:if>
				</div>
			</section>



			<section class="row">
				<div class="col-sm-12">
					<section class="row">

						<div class="col-sm-12">
							<div class="card mb-4">
								<div class="card-block">
									<h3 class="card-title">
										<decorator:title></decorator:title>
									</h3>
									<h6 class="card-subtitle mb-2 text-muted">Subtitle</h6>






									<decorator:body></decorator:body>


								</div>
							</div>



						</div>
					</section>
					<section class="row">
						<div class="col-12 mt-1 mb-4">
							Template by <a href="https://www.medialoot.com">Medialoot</a>
						</div>
					</section>
				</div>
			</section>
			</main>
		</div>
	</div>




	<div id="msgTmp" style="display: none">
		<s:if test="hasActionMessages()">

			<s:actionmessage />
		</s:if>

	</div>


	<div id="errorTmp" style="display: none">
		<s:if test="hasActionErrors()">

			<s:actionerror />
		</s:if>

	</div>


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->

	<script src="<s:url value="/dist/js/bootstrap.min.js"/>"></script>

	<script src="<s:url value="/js/chart.min.js"/>"></script>
	<script src="<s:url value="/js/chart-data.js"/>"></script>
	<script src="<s:url value="/js/easypiechart.js"/>"></script>
	<script src="<s:url value="/js/easypiechart-data.js"/>"></script>
	<script src="<s:url value="/js/bootstrap-datepicker.js"/>"></script>
	<script src="<s:url value="/js/custom.js"/>"></script>
	<script>
		window.onload = function() {
			var chart1 = document.getElementById("line-chart").getContext("2d");
			window.myLine = new Chart(chart1).Line(lineChartData, {
				responsive : true,
				scaleLineColor : "rgba(0,0,0,.2)",
				scaleGridLineColor : "rgba(0,0,0,.05)",
				scaleFontColor : "#c5c7cc"
			});
		};
	</script>

	<script src="<s:url value="/js/tether.min.js"/>"
		integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb"
		crossorigin="anonymous"></script>

</body>
</html>
