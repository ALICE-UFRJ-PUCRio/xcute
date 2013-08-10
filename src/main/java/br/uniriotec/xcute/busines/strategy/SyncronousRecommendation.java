package br.uniriotec.xcute.busines.strategy;

import java.util.List;

import br.uniriotec.xcute.busines.entity.GroupwareRecomendation;



public class SyncronousRecommendation extends CommunicationFactory {

	
	private static final String CONFERENCIA = "conferencia";
	private static final String DIALOGO = "dialogo";
	
	
	public SyncronousRecommendation(RecommendationHelper helper) {
		super(helper);
		System.out.println("I am syncrounous and I am running now!");
	}

	public void configure() {
		
		if(isUserMultipleInteraction())
			setServiceCategory(CONFERENCIA); 
		else
			setServiceCategory(DIALOGO);
		 
	}
	
	@Override
	protected List<GroupwareRecomendation> getServiceRecomendation() {
		return helper.getCollaborationRuleDAO().getServiceByCategory(map);
	}
	
}
