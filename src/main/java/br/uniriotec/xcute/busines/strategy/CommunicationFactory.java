package br.uniriotec.xcute.busines.strategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.uniriotec.xcute.busines.entity.ComunicationInfo;
import br.uniriotec.xcute.busines.entity.GroupwareRecomendation;
import br.uniriotec.xcute.util.Cardinality;


/**
 * Patterns utilized:
 * Strategy
 * Factory Method 
 * TemplateMethod 
 * 
 * @author edveloso
 *
 */
public abstract class CommunicationFactory {
	
	protected static final String EMPTY = "empty"; 
	protected static final String LANGUAGE = "language";
	protected static final String CATEGORY = "category";

	private String serviceCategory = EMPTY;
	
	protected  RecommendationHelper helper;
	
	protected  List<GroupwareRecomendation> list;
	
	protected HashMap<String, String> map;

	
	public CommunicationFactory(RecommendationHelper helper) {
		this.helper = helper;
		list = new ArrayList<GroupwareRecomendation>();
		map = new HashMap<String, String>();
	}
 
	public abstract void configure();
	
	protected abstract List<GroupwareRecomendation> getServiceRecomendation();
	
	public List<GroupwareRecomendation>  recomend(){
		//identifica comunicao
		initializeResponse();
		configure();
		addCommunicationServicesRecomendations(helper.getCommunicationInfos());
		
		//identifica cooperacao
		//identifica coordenaçao
		
		return list;
	}
	
	protected void initializeResponse() {
		if(null == list)
			list = new ArrayList<GroupwareRecomendation>();
	}

	protected boolean isUserMultipleInteraction() {
		return helper.getCommunicationCardinality().isIn(Cardinality.MUITOS_MUITOS, Cardinality.UM_MUITOS);
	}

	protected void setServiceCategory(String serviceCategory) {
		this.serviceCategory = serviceCategory;
	}

	public  static CommunicationFactory getCommunicationFactory(RecommendationHelper helper){
		if(helper.isCollaborationSyncronous())
			return new SyncronousRecommendation(helper);
		else
			return new AsyncronousRecommendation(helper);
	}

	public String getServiceCategory() {
		return serviceCategory;
	}

	protected void addCommunicationServicesRecomendations(List<ComunicationInfo> communicationInfos) {
		for (ComunicationInfo c : communicationInfos) {
			map.put(CATEGORY, getServiceCategory()); 
			map.put(LANGUAGE, c.getLanguage());
			List<GroupwareRecomendation> recomendList;
			if(null != c.getLanguage()){
				recomendList = getServiceRecomendation();
				if(null != recomendList)
					list.addAll(recomendList);	
			}
			
		}
	}

	
	
	
}
