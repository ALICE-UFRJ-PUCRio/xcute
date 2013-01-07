<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ tag description="Page layout" %>
 
<%@ attribute name="title"       required="true" description="Page title" %>
<%@ attribute name="keywords"    required="true" description="Page keywords to improve SEO" %>
<%@ attribute name="description" required="true" description="Page description" %>
<%@ attribute name="screen" required="true" description="Screen name" %>


<%@ taglib tagdir="/WEB-INF/tags" prefix="t" %> 


<!DOCTYPE html>
<html lang="en">
  <head>
        <!-- Displaying the attributes using EL -->
    <meta name="keywords"    content="${keywords}" />
    <meta name="description" content="${description}" />
    <title>${title}</title>
 
    <meta charset="utf-8">
    <title>Bootstrap, from Twitter</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Le styles -->
    <c:url value="/resources/css/bootstrap.css"  var="bootstrap_css" ></c:url>
    <link href="${bootstrap_css}" rel="stylesheet">
    <style type="text/css">
      body {
        padding-top: 60px;
        padding-bottom: 40px;
      }
      .sidebar-nav {
        padding: 9px 0;
      }
    </style>
    
    <c:url value="/resources/css/bootstrap-responsive.css"  var="responsive_css" ></c:url>
    <link href="${responsive_css}" rel="stylesheet">

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- Fav and touch icons -->
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="/resources/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="/resources/ico/apple-touch-icon-114-precomposed.png">
      <link rel="apple-touch-icon-precomposed" sizes="72x72" href="/resources/ico/apple-touch-icon-72-precomposed.png">
                    <link rel="apple-touch-icon-precomposed" href="/resources/ico/apple-touch-icon-57-precomposed.png">
                                   <link rel="shortcut icon" href="/resources/ico/favicon.png">
  </head>

  <body>

    <t:navbar screen="${screen}"/>
 
    <div class="container-fluid">
      <div class="row-fluid">
       <t:sidebar /> 

        <div class="span9">
          <jsp:doBody/>
      </div><!--/row-->
      </div>

      <hr>

      <footer>
        <p>&copy; Uniriotec 2012</p>
      </footer>

    </div><!--/.fluid-container-->

    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="/resources/js/jquery.js"></script>
    <script src="/resources/js/bootstrap-transition.js"></script>
    <script src="/resources/js/bootstrap-alert.js"></script>
    <script src="/resources/js/bootstrap-modal.js"></script>
    <script src="/resources/js/bootstrap-dropdown.js"></script>
    <script src="/resources/js/bootstrap-scrollspy.js"></script>
    <script src="/resources/js/bootstrap-tab.js"></script>
    <script src="/resources/js/bootstrap-tooltip.js"></script>
    <script src="/resources/js/bootstrap-popover.js"></script>
    <script src="/resources/js/bootstrap-button.js"></script>
    <script src="/resources/js/bootstrap-collapse.js"></script>
    <script src="/resources/js/bootstrap-carousel.js"></script>
    <script src="/resources/js/bootstrap-typeahead.js"></script>

  </body>
</html>
