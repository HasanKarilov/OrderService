<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <!-- Title here -->
    <title>Menu</title>
    <!-- Description, Keywords and Author -->
    <meta name="description" content="Your description">
    <meta name="keywords" content="Your,Keywords">
    <meta name="author" content="ResponsiveWebInc">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <%--<link href="<c:url value="/resources/css/main.css"/>" rel="stylesheet"> EQUALS TO--%>
    <%--<link href="${pageContext.request.contextPath}/resources/css/books.css" rel="stylesheet" >--%>

    <!-- Styles -->
    <!-- Bootstrap CSS -->
    <link href="/resources/css/bootstrap.min.css" rel="stylesheet">
    <!-- SLIDER REVOLUTION 4.x CSS SETTINGS -->
    <link href="/resources/css/settings.css" rel="stylesheet">
    <!-- FlexSlider Css -->
    <link rel="stylesheet" href="/resources/css/flexslider.css" media="screen" />
    <!-- Portfolio CSS -->
    <link href="/resources/css/prettyPhoto.css" rel="stylesheet">
    <!-- Font awesome CSS -->
    <link href="/resources/css/font-awesome.min.css" rel="stylesheet">
    <!-- Custom Less -->
    <link href="/resources/css/less-style.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="/resources/css/style.css" rel="stylesheet">
    <!--[if IE]><link rel="stylesheet" href="css/ie-style.css"><![endif]-->

    <!-- Favicon -->
    <link rel="shortcut icon" href="index.html#">
</head>

<body>
<!-- Main Content -->
<div class="main-content">

    <!-- menu Start -->
    <div class="menu padd">
        <div class="container">
            <!-- Default Heading -->
            <div class="default-heading">
                <!-- Crown image -->
                <img class="img-responsive" src="img/crown.png" alt="" />
                <!-- Heading -->
                <h2>Menu</h2>
                <!-- Paragraph -->
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                <!-- Border -->
                <div class="border"></div>
            </div>
            <!-- Menu content container -->
            <div class="menu-container">
                <div class="row">
                    <div class="col-md-4 col-sm-4">
                        <!-- Menu header -->
                        <div class="menu-head">
                            <!-- Image for menu item -->
                            <img class="menu-img img-responsive img-thumbnail" src="resources/images/menu/menu1.jpg" alt="" />
                            <!-- Menu title / Heading -->
                            <h3>Salads</h3>
                            <!-- Border for above heading -->
                            <div class="title-border br-red"></div>
                        </div>
                        <!-- Menu item details -->
                        <div class="menu-details br-green">
                            <!-- Menu list -->
                            <ul class="list-unstyled">
                                <c:forEach items="${saladList}" var="dish">
                                    <li>
                                        <div class="menu-list-item">
                                            <!-- Icon -->
                                            <img src="resources/images/menu_item/${dish.id}.png" width="100px"/> <a href="#">${dish.description}</a>
                                            <!-- Price badge -->
                                            <span class="pull-right">${dish.cost} som</span>
                                            <div class="clearfix"></div>
                                        </div>
                                    </li>
                                </c:forEach>
                            </ul>
                        </div><!-- / Menu details end -->
                    </div>
                    <div class="col-md-4 col-sm-4">
                        <!-- Menu header -->
                        <div class="menu-head">
                            <!-- Image for menu item -->
                            <img class="menu-img img-responsive img-thumbnail" src="resources/images/menu/menu3.jpg" alt="" />
                            <!-- Menu title / Heading -->
                            <h3>Foods</h3>
                            <!-- Border for above heading -->
                            <div class="title-border br-green"></div>
                        </div>
                        <!-- Menu item details -->
                        <div class="menu-details br-red">
                            <!-- Menu list -->
                            <ul class="list-unstyled">
                                <c:forEach items="${dishList}" var="dish">
                                <li>
                                    <div class="menu-list-item">
                                        <!-- Icon -->
                                        <img src="resources/images/menu_item/${dish.id}.png" width="100px"/> <a href="#">${dish.description}</a>
                                        <!-- Price badge -->
                                        <span class="pull-right">${dish.cost} som</span>
                                        <div class="clearfix"></div>
                                    </div>
                                </li>
                                </c:forEach>
                            </ul>
                        </div><!-- / Menu details end -->
                    </div>
                    <div class="col-md-4 col-sm-4">
                        <!-- Menu header -->
                        <div class="menu-head">
                            <!-- Image for menu item -->
                            <img class="menu-img img-responsive img-thumbnail" src="resources/images/menu/menu4.jpg" alt="" />
                            <!-- Menu title / Heading -->
                            <h3>Drinks</h3>
                            <!-- Border for above heading -->
                            <div class="title-border br-lblue"></div>
                        </div>
                        <!-- Menu item details -->
                        <div class="menu-details br-orange">
                            <!-- Menu list -->
                            <ul class="list-unstyled">
                                <c:forEach items="${drinkList}" var="dish">
                                    <li>
                                        <div class="menu-list-item">
                                            <!-- Icon -->
                                            <img src="resources/images/menu_item/${dish.id}.png" width="100px"/> <a href="#">${dish.description}</a>
                                            <!-- Price badge -->
                                            <span class="pull-right">${dish.cost} som</span>
                                            <div class="clearfix"></div>
                                        </div>
                                    </li>
                                </c:forEach>
                            </ul>
                        </div><!-- / Menu details end -->
                    </div>
                </div>
            </div> <!-- /Menu container end -->
        </div>
    </div>

    <!-- Menu End -->




</div><!-- / Main Content End -->

<!-- Footer Start -->

<div class="footer padd">
    <div class="container">
        <div class="row">

        </div>
        <!-- Copyright -->
        <div class="footer-copyright">
            <!-- Paragraph -->
            <p>&copy; Copyright 2014 <a href="index.html#">Company Name</a></p>
        </div>
    </div>
</div>

<!-- Footer End -->

</div><!-- / Wrapper End -->


<!-- Scroll to top -->
<span class="totop"><a href="index.html#"><i class="fa fa-angle-up"></i></a></span>
</body>
</html>
