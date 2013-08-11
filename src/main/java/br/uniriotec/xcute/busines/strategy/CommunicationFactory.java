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
	private ComunicationInfo comunicationInfo; 

	
	public CommunicationFactory(RecommendationHelper helper) {
		this.helper = helper;
		list = new ArrayList<GroupwareRecomendation>();
		map = new HashMap<String, String>();
	}
 
	public abstract void configure();
	
	protected abstract List<GroupwareRecomendation> getServiceRecomendation();
	
	public List<GroupwareRecomendation>  recomend(){
		configure();
		addCommunicationServicesRecomendations();
		return list;
	}
	
	
	
	protected boolean isUserMultipleInteraction() {
		return helper.getCommunicationCardinality().isIn(Cardinality.MUITOS_MUITOS, Cardinality.UM_MUITOS);
	}

	protected void setServiceCategory(String serviceCategory) {
		this.serviceCategory = serviceCategory;
	}

	public  static CommunicationFactory getCommunicationFactory(RecommendationHelper helper){
		Boolean collaborationSyncronous = helper.isCollaborationSyncronous();
		if(null != helper && null != collaborationSyncronous && collaborationSyncronous)
			return new SyncronousRecommendation(helper);
		else
			return new AsyncronousRecommendation(helper);
	}

	public String getServiceCategory() {
		return serviceCategory;
	}

	protected void addCommunicationServicesRecomendations() {
		for (ComunicationInfo c : helper.getCommunicationInfos()) {
			List<GroupwareRecomendation> recomendList;
			setComunicationInfo(c);
			recomendList = getServiceRecomendation();
			if(null != recomendList)
				list.addAll(recomendList);	
			
		}
	}

	private void setComunicationInfo(ComunicationInfo comunicationInfo) {
		this.comunicationInfo = comunicationInfo;
	}

	public ComunicationInfo getComunicationInfo() {
		return comunicationInfo;
	}

	@Override
	public String toString() {
		return "CommunicationFactory ["
				+ (serviceCategory != null ? "serviceCategory="
						+ serviceCategory + ", " : "")
				+ (helper != null ? "helper=" + helper + ", " : "")
				+ (list != null ? "list=" + list + ", " : "")
				+ (map != null ? "map=" + map + ", " : "")
				+ (comunicationInfo != null ? "comunicationInfo="
						+ comunicationInfo : "") + "]";
	}

	
	
	
}
