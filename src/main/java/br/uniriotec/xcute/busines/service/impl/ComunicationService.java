package br.uniriotec.xcute.busines.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.uniriotec.xcute.busines.entity.ColaborationInfo;
import br.uniriotec.xcute.busines.entity.GroupwareRecomendation;
import br.uniriotec.xcute.busines.persistence.ICollaborationRuleDAO;


@Service
public class ComunicationService {

	@Autowired
	private ICollaborationRuleDAO collaborationRuleDAO;

	public List<GroupwareRecomendation> getComunicationRecomendation(Integer id){
		List<ColaborationInfo> recomendationList = collaborationRuleDAO.getSocializationInfo(id);
		
		return null;
	}
	
	
}
