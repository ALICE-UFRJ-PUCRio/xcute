package br.uniriotec.xcute.busines.persistence;

import java.util.List;

import br.uniriotec.xcute.busines.entity.ColaborationInfo;
import br.uniriotec.xcute.busines.entity.ComunicationInfo;

public interface ICollaborationRuleMapper {

   List<ComunicationInfo> getCardinality(Integer id);
   
   List<ColaborationInfo>  getColaborativeSessionInfo(Integer id);
   
   List<ColaborationInfo>  getResourceParticipation(Integer id);
   
   List<ColaborationInfo>  getAgentsInComunication(Integer id);
   
   List<ColaborationInfo>  getSocializationInfo(Integer id);
   
   List<ColaborationInfo>  getDecisionInfo(Integer id);
   
}
