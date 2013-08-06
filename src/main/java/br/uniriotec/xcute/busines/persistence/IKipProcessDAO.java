package br.uniriotec.xcute.busines.persistence;

import java.util.List;

import br.uniriotec.xcute.busines.entity.ComunicationInfo;
import br.uniriotec.xcute.busines.entity.KnowledgeIntensiveActivity;
import br.uniriotec.xcute.busines.entity.KnowledgeIntensiveProcess;

public interface IKipProcessDAO {

	List<KnowledgeIntensiveProcess> list();

	KnowledgeIntensiveProcess getByKey(Integer id);  
	
	KnowledgeIntensiveActivity getKiaByKey(Integer id);
	
	boolean isSocialization(Integer id);
	
	boolean isCollaborativeActivity(Integer id);
	
	List<ComunicationInfo>	getCardinality(Integer id);
	
	boolean isCollaborativeSession(Integer id);
}
