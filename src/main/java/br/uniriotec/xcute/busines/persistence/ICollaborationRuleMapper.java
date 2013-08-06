package br.uniriotec.xcute.busines.persistence;

import java.util.List;

import br.uniriotec.xcute.busines.entity.ColaborationInfo;
import br.uniriotec.xcute.busines.entity.ComunicationInfo;

public interface ICollaborationRuleMapper {

   List<ComunicationInfo> getCardinality(Integer id);
   
   List<ColaborationInfo>  getColaborativeSessionInfo(Integer id);
	
}
