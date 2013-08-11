package br.uniriotec.xcute.busines.strategy;

import java.util.List;

import br.uniriotec.xcute.busines.entity.GroupwareRecomendation;
import br.uniriotec.xcute.util.Cardinality;


public class AsyncronousRecommendation extends CommunicationFactory {
   
	private static final String DIVULGACAO = "divulgacao";
	private static final String RECADO = "recado";
	private static final String TEXTO = "texto"; 
	private static final String DISCUSSAO = "discussao";
	private static final String CORRESPONDENCIA = "correspondencia";
 
	public AsyncronousRecommendation(RecommendationHelper helper) {
		super(helper);
		System.out.println("I am asyncrounous and I am running now!");
	}
	
	public void configure() {
		Cardinality communicationCardinality = helper.getCommunicationCardinality();
		if (communicationCardinality.isIn(Cardinality.UM_MUITOS)) {
			setServiceCategory(DIVULGACAO);
		} else if (communicationCardinality.
				isIn(Cardinality.MUITOS_MUITOS)) {
			setServiceCategory(DISCUSSAO);
		} else if (communicationCardinality.isIn(Cardinality.UM_UM)) {
			if (null != getComunicationInfo() && TEXTO.equals(getComunicationInfo().getLanguage())) {
				map.put(LANGUAGE, getComunicationInfo().getLanguage());
				setServiceCategory(CORRESPONDENCIA);
			} else{
				if (null != getComunicationInfo())
					map.put(LANGUAGE, getComunicationInfo().getLanguage());
				setServiceCategory(RECADO);
			}
		}

	}

	protected List<GroupwareRecomendation> getServiceRecomendation() {
		map.put(CATEGORY, getServiceCategory()); 
		return helper.getCollaborationRuleDAO().getServiceByCategory(map);
	}
	
	
	
}
