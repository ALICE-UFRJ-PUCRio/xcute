package br.uniriotec.xcute.busines.persistence;

import java.util.HashMap;
import java.util.List;

import br.uniriotec.xcute.busines.entity.ColaborationInfo;
import br.uniriotec.xcute.busines.entity.ComunicationInfo;
import br.uniriotec.xcute.busines.entity.GroupwareRecomendation;
import br.uniriotec.xcute.busines.entity.ServiceCategory;

public interface ICollaborationRuleDAO {
	   List<ComunicationInfo> getCardinality(Integer id);
	   
	   List<ColaborationInfo>  getColaborativeSessionInfo(Integer id);
	   
	   List<ColaborationInfo>  getResourceParticipation(Integer id);
	   
	   List<ColaborationInfo>  getAgentsInComunication(Integer id);
	   
	   List<ColaborationInfo>  getSocializationInfo(Integer id);
	   
	   List<ColaborationInfo>  getDecisionInfo(Integer id);
	   
	   List<GroupwareRecomendation> getServiceByCategory(HashMap<String, String> map);
	   
	   List<ServiceCategory> getCategoryChildren(Integer id);
	   
}