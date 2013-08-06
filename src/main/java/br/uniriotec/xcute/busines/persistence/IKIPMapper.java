package br.uniriotec.xcute.busines.persistence;

import java.util.List;

import br.uniriotec.xcute.busines.entity.ComunicationInfo;
import br.uniriotec.xcute.busines.entity.KnowledgeIntensiveActivity;
import br.uniriotec.xcute.busines.entity.KnowledgeIntensiveProcess;

public interface IKIPMapper {

	  List<KnowledgeIntensiveProcess> list();
	  
	  KnowledgeIntensiveProcess getById(Integer id);
	  
	  KnowledgeIntensiveActivity selectKIA(Integer id);
	  
	  boolean isSocialization(Integer id);
	  
	  boolean isCollaborativeActivity(Integer id);
	  
	  List<ComunicationInfo> getCardinality(Integer id);
	  
	  boolean isCollaborativeSession(Integer id);
	  
}
