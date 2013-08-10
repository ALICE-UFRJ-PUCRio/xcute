package br.uniriotec.xcute.busines.strategy;

import java.util.List;

import br.uniriotec.xcute.busines.entity.GroupwareRecomendation;
import br.uniriotec.xcute.busines.entity.ServiceCategory;


public class AsyncronousRecommendation extends CommunicationFactory {

	private static final String PUBLICACAO = "publicacao";
	private static final String MENSAGEM_PESSOAL = "mensagem pessoal";
	private static final Integer PUBLICACAO_ID = 4;
	private static final Integer MENSAGEM_PESSOAL_ID = 3;

	public AsyncronousRecommendation(RecommendationHelper helper) {
		super(helper);
		System.out.println("I am asyncrounous and I am running now!");
	}
	
	public void configure(){
		
		if(isUserMultipleInteraction())
			setServiceCategory(MENSAGEM_PESSOAL);
		else
			setServiceCategory(PUBLICACAO);
		
	}

	List<ServiceCategory> categoryList;
	@Override
	protected List<GroupwareRecomendation> getServiceRecomendation() {
		List<GroupwareRecomendation> serviceByCategory = null;
 
		if(getServiceCategory().equals(MENSAGEM_PESSOAL))
			recursiveSeach(MENSAGEM_PESSOAL_ID);
		else
			recursiveSeach(PUBLICACAO_ID);

		System.out.println("===========");  
		if(null != categoryList)
		for(ServiceCategory c: categoryList){
			map.put(CATEGORY, c.getDescription());
			serviceByCategory = helper.getCollaborationRuleDAO().getServiceByCategory(map);
		}
		
		return serviceByCategory;
	}

	private void recursiveSeach(Integer id) {
		try {
			categoryList = helper.getCollaborationRuleDAO().getCategoryChildren(id);
			if (null == categoryList)
				return;

			for (ServiceCategory c : categoryList) {
				System.out.println(c);
				
				if (null == c.getParent()){
					categoryList.add(c);
					return;
				}
				recursiveSeach(c.getId());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
}
