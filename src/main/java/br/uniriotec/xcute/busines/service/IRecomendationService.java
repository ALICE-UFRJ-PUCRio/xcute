package br.uniriotec.xcute.busines.service;

import java.util.List;

import br.uniriotec.xcute.busines.entity.ColaborationInfo;
import br.uniriotec.xcute.busines.entity.GroupwareRecomendation;

public interface IRecomendationService {

	List<ColaborationInfo> getCollaborationInfo(Integer id);
	
	List<GroupwareRecomendation> getRecomendation();
	
}
