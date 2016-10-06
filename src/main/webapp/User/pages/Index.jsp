<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>SB Admin 2 - Bootstrap Admin Theme</title>

<!-- Bootstrap Core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="dist/css/sb-admin-2.css" rel="stylesheet">

<!-- Morris Charts  -->
<link href="vendor/morrisjs/morris.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
	<!-- Start Body Index -->
	<div id="wrapper">
		<jsp:include page="Template/NavigationHeadTemp.jsp" />

		<!-- Page Content -->
		<div id="page-wrapper">
			<div class="container-fluid">
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">Blank</h1>

						<audio controls id="idplay">
							<source
								src="https://googledrive.com/host/0B3ekfv5mkbffZnBCaklnRnJtUnM"
								type="audio/mpeg">
						</audio>

						<h2>
							<%-- <s:property value="accdto.username__p" />
							<s:iterator value="musicDTOList" var="i">
								<s:property value="songname__p" />
							</s:iterator> --%>
						</h2>
					</div>
				</div>
				<div class="row">
					<div class="col-lg-3 col-md-6">
						<div class="panel panel-primary">
							<div class="panel-heading">
								<div class="row">
									<div class="col-xs-3">
										<i class="fa fa-music fa-5x"></i>
									</div>
									<div class="col-xs-9 text-right">
										<div class="huge">Music</div>
										<div>Bring the life more fun</div>
									</div>
								</div>
							</div>
							<a href="#">
								<div class="panel-footer">
									<span class="pull-left">View Details</span> <span
										class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
									<div class="clearfix"></div>
								</div>
							</a>
						</div>
					</div>
					<div class="col-lg-3 col-md-6">
						<div class="panel panel-green">
							<div class="panel-heading">
								<div class="row">
									<div class="col-xs-3">
										<i class="fa fa-film fa-5x"></i>
									</div>
									<div class="col-xs-9 text-right">
										<div class="huge">Movie</div>
										<div>Some Movie Note</div>
									</div>
								</div>
							</div>
							<a href="#">
								<div class="panel-footer">
									<span class="pull-left">View Details</span> <span
										class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
									<div class="clearfix"></div>
								</div>
							</a>
						</div>
					</div>
					<div class="col-lg-3 col-md-6">
						<div class="panel panel-yellow">
							<div class="panel-heading">
								<div class="row">
									<div class="col-xs-3">
										<i class="fa fa-photo fa-5x"></i>
									</div>
									<div class="col-xs-9 text-right">
										<div class="huge">Photo</div>
										<div>Some Photo Note</div>
									</div>
								</div>
							</div>
							<a href="#">
								<div class="panel-footer">
									<span class="pull-left">View Details</span> <span
										class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
									<div class="clearfix"></div>
								</div>
							</a>
						</div>
					</div>
					<div class="col-lg-3 col-md-6">
						<div class="panel panel-red">
							<div class="panel-heading">
								<div class="row">
									<div class="col-xs-3">
										<i class="fa fa-inbox fa-5x"></i>
									</div>
									<div class="col-xs-9 text-right">
										<div class="huge">News</div>
										<div>Some News Notes</div>
									</div>
								</div>
							</div>
							<a href="#">
								<div class="panel-footer">
									<span class="pull-left">View Details</span> <span
										class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
									<div class="clearfix"></div>
								</div>
							</a>
						</div>
					</div>

					<!-- Pulppy Start Content Page -->
					<div class="col-lg-3">
						<div class="panel panel-default">
							<div class="panel-heading">
								<i class="fa fa-bell fa-fw"></i>New Song
							</div>
							<div class="panel-body">
								<div class="list-group">
									<s:iterator value="musicDTOList" var="i">
										<a href="#" class="list-group-item"
											onclick="playsong();return false;"> <i
											class="fa fa-comment fa-fw" style="font-size: smaller;"></i>
											<s:property value="songname__p" /> <%-- <span class="pull-right text-muted small" style="font-size: smaller;"><em>Song Artist ago</em> </span> --%>
											<span id="songLink" style="visibility: hidden;"><s:property
													value="songLink__p" /></span>
										</a>
									</s:iterator>
								</div>
							</div>
						</div>
					</div>
					<!-- Pulppy End Content Page -->
				</div>
			</div>
		</div>
	</div>

	<script type="text/javascript">
		/* Script input Audio Source Start */
		function playsong() {
			alert($("#songLink").text());
			$('a #songLink').click(function() {
				var a = $(this).text();
				var songlink = 'https://googledrive.com/host/' + a;
				$('audio').show();
				$('#idplay').attr('src', songlink);
			});
		}
		/* Script input Audio Source End */
	</script>
	<!-- jQuery -->
	<script src="vendor/jquery/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="vendor/metisMenu/metisMenu.min.js"></script>

	<!-- Morris Charts JavaScript -->
	<script src="vendor/raphael/raphael.min.js"></script>
	<script src="vendor/morrisjs/morris.min.js"></script>
	<script src="data/morris-data.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="dist/js/sb-admin-2.js"></script>
</body>

</html>
