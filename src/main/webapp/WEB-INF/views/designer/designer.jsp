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
            <h3>${kip.process}</h3>

            <c:if test="${empty kip.id}">
            <h3>Configuração de processos intensivos em conhecimento</h3>
            <div class="alert alert-block" id="info">
            <button type="button" class="close" onclick="hide()" data-dismiss="alert">&times;</button>
            <p>Clicando em um KIP que consta no menu a configuração pode ser efetuada! 
	            </p>
	            </div>
            </c:if>

            <c:if test="${not empty kip.id and empty kip.knowledgeIntensiveActivities}">
            <div class="alert alert-block" id="info">
            <button type="button" class="close" onclick="hide()" data-dismiss="alert">&times;</button>
            <p>N&atilde;o foram encontradas atividades para este KIP. 
	            </p>
	            </div>
            </c:if>


           <c:if test="${not empty kip.id and not empty kip.knowledgeIntensiveActivities}">
           <div class="alert alert-block" id="info"> 
            <button type="button" class="close" onclick="hide()" data-dismiss="alert">&times;</button>
	            <p>Foram encontradas as atividades abaixo para este KIP . Todas as atividades colaborativas cont&eacute;m um link para o 
	               formul&aacute;rio de configura&ccedil;&atilde;o das ferramentas de grupo. 
	            </p>
	        </div>
	             
           	 	<table class="table table-striped">
                   <thead>
                      <tr>
                         <th>Id</th>
                         <th>Process</th>
                      </tr>
                   </thead>
	               <tbody>
 
                     <c:url var="colab" value="/resources/img/Users-Image.png" />
	                 <c:forEach var="act" items="${kip.knowledgeIntensiveActivities}"  >
			               <c:if test="${not empty act.name}">
				               <tr>
				                  <td> <span class="title"> ${act.id}</span> </td>
				                  <td>
				                 <span class="title"> ${act.name}</span>
				                  </td>
				                   <td>
				                   <c:if test="${act.colaborative eq true}">
				                   <c:url var="colabUrl" value="recomendation/${act.id}"   />
				                    	<a href="${colabUrl}">
				                    		<img src="${colab}" alt="imagem" width="32" height="32" />
				                    	</a>	
				                    </c:if>
				                   </td>
				               </tr>
			               </c:if>
	                 </c:forEach>
	               </tbody>
            	</table>
            </c:if>
          </div>
          
          
       <!--    <div class="row-fluid">
            <div class="span4">
              <h2>Heading</h2>
              <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
              <p>
						<a class="btn" href="#">View details &raquo;</a>
			  </p>
            </div>
				<!--/span-->
        <!--   </div>
			<!--/row-->
			
			
	  	</jsp:body>
	</t:layout>
	
	<script type="text/javascript">
		function hide(){
		   document.getElementById("info").style.display = "none";
}
</script>
	
</body>
</html>