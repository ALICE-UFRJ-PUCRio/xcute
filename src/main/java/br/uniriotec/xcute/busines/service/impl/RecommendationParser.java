package br.uniriotec.xcute.busines.service.impl;

import java.util.List;

import org.springframework.util.CollectionUtils;

import br.uniriotec.xcute.busines.entity.ColaborationInfo;
import br.uniriotec.xcute.busines.entity.ComunicationInfo;
import br.uniriotec.xcute.util.Cardinality;

public class RecommendationParser {

	private static final String EMPTY_STRING = "";  
	private List<ComunicationInfo> communicationInfos;
	private List<ColaborationInfo> colaborationInfos;

	private RecommendationParser() {
	}

	public static RecommendationParser getInstance(){
		Cardinality.clear();
		return new RecommendationParser();
	}
	
	public void setCollaborationInfos(final List<ColaborationInfo> colaborationInfos){
		this.colaborationInfos = colaborationInfos;
	}
	 
	public void setCommunicationInfos(final List<ComunicationInfo> communicationInfos){
		this.communicationInfos = communicationInfos;
	}
	
	public Boolean isCollaborationSyncronous(){
		if(CollectionUtils.isEmpty(colaborationInfos))
			return null;
		
		Boolean sync = null;
		for(ColaborationInfo ci: colaborationInfos){
			sync = ci.getSyncronous();
			if(null != sync && sync == true)
				return true;
 		}
		return sync;
	}
	
	public String getMessageType(){
		if(CollectionUtils.isEmpty(communicationInfos))
			return EMPTY_STRING;
		
		String msg;
		System.out.println(communicationInfos);
 		for (ComunicationInfo comunicationInfo : communicationInfos){
			if((msg = comunicationInfo.getLanguage()) != null) 
				return msg;
 		}
 		
		return EMPTY_STRING;
	}
	
	public Cardinality getCommunicationCardinality(){
		for (ComunicationInfo comunicationInfo : communicationInfos){
			Cardinality.addInteraction(comunicationInfo.getCardinality());
 		}
		return Cardinality.getCardinalityResult();
	}
	
	
}
