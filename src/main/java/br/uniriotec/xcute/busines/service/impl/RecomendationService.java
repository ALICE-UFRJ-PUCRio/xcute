package br.uniriotec.xcute.busines.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.uniriotec.xcute.busines.entity.ColaborationInfo;
import br.uniriotec.xcute.busines.entity.GroupwareRecomendation;
import br.uniriotec.xcute.busines.persistence.ICollaborationRuleDAO;
import br.uniriotec.xcute.busines.service.IRecomendationService;
import br.uniriotec.xcute.busines.strategy.CommunicationFactory;
import br.uniriotec.xcute.busines.strategy.RecommendationHelper;

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
		RecommendationHelper helper = RecommendationHelper.getInstance();
		helper.setCollaborationInfos(colaborationInfos);
		helper.setCommunicationInfos(collaborationRuleDAO.getCardinality(activityId));
		helper.setCollaborationRuleDAO(collaborationRuleDAO);
		CommunicationFactory communication = CommunicationFactory.getCommunicationFactory(helper);
		List<GroupwareRecomendation> recommendation = communication.recomend();
		return recommendation;
	}
	
		

}

	
