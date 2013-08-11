package br.uniriotec.xcute.busines.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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
	private Integer id;
	
	public RecomendationService() {
	}

	@Override
	public List<ColaborationInfo> getCollaborationInfo(final Integer id) {
		this.id = id;
		colaborationInfos = buildColaborationInformations(id);
		return colaborationInfos;
	}

	private List<ColaborationInfo> buildColaborationInformations(final Integer id) {
		List<ColaborationInfo> colaborationInfos = new ArrayList<ColaborationInfo>();
		colaborationInfos.addAll(collaborationRuleDAO.getAgentsInComunication(id));
		colaborationInfos.addAll(collaborationRuleDAO.getDecisionInfo(id));
		colaborationInfos.addAll(collaborationRuleDAO.getResourceParticipation(id));
		colaborationInfos.addAll(collaborationRuleDAO.getSocializationInfo(id));
		return colaborationInfos;
	}


	@Override
	public List<GroupwareRecomendation> getRecomendation() {
		RecommendationHelper helper = RecommendationHelper.getInstance();
		helper.setCollaborationRuleDAO(collaborationRuleDAO); 
		helper.setCollaborationInfos(collaborationRuleDAO.getSocializationInfo(id));
		helper.setCommunicationInfos(collaborationRuleDAO.getCardinality(id));
		CommunicationFactory communication = CommunicationFactory.getCommunicationFactory(helper);
		List<GroupwareRecomendation> recommendations = recomend(communication); 
		return recommendations;
	}

	private List<GroupwareRecomendation> recomend(CommunicationFactory communication) {
		List<GroupwareRecomendation> recommendation = null;
		if(communication != null) 
			recommendation = communication.recomend();
		Set<GroupwareRecomendation> rec = new TreeSet<GroupwareRecomendation>(recommendation);
		recommendation = new ArrayList<GroupwareRecomendation>(rec);
		return recommendation;
	}
	
	
	

}

	
