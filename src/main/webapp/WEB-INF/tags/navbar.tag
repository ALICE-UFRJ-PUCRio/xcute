    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ attribute name="screen" required="true" description="Screen name" %>
    <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container-fluid">
          <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </a>
          <a class="brand" href="./">XcuteKIP</a>
          <div class="nav-collapse collapse">
            <p class="navbar-text pull-right">
              Logged in as <a href="#" class="navbar-link">edveloso</a>
            </p>
            <ul class="nav">
            
              <c:url value="/designer" var="designer"></c:url>
              <c:url value="/execution" var="execution"></c:url>
            
              <li  <c:if test="${screen eq 'designer' }">  class="active"  </c:if>  ><a href="${designer}">Collaboration Designer</a></li>
              <li <c:if test="${screen eq 'execution' }">  class="active"  </c:if>    ><a href="${execution }">Collaboration Execution</a></li>
<!--               <li><a href="#contact">Contact</a></li> -->
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>
