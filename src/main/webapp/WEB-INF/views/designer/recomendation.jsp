<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="t"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page session="true"%>
<html>
<head>
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

            <c:if test="${not empty kia.id}">
            <div class="alert alert-block" id="info">
            <button type="button" class="close" onclick="hide()" data-dismiss="alert">&times;</button>
            <p>N&atilde;o foram encontradas atividades para este KIP. 
	            </p>
	            </div>
            </c:if>


           <!-- c:if test="${not empty kip.id and not empty kip.knowledgeIntensiveActivities}" -->
           <div class="alert alert-block" id="info"> 
            <button type="button" class="close" onclick="hide()" data-dismiss="alert">&times;</button>
	            <p>Foram encontradas as atividades abaixo para este KIP . Todas as atividades colaborativas cont&eacute;m um link para o 
	               formul&aacute;rio de configura&ccedil;&atilde;o das ferramentas de grupo. 
	            </p>
	        </div>
	             
           	 <!-- /c:if-->	
	  	</jsp:body>
	</t:layout>
	
	<script type="text/javascript">
		function hide(){
		   document.getElementById("info").style.display = "none";
}
</script>
	
</body>
</html>