package br.uniriotec.xcute.busines.service;

import java.util.List;

import br.uniriotec.xcute.busines.entity.ComunicationInfo;
import br.uniriotec.xcute.busines.entity.KnowledgeIntensiveActivity;
import br.uniriotec.xcute.busines.entity.KnowledgeIntensiveProcess;

public interface IKipProcessService {

	List<KnowledgeIntensiveProcess> findAll();

	KnowledgeIntensiveProcess get(Integer id);
	
	KnowledgeIntensiveActivity getKia(Integer id); 
	
	List<ComunicationInfo> getCardinality(Integer id);
	
}
