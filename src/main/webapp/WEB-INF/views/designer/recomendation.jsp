<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="t"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page session="true"%>
<html>
<head>
<style type="text/css">
   .title {
      color: 0088cc;
   }
</style>

<title>Home</title>

</head>
<body>


	<t:layout description="my" keywords="chat" title="principal" screen="designer">
		<jsp:body>
	
		
		
		
	  <div class="hero-unit">
            <h3>${kia.name}</h3>

            <c:if test="${empty kia.id}">
            <h3>Configuração de das atividades intensivas em conhecimento</h3>
            <div class="alert alert-block" id="info">
            <button type="button" class="close" onclick="hide()" data-dismiss="alert">&times;</button>
            <p>Clicando em um KIP que consta no menu a configuração pode ser efetuada! 
	            </p>
	            </div>
            </c:if>


           	 	<table class="table table-striped">
                   <thead>
                      <tr>
                         <th>Tipo de evento</th>
                         <th>Parcipação de recurso</th>
                         <th>Participação humana</th>
                      </tr>
                   </thead>
	               <tbody>
 
            <c:if test="${not empty kia.id}">
               <%-- CollaborationInfo --%>
                <c:forEach var="act" items="${kia.collaborationInfo}"  >
			               <c:if test="${not empty act.id}">
				               <tr>
				                  <td> <span class="title"> ${act.description}</span> </td>
				                  <td>
				                 <span class="title"> ${act.participationDescription}</span>
				                  </td>
				                   <td>
				                     <span class="title"> ${act.agentName}</span>
				                   </td>
				               </tr>
			               </c:if>
	                 </c:forEach>
            </c:if>
			</tbody>
            	</table>
            

	  	</jsp:body>
	</t:layout>
	
	<script type="text/javascript">
		function hide(){
		   document.getElementById("info").style.display = "none";
}
</script>
	
</body>
</html>