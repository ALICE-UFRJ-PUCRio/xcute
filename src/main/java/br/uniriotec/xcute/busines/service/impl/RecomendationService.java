package br.uniriotec.xcute.busines.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.uniriotec.xcute.busines.entity.ColaborationInfo;
import br.uniriotec.xcute.busines.entity.GroupwareRecomendation;
import br.uniriotec.xcute.busines.persistence.ICollaborationRuleDAO;
import br.uniriotec.xcute.busines.service.IRecomendationService;
import br.uniriotec.xcute.util.Cardinality;

@Service
public class RecomendationService implements IRecomendationService {
	
	@Autowired
	private ICollaborationRuleDAO collaborationRuleDAO;

	private List<ColaborationInfo> colaborationInfos;

	private Integer activityId;

	public RecomendationService() {
	}

	@Override
	public List<ColaborationInfo> getCollaborationInfo(final Integer id) {
		this.activityId = id;
		colaborationInfos = new ArrayList<ColaborationInfo>();
		colaborationInfos.addAll(collaborationRuleDAO.getAgentsInComunication(id));
		colaborationInfos.addAll(collaborationRuleDAO.getDecisionInfo(id));
		colaborationInfos.addAll(collaborationRuleDAO.getResourceParticipation(id));
		colaborationInfos.addAll(collaborationRuleDAO.getSocializationInfo(id));
		return colaborationInfos;
	}

	@Override
	public List<GroupwareRecomendation> getRecomendation() {
		RecommendationParser parser = RecommendationParser.getInstance();
		parser.setCollaborationInfos(colaborationInfos);
		parser.setCommunicationInfos(collaborationRuleDAO.getCardinality(activityId));
 		Boolean sync = parser.isCollaborationSyncronous();
 		System.out.println("Sincrono: " +sync); 
 		String messageType = parser.getMessageType();
 		System.out.println("Message type " + messageType ); 
 		Cardinality result = parser.getCommunicationCardinality();
 		System.out.println("Cardinality: "+ result);
 		Cardinality.clear();
 		
 		//identifica comunicao
		//identifica cooperacao
		//identifica coordenaçao
 		
		
		return null;
	}
	
		

}

	
