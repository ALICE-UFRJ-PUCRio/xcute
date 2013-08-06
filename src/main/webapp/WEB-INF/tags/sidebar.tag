
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>


<div class="span3">
	<div class="well sidebar-nav">
		<ul class="nav nav-list">
			<f:form modelAttribute="processes">
				<li class="nav-header">Menu</li>
				<c:forEach var="proc" items="${processes}" varStatus="status">
			<c:url var="url" value="/designer/${proc.id}"  ></c:url>
					<li ><a  href="${url}">${proc.process}</a></li>
				</c:forEach>
			</f:form>
		</ul>
	</div>	<!--/.well -->
</div> <!--/span-->